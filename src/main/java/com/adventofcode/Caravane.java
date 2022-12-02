package com.adventofcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Caravane {

    private List<Elf> elves;

    public Caravane(List<Elf> elves) {
        this.elves = elves;
    }

    public int getTopLoader() {
        return elves.stream()
            .mapToInt(elf -> elf.getCurrentLoad())
            .max()
            .getAsInt();
    }

    public int getTopThreeLoaders() {
        int[] loads = getSortedArrayOfLoads();
        List<Integer> loadList = toList(loads);
        Collections.reverse(loadList);
        return loadList.stream()
            .limit(3)
            .mapToInt(x -> x)
            .sum();
    }

    private int[] getSortedArrayOfLoads() {
        int[] loads = elves.stream()
            .mapToInt(elf -> elf.getCurrentLoad())
            .sorted()
            .toArray();
        return loads;
    }

    private List<Integer> toList(int[] loads) {
        List<Integer> loadList = new ArrayList<>();
        for (Integer integer : loads) {
            loadList.add(integer);
        }
        return loadList;
    }

}
