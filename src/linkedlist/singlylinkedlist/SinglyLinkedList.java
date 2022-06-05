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

    public static Node addAfter(Node start,int after,int val)
    {
        Node ptr=start;
        while(ptr!=null&&ptr.data!=after)
        {
            ptr=ptr.next;
        }
        if(ptr==null)
        {
            System.out.println("no such data");
            return start;
        }
        Node newnode=new Node(val,null);
        newnode.next=ptr.next;
        ptr.next=newnode;
        return start;

    }

    public static Node addBefore(Node start,int before,int val)
    {
        Node newnode=new Node(val,null);
        if(start.data==before)
        {
            newnode.next=start;
            start=newnode;
            return start;
        }

        Node ptr=start,previous=null;
        while(ptr.data!=before)
        {
            previous=ptr;
            ptr=ptr.next;
        }
        if(ptr==null)
        {
            System.out.println("no such data");
            return start;
        }
        newnode.next=ptr;
        previous.next=newnode;
        return start;

    }

    public static Node deleteFirst(Node start)
    {
        if(start==null)
        {
            System.out.println("no data is available");
            return start;
        }
        start=start.next;
        return start;
    }

    public static Node deleteLast(Node start)
    {
        if(start==null)
        {
            System.out.println("no such data");
            return start;
        }
        if(start.next==null)
        {
            return null;
        }
        start.next=deleteLast(start.next);
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
        start=addAfter(start,89,78);
        start=addAfter(start,90,67);
        start=addBefore(start,67,5);
        start=addBefore(start,89,6);
        display(start);
        System.out.println();

        display(start);
    }

}
