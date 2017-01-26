package cpu;

import interfaces.Instructions;

public class Cpu implements Instructions{

	Register R1 = new Register();
	Register R2 = new Register();
	Register R3 = new Register();
	Register R4 = new Register();
	Register R5 = new Register();
	Register R6 = new Register();
	
	RAM ram = new RAM();
	
	public void processCommand(byte[] command){
		switch(command[0]){
		case 1:
			load(command);
			break;
		case 10:
			loadc(command);
			break;
		case 2:
			store(command);
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

	@Override
	public void load(byte[] command) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loadc(byte[] command) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void store(byte[] command) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(byte[] command) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub(byte[] command) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mul(byte[] command) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void div(byte[] command) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eq(byte[] command) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mygoto(byte[] command) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void gotoif(byte[] command) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cprint(byte[] command) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cread(byte[] command) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void exit(byte[] command) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
