public class String{
	public static void main(String[] args){
		String str = "This sentance contains find me string";
		System.out.println(str);
		// find word in String
		String find = "find me";
		boolean val = str.contains(find);
		if(val)
			System.out.println("String found: "+find);
		else 
			System.out.println("string not found");
	}
}