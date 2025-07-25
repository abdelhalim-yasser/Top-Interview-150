# 🧩 LeetCode 26: Remove Duplicates from Sorted Array

You are given a **sorted** integer array `nums`.  
Your task is to remove the duplicates **in-place** such that each unique element appears only once, and return the new length.

Do not allocate extra space for another array — you must do this in-place with O(1) extra memory.

---

## 🔗 Problem Link

[LeetCode Problem Link](https://leetcode.com/problems/remove-duplicates-from-sorted-array/)

---

## ✅ Solutions

- 🔹 [Java Solution](./Remove_duplicates_sorted_array.java)
- 🔹 [Python Solution](./Remove_duplicates_sorted_array.py)

---

## 🧠 Approach

Use a pointer `k` to track the position for the next unique element.  
Start from index 1 and compare each element with the previous one:

- If `nums[i] != nums[k - 1]`, it's unique → place it at `nums[k]` and increment `k`.

The first `k` elements will be the final result with all unique values.

- **Time Complexity**: O(n)
- **Space Complexity**: O(1)

---

## 🗒️ Notes

- The array must be sorted for this approach to work.
- This is a very common two-pointer pattern.
- Elements beyond the returned length don’t matter.
