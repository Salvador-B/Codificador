
public class Ejer4 {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		
		String comandoLinux = "ls --help";
		String comandoWindows = "CMD /C DIRRMR";
		
		String comando = comandoWindows;
		
		Process p = null;
		
		try {
			p = rt.exec(comando);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		int status;
		
		try {
			status = p.waitFor();
			System.out.println("El comando " + comando + " ha resultado " + status);			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}

	}

}
