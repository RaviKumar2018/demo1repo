package com.test;

public class StringArmstorng {

	 
			 public static void main(String args[]){  
			  int r,temp;
			  String sum="";  
			  
			  String n="Hello";//It is the number variable to be checked for palindrome  
			  for(int i=n.length()-1;i>=0;i--) {
				  sum=sum+n.charAt(i);
			  }
			  
//			  temp=n;    
//			  while(n>0){    
//			   r=n%10;  //getting remainder  
//			   sum=(sum*10)+r;    
//			   n=n/10;    
//			  }    
//			  if(temp==sum)    
//			   System.out.println("palindrome number ");    
//			  else    
//			   System.out.println("not palindrome");    
//			}  
			 
	System.out.println(sum);
			 }
}


class Main {
    public static void main(String[] args) {
       int n1=0; int n3;
       int n2=1; 
       int count=10;
       System.out.println(n1+" "+n2);
       for(int i=2;i<count;++i){
           n3=n1+n2;
           System.out.println(" "+n3);
           n1=n2;
           n2=n3;
       }
      
    }
}

