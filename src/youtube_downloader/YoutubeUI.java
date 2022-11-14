/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package youtube_downloader;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Dhanur
 */
public class YoutubeUI {
//Components of UI

    JTextField urlLinkbox, downloadLoc;
    JLabel urlVideo, Location;

    YoutubeUI() {
        JFrame frame = new JFrame();
        JFrame jframe = new JFrame("YouTube Downloader");
        jframe.setPreferredSize(new Dimension(400, 300));
        urlLinkbox = new JTextField("Enter your URL", 10);
        downloadLoc = new JTextField("Enter the location to store Video", 10);
        urlLinkbox.setBounds(150, 140, 400, 50);//x,y,width,height
        downloadLoc.setBounds(150, 200, 400, 50);
        frame.add(urlLinkbox);
        frame.add(downloadLoc);
        frame.setSize(800, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
    //Main Function

    public static void main(String[] args) {
        //Direct Call the constructor
        new YoutubeUI();
    }
}
