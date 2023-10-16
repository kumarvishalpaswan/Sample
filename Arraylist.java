bbimport java.util.ArrayList;
class Arraylist{
	public static void main(String args[]){
		ArrayList al =new ArrayList();
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		al.add(10);
		al.add(20);
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al);
		System.out.println(al.size());
		al.add("Ajay");
		al.add("Ajay");
		System.out.println(al);
		ArrayList l1 =new ArrayList();
    		l1.add(19);
		l1.add(21);
		System.out.println(l1);
	}
  }