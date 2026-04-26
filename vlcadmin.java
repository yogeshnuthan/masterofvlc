import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;

import javax.swing.*;

public class Vlcadmin {
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
