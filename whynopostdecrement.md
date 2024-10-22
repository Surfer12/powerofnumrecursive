Using `exp - 1` instead of `exp--` is important for ensuring that the correct value of `exp` is passed to the recursive call. Here's a breakdown of the difference:

1. **`exp - 1`**: This expression evaluates to the current value of `exp` minus one, and then that value is passed to the recursive call. The original value of `exp` remains unchanged for the current call, which is what you want for the recursion to work correctly.

2. **`exp--`**: This is a post-decrement operator. It passes the current value of `exp` to the recursive call first, and then decrements `exp` by one. However, since `exp` is a parameter, this change does not affect the value of `exp` in the current call context. It can lead to confusion and unintended behavior, especially if you expect `exp` to be decremented for the next recursive call.

### Example:

Consider `exp` is `3`:

- Using `exp - 1`:
  - First call: `power(num, 3)` → calls `power(num, 2)`
  - Second call: `power(num, 2)` → calls `power(num, 1)`
  - Third call: `power(num, 1)` → calls `power(num, 0)`
  - Fourth call: `power(num, 0)` → returns `1`

- Using `exp--`:
  - First call: `power(num, 3)` → calls `power(num, 3)` (still `3` because of post-decrement)
  - This leads to an infinite loop because it keeps calling `power(num, 3)` without ever reaching the base case.

### Conclusion:
Using `exp - 1` is the correct approach for decrementing the exponent in a recursive function, ensuring that each recursive call processes the correct value of `exp`.