import java.util.*;

class fold_LL_2 {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public static ListNode mid(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast.next != null && fast.next.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public static ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void fold(ListNode head) {
        ListNode dt = new ListNode(-1);
        
        ListNode mid = mid(head);
        ListNode sh = mid.next;
        mid.next = null;
        
        ListNode t1 = head;
        ListNode t2 = reverse(sh);
        boolean flag = true;
        
        while(t1 != null || t2 != null){
            if(flag == true){
                dt.next = t1;
                t1 = t1.next;
            }else{
                dt.next = t2;
                t2 = t2.next;
            }
            flag = !flag;
            dt = dt.next;
        }
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = dummy.next;
        fold(head);
        printList(head);
    }
}