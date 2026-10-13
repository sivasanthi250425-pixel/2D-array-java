

public class Main {
	 public static void main(String[] args) {
		 String[] cartoon = {"doraemon","shinchan","bheem","dora"};
		 String[] series = {"heartbeat","aaradhana"};
		 String[] movie = {"three","24","","dora"};
		 String[][] mix= { cartoon,series,movie};
		 for(String[] m:mix) {
			 for(String m2:m) {
			 System.out.print(m2+" ");
		 }
			 System.out.println(); 
		 }
	 }
		 
		
	 }
	 
	 
	
