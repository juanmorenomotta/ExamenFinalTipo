package Factory;

import Interface.Read;

public class ReadFactory {

	String typeRead;
	public ReadFactory( String type) {
		this.typeRead = type;
	}	
	
	public Read TypeRead(){
		try {
			Object obj = Class.forName(this.typeRead).newInstance();
			return (Read) obj;
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
