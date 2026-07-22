
class Solution {
    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode current = head;
        while(current != null)
        {
            ListNode next = current.next;
            current.next=prev;
            prev=current;
            current = next;

        }
        return prev;
    }
}


// 1->2->3->4->5->null  we want   null<-1<-2<-3<-4<-5