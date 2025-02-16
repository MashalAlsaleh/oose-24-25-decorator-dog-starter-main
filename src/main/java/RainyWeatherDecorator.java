public class RainyWeatherDecorator extends WeatherDecorator
{
    public String generateWeather()
    {
        return "Rainy weather\n";
    }

    public int calculateWeatherChallenge()
    {
        return 20;
    }
}
