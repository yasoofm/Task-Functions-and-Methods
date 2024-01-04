public class WeatherStation {

    public double celsiusToFahrenheit(double celsius){
        return (celsius * 9/5) + 32;
    }

    public String categorizeRainfall(double rainfall){
        String analysis;
        if(rainfall > 0.05){
            analysis = "High";
        } else if(rainfall >= 0.02 && rainfall <= 0.05){
            analysis = "Moderate";
        } else {
            analysis = "Low";
        }
        return analysis;
    }
}
