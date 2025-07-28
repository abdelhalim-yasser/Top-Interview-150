# 🧩 Determine Array Order Type

Given an array of **distinct integers**, determine the **type of sorting** of the array.  
Return:
- `1` → if the array is **strictly increasing**
- `2` → if the array is **strictly decreasing**
- `3` → if the array is **unordered**
- `4` → if the array is **reverse sorted** (max comes before min, but not fully ordered)

---

## 🔗 Problem Context

This function helps in **classifying array order** patterns based on positions of maximum and minimum elements.

---

## ✅ Solutions

- 🔹 [Java Solution](./Type_of_array.java)
- 🔹 [Python Solution](./Type_of_array.py)

---

## 🧠 Approach: Min/Max Index Check

We identify the **indices** of the **maximum** and **minimum** elements:

- If min is at index `0` and max at `n-1` → **strictly increasing**
- If max at index `0` and min at `n-1` → **strictly decreasing**
- If max comes **after** min (not at edges) → **unordered**
- Otherwise → **reverse sorted**

---

### 📌 Algorithm Steps:

1. Initialize:  
   `max_idx = 0`, `min_idx = 0`, `n = len(arr)`
2. Loop over array:
   - If `arr[i] > arr[max_idx]` → update `max_idx`
   - If `arr[i] < arr[min_idx]` → update `min_idx`
3. Final decision:
   - `min == 0 and max == n - 1` → return `1`
   - `min == n - 1 and max == 0` → return `2`
   - `max > min` → return `3`
   - Else → return `4`
