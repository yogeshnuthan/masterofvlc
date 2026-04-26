<dependency>
    <groupId>uk.co.caprica</groupId>
    <artifactId>vlcj</artifactId>
    <version>4.8.2</version>
</dependency>
  import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

import javax.swing.JFrame;

public class VlcjExample {

    public static void main(String[] args) {
        JFrame frame = new JFrame("VLCJ Player");
        EmbeddedMediaPlayerComponent mediaPlayerComponent = new EmbeddedMediaPlayerComponent();

        frame.setContentPane(mediaPlayerComponent);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Play media file
        mediaPlayerComponent.mediaPlayer().media().play("C:\\path\\to\\your\\video.mp4");
    }
}
