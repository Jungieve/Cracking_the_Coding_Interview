package List;

/**
 * Created by ZihanCong on 16/7/2.
 */
public class Plus {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        if(a == null && b== null)
            return null;
        ListNode result = new ListNode(0);
        ListNode dummy = result;
        //标记是否进位
        int isPlus = 0;
        while(a!=null || b!=null || isPlus == 1){
            //如果a空余，把a=0进行计算
            if(a == null)
                a = new ListNode(0);
            if(b == null)
                b = new ListNode(0);
            //本节点的值
            int val = (a.val+b.val+isPlus)%10;
            //计算是否需要进位
            isPlus = (a.val+b.val+isPlus>9)?1:0;
            //加入结果
            result.next = new ListNode(val);
            result = result.next;
            //最终移动node,注意可能出现
            a = a.next;
            b = b.next;
        }
        return dummy.next;
    }
}