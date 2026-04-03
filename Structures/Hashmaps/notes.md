# Two Sum 

## Problem
Given an array of integers `nums` and an integer `target`, return the **indices** of the two numbers such that they add up to the target.

### Key Rules
- Exactly **one solution** exists
- Cannot use the **same element twice**
- Must return **indices**, not the values

### Example
Input:
nums = [2,7,11,15]
target = 9

Output:
[0,1]

Explanation:
nums[0] + nums[1] = 2 + 7 = 9


--------------------------------------------------

# Approach 1: Brute Force

## Idea
Check every possible pair of numbers using **two nested loops**.

Each element is compared with all elements that come after it.

This guarantees finding the solution but is inefficient.

--------------------------------------------------

## Pseudocode
for i from 0 to n-1
    for j from i+1 to n-1

        if nums[i] + nums[j] == target
            return [i, j]

--------------------------------------------------

## Complexity Analysis

Time Complexity:
O(n²)

Reason:
Two nested loops check all possible pairs.

Number of comparisons:
n(n-1)/2


Space Complexity:
O(1)

No additional memory used.

--------------------------------------------------

## Pros
- Easy to understand
- Easy to implement
- Good starting point

## Cons
- Slow for large inputs
- Not optimal for interviews
- Repeats many comparisons


==================================================

# Approach 2: HashMap (Optimal Solution)

## Core Idea
Instead of checking every pair:

For each number, compute the value needed to reach the target.

needed = target - current number

Check if we have already seen this needed number.

Store visited numbers in a HashMap for fast lookup.

--------------------------------------------------

## Why HashMap?
HashMap provides very fast lookup:

O(1)

Meaning we can instantly check if a number exists.

--------------------------------------------------

## Algorithm Steps

1. Create an empty HashMap
2. Loop through the array
3. Compute the complement:
       needed = target - nums[i]
4. Check if needed exists in the map
5. If yes → solution found
6. Otherwise store current number in map

--------------------------------------------------

## Pseudocode

create empty HashMap

for i from 0 to n-1

    needed = target - nums[i]

    if needed exists in map
        return [map[needed], i]

    store nums[i] with index i in map

--------------------------------------------------

## Complexity Analysis

Time Complexity:
O(n)

Reason:
We loop through the array only once.
HashMap lookup takes constant time O(1).


Space Complexity:
O(n)

Reason:
We store up to n elements inside the HashMap.

--------------------------------------------------

## Pros
- Very fast
- Efficient for large inputs
- Preferred in interviews
- Common DSA pattern

## Cons
- Uses extra memory
- Slightly harder to understand initially


==================================================

# Key Insight

We transform the equation:

a + b = target

into:

b = target - a

Instead of searching for both numbers simultaneously,
we search for the complement.

complement = target - current number


==================================================

# Comparison Table

Feature              Brute Force        HashMap
--------------------------------------------------
Time Complexity      O(n²)              O(n)
Space Complexity     O(1)               O(n)
Speed                Slow               Fast
Difficulty           Easy               Medium
Interview Value      Basic              Expected
Scalability          Poor               Good