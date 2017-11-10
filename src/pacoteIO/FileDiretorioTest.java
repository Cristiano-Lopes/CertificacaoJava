package pacoteIO;

import java.io.File;
import java.io.IOException;

public class FileDiretorioTest {

	public static void main(String[] args) throws IOException {
		 File diretorio = new
		 File("C:\\Users\\Cristiano\\Desktop\\Folder");//Criando uma Pasta no caminho informado
		 boolean mkdir = diretorio.mkdir();// Informa se o diretório foi criado
		 System.out.println("Diretorio Criado " + mkdir);
		
		 File arquivo = new File(diretorio, "arquivo.txt");//Criando arquivo dentro do Diretorio
		 boolean newFile = arquivo.createNewFile();
		 System.out.println("Arquivo criado " + newFile);
		
		 File arquivoNovoNome = new File(diretorio, "arquivo renomeado.txt");//Renomear o nome do arquivo
		 boolean renamed = arquivo.renameTo(arquivoNovoNome);
		 System.out.println("Renomeado " + renamed);
		
		 File diretorioRenomeado = new File("Folder2");
		 boolean diretorioRenamed = diretorio.renameTo(diretorioRenomeado);
		 System.out.println("diretorio renomeado: "+diretorioRenamed);
//		buscarArquivos();
	}

	public static void buscarArquivos() {
		File file = new File("folder2");
		String[] list = file.list();
		for (String arquivo : list) {
			System.out.println(arquivo);
		}
	}

}
