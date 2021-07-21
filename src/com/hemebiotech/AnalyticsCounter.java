package com.hemebiotech;

import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	public static void main(String[] args) {
		final String fileInputName = "C:\\Users\\Gonan\\eclipse-workspace\\OpenclassRoom_Project02\\src\\com\\hemebiotech\\symptomes.txt";
		ReaderSymptomsDataFromFile reader = new ReaderSymptomsDataFromFile(fileInputName);
		List namesOfSymptomes = reader.getSymtoms();
	

		NumberOfOccurrences countSymptomes = new NumberOfOccurrences();
		Map<String, Integer> getNumberOfOccurrences = countSymptomes.getNumberOfOccurrences(namesOfSymptomes);
	}
}
