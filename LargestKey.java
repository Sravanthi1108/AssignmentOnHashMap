import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class UserMainCode1{

	public static String getMaxKeyValue(HashMap<Integer, String> hashMap) {
		// TODO Auto-generated method stub
		int max=0;
		String name=null;
		Set<Map.Entry<Integer,String>> entries = hashMap.entrySet();
		for(Entry<Integer, String> entry : entries){
			if(entry.getKey()>max){
				max=entry.getKey();
				name =entry.getValue();
			}
		}
		
		return name;
	}
	
}
public class LargestKey {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the size of the map");
		int count = scanner.nextInt();
		HashMap<Integer,String> hashMap = new HashMap<>(count);
		for(int i=0;i<count;i++){
			hashMap.put(scanner.nextInt(),scanner.next());
			}
		String output = UserMainCode1.getMaxKeyValue(hashMap);
		System.out.println(output);
	

	}

}
