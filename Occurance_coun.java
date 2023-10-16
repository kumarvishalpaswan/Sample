import java.util.Scanner;
class Occurance_coun{
	public static void main(String args[]){
	      int n,x;
	      int count=0,i=0;
	      Scanner sc=new Scanner(System.in);
    	      System.out.print("Enter no of elements we want in array =");
	      n =sc.nextInt();
	      int a[] =new int[n];
	      System.out.print("Enter all the elements =");
	      for(i=0;i<n;i++){
		  	a[i]=sc.nextInt();
               }
	      System.out.print("Enter the elements of which we want to convert number of occurance =");
	      x=sc.nextInt();
	      for(i=0;i<n;i++){
                    if(a[i]==x){
                             count++;
   			}
		}	
	      System.out.println("Number of occurance of the elements ="+count);			
	}
}