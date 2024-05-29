package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

public class FullSearch {

    public HashSet<String> extractNumber(List<Task> tasks) {
        HashSet<String> uniqueNumbers = new HashSet<>();
        for (Task task : tasks) {
            uniqueNumbers.add(task.getNumber());
        }
        return uniqueNumbers;
    }
}