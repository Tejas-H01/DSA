# 1752. Check if Array Is Sorted and Rotated – Java Solution

This repository contains a Java solution for the **LeetCode problem: Check if Array Is Sorted and Rotated**.

The solution checks whether the array can be obtained by rotating a non-decreasing sorted array.

---

## 📌 Problem Overview

Given an integer array `nums`, return `true` if the array was originally sorted in non-decreasing order and then rotated some number of times. Otherwise, return `false`.

---

## 🧪 Code Functionality

- Initializes a counter to track the number of order violations  
- Traverses the array once  
- Compares each element with the next element using circular indexing `(i + 1) % n`  
- Increments the counter if the current element is greater than the next  
- If the count of such violations is more than 1, returns `false`  
- Otherwise, returns `true`  

---

## 🧠 Concepts Covered

- Arrays  
- Circular indexing  
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
- **Space Complexity:** O(1)

---

## 📂 File Information

- Solution.java — Java source code  
- case.png — Screenshot of Case output  
- submit.png — Screenshot of Submit result  
- README.md — Problem documentation  

---

## ⚠️ Notes

- Uses circular comparison to handle rotation  
- Efficient single-pass solution  
- Works for all rotation cases including no rotation  

---

## 👨‍💻 Author

Tejas Halvankar  

- GitHub: https://github.com/Tejas-H01  
- LinkedIn: https://www.linkedin.com/in/your-linkedin-username  
- Email: tejashalvankar0@gmail.com
