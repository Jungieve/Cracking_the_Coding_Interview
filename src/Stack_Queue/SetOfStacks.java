package Stack_Queue;

import java.util.*;

public class SetOfStacks {
    private ArrayList<ArrayList<Integer>> setOfStacks = new ArrayList<ArrayList<Integer>>();
    private int stackSize = -1;
    private int stackIndex = -1;
    private int size = 0;
    public ArrayList<ArrayList<Integer>> setOfStacks(int[][] ope, int size) {
        // write code here
        if(size < 1)	return null;
        this.size = size;
        for(int i = 0;i<ope.length;i++){
            if(ope[i][0]==1){//入栈
                int item = ope[i][1];
                push(item);
            }
            if(ope[i][0]==2){//出栈
                pop();
            }
        }
        return setOfStacks;
    }
    public void push(int item){
        if(stackSize == -1 ){
            setOfStacks.add(new ArrayList<Integer>());
            stackSize = 0;
        }
        if(stackIndex == size-1){
            ArrayList<Integer> newStack = new ArrayList<Integer>();
            newStack.add(item);
            setOfStacks.add(newStack);
            stackIndex = 0;
            stackSize++;
        }
        else{
            ArrayList<Integer> lastStack = setOfStacks.get(stackSize);
            lastStack.add(item);
            stackIndex++;
        }
    }
    public void pop(){
        if(stackSize == -1)
            throw new EmptyStackException();
        if(stackIndex == 0){
            ArrayList<Integer> lastStack = setOfStacks.get(stackSize);
            setOfStacks.remove(lastStack);
            stackSize--;
            stackIndex = size - 1;
        }
        else{
            ArrayList<Integer> lastStack = setOfStacks.get(stackSize);
            lastStack.remove(lastStack.get(stackIndex--));
        }
    }
}