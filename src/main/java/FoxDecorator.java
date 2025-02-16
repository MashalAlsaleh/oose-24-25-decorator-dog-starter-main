public class FoxDecorator extends LevelDecorator
{
    protected static final String FOX_DESCRIPTION = "Beyond that you see a fox\n";

    public FoxDecorator(LevelGenerator level)
    {
        this.level = level;
    }

    public String generateLevel()
    {
        return level.generateLevel() + FOX_DESCRIPTION;
    }

    public int calculateChallenge()
    {
        int baseChallenge = level.calculateChallenge();
        LEVEL_TYPE levelType = level.getLevelType(); 

        switch (levelType) {
            case BEACH:
                return baseChallenge + 20;
            case DESERT:
                return baseChallenge + 30;
            case FOREST:
                return baseChallenge + 40;
            default:
                return baseChallenge;
        }
    }
}