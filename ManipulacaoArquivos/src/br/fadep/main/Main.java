package br.fadep.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		// Output - Saida
		// Input - Entrada
		
	esreverArquivo();	
	lerArquivoTela();
	lerArquivoRaiz();
	}
	
	public static void esreverArquivo() {
		String caminho= "C:\\codigos.txt";
		try {
			OutputStream outputStream = new FileOutputStream(caminho, true);
			OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream);
			BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
			
			bufferedWriter.write("Nova Linha\n");
			bufferedWriter.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void lerArquivoTela() {
		try {
			Path path = Paths.get("C:\\codigos.txt");
			List<String> linhas = Files.readAllLines(path);
			for(String linha : linhas) {
				System.out.println(linha);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void lerArquivoRaiz() {
		String caminhoArquivo = "C:\\codigos.txt";
		
		try {
			InputStream inputStream = new FileInputStream(caminhoArquivo);
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String conteudo = bufferedReader.readLine();
			
			while (conteudo != null) {
				System.out.println(conteudo);
				conteudo = bufferedReader.readLine();
			}
			
			bufferedReader.close();
			inputStreamReader.close();
			inputStream.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
