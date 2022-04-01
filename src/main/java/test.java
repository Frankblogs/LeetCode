import org.junit.Test;

import java.util.Stack;

public class test {
    @Test
    public void CQueueTest(){
        CQueue cQueue=new CQueue();
        for (int i = 0; i < 5; i++) {
            cQueue.appendTail(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(cQueue.deleteHead()+",");
        }
    }
    @Test
    public void MinStackTest(){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.min());
    }
}
