/**
 * @author Parisi Alessio
 * 13/05/22
 * 4bi
 */
public class Parisi_Alessio_class {
	int r,s1,f1;
	/**
	 * 
	 * @param r
	 * @param s
	 * @param f
	 *
	 */
	
	public int ParisiMet(int r,int s, int f) {
		this.r=r;
		this.s1=s;
		this.f1=f;

	
		for(int i=1;i<f;i++) {
			r=s1*f1*s1;
		}
		return r;
		
	}
	
	
/**
 * main
 */

	public static void main(String[] args) {
		Parisi_Alessio_class p=new Parisi_Alessio_class();
		System.out.println("r:"+p.ParisiMet(5,6,7));
	}
}
