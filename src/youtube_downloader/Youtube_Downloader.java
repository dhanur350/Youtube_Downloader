/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package youtube_downloader;

import java.io.*;

/**
 *
 * @author Dhanur
 */
public class Youtube_Downloader {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String link = "https://file-examples.com/wp-content/uploads/2017/04/file_example_MP4_1920_18MG.mp4";
        File out = new File("C:\\Downloads");
        new Thread(new Downloads(link, out)).start();
    }

}
