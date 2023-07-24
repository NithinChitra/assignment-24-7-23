array = input().split(",")
int_array = []
for i in array:
    int_array.append(int(i))
print(int_array)
small_array=set(int_array)
d=dict()
for i in small_array:
    d[i]=int_array.count(i)
singular_count=0
for i in d.values():
    if i%2!=0:
        singular_count+=1
print("Total no. of Singular Socks:",singular_count)