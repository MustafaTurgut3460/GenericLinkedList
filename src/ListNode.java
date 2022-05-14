public class ListNode <T> {
    
    T data;
    ListNode<T> next;

    public ListNode(T data)
    {
        this.data = data;
        this.next = null;
    }

    public ListNode(T data, ListNode<T> next)
    {
        this.data = data;
        this.next = next;
    }

    public ListNode(){}


}
