package oldestFiles;

import java.util.Scanner;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Arrays;

public class costumeCompetition{
    public static void costumeCompetition(String[] args) {
        Scanner input = new Scanner(System.in);

        //Ask for competitions
        System.out.println("How Many Competitions:");
        int competitions = input.nextInt();

        //Ask for competition size
        System.out.println("Max Amount of Competitors:");
        int competitors = input.nextInt();
        //Fix scanner being weird
        input.nextLine();
        
        for (int k=0;k<competitions;k++){
            String Name[] = new String[competitions*competitors];
            int Scores[] = new int[competitions*competitors];
            ArrayList<String[]> ScoreName = new ArrayList<String[]>();

            int num = 0;
            for (int i=0; i<competitors;i++){
                //Ask for name
                System.out.println("Name?");
                Name[i] = input.nextLine();

                //Get score input
                System.out.println("Scores:");
                String scoreInput = input.nextLine();
                String scoreInputList[] = scoreInput.split(" ");
                
                if(!scoreInput.equals("")){
                   for (String score: scoreInputList){
                    Scores[i] += Integer.parseInt(score);
                    } 
                }
                
                String[] temp1 = {String.valueOf(Scores[i]) , Name[i]};
                if (i-1!=-1 && ScoreName.size()>0 && Integer.parseInt(temp1[0])>Integer.parseInt(ScoreName.get(i-1)[0])){
                    ScoreName.add(ScoreName.size()-i, temp1);
                } else {
                    ScoreName.add(temp1);
                }
                
                
                
            }
            //java.util.Arrays.sort(ScoreName);
            for (int i=1;i<=competitors;i++){
                System.out.printf(i + ". (%1s)  -  %1s %n", ScoreName.get(i-1));
                Scores[i-1] =0;
            }
        }
    }
}