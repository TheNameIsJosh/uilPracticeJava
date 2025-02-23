package oldestFiles;

public class supplyProbability {
	public static void supplyProbability(String[] args) {
		int total_supplies = 0;
		double[][] probs = {{0.25, 4},{0.9, 1},{0.8, 4},{0.56, 2},{0, 20},{1, 1}};
        for(int i=0;i<probs.length;i++){
             total_supplies += Math.round(probs[i][0] * probs[i][1]);
        }
        System.out.println(total_supplies);
	}
}

