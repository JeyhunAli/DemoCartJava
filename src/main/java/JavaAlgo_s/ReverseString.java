package JavaAlgo_s;

public class ReverseString {

	public static void main(String[] args) {
		
		reverse();
		reverse_2();
		reverse_3("Sahib Yaxci Oglan");
		
	}
	
	public static void reverse() {
		String ss = "Computer";
		System.out.println("String before reversing -> " +ss);
		StringBuffer st = new StringBuffer(ss);
		System.out.println(st.reverse());
		
	}
	
	public static void reverse_2() {
		String s = "Laptop";
		System.out.println("String before reversing  -> " + s);
		String reverse = "";
		for(int i=s.length()-1; i>=0; i--) {
			reverse = reverse + s.charAt(i);
		}
		System.out.println(reverse);
	}
	
	
	public static void reverse_3(String input) {
		System.out.println("String before reversing  -> " + input);
		String reverse = "";
		for(int i=input.length()-1; i>=0; i--) {
			reverse = reverse + input.charAt(i);
		}
		System.out.println(reverse);
	}
	

}
