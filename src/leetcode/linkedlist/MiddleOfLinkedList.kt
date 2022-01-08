package leetcode.linkedlist

class MiddleOfLinkedList {
    fun middleNode(head: ListNode?): ListNode? {
        if (head == null || head.next == null) return head

        var head = head
        var p1 = head
        var p2 = head

        while(p2 != null && p2.next != null){
            p1 = p1?.next
            p2 = p2.next?.next
        }

        return p1
    }
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}