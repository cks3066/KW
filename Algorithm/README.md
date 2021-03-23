# Chapter 1

## 알고리즘의 정의
- Problem : a question to which we seek an answer 답을 찾고자하는 문제
- Problem Instance : a problem where each parameter is assigned a specific value 값이 할당된 문제의 인자
- Algorithm : 각 problem instance의 솔루션을 찾기 위한 단계적 절차

## Sequential Search Algorithm 순차적 탐색 알고리즘
주어진 리스트를 순서대로 앞에서부터 체크하면서 해당 값을 찾는 알고리즘
```
public static index SeqSearch(int n, keyType[ ] S, keyType x) { 
  index location = 1 ; 
  while (location <= n && S[location] != x) location++ ; 
  if (location > n) location = 0 ; 
  return location ; 
}
```

## Binary Search Algorithm 이진 탐색 알고리즘
증가하도록 정렬되어있는 알고리즘에서만 사용 가능
```
public static index BinSearch(int n, keyType[ ] S, keyType x) { 
  index location, low, high, mid ; 
  low = 1 ; 
  high = n ; 
  location = 0 ; 
  while (low <= high && location == 0) { 
    mid = floor( (low+high) / 2 ) ; 
    if ( x== S[mid]) location = mid ; 
    else if (x < S[mid]) high = mid – 1 ; 
    else low = mid + 1 ; 
  } 
  return location ; 
}
```
## Sequential Search vs Binary Search
![1](https://user-images.githubusercontent.com/62434898/112117825-1b8bcc00-8bff-11eb-8f7e-8c1e7953d1df.jpg)

## Fibonacci Sequence (Recursive Algorithm) [inefficiency]
```
public static int Fib(int n) {
	if (n <= 1) return n;
	else return Fib(n-1) + Fib(n-2);
}
```

## Fibonacci Sequence (Iterative Algorithm)
```  
public static int Fib2(int n) {
	index i; int[] f = new int[n+1];
	f[0] = 0;
	if ( n > 0) {
		f[1] = 1;
		for (i = 2; i <= n; i++)
			f[i] = f[i-1] + f[i-2];
	}
	return f[n];
}
```

## Recursive vs Iterative Fibonacci
![2](https://user-images.githubusercontent.com/62434898/112117832-1cbcf900-8bff-11eb-8b30-610b2add4ee2.jpg)

## Two Parameters for Complexity
- the input size of an algorithm
> size of array
> 
> single number
> 
> number of vertices & number of edges
> 
- the basic operation of an algorithm [보통 반복문 및 재귀]
> the total work : number of times operation excuted

## Time Complexity Analysis
The determination of how many times the basic operation is done for each value of the input size
입력 크기의 각 값에 대해 기본 작업이 수행되는 횟수의 결정

## Type of Time Complexity Analysis

 ![1](https://user-images.githubusercontent.com/62434898/112126280-a2dd3d80-8c07-11eb-99d6-10c6149b783c.jpg)
 
- Every Case Analysis
> 크기 n의 모든 인스턴스에 대해 동일한 횟수만큼 기본 작업이 수행될 때 적용 가능
- Non-Every Case Analysis
> Best Case Analysis : the minimum # of times 
> Wort Case Analysis : the maximum # of times
> Average Case Analysis : the average # of times

## Applying the theory

![2](https://user-images.githubusercontent.com/62434898/112126285-a375d400-8c07-11eb-95cf-3b48b2a48c44.jpg)

Basic Operation 의 소요시간이 1000t , 루프의 횟수가 n 인 Algo1
Basic Operation 의 소요시간이 1t, 루프의 횟수가 n^2 인 Algo2
Input size N의 크기가 1000보다 적은 경우에만 Algo2가 효율적이다.
Input size N의 크기를 충분히 크다고 생각하고 알고리즘의 효율성을 분석하기 때문에 Algo1이 효율적인 알고리즘이라 할 수 있다.

## Order (차수)
- Linear 1차 : ex) (Worst case) Sequential search with n items
- Quadratic 2차 : ex) (Average case) Bubble sort with n items
- Highest-Order Term(최고차항)이 알고리즘의 복잡도를 지배한다.
> ex) n : 10,000 / 0.1n^2 : 10,000,000 / 0.1n2+n+100 : 10,010,100
![3](https://user-images.githubusercontent.com/62434898/112126287-a40e6a80-8c07-11eb-96dc-0af9e3e3def2.jpg)