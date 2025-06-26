https://leetcode.com/problems/product-of-array-except-self/

# Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

# The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

# You must write an algorithm that runs in O(n) time and without using the division operation.

 

# Example 1:

# Input: nums = [1,2,3,4]
# Output: [24,12,8,6]

Code 1:

def productExceptSelf(nums):
    n = len(nums)
    result = [1] * n

    left_product = 1
    for i in range(n):
        result[i] = left_product
        left_product *= nums[i]

    right_product = 1
    for i in range(n - 1, -1, -1):
        result[i] *= right_product
        right_product *= nums[i]

    return result

nums = [2,3,4,5]
result = multiply(nums)
print(result)


Output:

[60, 40, 30, 24]

=== Code Execution Successful ===


CODE - 2:

def productExceptSelf(nums):
  nums_multiply = 1
  
  for n in nums:
    nums_multiply *= n

  result = []

  for n in nums:
    result.append(nums_multiply/n)

  return result





