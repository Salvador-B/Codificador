import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Ejer8 {

	public static void main(String[] args) {
		ProcessBuilder pEnv = new ProcessBuilder();
		Map<String, String> vbles = pEnv.environment();
		System.out.println(vbles);
		
		List<String> lCommand = new ArrayList<String>();
		lCommand.add("CMD");
		lCommand.add("/C");
		lCommand.add("DIRR");
		
		ProcessBuilder pb = new ProcessBuilder(lCommand);
		System.out.println(pb.command());
		
		try {
			pb.start();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
