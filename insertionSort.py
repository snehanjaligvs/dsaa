'''

                            Online Python Compiler.
                Code, Compile, Run and Debug python program online.
Write your code in this editor and press "Run" button to execute it.

'''
a = [5, 4, 10, 1, 6, 2]
i =1
n = len(a)
while i<n :
    temp = a[i]
    j = i-1
    while (j>=0 and a[j]>temp):
        a[j+1] =a[j]
        j = j-1
    a[j+1] = temp
    i  = i+1
print(a)