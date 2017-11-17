package ImplementeWrite;

import Interface.Write;

public class Printer implements Write {

	public void write(String value) {
		System.out.println(" *Printer: " + value);

	}
	
}
