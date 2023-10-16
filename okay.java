class Okay{
	public static void main(String args[]){
		String s="Md-ImranKhan";
		String str=s.spilt("-");
		printString(str ,"String splilt method");
		
	}
	public static void printString(String str[],String approach){
		System.out.println("Spilt String uing " +approach);
		for(String string : str){
		System.out.println(string);	
		}
	}
}