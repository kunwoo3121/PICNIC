import java.util.Scanner;

public class PICNIC {
	
	static int count;
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = sc.nextInt();
		
		for(int i = 0; i < n; i++)
		{
			int num, pair_num;
			
			num = sc.nextInt();
			pair_num = sc.nextInt();
			
			int[] check = new int[num];
			int[][] matrix = new int[num][num];
			
			for(int j = 0; j < pair_num; j++)
			{
				int a, b;
				
				a = sc.nextInt();
				b = sc.nextInt();
				
				matrix[a][b] = 1;
				matrix[b][a] = 1;
			}
			
			PICNIC.count = 0;
			
			Count_Num(0, num, matrix, check);
			
			System.out.println(PICNIC.count);
		}
		
	}
	
	static void Count_Num(int i, int num, int[][] matrix, int[] check)
	{
		if(i >= num) 
		{
			int k;
			
			for(k = 0; k < num; k++)
			{
				if(check[k] == 0) break;
			}
			
			if(k == num) PICNIC.count++;
			
			return;
		}
		
		if(check[i] == 1) Count_Num(i+1, num, matrix, check);
		
		if(check[i] == 1) return;
		
		check[i] = 1;
		
		for(int j = i+1; j < num; j++)
		{
			if(matrix[i][j] == 1 && check[j] == 0)
			{
				check[j] = 1;
				Count_Num(i+1, num, matrix, check);
				check[j] = 0;
			}
		}
		
		check[i] = 0;
	}
}
