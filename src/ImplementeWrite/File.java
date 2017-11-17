package ImplementeWrite;

import Interface.Write;

public class File implements Write {

	public void write(String value) {
		System.out.println(" *File: " + value);

	}

}
