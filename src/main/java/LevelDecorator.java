
public abstract class LevelDecorator extends LevelGenerator{
    LevelGenerator level;
    public abstract String generateLevel();
    
    public int calculateChallenge(){
        return level.calculateChallenge();
    }

    public LEVEL_TYPE getLevelType(){
        return level.getLevelType();
    }
}