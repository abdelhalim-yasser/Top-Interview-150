# 🧩 GFG: Shortest Unordered Subarray

Given an array of **distinct integers**, find the length of the **shortest unordered subarray** (i.e., a subarray that is **neither strictly increasing nor strictly decreasing**).  
If the array is entirely increasing or decreasing, return `0`.

---

## 🔗 Problem Link

[GeeksForGeeks - Shortest Unordered Subarray](https://www.geeksforgeeks.org/problems/shortest-unordered-subarray/1)

---

## ✅ Solutions

- 🔹 [Java Solution](./ShortestUnorderedSubarray.java)
- 🔹 [Python Solution](./ShortestUnorderedSubarray.py) *(optional)*

---

## 🧠 Approach: Monotonic Check

We only need to check whether the entire array is **strictly increasing** or **strictly decreasing**:

- If it is → there is **no unordered subarray** → return `0`.
- Otherwise → the shortest unordered subarray must be of **length 3**.

This is because:
- Two elements alone are always either increasing or decreasing.
- A disorder needs at least **3** elements to "break" the monotonicity.

---

### 📌 Algorithm Steps:

1. Initialize two flags: `increasing = false`, `decreasing = false`.
2. Loop through the array:
   - If `arr[i] > arr[i-1]` → mark `increasing = true`.
   - If `arr[i] < arr[i-1]` → mark `decreasing = true`.
3. If both flags are `true` → the array is unordered → return `3`.
4. Otherwise → return `0`.
