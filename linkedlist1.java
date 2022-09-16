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
		int len()
		{
			Node temp=head;
			int length=0;
			while(temp!=null)
			{
				temp=temp.next;
				length+=1;
			}
			return length;
		}
		int get_the_xthe_element(int len)
		{
			Node temp=head;
			len-=1;
			while(len>0)
			{
				temp=temp.next;
				len-=1;
			}
			return temp.data;
		}
		int get_middle()
		{
		   Node turtle=head;
		   Node rabbit=head;
		   while(rabbit!=null && rabbit.next!=null)
		   {
			   turtle=turtle.next;
			   rabbit=rabbit.next.next;
		   }
		   return turtle.data;
		}
	}
	public static void main(String[] args) {
		ll a=new ll();
		ll b=new ll();
		a.insert(1);
		a.insert(2);
		a.insert(3);
		a.insert(4);
		int len=a.len();
		System.out.println(a.get_the_xthe_element((len+1)/2));
		System.out.println(a.get_middle());
		
	}
}
