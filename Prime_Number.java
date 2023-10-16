import java.util.Scanner;
class Prime_Number{
	public static void main(String args[]){
	   int i,n;
	   Scanner obj1=new Scanner(System.in);
	   System.out.print("Enter any Number =");
	   n=obj1.nextInt();
	   int m=n/2;
           int flag=0;
	   if(n==0||n==1){
                 System.out.println(n+" is prime_number");
              } 
          else{
	   for(i=2;i<=m;i++){
		if(n%i==0){
			flag=1;
                        break;
		}
	}
}
          if(flag==0){
	          System.out.println("Prime_Number");
		}
          else{
        System.out.println("Not A Prime_Number");
    }
   }
}