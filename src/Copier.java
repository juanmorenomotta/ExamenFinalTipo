import java.io.IOException;

import Factory.ReadFactory;
import Factory.WriteFactory;
import Interface.Read;
import Interface.Write;

public class Copier {
	
	private String _write;
	private String _read;

	public Copier(String __write, String __read) {
		_write = "ImplementeWrite." + __write;
		_read = "ImplementRead." + __read;
	}

	public void copy() throws IOException {
		String inputValue = "";

		Write Writer = getWrite();
		Read Reader = getRead();
		while (!(inputValue = (Reader.read())).equals("-1")) {
			Writer.write(inputValue);
		}
	}	
	
	public Write getWrite() {
		WriteFactory w = new WriteFactory(this._write);
		return w.TypeWrite();
	}

	public Read getRead() {
		ReadFactory r = new ReadFactory(this._read);
		return r.TypeRead();
	}
}
