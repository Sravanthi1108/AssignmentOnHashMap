import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.*;



public class RemoveKeys {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		HashMap<Integer, String>hashMap=new HashMap<Integer, String>();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));int n = Integer.parseInt(bufferedReader.readLine());
		for(int i=0;i<n;i++){
		  hashMap.put(Integer.parseInt(bufferedReader.readLine()), bufferedReader.readLine());
		}
		getvalues(hashMap);
		}
		public static void getvalues(HashMap<Integer, String> hashMap) {
		int count=0;
		Iterator<Integer>itr=hashMap.keySet().iterator();
		while(itr.hasNext())
		{
		int n=itr.next();
		if(n%4!=0)
		{
		count++;
		}
		}
		System.out.println(count);
		}

		
	}


