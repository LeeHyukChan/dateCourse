<%@page import="net.hb.login.LoginDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.io.PrintWriter"%>
<%@ page import="java.util.HashMap"%>

<%
    // 가상적으로 아이디 중복 여부를 확인
    	String id = request.getParameter("username_give");
		System.out.println(id);
		
		/* LoginDAO dao = new LoginDAO();
		boolean exists = false; // 가상적으로 존재하지 않는 아이디라고 가정
		int Gtotal =  dao.JoinIdCheck(id); 
		System.out.println(Gtotal);*/
    // HTML 형식으로 응답 생성
    //String responseHtml;
	
 
    // 응답 출력
        LoginDAO dao = new LoginDAO();
    	int Gtotal =  dao.JoinIdCheck(id);
		System.out.println(Gtotal);
    
    
%>
{"Gtotal": "<%= Gtotal %>"}


