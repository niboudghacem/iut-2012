
public class Project1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int somme = 0;
		for(int i = 0; i < 1000; i++){
			if(i%3 == 0)
				somme += i;
			else if(i%5 == 0)
				somme += i;
		}
		
		System.out.println(somme);
		
	}

}
