package day10.misc;

	class Sum{
		
		public static int divider(int a, int b) throws Exception{
			
			if(b == 0){
				throw new Exception("invalid argument");
			}
			
			return a/b;
		}
	}

public class ExceptionHandle {
	
	public static void main(String[] args) {
		
		
			try {
				Sum.divider(10, 0);
			} catch (Exception e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}

	}

}
