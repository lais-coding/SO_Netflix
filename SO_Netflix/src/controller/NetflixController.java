package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import br.edu.fateczl.filaobj.Fila;


public class NetflixController implements INetflixController {
	
	public NetflixController() {
		super();
	}
	

	//Verificar esse arquivo CSV
	
	@Override
	public void leArquivo(String path, String arquivo) throws IOException {
		File arq = new File(path, arquivo);
		
		if (arq.exists() && arq.isFile()) {
			FileInputStream abreFluxoArq = 
					new FileInputStream(arq);
			InputStreamReader leitorFluxo = 
					new InputStreamReader(abreFluxoArq);
			BufferedReader buffer = 
					new BufferedReader(leitorFluxo);
		
			
			
			//Vetor de filas (G�neros)
		Fila [] fila = new Fila[8];
		int cont = 0;
			
			//Pular o cabe�alho
			String linha = buffer.readLine();
			
			
			
			 
			linha = buffer.readLine();
			String vetLinha[] = linha.split(";");
			String generoAuxiliar = vetLinha[0];
			
			//Cria��o de fila - Anima��o (que � a primeira linha)
			fila[cont].insert(linha);
			
			
			linha = buffer.readLine();
			while(linha != null) {
				
				
				
				
			}
			
			
			
			
		}
	}
}

	
	
	
	
	
	
	
	