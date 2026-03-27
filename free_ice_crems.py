n,x=list(map(int,input("").split(" ")))
a=0
for i in range(0,n):
    ch=input("")
    if "+" in ch:
        y=int(ch.replace("+ ",""))
        x+=y
    elif "-" in ch:
        y=int(ch.replace("- ",""))
        if x>=y:
            x-=y
        else:
            a+=1
print(x,a)
