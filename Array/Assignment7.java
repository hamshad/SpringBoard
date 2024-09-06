import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class Tester{
  public static String[] findPermutations(String str){
    //Implement your code here and change the return value accordingly
    Set<String> permutations = new HashSet();

    if (str == null)
      return null;
    else if (str.length() == 0) {
      permutations.add("");
      return permutations.toArray(new String[permutations.size()]);
    }
    char a = str.charAt(0);
    String b = str.substring(1);
    Set<String> perms = new HashSet<>(Arrays.asList(findPermutations(b)));
    for (String perm : perms) {
      for (int i = 0; i <= perm.length(); i++) {
        permutations.add(perm.substring(0, i) + a + perm.substring(i));
      }
    }

    return permutations.toArray(new String[permutations.size()]);
  }

  public static void main(String args[]){
    String str = "abc";
    String permutations[] = findPermutations(str);
    for(String permutation: permutations){
      if (permutation!=null)
      System.out.println(permutation);
    }
  }
}



