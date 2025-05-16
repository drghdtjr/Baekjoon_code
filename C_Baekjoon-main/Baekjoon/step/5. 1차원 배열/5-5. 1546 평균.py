n=int(input())
before_test=list(map(int,input().split()))
max_score=max(before_test)
after_test=[]
sum_test=0
for i in range (n):
    before_test[i]=before_test[i]/max_score*100
    sum_test += before_test[i]
print(sum_test/n)