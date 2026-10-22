class COLLEGE
{ 
int ID; // identification number (unique) of college
String Location; // East, West, South, North
int numofstud;
int numofstaff;

COLLEGE(int id, String l, int nos, int nost)
{
ID = id;
Location = l;
numofstud = nos;
numofstaff = nost;
}


public int theID() { return ID; }
int theStud(){ return numofstud; }
int theStaff(){ return numofstaff; }

}

class LINKLIST {
private Node head;
private Node current;

public LINKLIST() {
this.head = null;
this.current = null;
}

public Object getFirst() {
if (head == null) return null;
current = head;
return head.data;
}

public Object getNext() {
if (current != null && current.next != null) {
current = current.next;
return current.data;
}
return null;
}

public void insertAtFront(Object elem) {
Node newNode = new Node(elem);
newNode.next = head;
head = newNode;
}

public Object removeElem(int targetID) {
Node prev = null;
Node temp = head;

while (temp != null) {
if (temp.data instanceof COLLEGE) {
COLLEGE c = (COLLEGE) temp.data;
if (c.theID() == targetID) {
if (prev == null) { 
head = temp.next;
} else {
prev.next = temp.next;
}
return temp.data;
}
}
prev = temp;
temp = temp.next;
}
return null;
}
}


class Node
{
Object data;
Node next;

Node(Object d)
{
data = d;
next = null;
}
}

public class main{
    public static void main(String [] args){
        //linkedlist
    }
}