    import java.util.Stack;

    public class Main {
        static Stack<Integer> stack1 = new Stack<Integer>();
        static Stack<Integer> stack2 = new Stack<Integer>();
        public void push(int node) {
            stack1.push(node);

        }

        public int pop() {
         if(stack2.isEmpty()){
             while(!stack1.isEmpty()){
                 stack2.push(stack1.pop());
             }
         }
         return stack2.pop();
        }
        public static void main(String[] args) {
            Main s = new Main();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            s.push(5);
            s.push(6);
            System.out.println(s.pop());

        }
    }
