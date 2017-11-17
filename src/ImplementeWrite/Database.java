package ImplementeWrite;

import Interface.Write;

public class Database implements Write {

	public void write(String value) {
		System.out.println(" *Database: " + value);

	}

}
