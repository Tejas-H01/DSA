# 905. Sort Array By Parity – Java Solution

This repository contains a Java solution for the **LeetCode problem: Sort Array By Parity**.

The solution rearranges the array so that all even elements appear before odd elements using a two-pointer filling approach.

---

## 📌 Problem Overview

Given an integer array `nums`, return an array where all even integers come before all the odd integers.

You may return any valid answer that satisfies this condition.

---

## 🧪 Code Functionality

- Creates a new array `arr` of the same size  
- Uses two pointers: `l` starting from the beginning and `r` from the end  
- Traverses the original array once  
- If the element is even, places it at index `l` and increments `l`  
- If the element is odd, places it at index `r` and decrements `r`  
- Returns the rearranged array  

---

## 🧠 Concepts Covered

- Arrays  
- Two-pointer technique  
- Conditional logic  
- Single-pass traversal  

---

## 🖥️ Screenshots

📸 **Case:**  
![Case](case.png)

📸 **Submit:**  
![Submit](submit.png)

---

## ⏱️ Complexity Analysis

- **Time Complexity:** O(n)  
- **Space Complexity:** O(n)

---

## 📂 File Information

- Solution.java — Java source code  
- case.png — Screenshot of Case output  
- submit.png — Screenshot of Submit result  
- README.md — Problem documentation  

---

## ⚠️ Notes

- Uses an extra array for simplicity  
- Maintains relative grouping of even and odd elements  
- Can be optimized to O(1) space using in-place swapping  

---

## 👨‍💻 Author

Tejas Halvankar  

- GitHub: https://github.com/Tejas-H01  
- LinkedIn: https://www.linkedin.com/in/your-linkedin-username  
- Email: tejashalvankar0@gmail.com
