package com.lynda.oilvepress.oilve;

public class Kalamata extends Olive {

	public Kalamata() {
		super(2);
		this.name = "Kalamata";
		this.color = BLACK;
		this.flavor = "Grassy";
	}
	
	@Override
	public int crush() {
		System.out.println("Crush from subclass");
		return super.crush();
	}
	
	/**
	 * @return
	 * THis is a unique method for <b>Kalamata</b> class
	 */
	public String getOrigin() {
		return "Grees";
	}
	
}
