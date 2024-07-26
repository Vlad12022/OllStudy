package InterfaceComputer;

public class WaterCollingException extends  Exception {
      public WaterCollingException(String message){
          super(message);
      }

    public WaterCollingException(String message, Throwable cause) {
        super(message, cause);
    }

    public WaterCollingException(Throwable cause) {
        super(cause);
    }

    public WaterCollingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public WaterCollingException() {
    }
}
