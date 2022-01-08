package leetcode.linkedlist

class RemoveNthNodeFromEndOfList {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        if(head == null) return null

        var dummyHead = ListNode(-1)
        dummyHead.next = head
        var fast: ListNode? = dummyHead
        var slow: ListNode? = dummyHead
        var n = n

        while(n > 0){
            fast = fast?.next
            n--
        }

        while(fast != null && fast?.next != null){
            slow = slow?.next
            fast = fast?.next
        }

        slow?.next = slow?.next?.next

        return dummyHead?.next
    }
}