package 循环流程;

import java.util.Scanner;

public class Test_04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("请输入开始位置");
		
		int x = sc.nextInt(); 
		
		
		System.out.println("请输入结束位置");
		int y = sc.nextInt(); 

		for(  ; x<= y ; x++ ) {

			if(x%2==0) {
				continue;  //跳过
			}
			
			System.out.println(x);
		
			
		}
		


		
	}

}
