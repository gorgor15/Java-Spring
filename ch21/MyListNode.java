package ch21;

public class MyListNode {
	private String data; //?ڷ?
	public MyListNode next; 
	
	public MyListNode() {
		data=null;
		next=null;
	}
	public MyListNode(String data){
		this.data = data;
		this.next = null;
	}
	
	public MyListNode(String data, MyListNode link){
		this.data = data;
		this.next = link;
	}
	
	public String getData(){
		return data;
	}

}
