// Singly-linked lists are already defined with this interface:
// class ListNode<T> {
//   ListNode(T x) {
//     value = x;
//   }
//   T value;
//   ListNode<T> next;
// }
//
ListNode<Integer> removeKFromList(ListNode<Integer> l, int k) {
    if(null == l) {
        return null;
    }

    ListNode temp = l;

    while (temp.next != null) {
        if (temp.next.value.equals(k)) {
            temp.next = temp.next.next;
        }
        else {
            temp = temp.next;
        }
    }
    
    return l.value == k ? l.next : l;
}
