package com.lynda.oilvepress.press;

import java.util.ArrayList;

import com.lynda.oilvepress.oilve.Olive;

public class Press {
	
	public void getoil(ArrayList<Olive> olives) {
		
		int oil = 0;
		
		for (Olive olive : olives) {
			oil += olive.crush();
		}
		
		System.out.println("You got " + oil + " unit of oil.");
	}
}
