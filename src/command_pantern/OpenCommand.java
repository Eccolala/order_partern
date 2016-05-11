package command_pantern;

public class OpenCommand implements Command{

    private Receiver mReceiver;

    public OpenCommand(Receiver mReceiver) {
        this.mReceiver = mReceiver;
    }


    @Override
    public void excute() {
        mReceiver.turn_TV_On();
    }
}
