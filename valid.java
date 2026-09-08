import java.util.*;
public class valid {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(s.charAt(0)=='}' || s.charAt(0)==']' || s.charAt(0)==')'){
            System.out.print("false");
            return;}
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='(' || c=='{' || c=='[')
                st.push(c);
            else{
                if(st.isEmpty()){
                   System.out.print("false");
            return;}
                char top=st.peek();
                if((c=='(' && top!=')') || (c=='[' && top!=']') || (c=='{' && top!='}') ){
                    System.out.print("false");
            return;}
                st.pop();

            }

        }
        if(st.isEmpty())
            System.out.print("true");
        else{
            System.out.print("false");
        }

    }
    
}
