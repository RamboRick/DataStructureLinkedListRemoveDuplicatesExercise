package linkedlistRemove;

import java.util.HashSet;



public class RemDup {
	public static void dumpdelete(LinkedListNode head){
		HashSet<Integer> crr = new HashSet<Integer>();
		LinkedListNode current = null;
		while (head != null){
			if ( crr.contains(head.data)){
				current.next = head.next;
			}else {
				crr.add(head.data);
				current = head;
			}
			head = head.next;
		}
	}
}
