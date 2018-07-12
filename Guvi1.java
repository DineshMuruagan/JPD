import java.util.Scanner;
public class Guvi1 {
public static void main(String[] args){
	int a;
	Scanner in=new Scanner(System.in);
	System.out.println("Enter the number:");
	a=in.nextInt();
	if(a>=0&&a<=100000){
		if(a>0){
			System.out.println(a+" "+"is positive");
		}else{
			System.out.println(a+" "+"is Zero");
		}
	}else{
		System.out.println("Invalid number");
	}
}
}
