package com.java.dto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SimpleDBConnection {
	
	

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		
		try {
		// 1. 드라이버로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2. connention 생성
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "JSP", "JSP");
		// 3. statement
		String sql = "select * from member";
		stmt = conn.createStatement();
		// 4. resultSet
		rs = stmt.executeQuery(sql);

		// 5. data주입
		List<MemberVO> memberList = new ArrayList<MemberVO>();
		MemberVO member;
		while (rs.next()) {
			member = new MemberVO();
			
			member.setId(rs.getString("id"));
			member.setPwd(rs.getString("pwd"));
			member.setName(rs.getString("name"));
			member.setPhone(rs.getString("phone"));
			member.setAddress(rs.getString("address"));
			member.setEmail(rs.getString("email"));
			member.setPicture(rs.getString("picture"));
			
			member.setRegister(rs.getString("register"));
			member.setRegDate(rs.getDate("regDate"));
			member.setAuthority(rs.getString("authority"));
			member.setEnabled(rs.getInt("enabled"));
			
			memberList.add(member);
		}
		
		
		System.out.println(memberList);
		}catch(Exception e) {
			e.printStackTrace();
			return;
		}finally {
			try {
			if(rs!=null) rs.close();
			if(stmt!=null) stmt.close();
			if(conn!=null) conn.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}

	
	
	
}






