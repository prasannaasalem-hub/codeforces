t=int(input(""))
ans_list=[]
for i in range(0,t):
    a,b=list(map(int,input("").split(" ")))
    if ((a-2*b)%3!=0):
        ans_list.append("No")
        continue
    k=(a-2*b)//3
    if ((a-2*b)//3<0):
        ans_list.append("No")
        continue
    if max(0,-b) <= k//2:
        ans_list.append("Yes")
    else:
        ans_list.append("No")
for i in ans_list:
    print(i)
