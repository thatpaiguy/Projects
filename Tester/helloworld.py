nums = [5,2,3,1]
print(nums)

for i in range(len(nums)):
    j = i - 1
    while j >= 0 and nums[j+1] < nums[j]:
        temp = nums[j+1]
        nums[j+1] = nums[j]
        nums[j] = temp
        j-=1

print(nums)