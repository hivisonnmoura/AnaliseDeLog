package servicos;


import java.io.File;
import java.util.List;

import utilidades.ProcessaDadosDoNo;

public class ServicoFachada {

	ServicoDescompactador servicoDescompactador = new ServicoDescompactador();
	ProcessaDadosDoNo processaDadosDoNo = new ProcessaDadosDoNo();
	
	//static ServicoInterpretador servicoInterpretador = new ServicoInterpretador();
	
	public static void ServicoFachada(){
		
	}
	
	public File solicitarServicoDescompactador(String caminho, List<String> ListaArquivo ){
		File file = servicoDescompactador.extrairLogs(caminho, ListaArquivo);
		System.out.println(file.getAbsolutePath());
		solicitarProcessaDadosDoNo(file);
		return file;
	}
	
	
	public void solicitarProcessaDadosDoNo(File caminhoTemp ){
		processaDadosDoNo.processaDiretorio(caminhoTemp);
		//pegar retorno para criar objeto
	}
}

 


