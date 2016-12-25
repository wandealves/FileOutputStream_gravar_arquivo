package com.wordpress.javaes;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author https://javaes.wordpress.com
 */
public class GravaArquivo {

    public void grava(String nomedoarquivo) {
        String msg = "Mensagem de teste gravar arquivo usando FileOutputStream";
        
        try (FileOutputStream fout = new FileOutputStream(nomedoarquivo)) {

            fout.write(msg.getBytes());

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
