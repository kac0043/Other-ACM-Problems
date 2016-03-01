import java.util.*;

public class voting
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		char[] c = s.toCharArray(); 
		while (!(c[0] == '#'))
		{
			int num = s.length();
			int y = 0, n = 0, a = 0, p = 0;
			for (int i = 0; i < num; i++)
			{
				if (c[i] == 'Y')
					y++; 
				else if (c[i] == 'N')
					n++;
				else if (c[i] == 'A')
					a++;
				else if (c[i] == 'P')
					p++;
			}
			if (a >= (num+1)/2)
				System.out.println("need quorum");
			else if (y > n)
				System.out.println("yes");
			else if (n > y)
				System.out.println("no");
			else 
				System.out.println("tie");
			s = scan.nextLine();
			c = s.toCharArray(); 
		}
	}
}