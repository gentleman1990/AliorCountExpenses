package io.parser;

import model.ExpenseModel;

import java.util.ArrayList;
import java.util.List;

public class CSVParser {

    public static List parse(List<String> lines){
        List models = new ArrayList<ExpenseModel>();
        lines.forEach(line -> {
            String[] splitLine = line.split(";");
            models.add(new ExpenseModel(splitLine[2],splitLine[3],splitLine[4],Double.parseDouble(splitLine[5].replace(",","."))));
        });
        return models;
    }
}
