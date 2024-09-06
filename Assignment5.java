class Tester{
    public static String removeDuplicatesandSpaces(String str){
        //Implement your code here and change the return value accordingly
	String result = "";
	for (char i : str.toCharArray()) {
		String a = String.valueOf(i);
		if (result.contains(a) || a.equals(" "))
				continue;
		result += a.toString();
	}
        return result;
	}
	
	public static void main(String args[]){
	    String str = "object oriented programming";
	    System.out.println(removeDuplicatesandSpaces(str));
	}
}
