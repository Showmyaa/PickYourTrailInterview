package sowm.pack1;

public class MaxIn1DArray {


		public static void main(String[] args)
		{
			int a;//First Index
 			int b;//Second Index
			int k;//Addend
			int max = 0;//Store Current Max Value
			int j=0;//For reading the Column Value
			
			
			//First Index, Second Index and Addend given as input in 2D Array.
		    int[][] input={{2,3,603},{1,2,286},{4,4,882}};
			
			//Intial Array with 0's
			int[] intialArray= {0,0,0,0};
			for(int i=0; i<input.length;i++)
			{
				a=input[i][j];//For each iteration assigning the a, b and k
				b=input[i][j+1];
				k=input[i][j+2];
				for(int counter=a-1;counter<b;counter++)//Loop to add k to the given range(a to b)
				{
				intialArray[counter]=intialArray[counter]+k;
				
			   }
				
			}
			//To print the final array
			for (int m=0;m<intialArray.length;m++)
				System.out.print(intialArray[m] + " ");
			
		
for( int m=0; m<intialArray.length;m++)//To Find the Maximun from the 1D Array
			{
				if(max==0)
					max=intialArray[m];
				else {
				if(max<=intialArray[m])
					max=intialArray[m];
				}
		
		}
			System.out.println("\n"+ "Largest Number in the array is : "+ max);//Finally Printing the Maximum Number in the 1D Array
	}
	}

