class Reverse_1{
	public static void main(String args[]){
		String name="jungle"; //

                char arr[]=name.toCharArray();

                for(int i=0;i<arr.length/2;i++){
                  char temp;
                  temp=arr[arr.length-1-i];
                  arr[arr.length-1-i]=arr[i];
                  arr[i]=temp;

             }
       
         for(int i=0;i<arr.length;i++)
          System.out.print(arr[i]); 

  		
 	}
 }
