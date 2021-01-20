import java.util.*;

class CustomExceptions {

    //for incomplete commands
    public static class IncompleteDecriptionException extends KobeException {
//        public IncompleteDecriptionException(String errMsg, Throwable cause) {
        public IncompleteDecriptionException(String errMsg) {
            super(errMsg);
//            super(errMsg, cause);
        }
    }

    //for gibberish commands
    public static class IncorrectDecriptionException extends KobeException {
//        public IncorrectDecriptionException(String errMsg, Throwable cause) {
        public IncorrectDecriptionException(String errMsg) {
            super(errMsg);
//            super(errMsg, cause);
        }
    }

}