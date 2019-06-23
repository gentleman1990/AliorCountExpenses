package io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    public static List read(String filePath) {
        List lines = new ArrayList<String>();
        try {
            File fileDir = new File(filePath);
            BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fileDir), "CP1252"));

            String str;
            while ((str = in.readLine()) != null) {
                lines.add((str));
            }

            in.close();
        } catch (UnsupportedEncodingException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        lines.remove(1);
        lines.remove(0);
        return lines;
    }
}
