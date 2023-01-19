import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Launch {

    public static ArrayList<Integer> pbonnot(int[] t, int n){
        ArrayList<Integer> plusGrands=new ArrayList();
        for(int i=0;i<n;i++){
            plusGrands.add(i);
        }
        Collections.sort(plusGrands);
        int size=plusGrands.size();
        for(int i=n;i<t.length;i++){
            if(t[i]>=plusGrands.get(size-1)) {
                plusGrands.remove(0);
                plusGrands.add(t[i]);
            }
        }
        return plusGrands;
    }

    public static void afficher(ArrayList<Integer> liste){
        for(int i:liste){
            System.out.print(i+"\t");
        }
        System.out.println();
    }

    public static void afficher(int[] t){
        for(int i:t){
            System.out.print(i+"\t");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] tab=new int[100000000];
        float start, end;
        for(int i=0;i<tab.length;i++){
            tab[i]=(int)(Math.random()*10000-5000);
        }
        start=System.nanoTime();
        pbonnot(tab,100);
        end=System.nanoTime();
        System.out.println((end-start)/1000000);
    }
}
