package activity;

	import java.util.*;
		
     	public class fb {

		   public static void main(String[] args) {
			  
			   String[] string1 = {"camelcam","camelcamp","camper"};
				
				Arrays.sort(string1);
				
				ArrayList numArray = new ArrayList();
				String str1="";
				String str2="";
				for(int i=1;i<string1.length;i++)
				{
					int counter = 0;
					str1 = string1[i-1];
					 str2= string1[i];
					for(int j=0;(j<str1.length())&&(j<str2.length());j++)
					{
						if(str1.charAt(j)==str2.charAt(j))
						{
							counter++;
						}
						
					}
					
					numArray.add(new Integer(counter));
					
				}
				System.out.println(str2);

				System.out.println(str1);

				int[] arrayInt = new int[numArray.size()];
				
				for(int i=0;i<numArray.size();i++)
				{
					arrayInt[i]=((Integer) numArray.get(i)).intValue();
					System.out.println(arrayInt[i]);
				}
				
				int maxCountIndex = numArray.indexOf(Collections.max(numArray));
			
				
				System.out.println("Maximum prefix value = "+string1[maxCountIndex].substring(0, arrayInt[maxCountIndex]));

			}

		}
		
	

//}
