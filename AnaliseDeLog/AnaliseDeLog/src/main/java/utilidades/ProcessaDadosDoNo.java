<<<<<<< HEAD:AnaliseDeLog/AnaliseDeLog/src/main/java/utilidades/ProcessaDadosDoNo.java
package utilidades;


import java.io.File;

public class ProcessaDadosDoNo {

	public static String[] processaNomeDoArquivo(String caminhoDoArquivo) {
		caminhoDoArquivo = caminhoDoArquivo.replace("\\", File.separator);
		System.out.println(caminhoDoArquivo);
		String[] nomePartes = caminhoDoArquivo.split(File.separator);
		String nomePasta = nomePartes[nomePartes.length - 3];
		//System.out.println(nomePasta);

		
		String[] noAtributoData = nomePasta.split("_");
		noAtributoData[2] = noAtributoData[2].replace("-","/");
		//System.out.println(noAtributoData[1]);
		return noAtributoData; //Retorna vetor com dados da pasta 1--> Nome 2--> Data

	}
	
	public void processaDiretorio(File file){
		String[] processaNomeDoArquivo = processaNomeDoArquivo(file.getAbsolutePath());
		for (String string : processaNomeDoArquivo) {
			System.out.println(string);
		}
	}

	public static void main(String[] args) {
		File arquivo = new File(
				"C:\\Users\\Wendler\\Desktop\\Empresas\\Indra\\Projeto Elektro\\acompanhamento_cmpsczeus01_10-20\\CPUProcess_cmpsczeus01_10-20_1625.txt");

		processaNomeDoArquivo(arquivo.getPath());
	}
}
=======
package utilidades;


import java.io.File;
import java.util.ArrayList;

import entidades.EntidadeProcesso;

public class ProcessaDadosDoNo {
	static ProcessaDadosCPU processaDadosCPU = new ProcessaDadosCPU ();
	
	public String[] processaDiretorio(File file) {

		String[] arquivos = file.list();
		String diretorioDoTemp = file.getAbsolutePath();
		System.out.println(diretorioDoTemp);
		
		for (String file1 : arquivos) {
			//	
			// System.out.println( file1 );

		}

		//
		// String[] processaNomeDoArquivo =
		// processaNomeDoArquivo(file.getAbsolutePath());
		// for (String string : processaNomeDoArquivo) {
		// System.out.println(string);
		// }
		processaDiretorioDoArquivo(arquivos,diretorioDoTemp);
		return arquivos;
	}
	
	public static void processaDiretorioDoArquivo(String[] arquivos,String diretorioDoTemp) {
		
		
		for (String file1 : arquivos) {
			String[] noAtributoData = file1.split("_");
			String nomeNo = noAtributoData[1];
			String dataNo = noAtributoData[2];
		    //System.out.println(nomeNo+" "+dataNo);
			 String diretorio = diretorioDoTemp.concat("\\").concat(file1);
					 
		     //System.out.println(diretorio);
		  processaDadosCPU.processaDiretorioDoNo(diretorio,nomeNo);
		     
		     
			
		}
		
		
		
//		arquivos = arquivos.replace("\\", File.separator);
//		System.out.println(arquivos);
//		String[] nomePartes = arquivos.split(File.separator);
//		String nomePasta = nomePartes[nomePartes.length - 3];
//		// System.out.println(nomePasta);

//		String[] noAtributoData = nomePasta.split("_");
//		noAtributoData[2] = noAtributoData[2].replace("-", "/");
//		// System.out.println(noAtributoData[1]);
//		return noAtributoData; // Retorna vetor com dados da pasta 1--> Nome
//								// 2--> Data

	}

	
	
	
	

}
>>>>>>> 292c26661d5de45fcd5a6b6e1b1754a76e2d563e:AnaliseDeLog/src/main/java/utilidades/ProcessaDadosDoNo.java
