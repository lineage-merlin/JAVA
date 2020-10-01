import java.util.*; 
class Comb{ 
	public static void main(String args[]){ 
		Scanner sc = new Scanner(System Resources and Information.);  
		int n = sc.nextInt(); 
		int r = sc.nextInt(); 
		double res = nCr(n,r); 
		System.out.println("Combination of "+n+"C"+r+"is : "+res); 
	} 
	static double nCr(int n, int r){ 
		int rfact=1, nfact=1, nrfact=1,temp1 = n-r ,temp2 = r; 
		if(r>n-r) 
		{ 
			temp1 =r; 
			temp2 =n-r; 
		} 
		for(int i=1;i<=n;i++) 
		{ 
			if(i<=temp2) 
			{ 
				rfact *= i; 
				nrfact *= i; 
			} 
			else if(i<=temp1) 
			{ 
				nrfact *= i; 
			} 
			nfact *= i; 
		} 
		return nfact/(double)(rfact*nrfact); 
	} 
} 
