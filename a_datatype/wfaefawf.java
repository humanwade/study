package a_datatype;

public class wfaefawf {
	public static void main(String[] args) {

		int[][] a = new int [][] {{3,-5,12}, 			  //10
								{-2,11,2,-7},		  //4		
								{21,-21,-35,-93,-11}, //-139
								{9,14,39,-98}};		  //-36


			int[] sum = new int [a.length]; {

				for (int i = 0 ; i < a.length ; i++) {
					int isum = 0;
					for(int j = 0 ; j < a[i].length ; j++) {
						isum += a[i][j];
					}
					sum[i] = isum;
					System.out.println((i+1)+"행의 합은 " + sum[i] + " 입니다");
				}
				for(int i = 0 ; i < sum.length ; i++ ) {		 
				}

				int max = sum[0];
				int min = sum[0];
				for (int i = 1 ; i < sum.length ; i++) {
					if(max < sum[i]) {
						max = sum[i];
					}else if(min > sum[i]) {
						min = sum[i];
			  }
			
			}
				System.out.println("최대값은 " + max + " 입니다.");
				System.out.println("최소값은 " + min + " 입니다.");
		}

	}
}
