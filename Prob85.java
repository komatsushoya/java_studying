import java.util.*;
import java.nio.charset.*;
import java.nio.file.*;
import java.io.*;

public class Prob85 {
	public static void main(String[] args) {
		int i,j=0,k;
		ArrayList<Integer> stack = new ArrayList<Integer>();
		for(i=0;i<args.length;i++){
			switch(args[i]){
				case "+" :
				stack.add(stack.get(j-2) + stack.get(j-1));
				stack.remove(j-1);
				stack.remove(j-2);
				j = j - 1;
				break;
				case "-" :
				stack.add(stack.get(j-2) - stack.get(j-1));
				stack.remove(j-1);
				stack.remove(j-2);
				j = j - 1;
				break;
				case "*" :
				stack.add(stack.get(j-2) * stack.get(j-1));
				stack.remove(j-1);
				stack.remove(j-2);
				j = j - 1;
				break;case "/" :
				stack.add(stack.get(j-2) / stack.get(j-1));
				stack.remove(j-1);
				stack.remove(j-2);
				j = j - 1;
				break;
				default:
				stack.add(Integer.valueOf(args[i]));
				j++;
			}
		}
		for(k=0;k<stack.size();k++){
			System.out.print(stack.get(k) + " ");
		}
	}
}
