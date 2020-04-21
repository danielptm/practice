package hackerrank;

public class DeleteNode {

    public static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    public static class SinglyLinkedList {
        public SinglyLinkedListNode head;
        public SinglyLinkedListNode tail;

        public SinglyLinkedList() {
            this.head = null;
            this.tail = null;
        }

        public void insertNode(int nodeData) {
            SinglyLinkedListNode node = new SinglyLinkedListNode(nodeData);

            if (this.head == null) {
                this.head = node;
            } else {
                this.tail.next = node;
            }

            this.tail = node;
        }
    }

    /**
     * Explanation of what this is doing in terms of the recursive aspect.
     * deleteNode is actually checking to see if a given node is the one to delete.
     * When the position == 0 is the node actually found. At this point it
     * returns the nextNode which removes the current node. At this point
     * the function's recursive cycle is broken and then returns each node
     * backwards up to the head node. The returning of the nodes in reverse order of
     * the calling makes it so the head returned at the end is the original head node.
     *
     * The key to understanding this is the breaking condition breaks the recursion
     * by returning the next node thus removing the current node.
     * And then each function call is returned in the opposite order that it was invoked in.
     *
     * @param head
     * @param position
     * @return
     */
    public static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position){
        if (position == 0){
            return head.next;
        }
        head.next = deleteNode(head.next, position-1);
        return head;
    }
}
