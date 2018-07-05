import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Vampire{
	public static void main(String[] args){
		int i,num;
		int[] fang = new int[4];
		int[] j = new int[4];
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(i=1000;i<10000;i++){
			num = i;
			j[0]=num%10;
			num = num / 10;
			j[1]=num%10;
			num = num / 10;
			j[2]=num%10;
			num = num / 10;
			j[3]=num%10;

			fang[0] = 10*j[0] + j[1];
			fang[1] = 10*j[1] + j[0];
			fang[2]= 10*j[2] + j[3];
			fang[3]= 10*j[3] + j[2];
			for(int k=0;k<2;k++){
				for(int l=2;l<4;l++){
					if(i == fang[l]*fang[k]){
						array.add(i);
					}
				}
			}
			fang[0] = 10*j[0] + j[2];
			fang[1] = 10*j[2] + j[0];
			fang[2]= 10*j[1] + j[3];
			fang[3]= 10*j[3] + j[1];
			for(int k=0;k<2;k++){
				for(int l=2;l<4;l++){
					if(i ==fang[l]*fang[k]){
						array.add(i);
					}
				}
			}
			fang[0] = 10*j[0] + j[3];
			fang[1] = 10*j[3] + j[0];
			fang[2]= 10*j[1] + j[2];
			fang[3]= 10*j[2] + j[1];
			for(int k=0;k<2;k++){
				for(int l=2;l<4;l++){
					if(i ==fang[l]*fang[k]){
						array.add(i);
					}
				}
			}


		}
		ArrayList<Integer> array2 = new ArrayList<Integer>(new HashSet<>(array));
		Collections.sort(array2);
		for(int k=0;k<array2.size();k++){
			if(array2.get(k)!=0){
				System.out.print(array2.get(k)+" ");
			}

		}
	}
}
