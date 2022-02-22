package Interface;

import java.io.File;

public class ImageSender implements Sender {

    @Override
    public void send(String name) {
        System.out.println("The image has been sent successfully");
    }
}
