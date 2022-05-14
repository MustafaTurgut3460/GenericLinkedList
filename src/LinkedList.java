public class LinkedList <T> {
    
    ListNode<T> head;
    private int length=0;

    public LinkedList()
    {
        this.head = null;
    }

    void add(T data)
    {
        ListNode<T> temp = new ListNode<>(data);

        if(this.head == null)
            head = temp;

        else
        {
            ListNode<T> node = head;

            while(node.next != null)
            {
                node = node.next;
            }

            node.next = temp;
        }

        length++;
    }

    void remove(T key)
    {
 
        //  NOTE
        // dummy node is used to represent the node before
        // the current node Since in a Singly Linked-List we
        // cannot go backwards from a node, we use a dummy
        // node to represent the previous node. In case of
        // head node, since there is no previous node, the
        // previous node is assigned to null.
 
        // Dummy node with null value
        ListNode<T> prev = new ListNode<>(null);
 
        // Dummy node pointing to head node
        prev.next = head;
 
        // Next node that points ahead of current node
        ListNode<T> next = head.next;
 
        // Temporary node for traversal
        ListNode<T> temp = head;
 
        // Boolean value that checks whether value to be
        // deleted exists or not
        boolean exists = false;
 
        // If head node needs to be deleted
        if (head.data == key) {
            head = head.next;
 
            // Node to be deleted exists
            exists = true;
        }
 
        // Iterating over LinkedList
        while (temp.next != null) {
 
            // We convert value to be compared into Strings
            // and then compare using
            // String1.equals(String2) method
 
            // Comparing value of key and current node
            if (String.valueOf(temp.data).equals(
                    String.valueOf(key))) {
 
                // If node to be deleted is found previous
                // node now points to next node skipping the
                // current node
                prev.next = next;
                // node to be deleted exists
                exists = true;
 
                // As soon as we find the node to be deleted
                // we exit the loop
                break;
            }
 
            // Previous node now points to current node
            prev = temp;
 
            // Current node now points to next node
            temp = temp.next;
 
            // Next node points the node ahead of current
            // node
            next = temp.next;
        }
 
        // Comparing the last node with the given key value
        if (exists == false
            && String.valueOf(temp.data).equals(
                String.valueOf(key))) {
 
            // If found , last node is skipped over
            prev.next = null;
 
            // Node to be deleted exists
            exists = true;
        }
 
        // If node to be deleted exists
        if (exists) {
 
            // Length of LinkedList reduced
            length--;
        }
 
        // If node to be deleted does not exist
        else {
 
            // Print statement
            System.out.println(
                "Given Value is not present in linked list");
        }
    }

    void remove(int index)
    {
        if (index<0 || index >=size()) {
            throw new IndexOutOfBoundsException();
        }
        ListNode<T> ref = head;
        for (int i = 0; i < index-1; i++) {
            ref = ref.next;
        }
        if (index == 0) {
            head = ref.next;
        } else {
            ref.next = ref.next.next;
        }
        length--;
    }

    public T get(int index)
    {
        ListNode<T> current = head;
        int count = 0; /* index of Node we are
                          currently looking at */
        while (current != null)
        {
            if (count == index)
                return current.data;

            count++;
            current = current.next;
        }
 
        /* if we get to this line, the caller was asking
        for a non-existent element so we assert fail */
        assert (false);
        return this.head.data;
    }

    void clear()
    {
        this.head = null;
        this.length = 0;
    }

    boolean isEmpty()
    {
        if(this.head == null)
            return true;

        return false;
    }

    int size()
    {
        return this.length;
    }
}
