n = int(input())
data = [list(map(int, input().split())) for _ in range(n)]
dp = [0 for _ in range(n + 1)]

for i in range(n):
    if i + data[i][0] <= n:
        dp[i + data[i][0]] = max(dp[i + data[i][0]], dp[i] + data[i][1])
    dp[i + 1] = max(dp[i + 1], dp[i])

print(dp[n])
