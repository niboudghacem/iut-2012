import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;


public class Project21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<Integer,Integer> l = new HashMap<Integer,Integer>();
		for(int i = 0; i <= 10000 ; i++){
			int somme = 0;
			for(int j = 1; j < i; j++){
				if(i%j == 0){
					somme += j;
				}
			}
			l.put(i,somme);
		}
		Iterator<Integer> i= l.keySet().iterator();
		List<Integer> li = new ArrayList<Integer>();
		int sommeTot = 0;
		while(i.hasNext()){
			int key = i.next();
			int v1 = l.get(key);
			if(!li.contains(key)){
				if(l.containsKey(v1)){
					int v2 = l.get(v1);
					if(v2 == key && key != v1){
						li.add(key);
						li.add(v1);
						sommeTot += key + v1;
					}					 
				}
			}
		}
		System.out.println(sommeTot);
	}

}
