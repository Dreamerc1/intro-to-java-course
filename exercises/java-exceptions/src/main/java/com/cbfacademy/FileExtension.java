package com.cbfacademy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileExtension {

    public boolean check(String filename) throws FilenameException {
        if (filename == null || filename.isEmpty()) {
            throw new FilenameException("Filename cannot be null or empty.");
        }
        return filename.endsWith(".java");
    }

    public Map<String, Integer> map(List<String> filenames) {
        Map<String, Integer> resultMap = new HashMap<>();
        for (String filename : filenames) {
            try {
                boolean isJavaFile = check(filename);
                resultMap.put(filename, isJavaFile ? 1 : 0);
            } catch (FilenameException e) {
                resultMap.put(filename, -1);
            }
        }
        return resultMap;
    }

    public static void main(String[] args) {
        FileExtension fileExtension = new FileExtension();
        List<String> filenames = List.of("test.java", "example.txt", "", null, "main.java");

        Map<String, Integer> resultMap = fileExtension.map(filenames);
        for (Map.Entry<String, Integer> entry : resultMap.entrySet()) {
            System.out.println("Filename: " + (entry.getKey() != null ? entry.getKey() : "null") + ", Result: " + entry.getValue());
        }
    }
}
