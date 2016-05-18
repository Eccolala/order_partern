package command_pattern;

public class ChangeCommand implements Command{

    private Receiver mReceiver;

    public ChangeCommand(Receiver mReceiver) {
        this.mReceiver = mReceiver;
    }

    @Override
    public void excute() {
        mReceiver.change_TV_channel();
    }
}
