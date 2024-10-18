package inheritanceHararcky;



public class lunch {

	public static void main(String[] args) {
		Thar thar = new Thar();
		thar.eHelth();
		thar.mailage();
		thar.ec();
		for(int i =1; i<=7;i++) {
			for(int k =7 ; k>=i;k--) {
				System.out.print(i);
			}System.out.println();
		}
	}

}
