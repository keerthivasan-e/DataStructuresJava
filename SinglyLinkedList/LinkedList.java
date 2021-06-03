
public class LinkedList {

    Node head;

    public void append(int data){

        Node node = new Node();
        node.data=data;
        node.next=null;

        if(head == null){
            head=node;
        }
        else{

            Node n = head;
            while(n.next!= null){
                n=n.next;
            }

            n.next=node;
        }
    }


    public void insertAtStart(int data){

        Node node =new Node();
        node.data=data;
        node.next=null;
        
        node.next=head;
        head=node;
    }

    public void insertAtIndex(int data, int index){

        Node node =new Node();
        node.data=data;
        node.next=null;

        if(index==0)
            insertAtStart(data);
        
        else{
                Node temp=head;
                for(int i=0;i<index-1;++i){
                    temp=temp.next;  
                }
                node.next=temp.next;
                temp.next=node;
        }
    }

    public void deleteAt(int index){

        Node temp= head;
        for(int i=0;i<index-1;++i){
            temp=temp.next;  
            
        }
        Node delete=temp.next;
        temp.next=delete.next;
        delete=null;

    }

    public void count(){
        
        int count=0;
        Node node=head;
        while(node!=null){
            
           // System.out.print(node.data+"->");
            count++;
            node=node.next;
        }
        //count++;
        System.out.println(count);
    }

    public void show(){

        Node node= head;
        while(node.next!=null){
            System.out.print(node.data+"->");
            node= node.next;
        }
        System.out.println(node.data);
    }
    
}
