package br.fadep.biblioteca.gerador;

import java.io.IOException;

public class FileData {
	public String[] catchData(String file_name_arg){
		String file_name = file_name_arg;
		
		try {			
			ReadFile file = new ReadFile(file_name);
			String[] aryLines = file.OpenFile();
			return aryLines;
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}

}
