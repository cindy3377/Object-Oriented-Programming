public class AgeDistributionSimulator {
    public static void main(String[] args) {
        final int SIMULATIONS = 1000;
        final int MAX_AGE = 35;

        int[][] ageDistribution = {
                {16, 20}, {34, 21}, {52, 22}, {68, 23}, {82, 24},
                {89, 25}, {94, 26}, {96, 28}, {98, 30}, {100, MAX_AGE}
        };

        int[] generatedAges = new int[MAX_AGE + 1];

        for (int i = 0; i < SIMULATIONS; i++) {
            int randomNum = (int) (Math.random() * 100) + 1;
            int ageIndex = 0;

            while (randomNum > ageDistribution[ageIndex][0]) {
                ageIndex++;
            }

            generatedAges[ageDistribution[ageIndex][1]]++;
        }

        System.out.println("Age  count     %-share");
        for (int age = 0; age <= MAX_AGE; age++) {
            if (generatedAges[age] != 0) {
                String str = "%-4d %-8d %-8.2f\n";
                System.out.printf(str, age, generatedAges[age], ((double) generatedAges[age]) / SIMULATIONS * 100);
            }
        }
    }
}