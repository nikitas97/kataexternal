package gr.hua.dit.springmvc1.dao;

import java.util.List;


import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import gr.hua.dit.springmvc1.entity.Student;


@Service
public class StudentDAOImpl implements StudentDAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String username = authentication.getName();
		System.out.println("The username is: "+username);
		Session currentSession = sessionFactory.getCurrentSession();
		
		Query<Student> query = currentSession.createQuery("from Student s where s.username='"+username+"'", Student.class);
		
        List<Student> students = query.getResultList();
		
		return students;
	}

}
