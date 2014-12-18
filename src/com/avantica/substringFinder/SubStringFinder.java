package com.avantica.substringFinder;

import java.util.HashSet;
import java.util.Set;

public class SubStringFinder {

	// when an illegal condition is passed to this method: 
	// null or empty strings, illegal combination of start position and substring size 
	// return an empty String
	public String getSubsTring(String originalString, int startPosition, int subStringSize) {
		
		String subsTring = "";
		
		if(null == originalString || originalString.isEmpty()){
			return subsTring;	
		}
		
		int maxLegalStartPosition = originalString.length()-subStringSize;
		
		if(startPosition>maxLegalStartPosition){
			return subsTring;
		}
		
		for(int i =0;i<subStringSize;i++){
			subsTring += originalString.charAt(i+startPosition);
		}
		
		return subsTring;
	}

	public Set<String> getSubsTrings(String stringA, String stringB) {
		
		Set<String> subStrings = new HashSet<String>();
		
		if(null == stringA || null == stringB){
			
			return subStrings;
		}
		
		for (int subStringSize = 2;subStringSize< stringA.length();subStringSize++){
		
			for (int j = 0; j < stringA.length(); j++) {
				String subStringA = getSubsTring(stringA, j, subStringSize);
					for (int i = 0; i < stringB.length(); i++) {
						String subStringb = getSubsTring(stringB, i, subStringSize);
						if(subStringA.equals(subStringb)){
							subStrings.add(subStringA);
						}
						
					}
			}
		}
		// delete invalid sub: ""
		subStrings.remove("");
		
		return subStrings;
	}

	
	
}
