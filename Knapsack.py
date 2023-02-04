def knapsack(val,wei,ind,weight,dp):
    if ind == len(val) or weight<=0:
        return 0
    if dp[weight][ind] != -1:
        return dp[weight][ind]
    include = 0
    if (weight - wei[ind]) >= 0:
        include = val[ind] + knapsack(val,wei,ind+1,weight-wei[ind],dp)
    exclude = knapsack(val,wei,ind+1,weight,dp)
    dp[weight][ind] = max(include,exclude)
    return dp[weight][ind]

val = list(map(int,input().split()))
wei = list(map(int,input().split()))
weight = int(input())
dp = [[-1 for i in range(len(val))] for j in range(weight+1)]
print(knapsack(val,wei,0,weight,dp))