import java.util.*;
public class linkedlistmiddle {
    public static ListNode middleNode(ListNode head) {
        ListNode slow =head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

}
