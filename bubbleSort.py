'''

                            Online Python Compiler.
                Code, Compile, Run and Debug python program online.
Write your code in this editor and press "Run" button to execute it.

'''

a = [22, 1, 4, 2, 5]
n = len(a)
for i in range(0, n-1):
    for j in range(0, n-i-1):
        if a[j] >  a[j+1] :
            temp = a[j]
            a[j] = a[j+1]
            a[j+1] = temp
    
print(a)
