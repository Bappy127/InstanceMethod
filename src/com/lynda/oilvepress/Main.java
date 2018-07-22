package com.lynda.oilvepress;

import java.util.ArrayList;

import com.lynda.oilvepress.oilve.Kalamata;
import com.lynda.oilvepress.oilve.Ligurian;
import com.lynda.oilvepress.oilve.Olive;
import com.lynda.oilvepress.press.Press;

/**
 * @author Bappy127
 *This is the main class of my java app
 */
public class Main {

	public static void main(String[] args) {
		
		ArrayList<Olive> olives = new ArrayList<Olive>();
		
		Olive olive;
		
		olive = new Kalamata();
		System.out.println(olive.name);
		olives.add(olive);
		
		olive = new Ligurian();
		System.out.println(olive.name);
		olives.add(olive);
		
		olive = new Kalamata();
		System.out.println(olive.name);
		olives.add(olive);
		
		
		Press press = new Press();
		press.getoil(olives);
		
		Kalamata olive1 = (Kalamata) olives.get(0);
		System.out.println("olive1 came from " + olive1.getOrigin());
		
		
	}

}
