<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List,org.hibernate.Session,org.hibernate.SessionFactory,org.hibernate.query.Query,
				gr.hua.dit.springmvc1.entity.Student,gr.hua.dit.springmvc1.dao.StudentDAO,org.hibernate.cfg.Configuration,
				org.springframework.security.core.Authentication,
				org.springframework.security.core.context.SecurityContextHolder" %>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%

Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
String username = authentication.getName();
String email = request.getParameter("email");
String telnumstr = request.getParameter("telnumber");
SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml")
	.addAnnotatedClass(Student.class)
	.buildSessionFactory();
Session sessionFact = sessionFactory.getCurrentSession();
sessionFact.beginTransaction();
if (email!="") {
	sessionFact.createQuery("update Student set email='"+email+"' where username='"+username+"'").executeUpdate();
}
if (telnumstr!=""){
	long telnum = Long.parseLong(telnumstr);
	sessionFact.createQuery("update Student set telnumber='"+telnum+"' where username='"+username+"'").executeUpdate();
}
sessionFact.getTransaction().commit();
sessionFactory.close();
%>

Updated Communication Info

</body>
</html>