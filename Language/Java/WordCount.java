//Python program to count number of words in a string.
public class WordCount 
{
	static int wordcount(String string)  
    {
		int count=0;
		char ch[]= new char[string.length()];     
        for(int i=0;i<string.length();i++)  
        {  
            ch[i]= string.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)) )  
                count++;  
        }  
        return count;  
    }  
    public static void main(String[] args)
	{  
		String string ="I Love My India";  
        System.out.println(wordcount(string) + " words.");   
    }  
}
