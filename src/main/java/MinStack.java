import java.util.Stack;

public class MinStack {
    private Stack<Integer> data;
    private Stack<Integer> aided;

    public MinStack() {
        data = new Stack<>();
        aided = new Stack<>();
    }

    public void push(int x) {
        data.push(x);
        pushAided(x);
    }
    private void pushAided(int x){
        if (aided.isEmpty() || x <=aided.peek()){
            aided.push(x);
        }else {
            int t = aided.pop();
            pushAided(x);
            aided.push(t);
        }
    }

    public void pop() {
        if (!data.isEmpty()){
            if (data.peek() == aided.peek()) {
                aided.pop();
                data.pop();
            }else {
                aided.remove(data.peek());
                data.pop();

            }
        }
    }

    public int top() {
        return data.peek();
    }

    public int min() {
        return aided.peek();
    }
}
