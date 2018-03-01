package com.revature.trms.beans;

public class Admin {
	private String empId;
	private String username;
	private String password;
	private String firstName;
	private String lastname;
	private int jobRef;
	private String dept_id;
	
    public Admin() {
		super();
	}
	
	public Admin(String empId, String username, String password, String firstName, String lastname) {
		super();
		this.empId = empId;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastname = lastname;
	}
	public Admin(String empId, String username, String password, String firstName, String lastname, int jobRef,
			String dept_id) {
		super();
		this.empId = empId;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastname = lastname;
		this.jobRef = jobRef;
		this.dept_id = dept_id;
	}
	public String getEmpId() {
		return empId;
	
	}
	
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public int getJobRef() {
		return jobRef;
	}
	public void setJobRef(int jobRef) {
		this.jobRef = jobRef;
	}
	public String getDept_id() {
		return dept_id;
	}
	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}

	@Override
	public String toString() {
		return "Admin [empId=" + empId + ", username=" + username + ", password=" + password + ", firstName="
				+ firstName + ", lastname=" + lastname + ", jobRef=" + jobRef + ", dept_id=" + dept_id + "]";
	}
 
	
}
