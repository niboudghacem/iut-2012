import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;


public class Project42 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		List<String> l = new ArrayList<String>();
		BufferedReader br = null;
		String line = null;
		StringTokenizer st = null;
		int i = 0, total = 0;
		
		for(int j = 1, k = 65; j <= 26 && k<=90; j++ , k++){
			m.put((char)k, j);
		}
		
		try {
			br = FileHelper.getBufferRead(new File("words.txt"));
			line = br.readLine();
			st = new StringTokenizer(line,"\",\"");
			while(st.hasMoreTokens()){
				String s = st.nextToken();
				l.add(s);
			}
			
			
			Map<Integer,String> mp = new HashMap<Integer, String>();
			Iterator<String> it = l.iterator();
			while(it.hasNext()){
				String word = it.next();
				int s = 0;
				for(int n = 0; n < word.length(); n++){
					s += m.get(word.charAt(n));
					
				}
				mp.put(s, word);			
			
				int y = 0;
				for(int n = 1; n <= s; n++){
					y += n;
					if(y == s){
						total++;
					}
				}
			}
			System.out.println(total);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
