
public class Assignment1 {
	
	public static int ret() {
		return 17;
	}
	
	public static boolean logic(boolean a, boolean b, boolean c) {
		return a&&b&&c;
	}
	
	public static String stars(int rows) {
		String str = "";
		for(int i = 0; i<rows; i++) {
			for(int k = 0; k<=i; k++) {
				str += "*";
			}
			str += "\n";
		}
		return str;
	}
	
	public static int coins(int n) {
		if(n%5==0) {
			return n/5;
		} else if((n%5)%2==0) {
			return n/5 + n/5/2;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		System.out.println(ret());
		System.out.println();
		System.out.println(logic(true, false, true));
		System.out.println();
		System.out.println(stars(5));
		System.out.println(coins(12));
	}
}
