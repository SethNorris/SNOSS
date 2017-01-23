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
		StringBuilder sb = new StringBuilder();
		try(BufferedReader br = new BufferedReader(new FileReader(assemblyCode))) {
			for(String line; (line = br.readLine()) != null; ) {
				String[] split = line.split(" ");
				switch(split[0]){
				case "LOAD":
					sb.append(load(split[1],split[2]));
					break;
				case "LOADC":
					sb.append(loadc(split[1],split[2]));
					break;
				case "STORE":
					sb.append(store(split[1],split[2]));
					break;
				case "ADD":
					sb.append(add(split[1],split[2],split[3]));
					break;
				case "SUB":
					sb.append(sub(split[1],split[2],split[3]));
					break;
				case "MUL":
					sb.append(mul(split[1],split[2],split[3]));
					break;
				case "DIV":
					sb.append(div(split[1],split[2],split[3]));
					break;
				case "EQ":
					sb.append(eq(split[1],split[2],split[3]));
					break;
				case "GOTO":
					sb.append(mygoto(split[1]));
					break;
				case "GOTOIF":
					sb.append(gotoif(split[1],split[2]));
					break;
				case "CPRINT":
					sb.append(cprint(split[1]));
					break;
				case "CREAD":
					sb.append(cread(split[1]));
					break;
				case "EXIT":
					sb.append(exit());
					break;
				}
			}
			// write stringbuilder to file
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
