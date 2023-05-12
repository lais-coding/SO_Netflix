package main;

import java.io.IOException;

import controller.NetflixController;
import model.Serie;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		
		String path = "C:\\TEMP";
		String arquivo = "netflix_originals_series_2.csv";
		
		NetflixController netflix = new NetflixController();
		
		netflix.leArquivo(path, arquivo);

	}

}
