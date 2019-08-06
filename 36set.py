a = input()
a=a.replace(" ","")
a = list(a)
counts = 0
for i in range(0,len(a)):
    if a[i].isalpha():
        continue
    elif a[i].isdigit():
        continue
    else:
        counts +=1

print(counts)
