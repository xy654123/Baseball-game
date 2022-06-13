package sungil0215;
import java.util.*;
import java.io.*;

public class BaseBall {


  public static int playGame() throws IOException //��ǻ�Ͱ� 3���� ������ �߻���Ű�� �޼ҵ�
  {
    int x, y, z;
    Random r= new Random();//��ǻ�Ͱ� �����ϴ� 3�� ����
    x= Math.abs(r.nextInt() % 9) + 1; //�����߻� Random() �޼ҵ�� ��ü���� r ����
  
    do{
      y= Math.abs(r.nextInt() % 9) + 1; // 1~9 ������ ���� �߻�
    }while(y==x);

    do{
      z= Math.abs(r.nextInt() % 9) + 1;
    }while((z==x)||(z==y)); // ���� ���� y�� x�� ���� ���� �� �ٽ� �� �� ���� �߻� �ݺ�

   
   System.out.println(x +", "+ y +", "+ z); //��ǻ�Ͱ� �߻���Ų ���� Ȯ��(���� �� �����)

    return playGame(x, y, z);
  }

  public static int playGame(int x, int y, int z) throws IOException
  //�μ� 3���� �־����� �޼ҵ�
  {
    int count; //������ �õ��ϴ� Ƚ��
    int strike, ball; // ���� ��Ī�� ���� ���
    int[] usr = new int[3]; // ����ڰ� �Է��ϴ� ���� 3���� �����ϴ� �迭
    int[] com = { x, y, z }; // ��ǻ�Ͱ� ������ ���� 3���� �����ϴ� �迭
    System.out.println("���� �߱� ����");
    count= 0;
    do{
      count++; //
      do{
        System.out.println("\nī��Ʈ: "+count);

        BufferedReader in= new BufferedReader(new InputStreamReader(System.in));
        // �ܼ� ȭ�鿡�� ����ڰ� �Է��ϴ� �����͸� �޾Ƶ��̴� BufferedReader() �޼ҵ��� ��ü ���� in ����
        String user; //��ü���� in�� ����ִ� �����ͳ����� �����������ͷ� ������ ��������

        System.out.print("1��° ����: ");
        user= in.readLine(); // ����ڰ� �Է��ϴ� �����͸� ���� user �� ����
        usr[0]= new Integer(user).intValue();//���� user�� ����� �����͸� ���������� ��ȭ���� �迭 0��ĭ�� ����

        System.out.print("2��° ����: ");
        user= in.readLine(); // ����ڰ� �Է��ϴ� �����͸� ���� user �� ����
        usr[1]= new Integer(user).intValue();//���� user�� ����� �����͸� ���������� ��ȭ���� �迭 1��ĭ�� ����

        System.out.print("3��° ����: ");
        user= in.readLine(); // ����ڰ� �Է��ϴ� �����͸� ���� user �� ����
        usr[2]= new Integer(user).intValue();//���� user�� ����� �����͸� ���������� ��ȭ���� �迭 2��ĭ�� ����

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
      //��� ���ڰ� 1~9����, ���� ���ڰ� ���� ��쿡�� �ݺ����� ��������
      strike = ball = 0; //��Ʈ����ũ �� �ʱ�ȭ
      
      if(usr[0]==com[0]) strike++;
      if(usr[1]==com[1]) strike++;
      if(usr[2]==com[2]) strike++;// usr,com �� ���� �迭�� ���� ������ ��ġ�� ��쿡�� strike ó��

      if(usr[0]==com[1]) ball++;
      if(usr[0]==com[2]) ball++;
      if(usr[1]==com[0]) ball++;
      if(usr[1]==com[2]) ball++;
      if(usr[2]==com[0]) ball++;
      if(usr[2]==com[1]) ball++;// usr, com �� ���� �迭�� ������ ��ġ�� �ٸ� ��쿡�� ball ó��
  
      System.out.println("Strike: "+ strike +" Ball: "+ ball); // ��Ʈ����ũ �� ���

    }while((strike<3)&&(count<11)); // ��Ʈ����ũ<3(���ӹ̿ϼ�) ī��Ʈ��<11(�õ�Ƚ�� 10������)�� �� �ݺ����� //strik=<3,count=11(�õ�Ƚ�� 11��°)�� �Ǹ�����
    return count; 
  }

  public static void main(String[] args) throws IOException
  {
    int result;// ������� ���� ���� ����

    if(args.length==3){// ���ӽ���� �־��� 3���� ���, ���� ���������� ����ȭ�� ���� x,y,z�� ����
      int x= Integer.valueOf(args[0]).intValue();
      int y= Integer.valueOf(args[1]).intValue();
      int z= Integer.valueOf(args[2]).intValue();
      	
      
      result= playGame(x, y, z);
    }else{ //�����߻���Ű�� ���playGame()�� �ش�
      result= playGame(); //return�� ��, �õ�Ƚ��(count)�� ��������� ��ȯ�Ͽ� result�� ����
    }

    System.out.println();//ī��Ʈ�� ���� ���
    if(result<=2){ 
      System.out.println("�� ���߾��!"); //�õ�Ƚ�� 2������
    }else if(result<=5){
      System.out.println("���߾��!"); //�õ�Ƚ�� 3������ 5������
    }else if(result<=9){
      System.out.println("�����̳׿�!"); //�õ�ȹ���� 6��~9��
    }else{
      System.out.println("�й��ϼ���!"); // �õ�Ƚ���� 10��            
    }
  }
}
