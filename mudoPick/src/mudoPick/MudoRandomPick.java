package mudoPick;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Random;
import java.util.Scanner;

public class MudoRandomPick {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        //전체회차
        //465 463 485 486
        int all =1;
        int[] RandomNumber =new int[1];
        Random AllRandom =new Random();
        int[] specialnumber = {465,463,485,486};
        for(int i=0; i<RandomNumber.length; i++){
            RandomNumber[i] = AllRandom.nextInt(476);
            if(AllRandom.nextBoolean()){
                RandomNumber[i] = specialnumber[AllRandom.nextInt(specialnumber.length)];
            }
        }

    // 잔진회차
        int start=110;
        int end=177;
        int[] jj =new int[end-start +1];
        for(int i =0; i<jj.length; i++){
            jj[i]=start+i;
        }

        Scanner scanner =new Scanner(System.in);
        Random random = new Random();
        System.out.println("전체회차=all 잔진있는편=jj 검색어를 입력");

        String input = scanner.nextLine();

        if(input.equals("jj")){
            int randomIndex = random.nextInt(jj.length);
            int randomNumber = jj[randomIndex];
            System.out.println("회차: "+ randomNumber);
        } else if (input.equals("all")) {
            int randomnumber = random.nextInt(RandomNumber.length);
            int randomnum=RandomNumber[randomnumber];
            System.out.println("회차: "+ randomnum);

        }
        else{
            System.out.println("해당배열없음");
        }


    }

}
