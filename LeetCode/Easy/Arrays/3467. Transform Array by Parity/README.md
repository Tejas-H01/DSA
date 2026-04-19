# Transform Array by Parity – Java Solution

This repository contains a Java solution for transforming an array based on parity.

The solution converts the array such that all even numbers become `0` and all odd numbers become `1`, with all `0`s placed before `1`s.

---

## 📌 Problem Overview

Given an integer array `nums`, transform it such that:
- All even numbers are replaced with `0`
- All odd numbers are replaced with `1`
- All `0`s appear before all `1`s in the array

Return the transformed array.

---

## 🧪 Code Functionality

- Counts the number of even elements in the array  
- Uses this count to determine how many `0`s should be placed at the beginning  
- Iterates through the array and fills the first `count` indices with `0`  
- Fills the remaining indices with `1`  
- Returns the transformed array  

---

## 🧠 Concepts Covered

- Arrays  
- Counting technique  
- Conditional logic  
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
- **Space Complexity:** O(1)

---

## 📂 File Information

- Solution.java — Java source code  
- case.png — Screenshot of Case output  
- submit.png — Screenshot of Submit result  
- README.md — Problem documentation  

---

## ⚠️ Notes

- Efficient single-pass counting approach  
- Modifies the array in place  
- Ensures all even-derived values (`0`) come before odd-derived values (`1`)  

---

## 👨‍💻 Author

Tejas Halvankar  

- GitHub: https://github.com/Tejas-H01  
- LinkedIn: https://www.linkedin.com/in/your-linkedin-username  
- Email: tejashalvankar0@gmail.com