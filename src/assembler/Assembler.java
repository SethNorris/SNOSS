package assembler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import interfaces.AssemblerInstructions;

public class Assembler implements AssemblerInstructions{

	public Assembler(){};

	public void processFile(File assemblyCode) throws FileNotFoundException, IOException{
		try(BufferedReader br = new BufferedReader(new FileReader(assemblyCode))) {
			for(String line; (line = br.readLine()) != null; ) {
				String[] split = line.split(" ");
				switch(split[0]){
				case "LOAD":
					break;
				case "LOADC":
					break;
				case "STORE":
					break;
				case "ADD":
					break;
				case "SUB":
					break;
				case "MUL":
					break;
				case "DIV":
					break;
				case "EQ":
					break;
				case "GOTO":
					break;
				case "GOTOIF":
					break;
				case "CPRINT":
					break;
				case "CREAD":
					break;
				case "EXIT":
					break;
				}
			}
			// line is not visible here.
		}
	}

	@Override
	public String load(String dest, String mem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String loadc(String dest, String val) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String store(String mem, String src) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String add(String dest, String src1, String src2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String sub(String dest, String src1, String src2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mul(String dest, String src1, String src2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String div(String dest, String src1, String src2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String eq(String dest, String src1, String src2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String mygoto(String jump) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String gotoif(String jump, String src) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String cprint(String mem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String cread(String mem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String exit() {
		// TODO Auto-generated method stub
		return null;
	}









}
