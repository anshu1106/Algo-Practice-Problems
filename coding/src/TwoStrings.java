import java.util.Scanner;


class TwoStrings {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		boolean flag;
		for (int i=0;i<count;i++)
		{
			flag = false;
			int lettersArray[] = new int[26];
			String a=in.next();
			String b = in.next();
			for ( int index = 0; index < a.length(); index++){
			    lettersArray[a.charAt(index)-'a']=1;
			}
			for(int index=0;index<b.length();index++)
			{
				char c = b.charAt(index);
				int arrayIndex= c-'a';
				if (lettersArray[arrayIndex]!=0)
				{
					flag = true;
					break;
				}
				
			}
			if(flag)
			{
				System.out.println("YES");
			}
			else
			{
				
				System.out.println("NO");
			}
		}
	}

}
