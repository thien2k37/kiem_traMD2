package File;

import Phonebook.Phonebook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadWrite {
    public static void writeToFile(List<Phonebook> phonebookList) throws IOException {
        FileWriter fileWriter = new FileWriter("/home/thien/IdeaProjects/TestMD2/src/File/data.csv");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (Phonebook o: phonebookList) {
            bufferedWriter.write(o.getName() + "," + o.getAddress() + "," + o.getEmail() + "," + o.getFacebook() + "," + o.getSex() + "," + o.getGroup() + "," + o.getBird() + "," + o.getPhoneNumber());
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
        fileWriter.close();
    }
    public static List<Phonebook> readToFile() {
        List<Phonebook> phonebookList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader("/home/thien/IdeaProjects/TestMD2/src/File/data.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] arr = line.split(",");
                phonebookList.add(new Phonebook(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], Integer.parseInt(arr[6]), Integer.parseInt(arr[7])));
            }
        }catch (Exception e) {
            e.printStackTrace();
            System.out.println("hihi");
        }
        return phonebookList;
    }
}
