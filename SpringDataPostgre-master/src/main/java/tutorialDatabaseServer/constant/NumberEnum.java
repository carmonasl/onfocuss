package tutorialDatabaseServer.constant;

public enum NumberEnum {
    ZERO(0),
    ONE(1),
    TWENTY(20),
    THOUSAND(1000);

    private int value;

    private NumberEnum(int value) {
        this.value = value;
    }
    public int getValue(){
        return value;
    }
}