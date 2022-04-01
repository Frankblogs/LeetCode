import java.util.Stack;

public class CQueue {

    private Stack<Integer> dataStack;
    private Stack<Integer> aidedStack;

    public CQueue() {
        dataStack=new Stack<>();
        aidedStack=new Stack<>();
    }

    public void appendTail(int value) {
        dataStack.push(value);
    }

    public int deleteHead() {
        if (dataStack.isEmpty()){
            return -1;
        }
        while (!dataStack.isEmpty()){
            aidedStack.push(dataStack.pop());
        }
        int ret=aidedStack.pop();
        while (!aidedStack.isEmpty()){
            dataStack.push(aidedStack.pop());
        }
        return ret;
    }
}
