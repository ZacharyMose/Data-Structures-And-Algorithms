# Contains Duplicate — Concept Notes

## Problem

Given an array of integers, determine whether any value appears **more than once**.

Return:

* true → if any element appears at least twice
* false → if all elements are unique

Example:
Input: [1,2,3,1]
Output: true

Input: [1,2,3,4]
Output: false

---

## Objective

We want to detect duplicates efficiently.

A naive solution compares every element with every other element, but this becomes slow when the array is large.

Goal:
Improve efficiency using a better data structure.

---

## Approach 1: Brute Force

### Idea

Compare every pair of elements.

Check:
Does any element appear more than once?

### Logic

For each element:
compare it with all elements that come after it.

If a match is found → duplicate exists.

### Pseudocode

FOR i from 0 to n-1
 FOR j from i+1 to n-1
  IF nums[i] equals nums[j]
   RETURN true

RETURN false

### Complexity

Time Complexity: O(n²)
Space Complexity: O(1)

Why inefficient?

* Many unnecessary comparisons
* Does not scale well for large datasets

---

## Approach 2: HashSet (Optimal)

### Key Insight

A HashSet only stores unique values.

If we try to add a value that already exists, we know a duplicate is present.

Instead of comparing every pair, we track what we have already seen.

This allows fast lookup.

---

## Intuition

As we iterate through the array:

* store each value in a set
* before storing, check if it already exists

If yes → duplicate found

---

## Pseudocode

CREATE empty set called seen

FOR each number in array

 IF number exists in seen
  RETURN true

 ADD number to seen

RETURN false

---

## Example Walkthrough

Array:
[1,2,3,1]

Step 1:
seen = {}

Step 2:
read 1 → not in set → add → {1}

Step 3:
read 2 → not in set → add → {1,2}

Step 4:
read 3 → not in set → add → {1,2,3}

Step 5:
read 1 → already exists in set

duplicate found → return true

---

## Complexity Analysis

Time Complexity: O(n)
Space Complexity: O(n)

Why faster?

* lookup in HashSet is constant time O(1)
* only one pass through the array

---

## Why Hashing Works Well

Hashing allows:

* fast lookup
* fast insertion
* efficient duplicate detection

Operations:
insert → O(1) average
search → O(1) average

This removes the need for nested loops.

---

## Pattern Recognition

This problem teaches the Hashing pattern.

Use hashing when:

* detecting duplicates
* checking if element exists
* counting frequency
* improving performance from O(n²) to O(n)
* quick membership testing needed

---

## Real-world Applications

Duplicate detection appears in:

Data engineering:

* removing duplicate records
* cleaning datasets
* ETL pipelines

Backend systems:

* checking unique usernames
* detecting repeated transactions

Security:

* fraud detection
* duplicate login attempts

Logging systems:

* removing repeated log entries

---

## Comparison of Approaches

Brute Force

* simple idea
* slow
* many comparisons
* O(n²)

HashSet

* slightly more memory
* very fast
* scalable
* O(n)

Tradeoff:
Use extra memory to gain speed.

