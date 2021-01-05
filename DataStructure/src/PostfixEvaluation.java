
public class PostfixEvaluation {

	static int evaluatePostfix(String exp) 
    { 
	 stack s= new stack(20);
	 char ch[] = exp.toCharArray();
	    for(char c: ch) {
  	    if(c >= '0' && c <= '9')
            s.push(Character.getNumericValue(c)); 
            else
            { 
                int val1 = s.pop(); 
                int val2 = s.pop(); 
                  
                switch(c) 
                { 
                    case '+': 
                    s.push(val2+val1); 
                    break; 
                      
                    case '-': 
                    s.push(val2- val1); 
                    break; 
                      
                    case '/': 
                    s.push(val2/val1); 
                    break; 
                      
                    case '*': 
                    s.push(val2*val1); 
                    break; 
              } 
            } 
        } 
        return s.pop();     
    }
	public static void main(String[] args) {
		 String exp="44+"; 
	     System.out.println("Evaluation of Postfix:"+evaluatePostfix(exp));

	}

}
