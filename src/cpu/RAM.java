package cpu;

public class RAM {

	byte[] memory = new byte[10000];
	
	public RAM(){
		for(int i = 0; i < 10000; i++){
			memory[0] = 0;
		}
	}
	
	public void loadProcess(byte[] process){
		for(int i = 0; i < process.length; i++){
			memory[i] = process[i];
		}
	}
}
