# 🧩 LeetCode 27: Remove Element

You are given an integer array `nums` and an integer value `val`.  
You need to remove all occurrences of `val` in-place and return the new length of the array.

Do not allocate extra space for another array — you must do this in-place with O(1) extra memory.

The order of elements can be changed. It doesn't matter what values are left beyond the returned length.

---

## 🔗 Problem Link

[LeetCode Problem Link](https://leetcode.com/problems/remove-element/)

---

## ✅ Solutions

- 🔹 [Java Solution](./Remove_Element.java)
- 🔹 [Python Solution](./Remove_Element.py)

---

## 🧠 Approach

Use a pointer `k` to keep track of the position of the next valid element.  
Iterate through the array:

- If `nums[i] != val`, assign `nums[k] = nums[i]` and increment `k`.

The first `k` elements will contain the final result.

- **Time Complexity**: O(n)
- **Space Complexity**: O(1)

---

## 🗒️ Notes

- Classic in-place filtering using two pointers.
- Order of elements after `k` does not matter.
- Very useful pattern for similar problems.
