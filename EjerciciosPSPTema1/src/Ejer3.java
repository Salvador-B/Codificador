import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Ejer3 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		String comandoLinux = "ls";
		String comandoWindows = "CMD /C DIR";
		
		String comando = comandoWindows;
		
		Process p = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			p = rt.exec(comando);
			
			InputStream is = p.getInputStream();
			br = new BufferedReader(new InputStreamReader(is));
			
			bw = new BufferedWriter(
					new FileWriter(
							Cadenas.getCadenaFichero("salida_comando_" + comando.replace('/',  '_'))));
			
			String linea;
			while((linea = br.readLine())!=null) {
				bw.write(linea);
				bw.newLine();
			}
			
			br.close();
			bw.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
