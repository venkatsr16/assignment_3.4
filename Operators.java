import java.util.*;
public class Operators {
     public static void main(String args[]){
	Scanner s = new Scanner(System.in);
	boolean same;
	String s1,s2;
	System.out.println("Enter first string");
	s1 = s.nextLine();
	System.out.println("Enter second string");
	s2 = s.nextLine();
	if(s1.equals(s2)){
	   same=true;
	   System.out.println(same);
        }
	else{
	   same=false;
	   System.out.println(same);
        }
     }
}