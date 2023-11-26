public class MyLinkedList<T> {
    private ListNode<T> root;
    private ListNode<T> curr;
    private int size;
    public MyLinkedList() {
        root = null;
        curr = null;
        size = 0;
    }
    public void add(T aVal) {
        add(aVal, size);
    }

    public void add(T aVal, int index) throws RuntimeException {
        if(index>size || index < 0) {
            return;
        }
        ListNode<T> newNode = new ListNode<T>(aVal);
        size++;
        if(size == 1) {
            root = newNode;
            curr = root;
            return;
        }
        if(index+1 == size) {
            curr.next = newNode;
            curr = curr.next;
            return;
        }
        ListNode<T> node = root;
        for(int i = 0; i < index; i++) {
            node= node.next;
        }
        ListNode<T> temp = node.next;
        node.next = newNode;
        newNode.next = temp;       
    }

    public T get() {
        if(root == null) {
            return null;
        }
        return curr.val;
    }
    
    public T delete() {
        if(root == null) {
            return null;
        }
        T tempVal;
        if(root == curr) {
            tempVal = root.val;
            root = null;
            curr = null;
            size--;
            return tempVal;
        }
        ListNode<T> temp = root;
        while(temp.next != curr) {
            temp = temp.next;
        }
        tempVal = temp.next.val;
        temp.next = null;
        curr =temp;
        size--;
        return tempVal;
    }
}

class ListNode<T> {
    T val;
    ListNode<T> next;
    public ListNode() {

    }
    public ListNode(T aVal) {
        val = aVal;
        next = null;
    }
    public ListNode(T aVal, ListNode<T> aNext) {
        val = aVal;
        next = aNext;
    }
}
