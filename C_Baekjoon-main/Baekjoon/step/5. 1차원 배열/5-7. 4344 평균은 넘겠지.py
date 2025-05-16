c=int(input())
for i in range (c):
    score=list(map(int,input().split()))
    student_number=score[0]
    real_score=score[1:]
    avg=(sum(real_score)/student_number)
    count=0
    for j in  real_score:
        if j>avg:
            count +=1
    per=(count/student_number)*100
    print("%.3f"%per+'%')
    
