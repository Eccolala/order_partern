import java.util.ArrayList;
import java.util.List;

//遥控器
public class Invoker {
    private List<Command> history = new ArrayList<Command>();
    public Invoker() {}
    public void storeAndExcute(Command cmd){
        this.history.add(cmd); // optional
        cmd.excute();
    }

    public void displayOrder(){
        System.out.print(history.size());
    }
}
