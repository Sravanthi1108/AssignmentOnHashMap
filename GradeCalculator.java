import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
class UserMainCode
{
	public static LinkedHashMap<String,String>dis(LinkedHashMap<String,Double>h1)
	{
		LinkedHashMap<String,String>h2=new LinkedHashMap<String,String>();
		for(Map.Entry m:h1.entrySet())
		{
			double d=(Double)m.getValue();
			if(d>60)
			{
				String s=(String)m.getKey();
				h2.put(s,"pass");
			}
			else{
				String s=(String)m.getKey();
				h2.put(s,"fail");
				}
		}
			
		
		return h2;
	}
}
public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Double>hm=new LinkedHashMap<String,Double>();
		
		LinkedHashMap<String,String>hm1=new LinkedHashMap<String,String>();
		Scanner scanner=new Scanner(System.in);int n=scanner.nextInt();
		for(int i=0;i<n;i++){
			String s=scanner.next();
			
			double d=scanner.nextDouble();
			hm.put(s,d);
		}
		LinkedHashMap<String,String>hm2=UserMainCode.dis(hm);
		for(Map.Entry<String,String>entry:hm2.entrySet())
		{
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}

}
