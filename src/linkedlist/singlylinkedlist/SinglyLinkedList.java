package linkedlist.singlylinkedlist;
import node.Node;

public class SinglyLinkedList {

    public static Node addFirst(Node start,int x)
    {
        Node newnode=new Node(x,null);
        newnode.next=start;
        start=newnode;
        return start;
    }


    public static Node addLast(Node start,int x)
    {
        Node newnode=new Node(x,null);
        if(start==null)
        {
            start=newnode;
            return start;
        }
        Node ptr=start;
        while (ptr.next!=null)
        {
            ptr=ptr.next;
        }
        ptr.next=newnode;
        return start;
    }
    public static void display(Node start)
    {
        Node ptr=start;
        while(ptr!=null)
        {
            System.out.print(ptr.data+" ");
            ptr=ptr.next;
        }
    }

    public static void main(String args[])
    {
        Node start=null;
        start=addFirst(start,9);
        System.out.println(start.data);
        start=addFirst(start,89);
        System.out.println(start.data);
        start=addLast(start,90);
        System.out.println(start.next.next.data);
        display(start);
    }

}
