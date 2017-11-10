package pacoteIO;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileTest {
	public static void main(String[] args) {
		File file = new File("C:\\DEVELOPMENTKIT\\testIO\\Arquivo.txt");
		try {
			System.out.println(file.createNewFile());// Para Criar um arquivo
			System.out.println(file.exists());// Para saber se o arquivo existe
			boolean exists = file.exists();
			System.out.println("Permissão de Leitura? " + file.canRead());// Saber se o arquivo pode ser editado			
			System.out.println("Path "+file.getPath());//Para saber o caminho da pasta do arquivo
			System.out.println("path "+file.getAbsolutePath());//Para saber o caminho completo do arquivo
			System.out.println("É um Diretorio? "+file.isDirectory());//Para saber se é um diretorio ou arquivo
			System.out.println("É um arquivo oculto? "+file.isHidden());//Para saber se é um arquivo oculto
			System.out.println("Quando foi a ultima modificação? "+ new Date(file.lastModified()));//Para saber quando o arquivo foi modificado pela ultima vez
			if (exists) {
				System.out.println("Deletado? " + file.delete());
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
