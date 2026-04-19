# 540. Single Element in a Sorted Array – Java Solution

This repository contains a Java solution for the **LeetCode problem: Single Element in a Sorted Array**.

The solution uses a **bitwise XOR approach** to find the element that appears only once while all other elements appear twice.

---

## 📌 Problem Overview

Given a sorted array `nums` where every element appears exactly twice except for one element that appears only once,  
return the single element that appears only once.

---

## 🧪 Code Functionality

- Initializes a variable `sol` to store the result  
- Iterates through the array using a for-each loop  
- Applies XOR operation between `sol` and each element  
- Since duplicate elements cancel out in XOR, only the unique element remains  
- Returns the final value stored in `sol`  

---

## 🧠 Concepts Covered

- Arrays  
- Bitwise XOR operation  
- Looping constructs  
- Efficient computation  

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

📸 **Complexity Proof:**  
![Complexity](complex.png)

---

## 📂 File Information

- Solution.java — Java source code  
- case.png — Screenshot of Case output  
- submit.png — Screenshot of Submit result  
- complex.png — Screenshot of time complexity analysis  
- README.md — Problem documentation  

---

## ⚠️ Notes

- Uses XOR property to eliminate duplicate elements  
- Efficient and optimal solution  
- Does not require additional data structures  

---

## 👨‍💻 Author

Tejas Halvankar  

- GitHub: https://github.com/Tejas-H01  
- LinkedIn: https://www.linkedin.com/in/your-linkedin-username  
- Email: tejashalvankar0@gmail.com
