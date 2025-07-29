# 🧩 GFG: Segregate Even and Odd Numbers

Given an array of integers, rearrange the array so that all **even numbers** appear **before all odd numbers**. The relative order **within** the even and odd groups does **not matter**.

---

## 🔗 Problem Link

[GeeksForGeeks - Segregate Even and Odd Numbers](https://www.geeksforgeeks.org/problems/segregate-even-and-odd-numbers4628/1)

---

## ✅ Solutions

- 🔹 [Java Solution](./Segregate_Even_Odd.java)

---

## 🧠 Approach: Sorting and Splitting

We sort the array, then iterate through it twice:

1. First loop: collect all even numbers.
2. Second loop: collect all odd numbers.
3. Overwrite the original array with the new ordering.

This ensures all even numbers come first, followed by all odd numbers.

> **Note**: Using sorting ensures the even/odd groups are in increasing order, though the problem may not require this strict ordering.

---

### 📌 Algorithm Steps:

1. Sort the array using `Arrays.sort(arr)`.
2. Create a temporary array `temp[]`.
3. Loop 1:
   - For each `arr[i]`, if it's even → add to `temp[]`.
4. Loop 2:
   - For each `arr[i]`, if it's odd → add to `temp[]`.
5. Copy all elements from `temp[]` back to `arr[]`.

---
