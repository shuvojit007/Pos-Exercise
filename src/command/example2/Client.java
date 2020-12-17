package command.example2;

import org.junit.Test;

public class Client {

    @Test
    public void clientInteraction(){
        SwitchBoard switchBoard = new SwitchBoard();

        Light bulb = new Light();
        Camera cam = new Camera();


        LightOneCommand light  = new LightOneCommand(bulb);
        CameraStartRecordingCommand camera=  new CameraStartRecordingCommand(cam);


        switchBoard.addCommand(camera);
        switchBoard.executeCommand(0);


        switchBoard.addCommand(light);
        switchBoard.executeCommand(1);


        switchBoard.undo();
    }

}
