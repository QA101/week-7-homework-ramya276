	import java.util.*;
	 
	public class DupStr{
	 
	    public void findDupChars(String str){
	        System.out.println(str); 
	        Map<Character, Integer> dupStrMap = new HashMap<Character, Integer>(); 
	        char[] chrs = str.toLowerCase().toCharArray();
	        for(Character ch:chrs){
	            if(dupStrMap.containsKey(ch)){
	            	dupStrMap.put(ch, dupStrMap.get(ch)+1);
	            } else {
	            	dupStrMap.put(ch, 1);
	            }
	        }
	        System.out.println(dupStrMap);
	        Set<Character> keys = dupStrMap.keySet();
	        System.out.println(keys);
	        for(Character ch:keys){
	            if(dupStrMap.get(ch) > 1){
	                System.out.println(ch+"-"+dupStrMap.get(ch));
	            }
	        }
	    }
	     
	    public static void main(String a[]){
	        DupStr dcs = new DupStr();
	        dcs.findDupChars("Banana");
	    }
	}
