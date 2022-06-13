package sungil0215;
import java.util.*;
import java.io.*;

public class Baseballl {
	
	
	public static void main(String[] args) throws IOException {
		
		int result;

	    if(args.length==3){
	      int x= Integer.valueOf(args[0]).intValue();
	      int y= Integer.valueOf(args[1]).intValue();
	      int z= Integer.valueOf(args[2]).intValue();
	      	
	      
	      result= playgame(x, y, z);
	    }else{ 
	      result= playgame();
	    }

	    System.out.println();
	    if(result<=2){ 
	      System.out.println("�� ���߾��!");
	    }else if(result<=5){
	      System.out.println("���߾��!");
	    }else if(result<=9){
	      System.out.println("�����̳׿�!");
	    }else{
	      System.out.println("�й��ϼ���!");
		
		

	}}
	public static int playgame() throws IOException {
		
		int x, y, z;
		
		Random r = new Random();
		
		x = Math.abs(r.nextInt() % 9)+1;
		
		do {
			
			y = Math.abs(r.nextInt() % 9)+1;
			
		}while(x==y);
		
		do {
			
			z = Math.abs(r.nextInt() % 9)+1;
			
		}while((z==y)||(z==x));
		
		return playgame(x, y, z);
		
	}
	public static int playgame(int x, int y,int z) throws IOException {
		
		int count;
	    int strike, ball;

	    int[] usr = new int[3];
	    int[] com = { x, y, z };

	    System.out.println("���� �߱� ����");

	    count= 0;

	    do{

	      count++;

	      do{
	        System.out.println("\nī��Ʈ: "+count);

	        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
	        String user;

	        System.out.print("1��° ����: ");
	        user= in.readLine();
	        usr[0]= new Integer(user).intValue();

	        System.out.print("2��° ����: ");
	        user= in.readLine();
	        usr[1]= new Integer(user).intValue();

	        System.out.print("3��° ����: ");
	        user= in.readLine(); 
	        usr[2]= new Integer(user).intValue();

	        if((usr[0]==0)||(usr[1]==0)||(usr[2]==0)){
	          System.out.println("0�� �Է����� ������. �ٽ� �Է����ּ���.");
	        }else if((usr[0]>9)||(usr[1]>9)||(usr[2]>9)){
	          System.out.println("1���� 9������ ���� �� �ϳ��� �Է����ּ���. �ٽ� �Է����ּ���.");
	        }else if((usr[0]==usr[1])||(usr[1]==usr[2])||(usr[0]==usr[2])){
	          System.out.println("��� �ٸ� ���ڸ� �Է����ּ���. �ٽ� �Է����ּ���.");
	        } 
	      }while((usr[0]==0)||(usr[1]==0)||(usr[2]==0)||
	             (usr[0]>9)||(usr[1]>9)||(usr[2]>9)||
	             (usr[0]==usr[1])||(usr[1]==usr[2])||(usr[0]==usr[2]));
	      
	      strike = ball = 0; 
	      
	      if(usr[0]==com[0]) strike++;
	      if(usr[1]==com[1]) strike++;
	      if(usr[2]==com[2]) strike++;

	      if(usr[0]==com[1]) ball++;
	      if(usr[0]==com[2]) ball++;
	      if(usr[1]==com[0]) ball++;
	      if(usr[1]==com[2]) ball++;
	      if(usr[2]==com[0]) ball++;
	      if(usr[2]==com[1]) ball++;
	  
	      System.out.println("Strike: "+ strike +" Ball: "+ ball);

	    }while((strike<3)&&(count<11));
	    return count; 
	}

}
