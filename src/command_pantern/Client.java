package command_pantern;

public class Client {
    public static void main(String[] args){
        Receiver mTV = new Receiver();
        ChangeCommand mChangeCommand = new ChangeCommand(mTV);
        OpenCommand mOpenCommand = new OpenCommand(mTV);
        CloseCommand mCloseCommand = new CloseCommand(mTV);

        Invoker mInvoker = new Invoker();

        mInvoker.storeAndExcute(mOpenCommand);
        mInvoker.storeAndExcute(mCloseCommand);
        mInvoker.storeAndExcute(mChangeCommand);

        mInvoker.displayOrder();

    }
}
