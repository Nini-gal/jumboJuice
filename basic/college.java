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
//linked list class
class LINKLIST {
    private Node head;
    private Node current;

    //constructor to initialize the linked list
    public LINKLIST() {
        this.head = null;
        this.current = null;
    }

    //get the first element in the linked list
    public Object getFirst() {
        if (head == null) return null;
            current = head;
            return head.data;
    }

    // Get the next element in the linked list
    public Object getNext() {
        if (current != null && current.next != null) {
            current = current.next;
            return current.data;
        }
    return null;
    }

    // Insert a new element at the front of the linked list
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
        LINKLIST list1 = new LINKLIST ();
        LINKLIST list2 = new LINKLIST ();//declaring 2 linked list
        //insert colleges into list1
        list1.insertAtFront(new COLLEGE(1, "East", 1000, 100));
        list1.insertAtFront(new COLLEGE(2, "West", 2000, 300));
        list1.insertAtFront(new COLLEGE(3, "South", 1500, 200));
        list1.insertAtFront(new COLLEGE(4, "North", 2500, 400));
        list1.insertAtFront(new COLLEGE(5, "East",3000,500));

        int totalStud = 0;
        int totalStaff = 0;
        System.out.println("COLLEGE INFORMATION");
        Object obj = list1.getFirst();
        while (obj != null) {
            COLLEGE c = (COLLEGE) obj;//casting object to college class
            System.out.println("ID: " + c.theID());
            System.out.println("Number of Students: " + c.theStud());
            System.out.println("Number of Staff: " + c.theStaff());
            totalStud += c.theStud();
            totalStaff += c.theStaff();
            obj = list1.getNext();//get next element from the list1
        }
        System.out.println("Average number of all students from all colleges: " + (totalStud / 5));
        System.out.println("Average number of all staffs from all colleges: " + (totalStaff / 5));


        obj = list1.getFirst();//get first element from the list1
        while (obj != null) {
            COLLEGE c = (COLLEGE) obj;//casting object to the college class
            for (int i = 0; i < 5; i++) {
                if (c.theStaff() > 200) {
                    list1.removeElem(c.theID());//to remove number of staff more than 200 from list1
                    list2.insertAtFront(c);// to insert the removed staff into list2
                }
            }
            obj = list1.getNext();
        }
    }
}