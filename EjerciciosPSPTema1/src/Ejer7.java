import java.io.IOException;

public class Ejer7 {

	public static void main(String[] args) {
		String comandoLinux = "Firefox";
		String comandoWindows = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";
		
		String comando = comandoWindows;
		
		try {
			ProcessBuilder pb = new ProcessBuilder(comando, "iescristobaldemonroy.es");
			pb.start();
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
