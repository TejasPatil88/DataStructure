/*
  stack is in same package so we can access its methods 
 */
public class PrefixEvaluation {
	 static int evaluatePrefix(String exp) 
	    { 
		stack s= new stack(20);
		int i,size;
		char ch[] = exp.toCharArray();
		size=ch.length-1;
		for(i=size;i>=0;i--)
		{
			if(ch[i] >= '0' && ch[i] <= '9')
	            s.push(Character.getNumericValue(ch[i])); 
	            else
	            { 
	                int val2 = s.pop(); 
	                int val1 = s.pop(); 
	                  
	                switch(ch[i]) 
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
        String exp="+44"; 
        System.out.println("Evaluation of Prefix:"+evaluatePrefix(exp));
    } 
}


