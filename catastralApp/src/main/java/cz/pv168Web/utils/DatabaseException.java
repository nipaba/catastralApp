package cz.pv168Web.utils;

/**
 *
 * Class for database exception 
 */
public class DatabaseException extends Exception {

   private static final long serialVersionUID = -8720173716208195168L;

    /**
     * constructor
     * @param msg = message
     */
    public DatabaseException(String msg) {
      super(msg);
  }

    /**
     * constructor
     * @param cause
     */
    public DatabaseException(Throwable cause) {
      super(cause);
  }

    /**
     * constructor
     * @param message
     * @param cause
     */
    public DatabaseException(String message, Throwable cause) {
      super(message, cause);
  }
}
