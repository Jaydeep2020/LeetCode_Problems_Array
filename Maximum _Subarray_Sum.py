def MaxSub(nums):
    MaxSum = nums[0]
    curSum = 0
    
    for n in nums:
        if curSum < 0:
            curSum = 0
            
        curSum += n
        
        MaxSum = max(curSum, MaxSum)
        
    return MaxSum


nums = [-2,1,-3,4,-1,2,1,-5,4]
sum = MaxSub(nums)
print(sum)


output:
6

=== Code Execution Successful ===
