package youtube_downloader;

import java.io.*;
import java.net.*;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 *
 * @author Dhanur
 */
public class Downloads implements Runnable {

    String link;
    File out;

    public Downloads(String link, File out) {
        this.link = link;
        this.out = out;
    }

    public void run() {
        try {
            URL url = new URL(link);
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            double fileSize = (double) http.getContentLength();
            BufferedInputStream buff = new BufferedInputStream(http.getInputStream());
            FileOutputStream fos = new FileOutputStream(this.out);
            BufferedOutputStream bos = new BufferedOutputStream(fos, 1024);
            byte[] buffer = new byte[1024];
            double percentDownloaded = 0.00;
            double downloaded = 0.00;
            int read = 0;
            while ((read = buff.read(buffer, 0, 1024)) >= 0) {
                bos.write(buffer, 0, read);
                downloaded += read;
                percentDownloaded = (downloaded * 100) / fileSize;
                String percent = String.format("%.3f", percentDownloaded);
                System.out.println("Downloading.. " + percent + "% of a file");
            }
            bos.close();
            buff.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
