# 283. Move Zeroes – Java Solution

This repository contains a Java solution for the **LeetCode problem: Move Zeroes**.

The solution moves all zeroes to the end of the array while maintaining the relative order of non-zero elements using an auxiliary array.

---

## 📌 Problem Overview

Given an integer array `nums`, move all `0`s to the end of it while maintaining the relative order of the non-zero elements.

The operation must be performed in-place.

---

## 🧪 Code Functionality

- Initializes a temporary array to store non-zero elements  
- Traverses the original array and copies non-zero values into `temp`  
- Counts the number of non-zero elements  
- Resets original array positions to `0` during traversal  
- Refills the original array:
  - First `counter` positions with values from `temp`  
  - Remaining positions with `0`  
- Modifies the original array in-place  

---

## 🧠 Concepts Covered

- Arrays  
- Conditional logic  
- Auxiliary array usage  
- In-place modification  

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
- Maintains the relative order of non-zero elements  
- Can be optimized to O(1) space using two-pointer technique  

---

## 👨‍💻 Author

Tejas Halvankar  

- GitHub: https://github.com/Tejas-H01  
- LinkedIn: https://www.linkedin.com/in/your-linkedin-username  
- Email: tejashalvankar0@gmail.com