package bridge.config;

public enum ExceptionMessage {
    WRONG_ELEMENT("다리의 요소는 반드시 U, D이어야 합니다.");

    private final String message;

    public static final String ERROR = "[ERROR]";

    ExceptionMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return ERROR + message;
    }
}
