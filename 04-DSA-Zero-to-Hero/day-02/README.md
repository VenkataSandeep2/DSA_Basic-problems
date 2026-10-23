# Day 2 — Time and Space Complexity

**Status:** Not started | **Time:** 60 minutes | **IDE:** Eclipse

## Goal
Estimate how runtime and additional memory grow as input size `n` grows.

## Concept
- One pass over `n` values is usually O(n).
- Two nested loops over `n` values can be O(n²).
- A fixed number of variables is O(1) extra space.
- Ignore constants when describing growth: O(2n) simplifies to O(n).

## Exercise
1. Count the iterations of a single loop over an array.
2. Count the pair checks in nested loops.
3. Identify the extra memory used by each example.
4. Explain why brute-force Two Sum is O(n²) in the worst case.

## Dry run
For `n = 4`, a single loop runs about 4 times. Pair enumeration with `j = i + 1` compares 3 + 2 + 1 = 6 pairs. For larger `n`, the pair count grows quadratically.

## Interview questions
1. What is the difference between time and space complexity?
2. Why do we drop constant multipliers in Big O?
3. Is O(n) always faster than O(n²) for every possible input size? Explain carefully.

## Checklist
- [ ] Identify the input size
- [ ] Count operations in one loop
- [ ] Count comparisons in nested loops
- [ ] Explain O(1), O(n), and O(n²) in your own words
- [ ] Record a real attempt
