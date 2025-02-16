public class main {
    public static void main(String[] args) {
        LevelGenerator defaultBeach = new BeachLevel();
        System.out.println(defaultBeach.generateLevel());
        System.out.println("Challenge Level: " + defaultBeach.calculateChallenge());
        LevelGenerator sunnyBeach = new BeachLevel(new SunnyWeatherDecorator());
        System.out.println(sunnyBeach.generateLevel());
        System.out.println("Challenge Level: " + sunnyBeach.calculateChallenge());
        LevelGenerator rainyBeach = new BeachLevel(new RainyWeatherDecorator());
        System.out.println(rainyBeach.generateLevel());
        System.out.println("Challenge Level: " + rainyBeach.calculateChallenge());
    }
}