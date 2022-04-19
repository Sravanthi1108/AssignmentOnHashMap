import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.*;



public class RemoveKeys {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

		HashMap<Integer, String> hashMap=new HashMap<Integer, String>();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bufferedReader.readLine());
		for(int i=0;i<n;i++){
		  hashMap.put(Integer.parseInt(bufferedReader.readLine()), bufferedReader.readLine());
		}
		int size=0;
		size=sizeOfResultandHashMap(hashMap);
		System.out.println(size);
		}
		public static int sizeOfResultandHashMap(HashMap<Integer, String> hashMap) {
		int count=0;
		Set<Integer>  keyValues=hashMap.keySet();
		Iterator<Integer> iterator=keyValues.iterator();


		//Iterator<Integer> itr=hashMap.keySet().iterator();//set interface
		HashMap<Integer,String> hashMap1=new HashMap<>();
		while(iterator.hasNext())
		{
			//HashMap<Integer,String> hashMap1=new HashMap<>();
		int key=iterator.next();
		if(key%4==0)
		{
			
			//hashMap.remove(key, hashMap.get(key));
		}
		else
		{
			hashMap1.put(key, hashMap1.get(key));
		count++;
		}
		}
		
		System.out.println(hashMap1);
		
		return count;
		//System.out.println(count);
		}

		
		
	}


