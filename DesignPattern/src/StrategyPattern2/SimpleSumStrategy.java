package StrategyPattern2;

public class SimpleSumStrategy implements SumStrategy{

	@Override
	public int get(int N) {
		int sum = N;
		
		for(long i = 0; i < N; i++) {
			sum += i;
		}
		
		return sum;		
	}
}
