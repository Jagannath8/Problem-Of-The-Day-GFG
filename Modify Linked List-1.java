class Solution {
	public static Node modifyTheList(Node head) {
		int count = 1;
		Node last = head;
		Node temp = head;
		ArrayList<Integer> a = new ArrayList<Integer>();
		while(last.next != null) {
			a.add(last.data);
			count++;
			last = last.next;
		}
		
		a.add(last.data);
		for(int i = 1; i <= count / 2; i++) {
			temp.data = a.get(count - i) - temp.data;
			temp = temp.next;
		}
		
		for(int i = count / 2 + 1; i <= count; i++) {
			temp.data = a.get(count - i);
			temp = temp.next;
		}
		return head;
	}
}
