fun main(args: Array<String>) {

}

fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
    if (headA == null || headB == null) {
        return null
    }
    var currA = headA
    var currB = headB
    while (currA != currB) {
        currA = if (currA == null) {
            headB
        } else {
            currA.next
        }
        currB = if (currB == null) {
            headA
        } else {
            currB.next
        }
    }
    return currA
}