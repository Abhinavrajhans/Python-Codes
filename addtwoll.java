import java.util.*;
import java.io.*;

public class Main {
	public static Scanner obj = new Scanner(System.in);
	public static PrintWriter out = new PrintWriter(System.out);
	public static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	public static class ll
	{
		Node head;
		void insert(int data)
		{
			if(head==null)
			{
				head=new Node(data);
				return;
			}
			Node temp=head;
			while(temp.next!=null)
			{
				temp=temp.next;
			}
			temp.next=new Node(data);
			return;
		}
		void print()
		{
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+"->");
				temp=temp.next;
			}
			System.out.print("null");
			System.out.println();
		}
		void reverse()
		{
			Node prev=null;
			Node curr=head;
			Node next=null;
			while(curr!=null)
			{
			  next=curr.next;
			  curr.next=prev;
			  prev=curr;
			  curr=next;
			}
			head=prev;
		}
		void delete()
		{
			Node temp=head;
			while(temp.next.next!=null) temp=temp.next;
			temp.next=null;
		}
		void delete_pos(int x)
		{
			
		}
	}
	public static void main(String[] args) {
		ll a=new ll();
		ll b=new ll();
		a.insert(1);
		a.insert(3);
		a.insert(8);
		b.insert(4);
		b.insert(5);
		b.insert(6);
		a.reverse();
		b.reverse();
		ll c=new ll();
		int carry=0;
		Node t1=a.head;
		Node t2=b.head;
		while(t1!=null && t2!=null)
		{
			int val=t1.data+t2.data+carry;
			if(val>=10)carry=1;
			else carry=0;
			c.insert(val%10);
		    t1=t1.next;
		    t2=t2.next;
		}
		c.reverse();
		c.print();
	}
}
