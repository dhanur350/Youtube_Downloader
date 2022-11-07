/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package youtube_downloader;

import javax.swing.*;

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
        urlLinkbox = new JTextField("Enter your URL", 10);
        frame.add(urlLinkbox);
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
