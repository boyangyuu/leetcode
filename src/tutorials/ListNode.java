
package tutorials;


public class ListNode {
    public int val;
    public ListNode next;
    public ListNode(int x) { val = x; }

    @Override
    public String toString() {
        String next = ", ";
        if (this.next != null)  next += this.next.toString();
        return this.val + next;
    }
}