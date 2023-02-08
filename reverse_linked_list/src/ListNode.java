public class ListNode {
    int val;
    ListNode next;
    ListNode last;
    boolean isEmpty = true;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    public void add(int value)
    {
        ListNode add = new ListNode(value);
        ListNode temp = this;
        while (temp.next != null) temp = temp.next;
        temp.next = add;
    }

    public void print()
    {
        ListNode cur = this;
        while (cur != null)
        {
            System.out.print(cur.val + " -> ");
            cur = cur.next;
        }
    }
}