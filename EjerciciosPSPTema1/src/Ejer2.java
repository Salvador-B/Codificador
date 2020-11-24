import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejer2 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		String comandoLinux = "ls";
		String comandoWindows = "CMD /C DIR";
		
		String comando = comandoWindows;
		
		Process p = null;
		
		try {
			p = rt.exec(comando);
			
			InputStream is = p.getInputStream();
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			
			String linea;
			while((linea = br.readLine())!=null) {
				System.out.println(linea);
			}
			
			br.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
