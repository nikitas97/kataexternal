package gr.hua.dit.springmvc1.dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import gr.hua.dit.springmvc1.entity.Form;
import gr.hua.dit.springmvc1.entity.Student;



@Service
public class FormDAOImpl implements FormDAO {

	@Autowired
    private SessionFactory sessionFactory;
	
	@Override
	@Transactional
	public String getForms() {
		
		String result;
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String username = authentication.getName();
		Session session = sessionFactory.getCurrentSession();
		
		Query<Student> q = session.createQuery("from Student s where s.username='"+username+"'");
		Student st = q.getSingleResult();
		String stdep=st.getDepartment();
		Query<Student> query = session.createQuery("from Student where department='"+stdep+"'", Student.class);
		List<Student> s = query.getResultList();
		int depsize=(s.size()*80)/100;
		
		Query<Form> qf = session.createQuery("from Form f where f.department='"+stdep+"'");
		List<Form> form = qf.getResultList();
		int pos=0;
		int i;
		for(i =0;i<form.size();i++) {
			String strid = String.valueOf(form.get(i).getId());
			if (username.contains(strid) ) {
				pos=i;
			}
			
		}
		
		if (pos<=depsize) {
			result="You are in position : "+(pos+1)+"και δικαιούσαι Σίτιση";
		} else {
			result="Προς το παρόν βρίσκεσαι στη θέση : "+(pos+1)+"και δεν δικαιούσαι Σίτιση";
		}
		

		
		return result;
	}
	
}
