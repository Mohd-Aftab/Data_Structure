import java.util.*;

class segregate_even_odd {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode segregateEvenOdd(ListNode head) {
        ListNode dt1 = new ListNode(-1); // for even
        ListNode dh1 = dt1;
        ListNode dt2 = new ListNode(-1); // for odd
        ListNode dh2 = dt2;
        
        ListNode temp = head;
        while(temp != null){
            if(temp.val % 2 == 0){
                dt1.next = temp;
                dt1 = dt1.next;
            }else{
                dt2.next = temp;
                dt2 = dt2.next;
            }
            temp = temp.next;
        }
        
        if(dh1.next == null && dh2 != null){
            dh2 = dh2.next;
            return dh2;
        }
        if(dh2.next == null && dh1 != null){
            dh1 = dh1.next;
            return dh1;
        }
        
        dh1 = dh1.next;
        dh2 = dh2.next;
        dt1.next = null;
        dt2.next = null;
        
        dt1.next = dh2;
        return dh1;
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

        ListNode head = segregateEvenOdd(dummy.next);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}