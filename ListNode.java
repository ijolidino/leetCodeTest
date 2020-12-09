public class ListNode {
    int val;
    ListNode next=null;
    ListNode(int x){
        val =x;
    }
    public static String print(ListNode l){
        StringBuilder stringBuilder = new StringBuilder();
        while (l!=null){
            stringBuilder.append(l.val);
            l=l.next;
        }
        return stringBuilder.toString();
    }
    public void add(int l){
        ListNode listNode = new ListNode(l);
        if (this.next==null){
            this.next=listNode;
        }else {
            this.next.add(l);
        }
    }
}
