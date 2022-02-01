package dataStructures


data class Node(
    val value: Int,
    var next: Node? = null
)

class LinkedList(){
    private var head: Node? = null

    constructor(head: Node) : this() {
        this.head = head
    }

    fun appendToTail(value: Int){
        if(head == null){
            head = Node(value)
        }else{
            var temp = head
            while(temp?.next != null){
                temp = temp.next
            }
            temp?.next = Node(value)
        }
    }

    fun deleteNode(value: Int){
        if(head == null) return

        if(head?.value == value){
            head = head?.next?.next
        }else{
            var temp = head
            while(temp?.next != null){
                if(temp.next?.value == value){
                    temp.next = temp.next?.next
                }
                temp = temp.next
            }
        }
    }

    override fun toString(): String {
        return if(head == null){
            "LinkedList is Empty"
        } else{
            val res = mutableListOf<Int>()
            var temp = head
            while(temp != null){
                res.add(temp.value)
                temp = temp.next
            }
            return res.joinToString("->")
        }
    }
}

fun main(){
    val linkedList = LinkedList()
    println(linkedList.toString())

    linkedList.appendToTail(121)
    println("Before Removing: $linkedList")
    linkedList.deleteNode(121)
    println("After Removing: $linkedList")

    linkedList.appendToTail(1)
    linkedList.appendToTail(3)
    linkedList.appendToTail(5)
    linkedList.appendToTail(7)
    linkedList.appendToTail(12)
    linkedList.appendToTail(7312)
    linkedList.appendToTail(12317)
    println(linkedList.toString())

    linkedList.deleteNode(7312)
    linkedList.deleteNode(12317)
    println(linkedList.toString())
}