# 26. Remove Duplicates from Sorted Array – Java Solution

This repository contains a Java solution for the **LeetCode problem: Remove Duplicates from Sorted Array**.

The solution removes duplicates in-place using a two-pointer approach and returns the number of unique elements.

---

## 📌 Problem Overview

Given a sorted integer array `nums`, remove the duplicates in-place such that each unique element appears only once.

Return the number of unique elements. The first `k` elements of `nums` should hold the final result.

---

## 🧪 Code Functionality

- Handles edge case when the array is empty  
- Uses two pointers: `i` for the position of unique elements and `j` for traversal  
- Iterates through the array starting from index `1`  
- Compares current element with the last unique element  
- If different, increments `i` and updates `nums[i]`  
- Returns `i + 1` as the count of unique elements  

---

## 🧠 Concepts Covered

- Arrays  
- Two-pointer technique  
- In-place modification  
- Conditional logic  

---

## 🖥️ Screenshots

📸 **Case:**  
![Case](case.png)

📸 **Submit:**  
![Submit](submit.png)

---

## ⏱️ Complexity Analysis

- **Time Complexity:** O(n)  
- **Space Complexity:** O(1)

---

## 📂 File Information

- Solution.java — Java source code  
- case.png — Screenshot of Case output  
- submit.png — Screenshot of Submit result  
- README.md — Problem documentation  

---

## ⚠️ Notes

- Requires the input array to be sorted  
- Efficient in-place solution with no extra space  
- Returns the length of the modified array, not a new array  

---

## 👨‍💻 Author

Tejas Halvankar  

- GitHub: https://github.com/Tejas-H01  
- LinkedIn: https://www.linkedin.com/in/your-linkedin-username  
- Email: tejashalvankar0@gmail.com