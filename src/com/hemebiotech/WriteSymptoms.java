package com.hemebiotech;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WriteSymptoms {

	public void writeSymptomsInAFile(Map<String, Integer> getNumberOfOccurrences) {
	
		try {
			List<String>listWritter = getNumberOfOccurrences.entrySet().stream()
					.map(entry->entry.getKey()+ ":"+entry.getValue()).collect(Collectors.toList());
			Files.write(Paths.get("C:\\Users\\Gonan\\eclipse-workspace\\OpenclassRoom_Project02\\src\\com\\hemebiotech\\result.out"),listWritter);	
			}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
