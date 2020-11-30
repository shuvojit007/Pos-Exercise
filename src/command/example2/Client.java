package command.example2;

import org.junit.Test;

public class Client {

    @Test
    public void clientInteraction(){

        LightOneCommand light  = new LightOneCommand(new Light());
        CameraStartRecordingCommand camera=  new CameraStartRecordingCommand(new Camera());

        SwitchBoard switchBoard = new SwitchBoard();
        switchBoard.addCommand(light);
        switchBoard.executeCommand(0);

        switchBoard.addCommand(camera);
        switchBoard.executeCommand(1);

        switchBoard.undo();
    }

}
