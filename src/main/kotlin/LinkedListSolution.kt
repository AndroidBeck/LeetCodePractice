class LinkedListSolution {

    /*
        https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/553/

        Delete Node in a Linked List
     */

    fun deleteNode(node: ListNode?) {
        if (node?.next != null) {
            node.`val` = node.next!!.`val`
        }
        node?.next = node?.next?.next
    }

}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}