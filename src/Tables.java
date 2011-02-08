import java.util.HashMap;


public class Tables {
	
	public HashMap<String, char[]> machineOpTable;
	
	public HashMap<String, Integer> psuedoOpTable;
	
	public HashMap<String, String[]> symbolTable;
	
	public HashMap<String, String[]> literalTable;
	
	public Tables() {
		machineOpTable = new HashMap<String, char[]>();
		psuedoOpTable = new HashMap<String, Integer>()
		symbolTable = new HashMap<String, String[]>();
		literalTable = new HashMap<String, String[]>();
		
	}
}
