public class BackwardString
{
	private String word;

	public BackwardString(String s)
	{
    word=s;
	}

	public char getFirstChar()
	{
    char firstl=word.charAt(0);
		return firstl;
	}

	public char getLastChar()
	{
    int length=word.length()-1;
		char lastl=word.charAt(length);
		return lastl;
	}

	public String getBackWards()
	{

		String back="";
    int length = word.length();
    for(int i=length-1;i>=0;i--){
      char a=word.charAt(i);
      back=back+a;
    }
		return back;
	}

 	public String toString()
 	{
    char first=getFirstChar();
    char last=getLastChar();
    String backward=getBackWards();
    
 		return first+"\n"+last+"\n"+backward+"\n"+word;
	}
}