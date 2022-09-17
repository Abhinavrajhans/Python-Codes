
class Node :
    
    #data and address of the next Node
    def __init__(self,value):
        self.data=value
        self.next=None


class LinkedList :
    
    def __init__(self):
        self.head=None
        self.tail=None
        
        
    def print(self) :
        
        temp=self.head
        while(temp!=None):
          print(temp.data)
          temp=temp.next
          
          
    def insert(self,data):
        #insert at the front 
          #time complexity is O(1)
        if self.head is None :
            self.head=Node(data)
            self.tail=self.head
        else :
            a=Node(data)
            a.next=self.head
            self.head=a
    
    def insert_after(self,opp,data):
        #time complexity is O(n)
        temp=self.head
        while(temp.data!=opp and temp is not None):
            temp=temp.next
        
        a = Node(data)
        a.next=temp.next
        temp.next=a
        
        
        
    def insert_end(self,data): 
        #time complexity is O(1)
        
        if self.head==None :
            self.head=Node(data)
            self.tail=self.head
        
        else :    
            a=Node(data)
            self.tail.next=a
            self.tail=a
    
    def reverse(self,t1):
        prev=None
        curr=t1
        nnext=None
        while(curr!=None):
            nnext=curr.next
            curr.next=prev
            prev=curr
            curr=nnext
        
            

if __name__ == '__main__'  :
    
    l1 = LinkedList()
    l1.insert_end(10)
    l1.insert_end(20)
    l1.insert_end(30)
    t2=l1.head.next
    l1.reverse(t2)
    l1.head.next=t2
    
    l1.print()


   
    
    
        
