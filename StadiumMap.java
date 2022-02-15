package stadium;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class StadiumMap {
	public static LinkedHashMap<String, Integer> cricketMap = new LinkedHashMap<String, Integer>() {{ 
        put("Eden", 1500); 
    }};
    
    public static LinkedHashMap<String, Integer> getCricketMap() {
    	return cricketMap;
    }
    
    public static void printCricketMap() {
    	for( Entry<String, Integer> entry : getCricketMap().entrySet() ){
		    System.out.println( entry.getKey() + " = " + entry.getValue() );
		}
    }
    
    public static LinkedHashMap<String, Integer> matchesMap = new LinkedHashMap<String, Integer>() {{ 
        put("CSK vs MI", 800); 
        put("DC vs SRH", 800); 
        put("KKR vs RCB", 800); 
    }};
    
    public static LinkedHashMap<String, Integer> getMatchesMap() {
    	return matchesMap;
    }
	
    public static void printMatchesMap() {
    	for( Entry<String, Integer> entry : getMatchesMap().entrySet() ){
		    System.out.println( entry.getKey() + " = " + entry.getValue() );
		}
    }
    
}
