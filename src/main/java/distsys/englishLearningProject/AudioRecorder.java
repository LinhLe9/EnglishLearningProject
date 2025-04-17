/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package distsys.englishLearningProject;
import javax.sound.sampled.*;
import java.io.*;

/**
 *
 * @author DELL
 */
public class AudioRecorder {
    private TargetDataLine line;
    private ByteArrayOutputStream out;
    private boolean recording = false;

    public void startRecording() throws LineUnavailableException {
        AudioFormat format = getAudioFormat();
        DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);
        line = (TargetDataLine) AudioSystem.getLine(info);
        line.open(format);
        line.start();

        out = new ByteArrayOutputStream();
        recording = true;

        new Thread(() -> {
            byte[] buffer = new byte[1024];
            while (recording) {
                int count = line.read(buffer, 0, buffer.length);
                out.write(buffer, 0, count);
            }
        }).start();
    }

    public byte[] stopRecording() throws IOException {
        recording = false;
        line.stop();
        line.close();
        return out.toByteArray(); // You can save this or send to server
    }

    private AudioFormat getAudioFormat() {
        return new AudioFormat(16000, 16, 1, true, true);
    }
}
