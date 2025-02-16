
public class BeachLevel extends LevelGenerator
{
    protected static final String BEACH_DESCRIPTION = "You see a beach around you \n";

    public BeachLevel()
    {
    }

    public String generateLevel()
    {
        return BEACH_DESCRIPTION;
    }

    public int calculateChallenge()
    {
        return 10;
    }

    public LEVEL_TYPE getLevelType()
    {
        return LEVEL_TYPE.BEACH;
    }
}
