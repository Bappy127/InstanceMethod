package com.lynda.oilvepress.oilve;

/**
 * This is the olive class for all my olive class
 * @author Bappy127
 *
 */
public class Olive {
	
	public static final long BLACK = 0x000000;
	public static final long GREEN = 0x00FF00;
	
	public String name = "coconut";
	public String flavor = "Grassy";
	public long color = Olive.BLACK;
	private int oil = 3;
	
	public int getOil() {
		return oil;
	}

	public void setOil(int oil) {
		this.oil = oil;
	}

	public Olive() {
		System.out.println("Constructor of " + this.name);
	}
	
	public Olive(int oil) {
		setOil(oil);
	}

	/**
	 * @return 
	 * Use this crush method for crush the oil
	 */
	public int crush() {
		System.out.println("Crush from superclass!");
		return getOil();
	}

}
