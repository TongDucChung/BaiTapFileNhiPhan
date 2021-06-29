package com.company;

import java.io.*;
import java.util.ArrayList;

public class DocGhiFile{
     void ghiFile(ArrayList<Nguoi> nguois) throws Exception {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("nhiPhan.txt"));
            Nguoi nguoi = new Nguoi("chung", 12, "nam", "012315522");
            oos.writeObject(nguois);
            oos.flush();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("Success!");
    }

     void docFile( ArrayList<Nguoi> nguois) throws Exception {
        FileInputStream fileInputStream = new FileInputStream("nhiPhan.txt");
        ObjectInputStream ois = new ObjectInputStream(fileInputStream);
        ArrayList<Nguoi> list = (ArrayList<Nguoi>) ois.readObject();
        for (Nguoi a:list) {
            System.out.println(a);
        }
        ois.close();

    }
}
