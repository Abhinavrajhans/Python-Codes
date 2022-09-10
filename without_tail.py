
class Node :
    
    #data and address of the next Node
    def __init__(self,value):
        self.data=value
        self.next=None


class LinkedList :
    
    def __init__(self):
        self.head=None
        
        
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
        #time complexity is O(n)
        temp=self.head
        while(temp.next is not None) :
            temp=temp.next
            
        a=Node(data)
        temp.next=a
        
        
    def delete(self):
        #delete a node from the start
        #time complexity is O(1)
        self.head=self.head.next
    
    def delete_end(self) :
        #delete a node from the end
        #time complexity is O(n)
        temp=self.head
        if(self.head is None) :
           return
        if(self.head.next is None ):
           self.head=None
           return 
        if(self.head.next.next is None):
           self.head.next=null
           return 
       
        while(temp.next.next is not None) :
          temp=temp.next
        temp.next=None
        
    def delete_val(self,value):
        
        if(self.head.data==value):
            self.head=self.head.next
        temp=self.head
        while(temp.next.data is not value):
            temp=temp.next
        temp.next=temp.next.next    
        

if __name__ == '__main__'  :
    
    l1 = LinkedList()
    l1.insert(30)
    l1.insert(10)
    l1.insert_after(10,20)
    l1.insert_end(40)
    l1.delete_val(30)
    l1.print()

   
    
    
        
