<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import="java.util.List,org.hibernate.Session,org.hibernate.SessionFactory,org.hibernate.query.Query,
				gr.hua.dit.springmvc1.entity.Form,gr.hua.dit.springmvc1.dao.FormDAO,org.hibernate.cfg.Configuration
				" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submitted</title>
</head>
<body>
<%
String id=request.getParameter("id"); 
int idn = Integer.parseInt(id);
session.setAttribute("sessname",idn);
String firstname=request.getParameter("firstname");
String lastname=request.getParameter("lastname");
String city=request.getParameter("city");
String studCity=request.getParameter("studCity");
int studIncome = Integer.parseInt(request.getParameter("studIncome"));
int familyInc = Integer.parseInt(request.getParameter("familyInc"));
int studSibs = Integer.parseInt(request.getParameter("studSibs"));
boolean workingParents = (request.getParameter("workingParents") =="true");
String department = request.getParameter("department");

SessionFactory sessionFactory=new Configuration().configure("hibernate.cfg.xml")
	.addAnnotatedClass(Form.class)
	.buildSessionFactory();
Session sessionFact = sessionFactory.getCurrentSession();

Form form = new Form(idn,firstname,lastname,city,studIncome,workingParents,familyInc,studSibs,studCity,department);
sessionFact.beginTransaction();

sessionFact.save(form);
sessionFact.getTransaction().commit();
sessionFactory.close();

%>

        <div id="wrapper">
                <div id="header">
                        <h2>Submitted Form</h2>
                </div>
        </div>
        
        
</body>
</html>