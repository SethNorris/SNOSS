package controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import assembler.Assembler;

public class Shell {
	ProcessController pc;
	
	public Shell(){
		pc = new ProcessController();
	}
	
	public void start() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split;
		String input;
		
		while((input = br.readLine()) != null){
			split = input.split(" ");
			switch(split[0]){
			case "ls":
				System.out.println("LS");
				break;
			case "ps":
				System.out.println("PS");
				break;
			case "exec":
				System.out.println(split[1]);
				pc.executeProcess(split[1]);
				break;
			case "exec_i":
				System.out.println(split[1]);
				break;
			case "kill":
				System.out.println(split[1]);
				break;
			case "exit":
				System.exit(0);
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
			
		}
	}

}
