public class App {
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newList = new ListNode();
        ListNode curNode = newList;
        
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curNode.next = list1;
                list1 = list1.next;
            }
            else {
                curNode.next = list2;
                list2 = list2.next;
            }   
            curNode = curNode.next;
        }

        if (list1 != null) {
            curNode.next = list1;
        } else if (list2 != null) {
            curNode.next = list2;
        }

        return newList.next;
    }

    public static void main(String[] args) throws Exception {
        App myApp = new App();
        ListNode list1 = new ListNode(1);
        list1.add(2);
        list1.add(3);

        System.out.println("List one is");
        list1.print();

        ListNode list2 = new ListNode(1);
        list2.add(3);
        list2.add(4);

        System.out.println("List two is");
        list2.print();

        ListNode mergedList = myApp.mergeTwoLists(list1, list2);
        mergedList.print();
    }
}
