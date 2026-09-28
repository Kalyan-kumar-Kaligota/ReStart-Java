import java.util.Stack;

public class StackPractice {

    public static void main(String[] args) {
        Stack<String> st = new Stack<>();

        st.push("Angular");
        st.push("React");
        st.push("Java");
        st.push("Spring boot");

        for(String s : st) {
            System.out.println("print all the stack values =====>  " + s);
        }

        System.out.println("----------------------------");

        System.out.println("check peek"+ st.pop());
        System.out.println("------------");

        for(String s : st) {
            System.out.println("print all the stack values =====>  " + s);
        }

        System.out.println("----------------------------");

        st.peek();
        System.out.println("check clone");
        st.clone();


        for(String s : st) {
            System.out.println("print all the stack values =====>  " + s);
        }

    }
}
