package sowm.pack1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ShortestString {
	 public static void main(String[] args)throws IOException
	    {
		//To get the data from the user
	        System.out.println("Enter a String :");
	        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	        String s=br.readLine();
	       //Arraylist to store the characters. If the Character is not avaliable in the list then the character gets added to the list
	        ArrayList<Character> splitResult=new ArrayList<Character>();
	        for(int i=0;i<s.length();i++)
	        {
	        	
	        	//To insert the first character into the Arraylist.
	        	if(splitResult.size()==0)
	        	{
	        		splitResult.add(s.charAt(i));
	        		continue;
	        	}
	        	
	            if(!splitResult.contains(s.charAt(i)))
	            {
	            	if(s.charAt(i)!= ' ')
	            	splitResult.add(s.charAt(i));
	            	
	            }
	       
	        }
	        //Finally printing length of Smallest String
	        System.out.println("Length of Smallest String: " + splitResult.size());
	    }
}
