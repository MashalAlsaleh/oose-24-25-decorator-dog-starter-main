public class main {
    public static void main(String[] args) {
        LevelGenerator beachLevel = new BeachLevel();
        LevelGenerator foxOnBeach = new FoxDecorator(beachLevel);
        System.out.println(foxOnBeach.generateLevel());
        System.out.println("Challenge Level: " + foxOnBeach.calculateChallenge());
        LevelGenerator forestLevel = new ForestLevel();
        LevelGenerator foxOnForest = new FoxDecorator(forestLevel);
        System.out.println(foxOnForest.generateLevel());
        System.out.println("Challenge Level: " + foxOnForest.calculateChallenge());
        LevelGenerator desertLevel = new DesertLevel();
        LevelGenerator foxOnDesert = new FoxDecorator(desertLevel);
        System.out.println(foxOnDesert.generateLevel());
        System.out.println("Challenge Level: " + foxOnDesert.calculateChallenge());
    }
}
