package com.hemebiotech;

import java.util.List;
import java.util.Map;

/*
 This is a main class
 the program will read a file which contains a list of sypmtoms and count theses 
 and print the result by the count and sorting in another file
 
 
  
 */

public class AnalyticsCounter {
	public static void main(String[] args) {
		final String path;
		// dans args le PATH qui contiendra le fichier symptomes.txt
		// Nous utilisons le même PATH pour déposer result.out
		if (args.length == 1) {
			path = args[0];
		} else {
			path = "";
		}
		final String inputFile = path + "/symptomes.txt";
		final String outputName = path + "/result.out";
		
		ReaderSymptomsDataFromFile reader = new ReaderSymptomsDataFromFile(inputFile);
		List namesOfSymptomes = reader.getSymtoms();

		NumberOfOccurrences countSymptomes = new NumberOfOccurrences();
		Map<String, Integer> getNumberOfOccurrences = countSymptomes.getNumberOfOccurrences(namesOfSymptomes);

		WriteSymptoms writeSymptoms = new WriteSymptoms(outputName);
		writeSymptoms.writeSymptomsInAFile(getNumberOfOccurrences);
	}
}
