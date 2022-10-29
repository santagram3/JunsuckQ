package ch04;

class q13 {
	public static void main(String[] args){
    	 String value = "12o34";
    	 char ch = ' ';
    	 boolean isNumber = true;
    	 // charAt(int i) 반복문과 를 이용해서 문자열의 문자를
    	 // . 하나씩 읽어서 검사한다
    	 
    	 for(int i=0; i < value.length() ;i++) {
    		 /**
    		  * 	 char t =  value.charAt(i);
    		 t.getClass().getSimpleName(); -이거 하면 무슨 타입인지 나오는데 왜 못한다고 하는지 . ;; 
    		 https://www.delftstack.com/ko/howto/java/typeof-in-java/
    		 System.out.println();
    		 
    		  * */
    		 // 하나하나 띄어와서 일일이 0~9 사이의 숫자인지 비교를 한다 ! 
    		 char charAtNum = value.charAt(i);
    		 if(!(charAtNum>='0' && charAtNum <='9')) {
    			 isNumber = false ;
    			 break;
    		 }
    		 
    	 }
    	 if (isNumber) {
    		 System.out.println(value+"는 숫자입니다 ."); 
    	 } else {
    		 System.out.println(value+"는 숫자가 아닙니다. "); 
    	 }
     } // end of main
} // end of class