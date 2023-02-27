'''

                            Online Python Compiler.
                Code, Compile, Run and Debug python program online.
Write your code in this editor and press "Run" button to execute it.

'''

a = [5, 4, 10, 1, 6, 2]
n = len(a)
for i in range(0, n-1):
    s = i
    for j in range(i+1, n):
        if a[j] <  a[s] :
            s =j
    temp = a[i]
    a[i] = a[s]
    a[s] = temp
print(a)
