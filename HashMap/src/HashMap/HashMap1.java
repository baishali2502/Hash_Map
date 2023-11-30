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
	/*
	 * @desc:This function prints frequency of words in the string
	 * 
	 * @params:The given string 
	 * 
	 * @returns:void
	 */
	public static void freqOfWords(String str)
	{
		HashMap<String,Integer> map = new HashMap<>();
		String[] arr = str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			String key = arr[i];
			if(map.containsKey(key))
				map.put(key,map.get(key)+1);
			else
				map.put(key,1);
			
		}
		for(String key:map.keySet())
		{
			System.out.println("Word: "+key+" Freq : "+map.get(key));
		}
	}
	/*
	 * @desc:This function removes a particular word from the string
	 * 
	 * @params:The string and the word to be removed from the string
	 * 
	 * @returns:The new string
	 */
	public static String removeWords(String str, String word)
	{
		String ans = "";
		String[] arr = str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].equals(word))
				continue;
			else
				ans+=arr[i]+" ";
		}
		return ans;
	}
}
