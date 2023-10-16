fun main(args: Array<String>) {
    val solution = Solution0119()
    val index = 4
    println("Pascal's triangle 2 solution with index of $index: ${solution.getRow(index)}")

    val solution0002 = Solution0002()
    val listNode3 = ListNode(3)
    val listNode2 = ListNode(4)
    listNode2.next = listNode3
    val listNode1 = ListNode(2)
    listNode1.next = listNode2

    val listNode6 = ListNode(4)
    val listNode5 = ListNode(6)
    listNode5.next = listNode6
    val listNode4 = ListNode(5)
    listNode4.next = listNode5

    var result = ""
    var tempListNode = solution0002.addTwoNumbers(listNode1, listNode4)
    while (tempListNode!!.next != null) {
        result += tempListNode.`val`.toString() + ","
        tempListNode = tempListNode.next
    }
    result += tempListNode.`val`.toString()

    println("[2,4,3] + [5,6,4] = [$result]")
}