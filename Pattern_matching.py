# Pattern Matching Problem

# https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/

# Solution 

# Code 1
def minAddToMakeValid(s: str) -> int:
    while("()" in s):
         s = s.replace("()","")   #Removing the opening and closing bracket pairs, the 
#   final remaining string is the one that is needed,
    return len(s)   		 #return its length

# Code 2
# arr = []
#     for i in s:
#         if i == "(":  // if the element in the string is “(“ 
#             arr.append(i)  // then simply push it to stack
#         elif len(arr) and arr[-1] == "(":  // else if stack is not empty and the last element is “(“
#             arr.pop()	// simply pop the last element bcz we have found a pair of ()
#         else:
#             arr.append(i) // if the stack is empty then simply push the element of the string to 
# 			// the stack, finally return the length of the stack
#     return len(arr)
