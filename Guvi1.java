import java.util.Scanner;
public class Guvi1 {
public static void main(String[] args){
	int a;
	Scanner in=new Scanner(System.in);
     a=in.nextInt();
     if(a>=0&&a<=10000){
    	 if(a==0){
    		System.out.println(a+" "+"is zero"); 
    	 }else{
    		 if(a%2==0){
    			 System.out.println(a+" "+"is even");
    		 }else{
    			 System.out.println(a+""+"is odd");
    		 }
    	 }
     }else{
    	 System.out.println(a+" "+"is invalid");
     }
}
}
