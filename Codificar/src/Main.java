import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
	
	private static String nombreFichero = "archivo.txt";
	private static String nombreCopia = "archivoCopia.txt";
	
	public static void main(String[] args) {		
		copiarFicheroDeTexto(nombreFichero);
		decodificarFichero(nombreCopia);
	}
	
	private static void copiarFicheroDeTexto(String nombreFichero) {
		String linea;
		String cifrado;
		
		try(FileReader flujoLectura=new FileReader(nombreFichero);
				BufferedReader filtroLectura=new BufferedReader(flujoLectura);
					FileWriter flujoEscritura=new FileWriter(nombreCopia);
						BufferedWriter filtroEscritura=new BufferedWriter(flujoEscritura);){
			
			linea=filtroLectura.readLine();
			while ( linea!=null){
				cifrado = Codificar.codifica(linea);
				
				filtroEscritura.write(cifrado);
				filtroEscritura.newLine();
				
				linea=filtroLectura.readLine();
				
			}
			
		}
		catch(FileNotFoundException e){
			System.out.println("No existe el fichero " + nombreFichero);
		}
		catch(IOException e){
			System.out.println( e.getMessage());
		}
	}
		
	private static void decodificarFichero(String nombreCopia) {
		String linea;
		String res;
		try(FileReader flujoLectura=new FileReader(nombreCopia);
				BufferedReader filtroLectura=new BufferedReader(flujoLectura);){
			
			linea=filtroLectura.readLine();
			while ( linea!=null){
				res = Codificar.decodifica(linea);
				
				System.out.println(res);
				
				linea=filtroLectura.readLine();
				
			}
			
		}
		catch(FileNotFoundException e){
			System.out.println("No existe el fichero " + nombreFichero);
		}
		catch(IOException e){
			System.out.println( e.getMessage());
		}
	}
}
