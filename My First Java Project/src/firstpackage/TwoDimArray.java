package firstpackage;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String empinfo[][]=new String[2][2];
		
		empinfo[0][0]="adithya";
		empinfo[0][01]="56789";
		empinfo[1][0]="Mike";
		empinfo[1][1]="12456";
		
		// System.out.println(empinfo[0][0]);
		// System.out.println(empinfo[0][1]);
		// System.out.println(empinfo[1][0]);
		// System.out.println(empinfo[1][1]);
		
		// for (int i=0;i<2;i++) {
			// for (int j=0;j<2;j++) {
				// System.out.println(empinfo[i][j]);
			//}
		//}

	//}

//}

		int i=0;


		while(i<2) {
		int j=0;
		while(j<2) {
		System.out.println(empinfo[i][j]);
		j++;
		}
		i++;
		}
	}
}