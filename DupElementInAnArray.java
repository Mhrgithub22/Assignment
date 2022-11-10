
public class DupElementInAnArray {

		
		public static void main(String[] args) {
	        
			  int []a= {3,4,6,9,7,8,3,9,4,6};
			  
			  System.out.println("Duplicate elements are : ");
			  for (int i=0;i<a.length;i++)
			  {
				  for (int j=i+1;j<a.length;j++)
				  {
					  if(a[i]==a[j])
					  {
						  
						  System.out.println(a[j]);
					  }
				  }
			  }
			  

		}

	}


