class Tester {
    
   public static int[] findLeapYears(int year){
       //Implement your code here and change the return value accordingly
	int[] result = new int[15];
//	int index = 0;
//	int leapyears = year;
//	while (true) {
//	    if (leapyears % 4 == 0 && (leapyears % 100 != 0 || leapyears % 400 == 0)) {
//		result[index] = leapyears;
//		if (index == 14) break;
//		index++;
//		leapyears += 4;
//	    } else {
//		leapyears++;
//	    }
//	}
	for (int i = 0; i < 15; year++) {
	    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
		result[i] = year;
		i++;
	    }
	}
        return result;
   }
    
   public static void main(String[] args) {
       int year = 2000;
	   int[] leapYears;
	   leapYears=findLeapYears(year);
	   for ( int index = 0; index<leapYears.length; index++ ) {
	       System.out.println(leapYears[index]);
	   }
    }
}
