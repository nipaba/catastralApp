package cz.pv168Web.utils;

/**
 *
 * class for entity exception
 */
public class EntityException extends Exception {

   private static final long serialVersionUID = -8720173716208195168L;

    /**
     * constructor
     * @param msg - message
     */
    public EntityException(String msg) {
      super("EntityException : ERROR WITH VALIDATING ENTITY : \n " + msg);
  }

    /**
     * constructor
     * @param cause
     */
    public EntityException(Throwable cause) {
      super(cause);
  }

    /**
     * constructor
     * @param message
     * @param cause
     */
    public EntityException(String message, Throwable cause) {
      super(message, cause);
  }
}
