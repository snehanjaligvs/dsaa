def qsort(a , small, big):
    pivot = a[small]
    i = small + 1
    j = big
    while True:
        while i<= j and a[i] <= pivot:
            i += 1
        while i <= j and a[j] >= pivot:
            j -= 1
        if i <= j:
            temp = a[j]
            a[j] = a[i]
            a[i] = temp
        else:
            break
        
    temp = a[j]
    a[j] = a[small]
    a[small] = temp
    return j
    
def partition(a, small, big):
    if small < big:
        p = qsort(a, small , big)
        partition(a, small, p - 1)
        partition(a, p + 1, big)
    
a = [8, 4, 5, 1, 2]
partition(a, 0, len(a) - 1)
print(a)