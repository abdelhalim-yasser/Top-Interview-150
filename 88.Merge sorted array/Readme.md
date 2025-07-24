# 🧩 LeetCode 88: Merge Sorted Array

You are given two sorted integer arrays `nums1` and `nums2`, and two integers `m` and `n`, representing the number of initialized elements in `nums1` and `nums2` respectively.

Your task is to merge `nums2` into `nums1` in non-decreasing order. The merged result should be stored **in-place** inside `nums1`.

---

## 🔗 Problem Link

[LeetCode Problem Link](https://leetcode.com/problems/merge-sorted-array/)

---

## ✅ Solutions

- 🔹 [Java Solution](./Merge_sorted_array.java)
- 🔹 [Python Solution](./Merge_sorted_array.py)

---

## 🧠 Approach

We start from the end of both arrays and place the largest elements at the end of `nums1`.  
This avoids overwriting useful data during the merge.

- **Time Complexity**: O(m + n)
- **Space Complexity**: O(1)

---

## 🗒️ Notes

- Arrays must be sorted in non-decreasing order.
- Reverse two-pointer method is used for in-place merge.
