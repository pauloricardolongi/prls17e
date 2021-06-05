package aplicacao;

import java.io.File;
import java.util.Scanner;

public class App04 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("entre com o caminho da folder path:");
		String strPath = sc.nextLine();
		
		File path= new File(strPath);
		File[] folders = path.listFiles(File::isDirectory);
		System.out.println("FOLDER:");
		for (File  folder : folders) {
			System.out.println(folder);
		}
		File[] files= path.listFiles(File::isFile);
		System.out.println("FILES:");
		for(File file : files) {
			System.out.println(file);
		}
		boolean sucesso = new File(strPath + "\\subpasta").mkdir();
		System.out.println("Diretorio criado sucesso: "+ sucesso);
		
		sc.close();

	}

}
