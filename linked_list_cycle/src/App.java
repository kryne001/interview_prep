public class App {
    
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        if (head.next == null) return false;

        ListNode slow = head;
        ListNode fast = head.next;
        
        while (slow != fast) {
            if (fast == null || fast.next == null) return false;

            slow = slow.next;
            fast = fast.next.next;
        }

        return true;
    }
    public static void main(String[] args) throws Exception {
        App myApp = new App();
        ListNode head = new ListNode(3);
        head.add(2);
        head.add(0);
        head.add(-4);
        head.changeNext(-4, 2, head);
        
        if (myApp.hasCycle(head)) System.out.println("true");
        else System.out.println("false");
    }
}
