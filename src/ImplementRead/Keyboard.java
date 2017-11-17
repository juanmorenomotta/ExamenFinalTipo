package ImplementRead;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import Interface.Read;

public class Keyboard implements Read {

	public String read() throws IOException {
		System.out.print("Keyboard - Enter String:");
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		return bufferedReader.readLine();
	}

}
