
public class CloseCommand implements Command{

    private Receiver mReceiver;

    public CloseCommand(Receiver mReceiver) {
        this.mReceiver = mReceiver;
    }


    @Override
    public void excute() {
        mReceiver.turn_TV_Off();
    }
}
