package leet

object LinkedListCycle:
  class ListNode(var _x: Int = 0):
    var next: ListNode = null
    var x: Int         = _x

  object Solution:
    def hasCycle(head: ListNode): Boolean =
      def loop(cursor: ListNode, scout: Option[ListNode]): Boolean =
        scout match
          case None                           => false
          case Some(scout) if cursor eq scout => true
          case Some(scout)                    => loop(cursor.next, Option(scout.next).flatMap(n => Option(n.next)))

      head != null && loop(head, Option(head.next))
