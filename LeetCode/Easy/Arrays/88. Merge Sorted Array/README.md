# 88. Merge Sorted Array – Java Solution

This repository contains a Java solution for the **LeetCode problem: Merge Sorted Array**.

The solution merges two sorted arrays by first appending elements and then sorting the final array.

---

## 📌 Problem Overview

You are given two sorted integer arrays `nums1` and `nums2`, and two integers `m` and `n` representing the number of valid elements in each array.

Merge `nums2` into `nums1` as one sorted array.  
The final sorted array should be stored inside `nums1`.

---

## 🧪 Code Functionality

- Copies all elements of `nums2` into the remaining positions of `nums1`  
- Uses `Arrays.sort()` to sort the updated `nums1` array  
- Returns the final sorted array in-place  

---

## 🧠 Concepts Covered

- Arrays  
- Looping constructs  
- Built-in sorting  
- In-place modification  

---

## 🖥️ Screenshots

📸 **Case :**  
![Case 1](case.png)

📸 **Submit:**  
![Submit](submit.png)

---

## ⏱️ Complexity Analysis

- **Time Complexity:** O((m+n) log (m+n))  
- **Space Complexity:** O(1)

📸 **Complexity Proof:**  
![Complexity](complex.png)

---


---

## ⚠️ Notes

- Uses built-in sorting for simplicity  
- Not the most optimal approach (two-pointer method is better)  
- Easy to understand and implement  

---

## 👨‍💻 Author

Tejas Halvankar  

- GitHub: https://github.com/Tejas-H01  
- LinkedIn: https://www.linkedin.com/in/your-linkedin-username  
- Email: tejashalvankar0@gmail.com
