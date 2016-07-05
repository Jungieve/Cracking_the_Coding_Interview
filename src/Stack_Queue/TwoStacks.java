package Stack_Queue;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by root on 2016/7/5.
 */
public class TwoStacks {
    public ArrayList<Integer> twoStacksSort(int[] numbers) {
        // write code here
        //插入排序
        if(numbers == null)	return null;
        ArrayList result = new ArrayList();
        Stack<Integer> stack1 = new Stack();
        Stack<Integer> stack2 = new Stack();
        for(int t:numbers)
            stack1.push(t);
        while(!stack1.isEmpty()){
            int item = stack1.peek();
            if(stack2.isEmpty())
                stack2.push(item);
            else{
                while(stack2.isEmpty() == false && item<stack2.peek())
                    stack1.push(stack2.pop());
                stack2.push(item);
                while(stack1.isEmpty() == false && stack1.peek()>item)
                    stack2.push(stack1.pop());
            }
            stack1.pop();
        }
        while(!stack2.isEmpty())
            result.add(stack2.pop());
        return result;
    }
}
