
//import java.util.TreeSet;
 
public class CountCharacters {
 
   public static void main(String args[]){
 
	   String str="abcdefaaabbbcccdddeeefff";
	      String temp="";
	 
	      for (int i = 0; i < str.length(); i++) {
	    	  int a=indexOf(str.charAt(i));
	         if(temp.indexOf(str.charAt(i)) == -1 ){
	             temp = temp + str.charAt(i);
	         }
	      }
	 
	      System.out.println(temp);
	      System.out.println("Unique character count: " + temp.length());
 
   }

private static int indexOf(char charAt) {
	// TODO Auto-generated method stub
	return 0;
}
}
