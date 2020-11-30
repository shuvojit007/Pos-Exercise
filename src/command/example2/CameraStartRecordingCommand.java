package command.example2;

public class CameraStartRecordingCommand implements  Command{
    private Camera camera;

    public CameraStartRecordingCommand(Camera camera) {
        this.camera = camera;
    }

    @Override
    public void execute() {
        camera.startRecording();
    }

    @Override
    public void undo() {
        camera.stopRecording();
    }
}
