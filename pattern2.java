import java.util.Scanner;
class pattern2{
	public static void main(String args[]){
	int num;
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter Print Table :");
	num =sc.nextInt();
      	for(int i=1;i<=10;i++){
	System.out.println(num + "*" +i+"=" +num*i);
	}
}
}