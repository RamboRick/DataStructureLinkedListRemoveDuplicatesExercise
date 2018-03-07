package linkedlistRemove;

public class RemDup2 {

	public void dumpRemove (LinkedListNode head){
		LinkedListNode current = head;
		while (current != null){
			LinkedListNode runner = current;
			if ( runner.next.data == current.data){
				runner.next = runner.next.next;
			}else{ 
				runner = runner.next;
			}
			
			current =current.next;
		}
	}

}
