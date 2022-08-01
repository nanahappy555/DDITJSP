package com.jsp.controller;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Set;

import com.jsp.action.Action;
import com.jsp.context.ApplicationContext;

/**
 * 어노테이션 대신 매핑
 * Action 매핑
 * @author PC-17
 *
 */
public class HandlerMapper {
	
	private Map<String, Action> commandMap= new HashMap<String, Action>();
	
	static final String path = "com/jsp/properties/url";
	
	public HandlerMapper() throws Exception {
		this(path);
	}
	public HandlerMapper(String path) throws Exception {	
		ResourceBundle rbHome = ResourceBundle.getBundle(path); //모든 키, 밸류꺼내올때 편함
		Set<String> actionSetHome = rbHome.keySet(); // uri set
		Iterator<String> it = actionSetHome.iterator();
		while(it.hasNext()){
			String command = it.next(); //key-> url			

			String actionClassName = rbHome.getString(command); //value 타입명 
			
			Class<?> actionClass = Class.forName(actionClassName); //객체화
			Action commandAction = (Action)actionClass.newInstance();
			
			//의존주입(service, dao.......)
			//의존성 확인 및 조립
			Method[] methods = actionClass.getMethods();
			for (Method method : methods) {
				if (method.getName().indexOf("set")==0) {
					//set으로 시작하는 메소드가 있는지. 메소드명에서 set의 시작위치0
					String paramType=method.getParameterTypes()[0].getName();//com.jsp.service.MemberService
					paramType=paramType.substring(paramType.lastIndexOf(".")+1); //MemberService
					paramType=(paramType.charAt(0) + "").toLowerCase() + paramType.substring(1);
					//memberService
					
					method.invoke(commandAction,ApplicationContext.getApplicationContext().get(paramType));
					//action 안에 있는 set메서드를 실행시킴 ex) MemberListAction내부의 setMemberService
					//파라미터1 : set메소드가 잇는 객체, 
					//파라미터2 : ApplicationContext.getApplicationContext() =>map container
					//get(memberService)
					System.out.println("[HandlerMapper:invoke]"
							+actionClassName+":"
							+ApplicationContext.getApplicationContext().get(paramType));
				}
			}
			
			commandMap.put(command, commandAction); //매핑해서 저장
			System.out.println("[HandlerMapper]"+command+":"+commandAction +" 가 준비되었습니다.");
			
		}
		
	}
	
	public Action getAction(String url) {
		Action action = commandMap.get(url); //key(url)이 들어오면 매칭되는 action꺼내서 작업
		return action;
	}
}








