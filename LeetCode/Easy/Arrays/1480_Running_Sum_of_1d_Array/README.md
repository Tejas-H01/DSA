````md
# LeetCode — Running Sum of 1d Array

## Problem Overview
Given an integer array `nums`, return the running sum of the array where  
`runningSum[i] = nums[0] + nums[1] + ... + nums[i]`.

---

## Approach
- Initialize a variable `sum` to store cumulative total
- Traverse the array once
- Add current element to `sum`
- Update the same index with the cumulative sum (in-place)

---

## Testcase Execution (Run)

### Input
```text
nums = [3, 1, 2, 10, 1]
````

### Output

```text
[3, 4, 6, 16, 17]
```

### Status

```text
Accepted
Runtime: 0 ms
All test cases passed
```

---

## Submission Result

### Verdict

```text
Accepted (54 / 54 testcases passed)
```

### Performance

```text
Runtime: 0 ms (Beats 100.00%)
Memory: 44.37 MB (Beats 46.72%)
```

---

## Complexity Analysis

* Time Complexity: O(n)
* Space Complexity: O(1) — in-place modification

---

## File Information

* Language: Java
* File: RunningSum.java

---

## Author

Tejas Halvankar

```
::contentReference[oaicite:0]{index=0}
```

