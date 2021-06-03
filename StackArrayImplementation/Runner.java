public class Runner {
    
    public static void main(String[] args) {
        
        Stack nums = new Stack();
        nums.push(10);
        nums.push(20);
        nums.show();
        System.out.println("element popped ->" + nums.pop());
        System.out.println("element peeked -> " + nums.peek());    ;
        nums.show();
    }
}
