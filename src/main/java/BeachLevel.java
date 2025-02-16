
public class BeachLevel extends LevelGenerator
{
    protected static final String BEACH_DESCRIPTION = "You see a beach around you \n";
    private WeatherDecorator weather;

    public BeachLevel()
    {
        this.weather = new NoWeatherDecorator();
    }

    public BeachLevel(WeatherDecorator weather)
    {
        this.weather = weather;
    }

    public String generateLevel()
    {
        return BEACH_DESCRIPTION + weather.generateWeather();
    }

    public int calculateChallenge()
    {
        return 10 + weather.calculateWeatherChallenge();
    }

    public LEVEL_TYPE getLevelType()
    {
        return LEVEL_TYPE.BEACH;
    }
}
