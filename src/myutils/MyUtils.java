
package myutils;

    import java.util.Scanner;


public class MyUtils {
    
	 public static void main(String[] args) {
            float a=6,b=8,c=5;
               
                float cevre = ucgenCevresiHesapla(a,b,c);
		float alan = ucgenAlaniHesapla(a,b,c);

		cevreYazdir(cevre);
		alanYazdir(alan);
                
                float x=5,y=5,z=5,w=5,t=5;
                float r=4;
                float besgencevre = besgenCevresiHesapla(x,y,z,w,t);
		float besgenalan = besgenAlaniHesapla(r,x);

	        besgencevreYazdir(besgencevre);
		besgenalanYazdir(besgenalan);
                
                 
		}
  
	public static float besgenCevresiHesapla(float x, float y, float z, float w, float t){
		float besgencevre= x + y + z + w + t;
		return besgencevre;
		}
	public static float besgenAlaniHesapla(float x ,float r){
                float besgenalan=5*((r*x)/2); 
		return besgenalan;
		}
	public static void besgencevreYazdir(float cevre){
		System.out.println("besgenin Çevresi:"+cevre);
		}
	 private static void besgenalanYazdir(float alan) {
        System.out.println("besgenin Alani:"+alan);
    
    }
	public static float ucgenCevresiHesapla(float a, float b, float c){
		float cevre= a + b + c;
		return cevre;
		}
	public static float ucgenAlaniHesapla(float a ,float b, float c){
                float u=a+b+c;
              float   alan=(float)Math.sqrt(u*(u-a)*(u-b)*(u-c)); 
		return alan;
		}
	public static void cevreYazdir(float cevre){
		System.out.println("Üçgenin Çevresi:"+cevre);
		}
	public static void alanYazdir(float alan){
		System.out.println("Üçgenin Alani:"+alan);
	}   
}