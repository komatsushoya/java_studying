//61607091 komatsu shoya
public class Prob76 {
	public static void phone(int i, int j){
		if(i==1){
			if(j==1||j==6){System.out.print(".");}
			if(j==2||j==7){System.out.print(",");}
			if(j==3||j==8){System.out.print("!");}
			if(j==4||j==9){System.out.print("?");}
			if(j==5||j==10){System.out.print(" ");}
		}else if(i==2){
			if(j==1||j==4){System.out.print("a");}
			if(j==2||j==5){System.out.print("b");}
			if(j==3||j==6){System.out.print("c");}
		}else if(i==3){
			if(j==1||j==4){System.out.print("d");}
			if(j==2||j==5){System.out.print("e");}
			if(j==3||j==6){System.out.print("f");}
		}else if(i==4){
			if(j==1||j==4){System.out.print("g");}
			if(j==2||j==5){System.out.print("h");}
			if(j==3||j==6){System.out.print("i");}
		}else if(i==5){
			if(j==1||j==4){System.out.print("j");}
			if(j==2||j==5){System.out.print("k");}
			if(j==3||j==6){System.out.print("l");}
		}else if(i==6){
			if(j==1||j==4){System.out.print("m");}
			if(j==2||j==5){System.out.print("n");}
			if(j==3||j==6){System.out.print("o");}
		}else if(i==7){
			if(j==1||j==5){System.out.print("p");}
			if(j==2||j==6){System.out.print("q");}
			if(j==3||j==7){System.out.print("r");}
			if(j==4||j==8){System.out.print("s");}
		}else if(i==8){
			if(j==1||j==4){System.out.print("t");}
			if(j==2||j==5){System.out.print("u");}
			if(j==3||j==6){System.out.print("v");}
		}else if(i==9){
			if(j==1||j==5){System.out.print("w");}
			if(j==2||j==6){System.out.print("x");}
			if(j==3||j==7){System.out.print("y");}
			if(j==4||j==8){System.out.print("z");}
		}
	}
	public static void main(String[] args) {
		int b,n=0;
		int c = ((int)args[0].charAt(0)-48);
		for(b=0;b<args[0].length();b++){
			if(((int)args[0].charAt(b)-48)==0){
				phone(c,n);
				if(b<args[0].length()-1){
					c = ((int)args[0].charAt(b+1)-48);
					n=0;
				}
			}
			else n++;
		}
	}
}
