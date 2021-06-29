package com.company;

import java.io.*;
import java.util.ArrayList;

public class Main  {
    public static void main(String[] args) {
        ArrayList<Nguoi> list = new ArrayList<Nguoi>();
        list.add(new Nguoi("Chung", 20, "nam", "0123456789"));
        list.add(new Nguoi("Son", 20, "nam", "0123456789"));
        list.add(new Nguoi("Huy", 20, "nam", "0123456789"));
        list.add(new Nguoi("Toan", 20, "nam", "0123456789"));
        DocGhiFile docGhiFile=new DocGhiFile();
        try {
            docGhiFile.ghiFile(list);
        }catch (Exception e){
            e.printStackTrace();
        }
        try {
            docGhiFile.docFile(list);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}

