//Is Unique: Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
//possible hints 1. try a hashtable 2. could a bit vector be useful 3. can this be solved using a complexity of O(N log N)?

public class Q1 {
  boolean isUniqueChars(String str) {
    if (str.length() > 128)
      return false;
      boolean[] char_set = new boolean[128];;
      for (int i = 0; i < char_set.length; i++) {
        int val =  str.charAt(i);
      }



      return false;
  }
 
}
