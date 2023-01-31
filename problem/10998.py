def fibb(num):
    if num == 1:
        return 1
    elif num == 0:
        return 0
    else:
           
        return fibb(num - 1) + fibb(num - 2) 


number = int(input())
print(fibb(number))
