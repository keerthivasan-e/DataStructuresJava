public class Runner {
    
    public static void main(String[] args) {
        
        Stack nums = new Stack();
        
        nums.push(10);
        nums.push(20);
        nums.push(30);
        nums.push(40);
        nums.push(50);
        nums.push(60);
        nums.show();
        System.out.println(nums.pop());   
        System.out.println(nums.pop());   
        System.out.println(nums.pop());  
        System.out.println(nums.pop());  
        System.out.println(nums.pop());  
        System.out.println(nums.pop());  
        nums.show();
      



        // System.out.println("element popped ->" + nums.pop());
        // System.out.println("element peeked -> " + nums.peek());    ;
        // System.out.println("size -> " + nums.size());
        // nums.show();
        // System.out.println("isEmpty() -> "+ nums.isEmpty());
    }
}
