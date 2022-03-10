import java.util.*;

class unfold_LL {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
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
    
    public static void unfold(ListNode head) {
        ListNode dt1 = new ListNode(-1);
        ListNode dh1 = dt1;
        ListNode dt2 = new ListNode(-1);
        ListNode dh2 = dt2;
        
        ListNode temp = head;
        int idx = 0;
        while(temp != null){
            if(idx % 2 == 0){
                dt1.next = temp;
                dt1 = dt1.next;
            }else{
                dt2.next = temp;
                dt2 = dt2.next;
            }
            idx++;
            temp = temp.next;
        }
        dt1.next = null;
        dt2.next = null;
        
        ListNode rh = reverse(dh2.next);
        
        
        dt1.next = rh;
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
        unfold(head);
        printList(head);
    }
}