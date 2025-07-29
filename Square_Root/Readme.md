# 🧩 GFG: Square Root of a Number

Given a positive integer `n`, find the square root of `n`.  
If `n` is **not a perfect square**, then return the **floor value** of the square root.

> The floor value of any number is the greatest integer which is less than or equal to that number.

---

## 🔗 Problem Link

[GeeksForGeeks - Square Root](https://www.geeksforgeeks.org/problems/square-root/1)

---

## ✅ Solutions

- 🔹 [Java Solution](./Square_Root.java)
- 🔹 [Python Solution](./Square_Root.py)

---

## 🧠 Approach: Binary Search

We use **binary search** to find the floor of the square root:

- The answer must lie between `1` and `n`.
- We repeatedly narrow down the range based on the square of the mid value.

---

### 📌 Algorithm Steps:

1. Initialize `low = 1`, `high = n`, `ans = -1`.
2. While `low <= high`:
   - Compute `mid = (low + high) // 2`
   - If `mid * mid == n`, return `mid`.
   - If `mid * mid < n`, store `ans = mid` and search in right half: `low = mid + 1`.
   - Else search in left half: `high = mid - 1`.
3. Return `ans`.

---
