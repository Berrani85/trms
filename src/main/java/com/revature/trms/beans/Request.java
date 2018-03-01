package com.revature.trms.beans;

import java.util.Date;

public class Request {
	private int reqNum;
	private String empId;
	private Date startDate;
	private Date endDate;
	private int daysMissed;
	private String programType;
	private String descripion;
	private String instituteName;
	private double cost;
	private String location;
	private String justification;
	private String supervisorApproval;
	private String bencoAproval;
	private String deptAproval;
	private String supervisorNote;
	private String bencoNote;
	private String deptNote;
	private String AppliedDate;
	
	public Request() {
		
	}
	public Request(int reqNum, String description, String appliedDate, String supervisorAp,String bencoAp,String deptAp) {
		this.reqNum=reqNum;
		this.descripion=description;
		this.setAppliedDate(appliedDate);
		this.supervisorApproval=supervisorAp;
		this.setBencoAproval(bencoAp);
		this.setDeptAproval(deptAp);
		
	}
	
	public Request(int reqNum,String empId, Date startDate, Date endDate, int dayMissed, String programType, String descripion,
			String instituteName, double cost, String location, String justification) {
		super();
		this.reqNum = reqNum;
		this.empId=empId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.daysMissed=dayMissed;
		this.programType = programType;
		this.descripion = descripion;
		this.instituteName = instituteName;
		this.cost=cost;
		this.location = location;
		this.justification = justification;
	}
	
	/**
	 * @param startDate
	 * @param endDate
	 * @param programType
	 * @param descripion
	 * @param instituteName
	 * @param location
	 * @param justification
	 */
	public Request(String empId, Date startDate, Date endDate, int daysMissed, String programType, 
			String descripion, String instituteName, double cost,	String location, String justification) {
		super();
		this.empId=empId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.programType = programType;
		this.daysMissed=daysMissed;
		this.descripion = descripion;
		this.instituteName = instituteName;
		this.cost=cost;
		this.location = location;
		this.justification = justification;
	}

	/**
	 * @return the reqNum
	 */
	public int getReqNum() {
		return reqNum;
	}
	/**
	 * @param reqNum the reqNum to set
	 */
	public void setReqNum(int reqNum) {
		this.reqNum = reqNum;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	/**
	 * @return the programType
	 */
	public String getProgramType() {
		return programType;
	}
	/**
	 * @param programType the programType to set
	 */
	public void setProgramType(String programType) {
		this.programType = programType;
	}
	/**
	 * @return the descripion
	 */
	public String getDescripion() {
		return descripion;
	}
	/**
	 * @param descripion the descripion to set
	 */
	public void setDescripion(String descripion) {
		this.descripion = descripion;
	}
	/**
	 * @return the instituteName
	 */
	public String getInstituteName() {
		return instituteName;
	}
	/**
	 * @param instituteName the instituteName to set
	 */
	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the jutification
	 */
	public String getJustification() {
		return justification;
	}
	/**
	 * @param jutification the jutification to set
	 */
	public void setJustification(String justification) {
		this.justification = justification;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Request [reqNum=" + reqNum + ", empId=" + empId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", programType=" + programType + ", descripion=" + descripion + ", instituteName=" + instituteName
				+ ", cost=" + cost + ", location=" + location + ", justification=" + justification + "]";
	}

	public int getDaysMissed() {
		return daysMissed;
	}

	public void setDaysMissed(int daysMissed) {
		this.daysMissed = daysMissed;
	}
	public String getSupervisorApproval() {
		return supervisorApproval;
	}
	public void setSupervisorApproval(String supervisorApproval) {
		this.supervisorApproval = supervisorApproval;
	}
	public String getBencoAproval() {
		return bencoAproval;
	}
	public void setBencoAproval(String bencoAproval) {
		this.bencoAproval = bencoAproval;
	}
	public String getDeptAproval() {
		return deptAproval;
	}
	public void setDeptAproval(String deptAproval) {
		this.deptAproval = deptAproval;
	}
	public String getSupervisorNote() {
		return supervisorNote;
	}
	public void setSupervisorNote(String supervisorNote) {
		this.supervisorNote = supervisorNote;
	}
	public String getBencoNote() {
		return bencoNote;
	}
	public void setBencoNote(String bencoNote) {
		this.bencoNote = bencoNote;
	}
	public String getDeptNote() {
		return deptNote;
	}
	public void setDeptNote(String deptNote) {
		this.deptNote = deptNote;
	}
	public String getAppliedDate() {
		return AppliedDate;
	}
	public void setAppliedDate(String appliedDate) {
		AppliedDate = appliedDate;
	}
	
	
	

}
