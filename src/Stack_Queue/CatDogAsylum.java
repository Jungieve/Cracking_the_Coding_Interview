package Stack_Queue;

import java.util.*;

public class CatDogAsylum {
    public ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        ArrayList<Integer> r = new ArrayList<Integer>();// 存放最终收养序列
        ArrayList<Integer> animal = new ArrayList<Integer>();// 存放进入收容所的动物
        for(int i = 0;i<ope.length;i++){
            //有动物进入收容所
            if(ope[i][0]==1 && ope[i][1]!=0)
                animal.add(ope[i][1]);
            //有人收养
            if(ope[i][0]==2 && animal.size()!=0){
                int item = ope[i][1];
                //收养狗，收养该种动物中最早进入收容所的。
                if(item == 1){
                    int index = findLast(animal,1);
                    if(index != -1){
                        r.add(animal.get(index));
                        animal.remove(index);
                    }
                }
                //收养猫，收养该种动物中最早进入收容所的。
                if(item == -1){
                    int index = findLast(animal,-1);
                    if(index != -1){
                        r.add(animal.get(index));
                        animal.remove(index);
                    }
                }
                //采取直接收养所有动物中最早进入收容所的
                if(item == 0)
                    r.add(animal.remove(0));
            }
        }
        return r;
    }
    public int findLast(ArrayList<Integer> animal,int type){
        for(int i = 0;i<animal.size();i++){
            if(type == 1 && animal.get(i) > 0)
                return i;
            if(type == -1 && animal.get(i) < 0)
                return i;
        }
        return -1;
    }
}