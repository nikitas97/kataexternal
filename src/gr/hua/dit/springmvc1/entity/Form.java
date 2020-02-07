package gr.hua.dit.springmvc1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "form")
public class Form {

	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "studIncome")
	private int studIncome;
	
	@Column(name = "workingParents")
	private boolean workingParents;
	
	@Column(name = "familyInc")
	private int familyInc;
	
	@Column(name = "studyingSibs")
	private int studyingSibs;
	
	@Column(name = "studCity")
	private String studCity;

	@Column(name = "department")
	private String department;
	
	@Column(name = "isVerified")
	private boolean isVerified;
	
	@Column(name = "rating")
	public int rating;

	public Form() {
		
	}

	public Form(int id, String firstName, String lastName, String city, int studIncome, boolean workingParents,
			int familyInc, int studyingSibs, String studCity,String department) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.studIncome = studIncome;
		this.workingParents = workingParents;
		this.familyInc = familyInc;
		this.studyingSibs = studyingSibs;
		this.studCity = studCity;
		this.department = department;
	}
	
	public Form(int id, String firstName, String lastName, String city, int studIncome, boolean workingParents,
			int familyInc, int studyingSibs, String studCity,String department, boolean isVerified, int rating) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.studIncome = studIncome;
		this.workingParents = workingParents;
		this.familyInc = familyInc;
		this.studyingSibs = studyingSibs;
		this.studCity = studCity;
		this.department = department;
		this.isVerified = isVerified;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getStudIncome() {
		return studIncome;
	}

	public void setStudIncome(int studIncome) {
		this.studIncome = studIncome;
	}

	public boolean isWorkingParents() {
		return workingParents;
	}

	public void setWorkingParents(boolean workingParents) {
		this.workingParents = workingParents;
	}

	public int getFamilyInc() {
		return familyInc;
	}

	public void setFamilyInc(int familyInc) {
		this.familyInc = familyInc;
	}

	public int getStudyingSibs() {
		return studyingSibs;
	}

	public void setStudyingSibs(int studyingSibs) {
		this.studyingSibs = studyingSibs;
	}

	public String getStudCity() {
		return studCity;
	}

	public void setStudCity(String studCity) {
		this.studCity = studCity;
	}
	
	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public boolean isVerified() {
		return isVerified;
	}

	public void setVerified(boolean isVerified) {
		this.isVerified = isVerified;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
