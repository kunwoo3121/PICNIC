# PICNIC

https://algospot.com/judge/problem/read/PICNIC

# 구현 방법

모든 경우의 수를 체크하여 가능한 경우의 수를 구하는 방법으로 구현하였다.

ex) 4 6  
    0 1 1 2 2 3 3 0 0 2 1 3 과 같은 입력이 들어오는 경우
    
    i) 배열을 두 개 생성한다. 배열 1은 이미 짝이 지어진 사람인지 체크하는 배열이고 배열 2는 친구 관계를 나타내는 배열이다.  
    
    ii) 예제와 같은 입력이 들어오면 배열 2는  
    
        X O O O  
        O X O O  
        O O X O  
        O O O X 와 같은 상태가 된다.
