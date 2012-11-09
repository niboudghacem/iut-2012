import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeSet;


public class Project22 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Character, Integer> m = new HashMap<Character, Integer>();			
		BufferedReader br = null;
		String line = null;
		StringTokenizer st = null;
		TreeSet<String> t = new TreeSet<String>();
		int i = 0, total = 0;
		
		for(int j = 1, k = 65; j <= 26 && k<=90; j++ , k++){
			m.put((char)k, j);
		}
		
		try {
			br = FileHelper.getBufferRead(new File("names.txt"));
			line = br.readLine();
			st = new StringTokenizer(line,"\",\"");
			while(st.hasMoreTokens()){
				String s = st.nextToken();
				t.add(s);
			}
			
			t = (TreeSet<String>) t.descendingSet().descendingSet();
			Iterator<String> it = t.iterator();
			while(it.hasNext()){
				String name = it.next();
				int somme = 0;
				for(int i1 = 0; i1 < name.length(); i1++){
						
					somme += m.get(name.charAt(i1));
				}
				i++;
				total += (somme*i);
			}
			System.out.println(total);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
