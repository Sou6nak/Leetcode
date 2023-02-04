mat = [[1,1,0,0,0], [1,1,1,1,0], [1,0,0,0,0], [1,1,0,0,0], [1,1,1,1,1]]
dic = {}
for i in range(len(mat)):
    cnt=0
    for j in range(len(mat[0])):
        if(mat[i][j]==1):
            cnt+=1
    dic[i] = cnt
dic = sorted(dic.items(),key = lambda x:x[1])
for i in dic:
    print(i[0],end=" ")