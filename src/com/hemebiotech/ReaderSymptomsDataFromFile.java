package com.hemebiotech;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReaderSymptomsDataFromFile implements ISymptomReader {
	private BufferedReader br;
	private ArrayList<String> symptomesList = new ArrayList<String>();
	private String fileInputName = "C:\\Users\\Gonan\\eclipse-workspace\\OpenclassRoom_Project02\\src\\com\\hemebiotech\\symptomes.txt";

	public ReaderSymptomsDataFromFile() {
		// TODO Auto-generated constructor stub
	}

	public ReaderSymptomsDataFromFile(String fileInputName) {
		super();
		this.fileInputName = fileInputName;
	}

	@Override
	public List<String> getSymtoms() {

		File file = new File(fileInputName);

		try {
			String lines;
			int compteur = 0;
			br = new BufferedReader(new FileReader(file));

			while ((lines = br.readLine()) != null) {
				compteur = compteur + 1;

				System.out.println(compteur + ")" + lines);
				symptomesList.add(lines);

			}
			System.out.println("*************************************************");
			System.out.printf("Le fichier %s contient %d lignes \n", fileInputName.substring(77), compteur);
			System.out.println("*************************************************");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return symptomesList;
	}

}
