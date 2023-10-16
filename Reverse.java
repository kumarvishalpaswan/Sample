class Reverse{
	public static void main(String args[]){
		//String name="jungle"; //

                int arr[] ={1,2,3,4,5,6,7,8};

                for(int i=0;i<arr.length/2;i++){
                  int temp;
                  temp=arr[arr.length-1-i];
                  arr[arr.length-1-i]=arr[i];
                  arr[i]=temp;

             }
       
         for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]); 

  		
 	}
 }
