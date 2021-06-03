public class Runner {
    
    public static void main(String[] args){

       LinkedList list = new LinkedList();
        list.append(5);
        list.append(10);
        
        list.insertAtStart(25);
        list.insertAtIndex(13, 2);
        list.deleteAt(2);
        System.out.print("No of elements -> ");    
        list.count();
        list.show();
        // System.out.println("Hello world");
    }

}
