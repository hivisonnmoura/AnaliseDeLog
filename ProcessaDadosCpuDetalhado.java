package utilidades;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import servicos.ServicoThread;

public class ProcessaDadosCpuDetalhado {

	public static void processaCpuDetalhada(String caminhoDoArquivo) {

		ServicoThread servicoThread = new ServicoThread();
		List<String> listaCpuDetalhada = new ArrayList<>();

		try (Stream<String> stream = Files.lines(Paths.get(caminhoDoArquivo))) {
			listaCpuDetalhada = (List<String>) stream.filter(cpuDetalhado -> cpuDetalhado.contains("java"))
					.collect(Collectors.toList());
			listaCpuDetalhada.forEach(System.out::println);

		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String cpuDetalhada : listaCpuDetalhada) {
			String[] arrayCpuDetalhada = cpuDetalhada.split("\\s+");
			String[] arrayCpuDetalhadaquebraBarra = arrayCpuDetalhada[10].split("/");
			String pidDetalhadaDadoString = arrayCpuDetalhada[1];
			int pidDetalhadaDadoInt = Integer.parseInt(pidDetalhadaDadoString);
			String cpuDetalhadaDado = arrayCpuDetalhada[9];
			String lwpidDeatalhadaDadoString = arrayCpuDetalhadaquebraBarra[1];
			int lwpidDetalhadaDadoInt = Integer.parseInt(lwpidDeatalhadaDadoString);
			servicoThread.solicitarCriacaoThread(pidDetalhadaDadoInt, cpuDetalhadaDado, lwpidDetalhadaDadoInt);
			
		}

	}

	public static void main(String[] args) {
		String fileName = "C:\\Users\\Wendler\\Desktop\\Empresas\\Indra\\Projeto Elektro\\acompanhamento_cmpsczeus01_10-20\\CPUProcess_Detalhado_cmpsczeus01_10-20_1625.txt";
		processaCpuDetalhada(fileName);

	}
}
