
public class Project2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
        int nbr = 1, nbr2 = 0, somme = 0;
        while(nbr<=4000000){
            if(nbr%2 == 0){
                somme = somme + nbr;
            }
            nbr = nbr2 + nbr;
            nbr2 = nbr - nbr2;
        }
        System.out.println(somme);
	}

}
