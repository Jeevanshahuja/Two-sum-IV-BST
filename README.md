# Two Sum IV - Input is a BST  

## Problem Description  
Given the root of a Binary Search Tree (BST) and an integer `k`, determine if there exist **two elements** in the BST whose sum equals `k`.  

## Solution  

### Approach  
The solution uses a **HashSet** to track visited nodes in the tree.  
1. Traverse the BST using DFS (Depth-First Search).  
2. For each node, check if `target - node.val` exists in the HashSet:  
   - If true, return `true` immediately.  
   - If false, add the current node's value to the HashSet.  
3. Recursively traverse the left and right subtrees.  


### Time Complexity  
- **Traversal**: `O(N)`, where `N` is the number of nodes in the tree.  
- **Set Operations**: `O(1)` on average for `contains()` and `add()`.  

### Space Complexity  
- **HashSet Storage**: `O(N)` for storing values of nodes.  
- **Recursive Stack**: `O(H)`, where `H` is the height of the BST.  

## Link to Problem  
[LeetCode - Two Sum IV (Input is a BST)](https://leetcode.com/problems/two-sum-iv-input-is-a-bst/description/)  
