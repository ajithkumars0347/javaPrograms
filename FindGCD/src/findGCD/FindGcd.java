package findGCD;

public class FindGcd {
static int gcdMethod(int m,int n) {
	while(n!=0)
	{
	int rem=m%n;
	m=n;
	n=rem;
	}
	return m;
}
}
