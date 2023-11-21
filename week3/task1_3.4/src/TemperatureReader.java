import java.io.*;
import java.net.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TemperatureReader {
    private final static String FILE_URL = "https://users.metropolia.fi/~jarkkov/temploki.csv";

    public static void main(String[] args) {
        try {
            URL url = new URL(FILE_URL);

            InputStream inputStream = url.openStream();

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            reader.readLine();

            int totalTemperature = 0;
            int temperatureCount = 0;

            String line;
            while ((line = reader.readLine()) != null) {
                String[] columns = line.split(";");
                String timestamp = columns[0];
                String temperatureStr = columns[1].replace(",", ".");

                if (!temperatureStr.equals("*")) {
                    double temperature = Double.parseDouble(temperatureStr);

                    SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm");
                    Date date = dateFormat.parse(timestamp);
                    if (isFirstDayOfJanuary2023(date)) {
                        totalTemperature += temperature;
                        temperatureCount++;
                    }
                }
            }

            if (temperatureCount > 0) {
                double averageTemperature = totalTemperature / (double) temperatureCount;
                System.out.println("Average temperature on the 1st day of January 2023: " + averageTemperature);
            } else {
                System.out.println("No valid temperature data found for the 1st day of January 2023.");
            }

            reader.close();
        } catch (IOException | ParseException e) {
            System.err.println(e);
        }
    }

    private static boolean isFirstDayOfJanuary2023(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        String dateString = dateFormat.format(date);
        return dateString.equals("01.01.2023");
    }
}
