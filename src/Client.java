import java.io.IOException;

public class Client {

	public static void main(String[] args) throws IOException  {
		
		Copier copier = new Copier("File", "Keyboard");
		copier.copy();

	}

}
