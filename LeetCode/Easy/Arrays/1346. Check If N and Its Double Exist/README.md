
# 1346. Check If N and Its Double Exist – Java Solution

This repository contains a Java solution for the **LeetCode problem: Check If N and Its Double Exist**.

The solution uses a **brute-force nested loop approach** to determine if there exists a pair where one element is double the other.

---

## 📌 Problem Overview

Given an integer array `arr`, check if there exist two indices `i` and `j` such that:

- `i != j`
- `arr[i] == 2 * arr[j]`

Return `true` if such a pair exists, otherwise return `false`.

---

## 🧪 Code Functionality

- Uses two nested loops to compare every pair of elements  
- Ensures indices are not the same (`i != j`)  
- Checks whether one element is double the other  
- If a valid pair is found, sets a flag and breaks the loop  
- Returns `true` if such a pair exists, otherwise returns `false`  

---

## 🧠 Concepts Covered

- Arrays  
- Nested loops  
- Conditional logic  
- Brute-force searching  

---

## 🖥️ Screenshots

📸 **Case:**  
![Case](case.png)

📸 **Submit:**  
![Submit](submit.png)

---

## ⏱️ Complexity Analysis

- **Time Complexity:** O(n²)  
- **Space Complexity:** O(1)

---

## 📂 File Information

- Solution.java — Java source code  
- case.png — Screenshot of Case output  
- submit.png — Screenshot of Submit result  
- README.md — Problem documentation  

---

## ⚠️ Notes

- Uses a brute-force approach for simplicity  
- No additional data structures are used  
- Can be optimized using hashing for better performance  

---

## 👨‍💻 Author

Tejas Halvankar  

- GitHub: https://github.com/Tejas-H01  
- LinkedIn: https://www.linkedin.com/in/your-linkedin-username  
- Email: tejashalvankar0@gmail.com