import io.CSVReader;
import io.parser.CSVParser;
import model.ExpenseModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String [] args){
        List readLines = CSVReader.read("C://Document2.CSV");

        HashMap tags = new HashMap(){{
            put("zabka", "Żabka");

            put("hanna socha", "Żłobek");

            put("tesco stacja paliw", "Paliwo");
            put("shell", "Paliwo");
            put("orlen", "Paliwo");
            put("autostrada", "Paliwo");
            put("bp", "Paliwo");
            put("lotos", "Paliwo");
            put("przeglad", "Paliwo");


            put("netflix", "Rachunki");
            put("aws", "Rachunki");
            put("fvt", "Rachunki");
            put("/ktr/", "Rachunki");
            put("mieszkanie sierakowskiego", "Rachunki");
            put("fm group", "Rachunki");
            put("p4", "Rachunki");
            put("podatek od", "Rachunki");
            put("przelew", "Rachunki");
            put("cashback", "Rachunki");
            put("mpk", "MPK");

            put("sklep piekarniczy", "Zakupy");
            put("biedronka", "Zakupy");
            put("kaufland", "Zakupy");
            put("rossmann", "Zakupy");
            put("eleclerc", "Zakupy");
            put("auchan", "Zakupy");
            put("dino", "Zakupy");
            put("piekarenka", "Zakupy");
            put("tesco lodz baluty", "Zakupy");
            put("aldi", "Zakupy");
            put("sklep zakladowy nr 17", "Zakupy"); // OSM RADOSMKO :)
            put("lidl", "Zakupy");
            put("payu", "Zakupy"); //m.in mleko Hani
            put("pamso", "Zakupy");
            put("m black sieradz", "Zakupy"); //Kurtka
            put("phu krasnal", "Zakupy"); //Kurtka
            put("apteka", "Apteka");
            put("w internecie", "Allegro");
            put("allegro", "Allegro");
            put("dotpay", "Allegro");
            put("alkohol", "Alkokol");
            put("leroy", "Leroy");
            put("mediaexpert", "Media Expert");

            put("subway", "Jedzenie w pracy");
            put("chinol", "Jedzenie w pracy");

            put("umowy numer", "Kredyt");
            put("kapita³: na", "Kredyt");

            put("olimp", "Jedzenie w pracy");
            put("tu kuba", "Jedzenie w pracy");
            put("telepizza", "Jedzenie w pracy");
            put("sandwich szop", "Jedzenie w pracy");
            put("ha long", "Jedzenie w pracy");

            put("pasibus", "Jedzenie na mieście");
            put("pasta go", "Jedzenie na mieście");
            put("Katarzyna Szczesna Les", "Jedzenie na mieście");
            put("kawiarnia", "Jedzenie na mieście");
            put("da grasso", "Jedzenie na mieście");
            put("frame", "Jedzenie na mieście");
            put("pierogarnia", "Jedzenie na mieście");

            put("planet cash", "Bankomat");
            put("bankoma", "Bankomat");
            put("brzoski 42 pl", "Bankomat");
            put("lodz ul.sierakowskiego 77/8", "Bankomat");

            put("ubezpieczenia", "Ubezpieczenia");
            put("z rachunku", "Focus");

            put("socha jakub", "Inwestycje"); //Alior
            put("rezerwacja 172/2019", "Wakacje"); //Wakacje w Ustroniu
            put("901903731153", "Telefon"); //Redmi Note 7

            put("hania", "Hania");
            put("emerytura", "emerytura");
            put("odsetki", "Odsetki");

            put("wynagrodzenie", "Pensja");
        }};

        List parse = CSVParser.parse(readLines);
        ExpenseCounter expenseCounter = new ExpenseCounter(parse, tags);
        expenseCounter.tag();
        expenseCounter.print();

    }
}
