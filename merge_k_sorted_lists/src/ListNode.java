public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int x) {
        val = x;
        next = null;
    }
    ListNode(int val, ListNode next) {this.val = val; this.next = next;}
    
    public void add(int value)
    {
        ListNode newNode = new ListNode(value);
        ListNode cur = this;
        while (cur.next != null)
        {
            cur = cur.next;
        }
        cur.next = newNode;
       
    }

    public ListNode getNode(int value, ListNode head)
    {
        while (head != null)
        {
            if (head.val == value) return head;
            head = head.next;
        }

        return null;
    }

    public void changeNext(int cur, int next, ListNode head)
    {
        ListNode curNode = getNode(cur, head);
        curNode.next = getNode(next,head);
    }

    public void print()
    {
        ListNode cur = this;
        while (cur != null)
        {
            System.out.print(cur.val + " -> ");
            cur = cur.next;
        }

        System.out.println("");
    }
}
