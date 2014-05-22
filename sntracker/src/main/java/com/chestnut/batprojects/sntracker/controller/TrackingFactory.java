package com.chestnut.batprojects.sntracker.controller;

import java.util.ArrayList;
import java.util.List;

import com.chestnut.batprojects.sntracker.model.RawLocation;
import com.chestnut.batprojects.sntracker.model.SocialAccount;
import com.chestnut.batprojects.sntracker.util.Constants;

public class TrackingFactory {

	List<SocialAccount> accounts;
	List<RawLocation> results;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public TrackingFactory(){
		
	}
	
	public TrackingFactory(List<SocialAccount> accts){
		
	}
	
	public boolean verifyAccounts(List<SocialAccount> accts){
		return false;
	}
	
	public boolean verifyAccount(SocialAccount acct){
		return false;
	}
	
	public List<RawLocation> locateUser(List<SocialAccount> accts){
		accounts = accts;
		return locateUser();
	}
	
	public List<RawLocation> locateUser(){
		if(accounts != null && accounts.size() > 0){
			results = new ArrayList<RawLocation>(); 
			for(SocialAccount acct: accounts){
				List<RawLocation> rLoc = flushAccount(acct);
				
			}
		}
		
		return results;
	}
	
	public List<RawLocation> flushAccount(SocialAccount acct){
		List<RawLocation> result = new ArrayList<RawLocation>();
		String type = acct.getNetwork();
		if(Constants.FB_NETWORK.equals(type)){
			
		}
		
		return result;
	}
	
	public boolean addAccount(){
		return false;
	}
	
	public List<SocialAccount> getAccounts(){
		return accounts;
	}

}
