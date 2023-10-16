import java.util.Scanner;
class Legal{
	public static void main (String args[]){
	int i;
	int j;
	Scanner sc =new Scanner(System.in);
        int row;
	System.out.print("Enter any number to print :");
         row=sc.nextInt();
	for(i=4;i>=1;i--){
		for(j=1;j<=i;j++){
		System.out.print(j);
	}
		System.out.println();
	}
	}
}