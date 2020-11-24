import java.io.IOException;

public class Ejer1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime rt = Runtime.getRuntime();
		//Process p = null;
		try {
			rt.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("prueba");
		}
	}

}
