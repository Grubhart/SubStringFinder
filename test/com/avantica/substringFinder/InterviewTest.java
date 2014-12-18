package com.avantica.substringFinder;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class InterviewTest {

	@Test
	public void testGetFirstCharacter() {
		
		SubStringFinder finder = new SubStringFinder();
		
		String subStrings = finder.getSubsTring("abcd",0,1);
		
		assertEquals("a",subStrings);
		
	}
	
	@Test
	public void testGetSecondCharacter() {
		
		SubStringFinder finder = new SubStringFinder();
		
		String subStrings = finder.getSubsTring("abcd",1,1);
		
		assertEquals("b",subStrings);
		
	}
	
	@Test
	public void testGetLastCharacter() {
		
		SubStringFinder finder = new SubStringFinder();
		
		String subStrings = finder.getSubsTring("abcd",3,1);
		
		assertEquals("d",subStrings);
		
	}
	
	@Test
	public void testGetFirstPair() {
		
		SubStringFinder finder = new SubStringFinder();
		
		String subStrings = finder.getSubsTring("abcd",0,2);
		
		assertEquals("ab",subStrings);
		
	}
	
	@Test
	public void testGetSecondPair() {
		
		SubStringFinder finder = new SubStringFinder();
		
		String subStrings = finder.getSubsTring("abcd",1,2);
		
		assertEquals("bc",subStrings);
		
	}
	
	@Test
	public void testGetLastPair() {
		
		SubStringFinder finder = new SubStringFinder();
		String subStrings = finder.getSubsTring("abcde",3,2);
		assertEquals("de",subStrings);
		
	}
	
	@Test
	public void testGetLastPairStringNull() {
		
		SubStringFinder finder = new SubStringFinder();
		String subStrings = finder.getSubsTring(null,2,2);
		assertEquals("" ,subStrings);
		
	}
	
	@Test
	public void testGetLastPairStringEmpty() {
		
		SubStringFinder finder = new SubStringFinder();
		String subStrings = finder.getSubsTring("",2,2);
		assertEquals("" ,subStrings);
		
	}
	
	@Test
	public void testGetSubStringSizeToolarge() {
		
		SubStringFinder finder = new SubStringFinder();
		String subStrings = finder.getSubsTring("abcd",2,3);
		assertEquals("" ,subStrings);
		
	}
	
	@Test
	public void testGetLastSubstringSize4() {
		
		SubStringFinder finder = new SubStringFinder();
		String subStrings = finder.getSubsTring("abcdefg",3,4);
		assertEquals("defg" ,subStrings);
		
	}
	
	@Test
	public void testGetSubstrings1Sub() {
		
		SubStringFinder finder = new SubStringFinder();
		Set<String> subStrings = finder.getSubsTrings("abcd","ab");
		
		Set<String> expectedSubStrings = new HashSet<String>();
		expectedSubStrings.add("ab");
		
		assertEquals(expectedSubStrings, subStrings);
		
		
	}
	
	@Test
	public void testGetSubstrings2Subs() {
		
		SubStringFinder finder = new SubStringFinder();
		Set<String> subStrings = finder.getSubsTrings("abcd","abbc");
		
		Set<String> expectedSubStrings = new HashSet<String>();
		expectedSubStrings.add("ab");
		expectedSubStrings.add("bc");
		
		
		assertEquals(expectedSubStrings, subStrings);
		
		
	}
	
	@Test
	public void testGetSubstringsEmptyStrings() {
		
		SubStringFinder finder = new SubStringFinder();
		Set<String> subStrings = finder.getSubsTrings("","abbc");
		
		Set<String> expectedSubStrings = new HashSet<String>();
		
		assertEquals(expectedSubStrings, subStrings);
		
		
	}
	
	@Test
	public void testGetSubstringsEmptyStringB() {
		
		SubStringFinder finder = new SubStringFinder();
		Set<String> subStrings = finder.getSubsTrings("abcde","");
		
		Set<String> expectedSubStrings = new HashSet<String>();
		
		assertEquals(expectedSubStrings, subStrings);
		
		
	}
	
	@Test
	public void testGetSubstringsNullStrings() {
		
		SubStringFinder finder = new SubStringFinder();
		Set<String> subStrings = finder.getSubsTrings(null,"abbc");
		
		Set<String> expectedSubStrings = new HashSet<String>();
		
		assertEquals(expectedSubStrings, subStrings);
		
		
	}
	
	@Test
	public void testGetSubstringsInterviewTest() {
		
		SubStringFinder finder = new SubStringFinder();
		Set<String> subStrings = finder.getSubsTrings("abcbcdxyz","bcabxzy");
		
		Set<String> expectedSubStrings = new HashSet<String>();
		expectedSubStrings.add("ab");
		expectedSubStrings.add("bc");
		
		
		assertEquals(expectedSubStrings, subStrings);
		
		
	}
	
	@Test
	public void testGetSubstringsInterviewTest2() {
		
		SubStringFinder finder = new SubStringFinder();
		Set<String> subStrings = finder.getSubsTrings("abcbcz","bcabcx");
		
		Set<String> expectedSubStrings = new HashSet<String>();
		expectedSubStrings.add("ab");
		expectedSubStrings.add("abc");
		expectedSubStrings.add("bc");
		
		
		assertEquals(expectedSubStrings, subStrings);
		
		
	}
	
	
	
	
	
	
	


}
