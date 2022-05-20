package JavaAlgo_s;

public class RemoveJunk {

	public static void main(String[] args) {
		
		//for that need to use regular expression

		String s = "*&^%%#$@)*((&&^ String 0946483";
		String regex = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(regex);
		
		
	}

}
