import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejer5 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		
		String comandoLinux = "lsss -help";
		String comandoWindows = "CMD /C DIRRMR";
		
		String comando = comandoWindows;
		
		Process p = null;
		
		try {
			p = rt.exec(comando);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int status;
		BufferedReader br = null;
		
		try {
			status = p.waitFor();
			System.out.println("El comando " + comando + " ha resultado " + status);	
			System.out.println("La salida ha sido: ");
			
			InputStream errStream = p.getErrorStream();
			br = new BufferedReader(new InputStreamReader(errStream));
			
			String linea = "";
			while ((linea = br.readLine()) !=null){
				System.out.println(linea);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
