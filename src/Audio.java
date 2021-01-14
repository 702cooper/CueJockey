import java.io.File;
import java.io.IOException;
import java.net.URL;

//import javax.sound.sampled.AudioInputStream;
//import javax.sound.sampled.AudioSystem;
//import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.*;

public class Audio {
	public void playTest(int testNum) {
		File testFile = null;
		if(testNum == 1) {
			URL url = getClass().getResource("test.wav");
			testFile = new File(url.getPath());
		}
		else if(testNum == 2) {
			URL url = getClass().getResource("testTwo.wav");
			testFile = new File(url.getPath());
		}
		else
			System.out.println("That is not an audio file");
		
		if(testFile != null) {
			try {
				AudioInputStream audioStream = AudioSystem.getAudioInputStream(testFile);
				AudioFormat format = audioStream.getFormat();
				DataLine.Info info = new DataLine.Info(Clip.class, format);
				Clip audioClip = (Clip) AudioSystem.getLine(info);
				audioClip.open(audioStream);
				audioClip.start();
			}
			catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
				e.printStackTrace();
			}
		}
	}
}
