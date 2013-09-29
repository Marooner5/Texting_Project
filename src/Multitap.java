/**
 * 
 */

/**
 * @author dela5875
 * 
 */
public class Multitap {
	private int presses = 0;
	private int previousKey = -1;
	private String[][] keys = new String[][] {
			{ "next", "next", "a", "d", "g", "j", "m", "p", "t", "w", "shift", "space" },
			{ "next", "next", "b", "e", "h", "k", "n", "q", "u", "x", "shift", "space" },
			{ "next", "next", "c", "f", "i", "l", "o", "r", "v", "y", "shift", "space" },
			{ "next", "next", null, null, null, null, null, "s", null, "z", "shift", "space" } 
		};
	private int currentLetter = 0;

	public String append(String txt, int key) {
		String newLetter = "";
		String result;
		if (presses == 0) {
			previousKey = key;
		}
		if (previousKey == key) {
			presses++;
		}
		return newLetter;
	}
}