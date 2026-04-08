package leet

object AddTwoNumbers:
  final case class ListNode(x: Int = 0, next: ListNode = null)

  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode =
    def loop(l1: Option[ListNode], l2: Option[ListNode], carryOver: Int = 0): ListNode =
      val sum = l1.fold(0)(_.x) + l2.fold(0)(_.x) + carryOver
      if l1.isEmpty && l2.isEmpty && sum == 0 then null
      else ListNode(sum % 10, loop(l1.flatMap(l => Option(l.next)), l2.flatMap(l => Option(l.next)), sum / 10))

    loop(Some(l1), Some(l2))
