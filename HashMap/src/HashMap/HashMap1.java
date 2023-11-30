package HashMap;
import java.util.*;

public class HashMap1 {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		
		freqOfWords(str);
		System.out.println("What word do you want to remove ? ");
		String word = s.next();
		String str2 = removeWords(str,word);
		System.out.println("The new string is : "+str2);
	}

}
