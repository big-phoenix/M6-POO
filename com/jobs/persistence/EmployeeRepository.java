package com.jobs.persistence;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;

public class EmployeeRepository {

	private static List<AbsStaffMember> members=new ArrayList<>();
	private String member="";
	
	public EmployeeRepository(){
		
	}
	
	
	public String getAllMembers() {
		
		for(AbsStaffMember m : members){
			member+=m.getname() +" - "+ m.getaddress() +" - "+ m.getphone() +" - "+ m.getTotalPaid() + " \n ";
		}
		return member;
	}
	
	
	/*public List<AbsStaffMember> getAllMembers(){
		return new ArrayList<>(members);
	}*/
	
	
	public void addMember(AbsStaffMember member) throws Exception{
		if(member==null) throw new Exception();
		members.add(member);
	}
	
	
}
