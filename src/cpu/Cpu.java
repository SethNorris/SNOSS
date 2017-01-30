package cpu;

public class Cpu{

	RAM ram;
	Register[] registers = new Register[6];
	public Cpu(){
		for(int i = 0; i < 6; i++){
			registers[i] = new Register();
		}
	}
	int i = 0;
	
	

	public void doProgram(int pcbStart){
		int pId = ram.memory[pcbStart];
		int start = byteArrayToInt(ram.memory[pcbStart + 1], ram.memory[pcbStart + 2]);
		int end = byteArrayToInt(ram.memory[pcbStart + 3], ram.memory[pcbStart + 4]);
		byte[] temp = new byte[4];
		for(int i = start; i <= end; i++){
			temp[0] = ram.memory[i];
			temp[1] = ram.memory[i + 1];
			temp[2] = ram.memory[i + 2];
			temp[3] = ram.memory[i + 3];
			i = i + 3;
			processCommand(temp, start, end);
		}
	}
	
	public void processCommand(byte[] command, int pcbStart, int pcbEnd){
		switch(command[0]){
		case 1:
			load(command);
			break;
		case 10:
			loadc(command);
			break;
		case 2:
			store(command, pcbStart, pcbEnd);
			break;
		case 3:
			add(command);
			break;
		case 4:
			sub(command);
			break;
		case 5:
			mul(command);
			break;
		case 6:
			div(command);
			break;
		case 7:
			eq(command);
			break;
		case 8:
			mygoto(command);
			break;
		case 11:
			gotoif(command);
			break;
		case 9:
			cprint(command);
			break;
		case 16:
			cread(command);
			break;
		case 17:
			exit(command);
			break;
		}
	}

	public void load(byte[] command) {
		
	}

	public void loadc(byte[] command) {
		registers[command[1]].write(byteArrayToInt(command[2],command[3]));
	}

	public void store(byte[] command, int start, int end) {
		
		//System.out.println("STORE" + i++);
		int memAddress = byteArrayToInt(command[1],command[2]);
		if(start + memAddress < end - 1){
			ram.store(memAddress, registers[command[3]].read());
		}
	}

	public void add(byte[] command) {
		int x = registers[command[2]].read();
		int y = registers[command[3]].read();
		registers[command[1]].write(( x+y ));
	}

	public void sub(byte[] command) {
		int x = registers[command[2]].read();
		int y = registers[command[3]].read();
		registers[command[1]].write(( x-y ));
	}

	public void mul(byte[] command) {
		int x = registers[command[2]].read();
		int y = registers[command[3]].read();
		registers[command[1]].write(( x*y ));
	}

	public void div(byte[] command) {
		int x = registers[command[2]].read();
		int y = registers[command[3]].read();
		registers[command[1]].write(( x/y ));
	}

	public void eq(byte[] command) {
		
	}

	public void mygoto(byte[] command) {
		
	}

	public void gotoif(byte[] command) {
		
	}

	public void cprint(byte[] command) {
		System.out.println("CPRINT: "  + ram.read(byteArrayToInt(command[1],command[2])));
	}

	public void cread(byte[] command) {
		
	}

	public void exit(byte[] command) {
		
	}
	
	public void putRam(RAM ram){
		this.ram = ram;
	}
	
	private int byteArrayToInt(byte x, byte y){
		int first = x;
		int second = y;
		String firstString = addZeros(Integer.toBinaryString(first & 0xff));
		String secondString = addZeros(Integer.toBinaryString(second & 0xff));
		String finalString = firstString + secondString;
		
		return Integer.parseInt(finalString, 2);
	}
	
	private String addZeros(String thing){
		String emptyString = "";
		for(int i = 0; i < 8 - thing.length(); i++){
			emptyString += 0;
		}
		return emptyString + thing;
	}
	
	
}
