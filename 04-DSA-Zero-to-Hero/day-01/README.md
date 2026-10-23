# Day 1 — Two Sum (Brute Force)

**Status:** In progress
**Time budget:** 60 minutes
**IDE:** Eclipse
**LeetCode:** [1. Two Sum](https://leetcode.com/problems/two-sum/)

## Goal
Given an integer array `nums` and a target, return the **indices** of two different elements whose values add up to the target. Learn the direct brute-force approach before HashMap optimization.

## Example
Input: `nums = [3, 4, 6, 8]`, `target = 10`
Output: `[1, 2]`

Why? `nums[1] = 4` and `nums[2] = 6`, and `4 + 6 = 10`. Array indices start at 0.

## Concept
Two nested loops can enumerate pairs. Starting the inner loop at `j = i + 1` avoids using the same position twice and avoids checking each pair twice.

## Logic-building exercise
You identified this condition:
```java
nums[i] + nums[j] == target
```
Before filling the TODO, answer:
1. What do `i` and `j` represent?
2. Which two numbers matched when the condition became true?
3. Does the problem ask for values or indices?
4. After a match, should the method keep searching or return the pair?
5. Why does `j` start at `i + 1`?

**Hint:** the two values are at positions `i` and `j`. Think about what the caller needs back.

Telugu: `i`, `j` అనేవి array indices. Condition true అయితే pair ఏ positions‌లో ఉందో గుర్తించి ఆ indices ఇవ్వాలి.

## Dry run
For `nums = [3, 4, 6, 8]`, target `10`:

| i | j | nums[i] | nums[j] | Sum | Match? |
|---:|---:|---:|---:|---:|---|
| 0 | 1 | 3 | 4 | 7 | No |
| 0 | 2 | 3 | 6 | 9 | No |
| 0 | 3 | 3 | 8 | 11 | No |
| 1 | 2 | 4 | 6 | 10 | Yes |

Pause and explain what your program should do after the final row.

## Complexity
- Worst-case time: **O(n²)**, because pairs are compared in nested loops.
- Extra space: **O(1)** for the search itself, not counting the returned pair.

## Test ideas
- `[3,4,6,8]`, target `10` → `[1,2]`
- `[3,3]`, target `6` → `[0,1]`
- `[-2,7,11]`, target `5` → `[0,1]`
- If testing a generalized no-answer variant, explicitly define expected behavior.

## Interview questions
1. Why is a nested-loop approach brute force?
2. Why does the inner loop start at `i + 1`?
3. Why is the worst-case time complexity O(n²)?

## Revision quiz
1. For `[2,5,7]`, target `12`, what indices work?
2. Does Two Sum return values or indices?
3. What is one downside of brute force?

## Checklist
- [ ] Understand indices and the condition
- [ ] Finish the TODO in Eclipse yourself
- [ ] Dry-run and test edge cases
- [ ] Answer the quiz and record progress

Do not mark Day 1 complete until the implementation has been attempted and tested. HashMap comes after the brute-force logic is clear.
