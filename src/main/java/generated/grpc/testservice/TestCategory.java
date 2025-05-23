// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TestService.proto

package generated.grpc.testservice;

/**
 * <pre>
 * Enum for test categories
 * </pre>
 *
 * Protobuf enum {@code TestService.TestCategory}
 */
public enum TestCategory
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>READING = 0;</code>
   */
  READING(0),
  /**
   * <code>LISTENING = 1;</code>
   */
  LISTENING(1),
  /**
   * <code>SPEAKING = 2;</code>
   */
  SPEAKING(2),
  /**
   * <code>WRITING = 3;</code>
   */
  WRITING(3),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>READING = 0;</code>
   */
  public static final int READING_VALUE = 0;
  /**
   * <code>LISTENING = 1;</code>
   */
  public static final int LISTENING_VALUE = 1;
  /**
   * <code>SPEAKING = 2;</code>
   */
  public static final int SPEAKING_VALUE = 2;
  /**
   * <code>WRITING = 3;</code>
   */
  public static final int WRITING_VALUE = 3;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TestCategory valueOf(int value) {
    return forNumber(value);
  }

  public static TestCategory forNumber(int value) {
    switch (value) {
      case 0: return READING;
      case 1: return LISTENING;
      case 2: return SPEAKING;
      case 3: return WRITING;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TestCategory>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TestCategory> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TestCategory>() {
          public TestCategory findValueByNumber(int number) {
            return TestCategory.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return generated.grpc.testservice.TestServiceImpl.getDescriptor().getEnumTypes().get(0);
  }

  private static final TestCategory[] VALUES = values();

  public static TestCategory valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TestCategory(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:TestService.TestCategory)
}

