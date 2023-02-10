public class App {

    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null) return null;
        int amount = lists.length; // amount of lists 
        int end = 0; // will keep track of the amount of lists are at their end
        ListNode newList = new ListNode();
        ListNode curNode = newList;
        while (end < amount) // keep iterating until end == amount (meaning all lists at their end)
        {
            int minValue = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int i = 0; i < amount; i++) { // find minimum at current depth
                if (lists[i] != null && lists[i].val < minValue) {
                    minValue = lists[i].val;
                    minIndex = i;
                }
            }

            curNode.next = lists[minIndex];
            lists[minIndex] = lists[minIndex].next;
            if (lists[minIndex] == null) end++;
            curNode = curNode.next;
            
        }

        return newList.next;
        
    }
    public static void main(String[] args) throws Exception {
        App myApp = new App();
        ListNode lists[] = new ListNode[3];

 
        lists[0] = new ListNode(1);
        lists[0].add(4);
        lists[0].add(5);
        
        lists[1] = new ListNode(1);
        lists[1].add(3);
        lists[1].add(4);

        lists[2] = new ListNode(2);
        lists[2].add(6);

        ListNode answer = myApp.mergeKLists(lists);
        answer.print();

    }
}
