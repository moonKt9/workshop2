package com.linkedlist;

public class LinkedList{
	private ListNode head;
	
	public static class ListNode{
		private int  data;
		private ListNode next;
		

	public ListNode(int data) {
		this.data=data;
		this.next=null;
	}
}

	
	

	public void display() {
		ListNode current=head;
		while(current!=null) {
			System.out.print(current.data+"-->");
			current=current.next;
		}
		
	System.out.println("null");
	}
	
	
		
		public void insertFirst(int value) {
			ListNode newNode=new ListNode(value);
			newNode.next=head;
			head=newNode;
		}
		
		public static void main(String args []) {
			LinkedList ll=new LinkedList();
			ll.head=new ListNode(10);
			ListNode second=new ListNode(12);
			ListNode third=new ListNode(14);
			ListNode forth=new ListNode(15);
			
			ll.head.next=second;
			second.next=third;
			third.next=forth;
			ll.insertFirst(6);
			
			ll.display();
		}
			
		}

	
		
		
			
		






