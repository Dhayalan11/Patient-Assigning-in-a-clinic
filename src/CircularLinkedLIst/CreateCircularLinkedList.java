package CircularLinkedLIst;

import hospitals.Doctor;

public class CreateCircularLinkedList {  
	
    public class Node{  
    	public Doctor data;  
        public Node next;  
        public Node(Doctor data) {  
            this.data = data;  
        }  
    }    
//    java.util.Collections    
    public Node head = null;  
    public Node tail = null;    
	public Node CurNode=null;
    public void add(Doctor data){  
        Node newNode = new Node(data);    
        if(head == null) {    
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {    
           // tail.next = newNode;    
            tail = newNode;  
            tail.next = head;  
        }  
    }  
    public Node get() {

    		if(CurNode==null) {
    			CurNode=head;
    		
    		}else {
    			CurNode=CurNode.next;
    		}
    		return  CurNode;
    		
    }
    

    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
            System.out.println("Nodes of the circular linked list: ");  
             do{  
                 
                System.out.println(" "+ current.data);  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
  

}  