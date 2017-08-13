import java.util.Arrays;

public class Rearrangement {
	public static int dotWith(int[] a, int[] b){
		if(a.length!=b.length){
			return 0;
		}
		int sum = 0;
		for(int i = 0;i<a.length;i++){
			sum+=a[i]*b[i];
		}
		return sum;
	}
	
	public static void rotate (int[] b){
		int value = b[b.length-1];
		for(int i =b.length-1;i>0;i--){
			b[i]=b[i-1];
		}
		b[0] = value;
	}
	
	
	public static int useRotations(int[] a, int[] b){
		if(a.length!=b.length){
			return 0;
		}
		int[] resultset = new int[b.length];
		for(int i = 0;i<b.length-1;i++){
			rotate(b);
			resultset[i] = dotWith(a,b);
		}
		
		int max =resultset[0];
		for(int i = 0;i<resultset.length;i++){
			if(max<resultset[i]){
				max = resultset[i];
			}
		}
		return max;
	}
	
	public static int useSorted(int[] a, int[] b){
		if(a.length!=b.length){
			return 0;
		}
		Arrays.sort(a);
		Arrays.sort(b);
		return dotWith(a, b);
	}
	public static void main(String[] args) {
		int length =  Integer.parseInt(args[0]);
		int[] a = new int[((int)args.length/2)];
		int[] b = new int[((int)args.length/2)];
		for(int i = 1;i<((int)(args.length/2.0+0.5));i++){
			a[i-1] = Integer.parseInt(args[i]);
		}
		
		for(int i = (int)(args.length/2.0+0.5);i<args.length;i++){
			b[i-(int)(args.length/2.0+0.5)] = Integer.parseInt(args[i]);
		}
		
		System.out.println(dotWith(a,b));
		System.out.println(useRotations(a,b));
		System.out.println(useSorted(a,b));

		
	}
}
