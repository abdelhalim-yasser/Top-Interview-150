class Solution:
    def segregateEvenOdd(self, arr):
        arr.sort()
        even = []
        odd = []

        for num in arr:
            if num % 2 == 0:
                even.append(num)
            else:
                odd.append(num)

        for i in range(len(arr)):
            if i < len(even):
                arr[i] = even[i]
            else:
                arr[i] = odd[i - len(even)]

