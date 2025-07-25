# 🧩 LeetCode 169: Majority Element

Given an integer array `nums`, return the majority element.

The majority element is the element that appears **more than ⌊n / 2⌋ times**.  
You may assume that the majority element always exists in the array.

---

## 🔗 Problem Link

[LeetCode Problem Link](https://leetcode.com/problems/majority-element/)

---

## ✅ Solutions

- 🔹 [Java Solution](./Majority_Element.java)
- 🔹 [Python Solution](./Majority_Element.py)

---

## 🧠 Approach: Boyer-Moore Voting Algorithm

This elegant algorithm lets us find the majority element using **O(1) space** and **O(n) time**.

We treat the majority element like a president candidate:
- If a number supports the candidate → we increase his votes.
- If not → we decrease the votes.
- If the votes drop to 0 → we choose a new candidate.

Since the majority element appears more than n/2 times, it cannot be fully canceled out.

---

### 📌 Algorithm Steps:

1. Initialize `count = 0` and `candidate = 0`.
2. For every number in the array:
   - If `count == 0`, assign the current number as the candidate.
   - If current number equals candidate → `count++`.
   - Else → `count--`.
3. Return the final candidate.
