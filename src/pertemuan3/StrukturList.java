package pertemuan3;

public class StrukturList {
	private Node head;
	
	//inisialisasi
	public StrukturList() {
		this.head = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addTail(int data) {
		Node posNode = null, curNode = null;
		
		Node newNode = new Node (data);
		if (isEmpty()) {
			head = newNode;
		}
		else {
			curNode = head;
			while (curNode != null) {
				posNode = curNode;
				curNode = curNode.getNext();
			}
			posNode.setNext(newNode);
		}
	}
	
	public void displayElement() {
		Node curNode = head;
		while (curNode != null) {
			System.out.print(curNode.getData()+ " ");
			curNode = curNode.getNext();
		}
	}
	
	public void addHead (int data) {
		Node newNode = new Node (data);
		if (isEmpty()) {
			head = newNode;
		}else {
			newNode.setNext(head);
			head = newNode;
		}
	}
}
