import java.util.*;
class JavaStack{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            boolean result = isParanthesisMatching(input);
            System.out.println(result);
            
		}
		
	}
    static boolean isParanthesisMatching(String str){
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(isOpening(c)){
                s.push(c);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                else if(!isMatching(s.peek(),c)){
                    return false;
                }
                else{
                    s.pop();
                }
            }
        }
        return s.isEmpty();
    }
    static boolean isOpening(char c){
        return c=='(' || c=='{' || c=='[';
    }
    static boolean isMatching(char a,char b){
        return (a=='(' && b==')') || (a=='[' && b==']') || (a=='{' && b=='}');
    }
}



