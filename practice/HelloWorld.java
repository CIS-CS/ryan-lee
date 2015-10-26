public class HelloWorld {
	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		
		for(int i = 0; i < num; i++)
		{
			if(num % 2 == 0){
				System.out.println("Hello World");
			}
			
		}
			
		if(num % 2 == 1){
				System.out.println("Error");
			}
			
		if (num < 0){
	    System.out.println( "Number cannot be negative." );
		}
				
}

}


