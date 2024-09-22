import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Sol a = new Sol();
        System.out.println(a.validparenthesis("{45*({15)}"));
    }
}
class Sol{
    public boolean validparenthesis(String s){
        Stack<Character> st = new Stack<>();
        char p = '\0';
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if (c=='('|| c=='{'|| c=='[') {
                st.push(c);
            }
            else if(c==')'|| c=='}'|| c==']'){
                if (st.isEmpty()) {
                    return false;
                }
               p = st.pop();

               if (!match(p, c)){
                return false;
               }
            }
        }
        if(st.isEmpty()) return true;
        else return false;
    }
    boolean match(char a,char b){
        if(a=='('&& b==')') return true;
        if(a=='{'&& b=='}') return true;
        if(a=='['&& b==']') return true;
        else return false;
    }
}