public class Main {

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        MergeLists mergeLists = new MergeLists();
        ListNode finalList = mergeLists.mergeTwoLinkedLists(list1, list2);
        System.out.println("This is a main class");
    }

}
