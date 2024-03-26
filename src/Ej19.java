
public class Ej19 {
	
public static int dameIndice(String[] a, char x) {
		
		int pos = 0;
		
		for (int i = 0; i < a.length; i++) {
			
			if (a[i] == x+"") {
				pos = i;
			}
		}
		return pos;
	}

	public static boolean esAbecedaria(String s) {
		String[] abc = {
			    "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m",
			    "n", "ñ", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"
			    };
		
		String nStr = "";
		String word = s.toLowerCase();
		int registro = -1;
		for (int i = 0; i< word.length(); i++) {
			
			if (dameIndice(abc, word.charAt(i)) >= registro) {
				registro= dameIndice(abc, word.charAt(i));
				nStr += word.charAt(i);
			}
		
			else {
				break;
			}
		}
		
		if(word.equals(nStr)) {
			return true;
		}
		
		else {
			return false;
		}
	}
		
	public static void main(String[] args) {
		
		System.out.println(esAbecedaria("sadt"));

	}

}

		