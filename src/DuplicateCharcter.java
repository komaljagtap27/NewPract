
public class DuplicateCharcter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "beautiful beach";
		char[] word= str.toCharArray();
		char[] temp = null;
	int count=0;
	System.out.println("duplicate charcters::");
		for(int i=0;i<str.length();i++){
			for(int j=i+1;j<str.length();j++){
				if(word[i]==word[j])
				{
					System.out.println(word[j]+" ");
					count++;
					break;
				}
			}
		}
		int k=0;
		System.out.println(count);
		for (int i=0;i<str.length()-1;i++)
		{
			if(word[i]!=word[i+1])
			{
				temp[k++]=word[i];
			}
			
		}
		
	}
}
