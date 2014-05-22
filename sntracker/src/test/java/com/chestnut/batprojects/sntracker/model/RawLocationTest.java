package com.chestnut.batprojects.sntracker.model;
import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class RawLocationTest {

	RawLocation rLoc;
	String[] locSuite = {""," "," asdasdas", "Evil Street"};
	Integer[] timeSuite = {1, 2111111, 0, (int)10.2, -2};
	
	@Test
	public void testRawLocation() {
		for(String s: locSuite){
			for(Integer t: timeSuite){
				rLoc = new RawLocation(s, t);
				assertNotNull(rLoc);
			}
		}
	}

	

	@Test
	public void testGetSetLoc() {
		rLoc = new RawLocation();
		for(String s: locSuite){
			rLoc.setLoc(s);
			assertEquals(s, rLoc.getLoc());
		}
		
	}
	@Test
	public void testGetSetTime() {
		rLoc = new RawLocation();
		for(Integer t: timeSuite){
			rLoc.setTime(t);
			assertEquals(t, rLoc.getTime());
		}
	}
//Currently don't see necessity of below; leaving commented for future 5/22/14
	//Chestnut
	/*
	@Test
	public void testGetCorrespondence() {
		rLoc = new RawLocation();
		for(String s: locSuite){
			rLoc.setLoc(s);
			assertEquals(s, rLoc.getLoc());
		}
	}

	@Test
	public void testSetCorrespondence() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetConfidence() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetConfidence() {
		fail("Not yet implemented");
	}
*/
}
