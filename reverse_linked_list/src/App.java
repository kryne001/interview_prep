public class App {
    
    public ListNode reverseList(ListNode head) {
        if (head == null) return null;
        else if(head.next == null) return head;
        
        ListNode prev = head;
        ListNode cur = head.next;
        while (cur != null)
        {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head.next = null;
        return prev;

    }
    public static void main(String[] args) throws Exception {
        App myApp = new App();
        ListNode one = new ListNode(1);
        one.add(2);
        one.add(3);
        one.add(4);
        one.add(5);
        one = myApp.reverseList(one);
        one.print();
    }
}
