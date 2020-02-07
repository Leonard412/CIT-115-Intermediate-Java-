/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package demomylinklist;


public class MyLinkList {
    private Node head;
    public MyLinkList(){head = null;}
    
    private class Node{
        String data;
        Node next;
        public Node(){data = null; next = null;}
        public Node(String s){data = s; next = null;}
        public Node(String s, Node n){data = s; next = n;}
        public void setData(String s){data = s;}
        public void setNext(Node s){next = s;}
        public String getData(){return data;}
        public Node getNext(){return next;}
        public String toString(){return data + "\n";}            
    }
    
    public void add(String s){
        if(empty()){
            head = new Node(s);
        }
        else{
            Node curr = head;
            
            // Case 2: add at beginning? 
            if(s.compareTo(curr.getData())<0){
                
                
                //add at beginning
                Node newHead = new Node(s, head);
                head = newHead;
            }
            else{
                //Case 3 & 4: add in the middle or end?
                
                Node prev = null;
                while(curr != null){
                    if(s.compareTo(curr.getData())<0){
                        //prev = curr;
                        break;
                    }
                    prev = curr;
                    curr = curr.next;
                }
                //Case 3: add in the middle
                if(curr != null){
                    Node n = new Node(s, curr);
                    prev.setNext(n);
                }else{
                    //Case 4 add at the end;
                    Node n = new Node(s);
                    prev.next = n;
                }
            }
        }
    }
    
    public boolean empty(){
        return head == null;
    }
    
    public String toString(){
        String s = "";
        if(empty())return "EMPTY";
        Node curr = head;
        while(curr != null){
            s += curr;
            curr = curr.next;
        }
        return s;
    }
}
