import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

import javax.swing.*;

public class vlcadmin {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Simple VLC Player");
        EmbeddedMediaPlayerComponent mediaPlayer = new EmbeddedMediaPlayerComponent();

        frame.setContentPane(mediaPlayer);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Play video (change path)
        mediaPlayer.mediaPlayer().media().play("sample.mp4");
    }
}
<project xmlns="http://maven.apache.org/POM/4.0.0">
  <modelVersion>4.0.0</modelVersion>

  <groupId>example</groupId>
  <artifactId>vlc-project</artifactId>
  <version>1.0</version>

  <dependencies>
    <dependency>
      <groupId>uk.co.caprica</groupId>
      <artifactId>vlcj</artifactId>
      <version>4.8.2</version>
    </dependency>
  </dependencies>
</project>
