public class SunnyWeatherDecorator extends WeatherDecorator
{
    public String generateWeather()
    {
        return "Sunny weather\n";
    }

    public int calculateWeatherChallenge()
    {
        return 5;
    }
}
