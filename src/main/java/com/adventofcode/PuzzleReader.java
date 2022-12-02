package com.adventofcode;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class PuzzleReader {
    
    private static final String DOUBLE_NEWLINE = "\\n\\n";
    private File file;

    public PuzzleReader(File file) {
        this.file = file;
    }

    public List<Elf> getElves() throws IOException {
        String puzzle = Files.readString(file.toPath());
        List<Elf> elves = new ArrayList<>();
        for (String caloriesSection : splitByDoubleNewline(puzzle)) {
            elves.add(extractElv(caloriesSection));
        }
        return elves;
    }

    private String[] splitByDoubleNewline(String readString) {
        return readString.split(DOUBLE_NEWLINE);
    }

    private Elf extractElv(String string) {
        List<Integer> loadedCalories = new ArrayList<>();
        String[] calories = string.split("\\n");
        for (String calorie : calories) {
            loadedCalories.add(Integer.parseInt(calorie));
        }
        return new Elf(loadedCalories);
    }
}
