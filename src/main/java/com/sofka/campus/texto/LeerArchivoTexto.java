package com.sofka.campus.texto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivoTexto {

    public void leer(String path) {
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            System.out.println(bufferedReader.readLine());

            String temp = "";
            while (temp!=null) {
                temp = bufferedReader.readLine();
                if (temp!=null){
                    System.out.println(temp);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
