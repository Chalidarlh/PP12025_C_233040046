package pertemuan2;

public class Tes4a {
	public static void main(String[] args) {
		
		//membuat 2 buah node n1, n2, n3, n4
		Node n1 = new Node(5);
		Node n2 = new Node(7);
		Node n3 = new Node(9);
		Node n4 = new Node(8);
		
		//membuat node n1, n2, n3, n4
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		
		//menampilkan node n1 & n2 dengan pointer p
		Node p = n1;
		while(p != null) {
			System.out.printf("%d", p.getNilai());
			p = p.getNext();
		}
		
	}
}
