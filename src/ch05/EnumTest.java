package ch05;

import java.util.Scanner;

/**
 * 
 * @author niuzhihuan
 */
public class EnumTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a size:(SMALL,MEDIUM,LARGE,EXTRA_LARGE)");
		String input=scanner.next().toUpperCase();
		Size size=Enum.valueOf(Size.class, input);
		System.out.println("size="+size);
		System.out.println("abbreviation="+size.getAbbreviation());
		if(size==Size.EXTRA_LARGE){
			System.out.println("Good job-");
		}
	}

}

enum Size{
	SMALL("S"),
	MEDIUM("M"),
	LARGE("L"),
	EXTRA_LARGE("XL");
	private String abbreviation;
	private Size(String abbreviation){
		this.abbreviation=abbreviation;
	}
	/**
	 * @return the abbreviation
	 */
	public String getAbbreviation() {
		return abbreviation;
	}
}