package clientTS;

/**
 * Autogenerated by Thrift Compiler (0.11.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

public enum PARAMTYPE implements org.apache.thrift.TEnum {
  TEXT(1),
  XML(2),
  JSON(3);

  private final int value;

  private PARAMTYPE(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static PARAMTYPE findByValue(int value) {
    switch (value) {
      case 1:
        return TEXT;
      case 2:
        return XML;
      case 3:
        return JSON;
      default:
        return null;
    }
  }
}
