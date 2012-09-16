public class Project9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		for (int i = 1; i < 1000; i++) {

			for (int j = 2; j < 1000; j++) {

				int k = 1000 - i - j;
				
				if((i*i) + (j*j) == (k*k)){
					System.out.println("abc = "+ i*j*k);
				}

			}

		}

	}
}
