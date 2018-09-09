import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.FrameGrabber;

import java.io.File;
import java.io.IOException;


import javax.imageio.ImageIO;

public class Frames {
    public static void main(String[] args) throws FrameGrabber.Exception, IOException {


        FFmpegFrameGrabber g = new FFmpegFrameGrabber("/Users/Shiqing/Desktop/img/FunnyCats.mp4");
        g.start();

        for (int i = 0 ; i < 500 ; i += 10) {
            ImageIO.write(g.grab().getBufferedImage(), "png", new File("/Users/Shiqing/Desktop/img/" + System.currentTimeMillis() + ".png"));
    }

        g.stop();
    }



}
