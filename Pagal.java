import java.util.Scanner;
class Pagal{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int row;
	System.out.print("Enter your choice to print number :");
        row=sc.nextInt();
        int i,j;
	for(i=0;i<=row;i++){
		for(j=1;j<=i;j++){
				System.out.print("j");
			}
			System.out.println();
		}
	}
}