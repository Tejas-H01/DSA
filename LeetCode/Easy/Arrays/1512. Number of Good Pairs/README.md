# 1512. Number of Good Pairs – Java Solution

This repository contains a Java solution for the **LeetCode problem: Number of Good Pairs**.

The solution counts the number of valid pairs where the values are equal and the first index is less than the second.

---

## 📌 Problem Overview

Given an array of integers `nums`, return the number of good pairs.

A pair `(i, j)` is called good if:
- `i < j`
- `nums[i] == nums[j]`

---

## 🧪 Code Functionality

- Initializes a counter to store the number of good pairs  
- Uses two nested loops to compare all possible pairs  
- Ensures that `i < j` to avoid duplicate counting  
- Checks if both elements are equal  
- Increments the counter when a valid pair is found  
- Returns the final count  

---

## 🧠 Concepts Covered

- Arrays  
- Nested loops  
- Conditional logic  
- Pair comparison  

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
- Ensures no duplicate pairs using `i < j`  
- Can be optimized using a hashmap for better performance  

---

## 👨‍💻 Author

Tejas Halvankar  

- GitHub: https://github.com/Tejas-H01  
- LinkedIn: https://www.linkedin.com/in/your-linkedin-username  
- Email: tejashalvankar0@gmail.com
