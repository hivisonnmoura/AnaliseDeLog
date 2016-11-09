package teste;

import java.util.ArrayList;

import entidades.EntidadeProcesso;
import servicos.ServicoNo;
import servicos.ServicoProcesso;



public class TesteDeCriacaoDeProcessos {
	
	public void adicionarNaListaDeNos(String nome, String data, int pid2, String username2, String time2, String cpu2,
			int nlwp2, String process2, String hora) {
			ServicoNo no = new ServicoNo();
			
			ServicoProcesso processo = new ServicoProcesso();
			
			ArrayList<EntidadeProcesso> listaDeProcessos = new ArrayList<>();
		    EntidadeProcesso processo1 = processo.solicitarCriacaoProcesso(16, "abc", "palmeiras", "teste", 16, "abc", "1625");
			no.solicitarCriacaoNo("teste", "123132", listaDeProcessos);
			
			System.out.println(no);
			
		

	}

}
