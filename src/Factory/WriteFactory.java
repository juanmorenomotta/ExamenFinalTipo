package Factory;

import Interface.Write;

public class WriteFactory {

	String typeWrite;
	public WriteFactory( String type) {
		this.typeWrite = type;
	}	
	
	public Write TypeWrite(){
		try {
			Object obj = Class.forName(this.typeWrite).newInstance();
			return (Write) obj;
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}	
}
