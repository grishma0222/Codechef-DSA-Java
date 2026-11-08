# Reverse Letters Then Special Characters in a String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

You are given a string `s` consisting of lowercase English letters and special characters.

Your task is to perform these  **in order** :

- Reverse the lowercase letters and place them back into the positions originally occupied by letters.
- Reverse the special characters and place them back into the positions originally occupied by special characters.

Return the resulting string after performing the reversals.

 

 **Example 1:** 

 **Input:**  s = ")ebc#da@f("

 **Output:**  "(fad@cb#e)"

 **Explanation:** 

- The letters in the string are ['e', 'b', 'c', 'd', 'a', 'f']: Reversing them gives ['f', 'a', 'd', 'c', 'b', 'e'] s becomes ")fad#cb@e("
- ​​​​​​​The special characters in the string are [')', '#', '@', '(']: Reversing them gives ['(', '@', '#', ')'] s becomes "(fad@cb#e)"

 **Example 2:** 

 **Input:**  s = "z"

 **Output:**  "z"

 **Explanation:** 

The string contains only one letter, and reversing it does not change the string. There are no special characters.

 **Example 3:** 

 **Input:**  s = "!@#$%^&*()"

 **Output:**  ")(*&^%$#@!"

 **Explanation:** 

The string contains no letters. The string contains all special characters, so reversing the special characters reverses the whole string.

 

 **Constraints:** 

- 1 <= s.length <= 100
- s consists only of lowercase English letters and the special characters in "!@#$%^&*()".

## Solution

**Language:** Java  
**Runtime:** 0 ms  
**Memory:** 42 MB  
**Submitted:** 2026-11-08T10:52:40.718Z  

```java
class Solution {
    public String reverseByType(String s) {
        StringBuilder s2=new StringBuilder(s);
        int n=s.length();
        for(int i=0;i<n/2;i++)
        {
            char ch=s.charAt(i);
            if(!Character.isLetterOrDigit(ch))
            {
                char temp=s2.charAt(i);
                s2.setCharAt(i,s2.charAt(n-i-1));
                s2.setCharAt(n-i-1,temp);
            }
            else{
                 char temp=s2.charAt(i);
                s2.setCharAt(i,s2.charAt(n-i-1));
                s2.setCharAt(n-i-1,temp);
            }
        }
        return s2.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-letters-then-special-characters-in-a-string/)