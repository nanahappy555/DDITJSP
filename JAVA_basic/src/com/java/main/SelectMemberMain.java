package com.java.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.java.dto.MemberVO;

public class SelectMemberMain {

	public static void main(String[] args) {


		Connection conn = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//입력
		String id = null;
		Scanner scan = new Scanner(System.in);
		System.out.print("아이디를 입력하세요");
		id=scan.nextLine();
		
		try {
		// 1. 드라이버로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 2. connention 생성
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "JSP", "JSP");
		}catch(Exception e) {
			e.printStackTrace();
			return;
		}
		
		try {
		// 3. statement
		String sql = "select * "
				+ " from member "
				+ " where id=? ";
		
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		rs = pstmt.executeQuery();
		
		MemberVO member = new MemberVO();
		if(rs.next()) {
			
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
			
		}
		
		System.out.println(member.getName());
		
		}catch(SQLException e) {
			e.printStackTrace();
			return;
		}
	}

}
