// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TestService.proto

package generated.grpc.testservice;

/**
 * <pre>
 * Listening Question or Score
 * </pre>
 *
 * Protobuf type {@code TestService.ListeningQuestionOrScore}
 */
public  final class ListeningQuestionOrScore extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TestService.ListeningQuestionOrScore)
    ListeningQuestionOrScoreOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListeningQuestionOrScore.newBuilder() to construct.
  private ListeningQuestionOrScore(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListeningQuestionOrScore() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListeningQuestionOrScore(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            generated.grpc.testservice.ListeningSound.Builder subBuilder = null;
            if (messageCase_ == 1) {
              subBuilder = ((generated.grpc.testservice.ListeningSound) message_).toBuilder();
            }
            message_ =
                input.readMessage(generated.grpc.testservice.ListeningSound.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((generated.grpc.testservice.ListeningSound) message_);
              message_ = subBuilder.buildPartial();
            }
            messageCase_ = 1;
            break;
          }
          case 18: {
            generated.grpc.testservice.ListeningQuestion.Builder subBuilder = null;
            if (messageCase_ == 2) {
              subBuilder = ((generated.grpc.testservice.ListeningQuestion) message_).toBuilder();
            }
            message_ =
                input.readMessage(generated.grpc.testservice.ListeningQuestion.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((generated.grpc.testservice.ListeningQuestion) message_);
              message_ = subBuilder.buildPartial();
            }
            messageCase_ = 2;
            break;
          }
          case 26: {
            generated.grpc.testservice.AverageScore.Builder subBuilder = null;
            if (messageCase_ == 3) {
              subBuilder = ((generated.grpc.testservice.AverageScore) message_).toBuilder();
            }
            message_ =
                input.readMessage(generated.grpc.testservice.AverageScore.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((generated.grpc.testservice.AverageScore) message_);
              message_ = subBuilder.buildPartial();
            }
            messageCase_ = 3;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return generated.grpc.testservice.TestServiceImpl.internal_static_TestService_ListeningQuestionOrScore_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return generated.grpc.testservice.TestServiceImpl.internal_static_TestService_ListeningQuestionOrScore_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            generated.grpc.testservice.ListeningQuestionOrScore.class, generated.grpc.testservice.ListeningQuestionOrScore.Builder.class);
  }

  private int messageCase_ = 0;
  private java.lang.Object message_;
  public enum MessageCase
      implements com.google.protobuf.Internal.EnumLite {
    SOUNDPATH(1),
    QUESTION(2),
    FINALSCORE(3),
    MESSAGE_NOT_SET(0);
    private final int value;
    private MessageCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static MessageCase valueOf(int value) {
      return forNumber(value);
    }

    public static MessageCase forNumber(int value) {
      switch (value) {
        case 1: return SOUNDPATH;
        case 2: return QUESTION;
        case 3: return FINALSCORE;
        case 0: return MESSAGE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public MessageCase
  getMessageCase() {
    return MessageCase.forNumber(
        messageCase_);
  }

  public static final int SOUNDPATH_FIELD_NUMBER = 1;
  /**
   * <code>.TestService.ListeningSound soundpath = 1;</code>
   */
  public boolean hasSoundpath() {
    return messageCase_ == 1;
  }
  /**
   * <code>.TestService.ListeningSound soundpath = 1;</code>
   */
  public generated.grpc.testservice.ListeningSound getSoundpath() {
    if (messageCase_ == 1) {
       return (generated.grpc.testservice.ListeningSound) message_;
    }
    return generated.grpc.testservice.ListeningSound.getDefaultInstance();
  }
  /**
   * <code>.TestService.ListeningSound soundpath = 1;</code>
   */
  public generated.grpc.testservice.ListeningSoundOrBuilder getSoundpathOrBuilder() {
    if (messageCase_ == 1) {
       return (generated.grpc.testservice.ListeningSound) message_;
    }
    return generated.grpc.testservice.ListeningSound.getDefaultInstance();
  }

  public static final int QUESTION_FIELD_NUMBER = 2;
  /**
   * <code>.TestService.ListeningQuestion question = 2;</code>
   */
  public boolean hasQuestion() {
    return messageCase_ == 2;
  }
  /**
   * <code>.TestService.ListeningQuestion question = 2;</code>
   */
  public generated.grpc.testservice.ListeningQuestion getQuestion() {
    if (messageCase_ == 2) {
       return (generated.grpc.testservice.ListeningQuestion) message_;
    }
    return generated.grpc.testservice.ListeningQuestion.getDefaultInstance();
  }
  /**
   * <code>.TestService.ListeningQuestion question = 2;</code>
   */
  public generated.grpc.testservice.ListeningQuestionOrBuilder getQuestionOrBuilder() {
    if (messageCase_ == 2) {
       return (generated.grpc.testservice.ListeningQuestion) message_;
    }
    return generated.grpc.testservice.ListeningQuestion.getDefaultInstance();
  }

  public static final int FINALSCORE_FIELD_NUMBER = 3;
  /**
   * <code>.TestService.AverageScore finalScore = 3;</code>
   */
  public boolean hasFinalScore() {
    return messageCase_ == 3;
  }
  /**
   * <code>.TestService.AverageScore finalScore = 3;</code>
   */
  public generated.grpc.testservice.AverageScore getFinalScore() {
    if (messageCase_ == 3) {
       return (generated.grpc.testservice.AverageScore) message_;
    }
    return generated.grpc.testservice.AverageScore.getDefaultInstance();
  }
  /**
   * <code>.TestService.AverageScore finalScore = 3;</code>
   */
  public generated.grpc.testservice.AverageScoreOrBuilder getFinalScoreOrBuilder() {
    if (messageCase_ == 3) {
       return (generated.grpc.testservice.AverageScore) message_;
    }
    return generated.grpc.testservice.AverageScore.getDefaultInstance();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (messageCase_ == 1) {
      output.writeMessage(1, (generated.grpc.testservice.ListeningSound) message_);
    }
    if (messageCase_ == 2) {
      output.writeMessage(2, (generated.grpc.testservice.ListeningQuestion) message_);
    }
    if (messageCase_ == 3) {
      output.writeMessage(3, (generated.grpc.testservice.AverageScore) message_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (messageCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (generated.grpc.testservice.ListeningSound) message_);
    }
    if (messageCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (generated.grpc.testservice.ListeningQuestion) message_);
    }
    if (messageCase_ == 3) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, (generated.grpc.testservice.AverageScore) message_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof generated.grpc.testservice.ListeningQuestionOrScore)) {
      return super.equals(obj);
    }
    generated.grpc.testservice.ListeningQuestionOrScore other = (generated.grpc.testservice.ListeningQuestionOrScore) obj;

    boolean result = true;
    result = result && getMessageCase().equals(
        other.getMessageCase());
    if (!result) return false;
    switch (messageCase_) {
      case 1:
        result = result && getSoundpath()
            .equals(other.getSoundpath());
        break;
      case 2:
        result = result && getQuestion()
            .equals(other.getQuestion());
        break;
      case 3:
        result = result && getFinalScore()
            .equals(other.getFinalScore());
        break;
      case 0:
      default:
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    switch (messageCase_) {
      case 1:
        hash = (37 * hash) + SOUNDPATH_FIELD_NUMBER;
        hash = (53 * hash) + getSoundpath().hashCode();
        break;
      case 2:
        hash = (37 * hash) + QUESTION_FIELD_NUMBER;
        hash = (53 * hash) + getQuestion().hashCode();
        break;
      case 3:
        hash = (37 * hash) + FINALSCORE_FIELD_NUMBER;
        hash = (53 * hash) + getFinalScore().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static generated.grpc.testservice.ListeningQuestionOrScore parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.testservice.ListeningQuestionOrScore parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.testservice.ListeningQuestionOrScore parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.testservice.ListeningQuestionOrScore parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.testservice.ListeningQuestionOrScore parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static generated.grpc.testservice.ListeningQuestionOrScore parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static generated.grpc.testservice.ListeningQuestionOrScore parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.testservice.ListeningQuestionOrScore parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.grpc.testservice.ListeningQuestionOrScore parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static generated.grpc.testservice.ListeningQuestionOrScore parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static generated.grpc.testservice.ListeningQuestionOrScore parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static generated.grpc.testservice.ListeningQuestionOrScore parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(generated.grpc.testservice.ListeningQuestionOrScore prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Listening Question or Score
   * </pre>
   *
   * Protobuf type {@code TestService.ListeningQuestionOrScore}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TestService.ListeningQuestionOrScore)
      generated.grpc.testservice.ListeningQuestionOrScoreOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return generated.grpc.testservice.TestServiceImpl.internal_static_TestService_ListeningQuestionOrScore_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return generated.grpc.testservice.TestServiceImpl.internal_static_TestService_ListeningQuestionOrScore_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              generated.grpc.testservice.ListeningQuestionOrScore.class, generated.grpc.testservice.ListeningQuestionOrScore.Builder.class);
    }

    // Construct using generated.grpc.testservice.ListeningQuestionOrScore.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      messageCase_ = 0;
      message_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return generated.grpc.testservice.TestServiceImpl.internal_static_TestService_ListeningQuestionOrScore_descriptor;
    }

    @java.lang.Override
    public generated.grpc.testservice.ListeningQuestionOrScore getDefaultInstanceForType() {
      return generated.grpc.testservice.ListeningQuestionOrScore.getDefaultInstance();
    }

    @java.lang.Override
    public generated.grpc.testservice.ListeningQuestionOrScore build() {
      generated.grpc.testservice.ListeningQuestionOrScore result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public generated.grpc.testservice.ListeningQuestionOrScore buildPartial() {
      generated.grpc.testservice.ListeningQuestionOrScore result = new generated.grpc.testservice.ListeningQuestionOrScore(this);
      if (messageCase_ == 1) {
        if (soundpathBuilder_ == null) {
          result.message_ = message_;
        } else {
          result.message_ = soundpathBuilder_.build();
        }
      }
      if (messageCase_ == 2) {
        if (questionBuilder_ == null) {
          result.message_ = message_;
        } else {
          result.message_ = questionBuilder_.build();
        }
      }
      if (messageCase_ == 3) {
        if (finalScoreBuilder_ == null) {
          result.message_ = message_;
        } else {
          result.message_ = finalScoreBuilder_.build();
        }
      }
      result.messageCase_ = messageCase_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof generated.grpc.testservice.ListeningQuestionOrScore) {
        return mergeFrom((generated.grpc.testservice.ListeningQuestionOrScore)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(generated.grpc.testservice.ListeningQuestionOrScore other) {
      if (other == generated.grpc.testservice.ListeningQuestionOrScore.getDefaultInstance()) return this;
      switch (other.getMessageCase()) {
        case SOUNDPATH: {
          mergeSoundpath(other.getSoundpath());
          break;
        }
        case QUESTION: {
          mergeQuestion(other.getQuestion());
          break;
        }
        case FINALSCORE: {
          mergeFinalScore(other.getFinalScore());
          break;
        }
        case MESSAGE_NOT_SET: {
          break;
        }
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      generated.grpc.testservice.ListeningQuestionOrScore parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (generated.grpc.testservice.ListeningQuestionOrScore) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int messageCase_ = 0;
    private java.lang.Object message_;
    public MessageCase
        getMessageCase() {
      return MessageCase.forNumber(
          messageCase_);
    }

    public Builder clearMessage() {
      messageCase_ = 0;
      message_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        generated.grpc.testservice.ListeningSound, generated.grpc.testservice.ListeningSound.Builder, generated.grpc.testservice.ListeningSoundOrBuilder> soundpathBuilder_;
    /**
     * <code>.TestService.ListeningSound soundpath = 1;</code>
     */
    public boolean hasSoundpath() {
      return messageCase_ == 1;
    }
    /**
     * <code>.TestService.ListeningSound soundpath = 1;</code>
     */
    public generated.grpc.testservice.ListeningSound getSoundpath() {
      if (soundpathBuilder_ == null) {
        if (messageCase_ == 1) {
          return (generated.grpc.testservice.ListeningSound) message_;
        }
        return generated.grpc.testservice.ListeningSound.getDefaultInstance();
      } else {
        if (messageCase_ == 1) {
          return soundpathBuilder_.getMessage();
        }
        return generated.grpc.testservice.ListeningSound.getDefaultInstance();
      }
    }
    /**
     * <code>.TestService.ListeningSound soundpath = 1;</code>
     */
    public Builder setSoundpath(generated.grpc.testservice.ListeningSound value) {
      if (soundpathBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
        onChanged();
      } else {
        soundpathBuilder_.setMessage(value);
      }
      messageCase_ = 1;
      return this;
    }
    /**
     * <code>.TestService.ListeningSound soundpath = 1;</code>
     */
    public Builder setSoundpath(
        generated.grpc.testservice.ListeningSound.Builder builderForValue) {
      if (soundpathBuilder_ == null) {
        message_ = builderForValue.build();
        onChanged();
      } else {
        soundpathBuilder_.setMessage(builderForValue.build());
      }
      messageCase_ = 1;
      return this;
    }
    /**
     * <code>.TestService.ListeningSound soundpath = 1;</code>
     */
    public Builder mergeSoundpath(generated.grpc.testservice.ListeningSound value) {
      if (soundpathBuilder_ == null) {
        if (messageCase_ == 1 &&
            message_ != generated.grpc.testservice.ListeningSound.getDefaultInstance()) {
          message_ = generated.grpc.testservice.ListeningSound.newBuilder((generated.grpc.testservice.ListeningSound) message_)
              .mergeFrom(value).buildPartial();
        } else {
          message_ = value;
        }
        onChanged();
      } else {
        if (messageCase_ == 1) {
          soundpathBuilder_.mergeFrom(value);
        }
        soundpathBuilder_.setMessage(value);
      }
      messageCase_ = 1;
      return this;
    }
    /**
     * <code>.TestService.ListeningSound soundpath = 1;</code>
     */
    public Builder clearSoundpath() {
      if (soundpathBuilder_ == null) {
        if (messageCase_ == 1) {
          messageCase_ = 0;
          message_ = null;
          onChanged();
        }
      } else {
        if (messageCase_ == 1) {
          messageCase_ = 0;
          message_ = null;
        }
        soundpathBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.TestService.ListeningSound soundpath = 1;</code>
     */
    public generated.grpc.testservice.ListeningSound.Builder getSoundpathBuilder() {
      return getSoundpathFieldBuilder().getBuilder();
    }
    /**
     * <code>.TestService.ListeningSound soundpath = 1;</code>
     */
    public generated.grpc.testservice.ListeningSoundOrBuilder getSoundpathOrBuilder() {
      if ((messageCase_ == 1) && (soundpathBuilder_ != null)) {
        return soundpathBuilder_.getMessageOrBuilder();
      } else {
        if (messageCase_ == 1) {
          return (generated.grpc.testservice.ListeningSound) message_;
        }
        return generated.grpc.testservice.ListeningSound.getDefaultInstance();
      }
    }
    /**
     * <code>.TestService.ListeningSound soundpath = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        generated.grpc.testservice.ListeningSound, generated.grpc.testservice.ListeningSound.Builder, generated.grpc.testservice.ListeningSoundOrBuilder> 
        getSoundpathFieldBuilder() {
      if (soundpathBuilder_ == null) {
        if (!(messageCase_ == 1)) {
          message_ = generated.grpc.testservice.ListeningSound.getDefaultInstance();
        }
        soundpathBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            generated.grpc.testservice.ListeningSound, generated.grpc.testservice.ListeningSound.Builder, generated.grpc.testservice.ListeningSoundOrBuilder>(
                (generated.grpc.testservice.ListeningSound) message_,
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      messageCase_ = 1;
      onChanged();;
      return soundpathBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        generated.grpc.testservice.ListeningQuestion, generated.grpc.testservice.ListeningQuestion.Builder, generated.grpc.testservice.ListeningQuestionOrBuilder> questionBuilder_;
    /**
     * <code>.TestService.ListeningQuestion question = 2;</code>
     */
    public boolean hasQuestion() {
      return messageCase_ == 2;
    }
    /**
     * <code>.TestService.ListeningQuestion question = 2;</code>
     */
    public generated.grpc.testservice.ListeningQuestion getQuestion() {
      if (questionBuilder_ == null) {
        if (messageCase_ == 2) {
          return (generated.grpc.testservice.ListeningQuestion) message_;
        }
        return generated.grpc.testservice.ListeningQuestion.getDefaultInstance();
      } else {
        if (messageCase_ == 2) {
          return questionBuilder_.getMessage();
        }
        return generated.grpc.testservice.ListeningQuestion.getDefaultInstance();
      }
    }
    /**
     * <code>.TestService.ListeningQuestion question = 2;</code>
     */
    public Builder setQuestion(generated.grpc.testservice.ListeningQuestion value) {
      if (questionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
        onChanged();
      } else {
        questionBuilder_.setMessage(value);
      }
      messageCase_ = 2;
      return this;
    }
    /**
     * <code>.TestService.ListeningQuestion question = 2;</code>
     */
    public Builder setQuestion(
        generated.grpc.testservice.ListeningQuestion.Builder builderForValue) {
      if (questionBuilder_ == null) {
        message_ = builderForValue.build();
        onChanged();
      } else {
        questionBuilder_.setMessage(builderForValue.build());
      }
      messageCase_ = 2;
      return this;
    }
    /**
     * <code>.TestService.ListeningQuestion question = 2;</code>
     */
    public Builder mergeQuestion(generated.grpc.testservice.ListeningQuestion value) {
      if (questionBuilder_ == null) {
        if (messageCase_ == 2 &&
            message_ != generated.grpc.testservice.ListeningQuestion.getDefaultInstance()) {
          message_ = generated.grpc.testservice.ListeningQuestion.newBuilder((generated.grpc.testservice.ListeningQuestion) message_)
              .mergeFrom(value).buildPartial();
        } else {
          message_ = value;
        }
        onChanged();
      } else {
        if (messageCase_ == 2) {
          questionBuilder_.mergeFrom(value);
        }
        questionBuilder_.setMessage(value);
      }
      messageCase_ = 2;
      return this;
    }
    /**
     * <code>.TestService.ListeningQuestion question = 2;</code>
     */
    public Builder clearQuestion() {
      if (questionBuilder_ == null) {
        if (messageCase_ == 2) {
          messageCase_ = 0;
          message_ = null;
          onChanged();
        }
      } else {
        if (messageCase_ == 2) {
          messageCase_ = 0;
          message_ = null;
        }
        questionBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.TestService.ListeningQuestion question = 2;</code>
     */
    public generated.grpc.testservice.ListeningQuestion.Builder getQuestionBuilder() {
      return getQuestionFieldBuilder().getBuilder();
    }
    /**
     * <code>.TestService.ListeningQuestion question = 2;</code>
     */
    public generated.grpc.testservice.ListeningQuestionOrBuilder getQuestionOrBuilder() {
      if ((messageCase_ == 2) && (questionBuilder_ != null)) {
        return questionBuilder_.getMessageOrBuilder();
      } else {
        if (messageCase_ == 2) {
          return (generated.grpc.testservice.ListeningQuestion) message_;
        }
        return generated.grpc.testservice.ListeningQuestion.getDefaultInstance();
      }
    }
    /**
     * <code>.TestService.ListeningQuestion question = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        generated.grpc.testservice.ListeningQuestion, generated.grpc.testservice.ListeningQuestion.Builder, generated.grpc.testservice.ListeningQuestionOrBuilder> 
        getQuestionFieldBuilder() {
      if (questionBuilder_ == null) {
        if (!(messageCase_ == 2)) {
          message_ = generated.grpc.testservice.ListeningQuestion.getDefaultInstance();
        }
        questionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            generated.grpc.testservice.ListeningQuestion, generated.grpc.testservice.ListeningQuestion.Builder, generated.grpc.testservice.ListeningQuestionOrBuilder>(
                (generated.grpc.testservice.ListeningQuestion) message_,
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      messageCase_ = 2;
      onChanged();;
      return questionBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        generated.grpc.testservice.AverageScore, generated.grpc.testservice.AverageScore.Builder, generated.grpc.testservice.AverageScoreOrBuilder> finalScoreBuilder_;
    /**
     * <code>.TestService.AverageScore finalScore = 3;</code>
     */
    public boolean hasFinalScore() {
      return messageCase_ == 3;
    }
    /**
     * <code>.TestService.AverageScore finalScore = 3;</code>
     */
    public generated.grpc.testservice.AverageScore getFinalScore() {
      if (finalScoreBuilder_ == null) {
        if (messageCase_ == 3) {
          return (generated.grpc.testservice.AverageScore) message_;
        }
        return generated.grpc.testservice.AverageScore.getDefaultInstance();
      } else {
        if (messageCase_ == 3) {
          return finalScoreBuilder_.getMessage();
        }
        return generated.grpc.testservice.AverageScore.getDefaultInstance();
      }
    }
    /**
     * <code>.TestService.AverageScore finalScore = 3;</code>
     */
    public Builder setFinalScore(generated.grpc.testservice.AverageScore value) {
      if (finalScoreBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        message_ = value;
        onChanged();
      } else {
        finalScoreBuilder_.setMessage(value);
      }
      messageCase_ = 3;
      return this;
    }
    /**
     * <code>.TestService.AverageScore finalScore = 3;</code>
     */
    public Builder setFinalScore(
        generated.grpc.testservice.AverageScore.Builder builderForValue) {
      if (finalScoreBuilder_ == null) {
        message_ = builderForValue.build();
        onChanged();
      } else {
        finalScoreBuilder_.setMessage(builderForValue.build());
      }
      messageCase_ = 3;
      return this;
    }
    /**
     * <code>.TestService.AverageScore finalScore = 3;</code>
     */
    public Builder mergeFinalScore(generated.grpc.testservice.AverageScore value) {
      if (finalScoreBuilder_ == null) {
        if (messageCase_ == 3 &&
            message_ != generated.grpc.testservice.AverageScore.getDefaultInstance()) {
          message_ = generated.grpc.testservice.AverageScore.newBuilder((generated.grpc.testservice.AverageScore) message_)
              .mergeFrom(value).buildPartial();
        } else {
          message_ = value;
        }
        onChanged();
      } else {
        if (messageCase_ == 3) {
          finalScoreBuilder_.mergeFrom(value);
        }
        finalScoreBuilder_.setMessage(value);
      }
      messageCase_ = 3;
      return this;
    }
    /**
     * <code>.TestService.AverageScore finalScore = 3;</code>
     */
    public Builder clearFinalScore() {
      if (finalScoreBuilder_ == null) {
        if (messageCase_ == 3) {
          messageCase_ = 0;
          message_ = null;
          onChanged();
        }
      } else {
        if (messageCase_ == 3) {
          messageCase_ = 0;
          message_ = null;
        }
        finalScoreBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.TestService.AverageScore finalScore = 3;</code>
     */
    public generated.grpc.testservice.AverageScore.Builder getFinalScoreBuilder() {
      return getFinalScoreFieldBuilder().getBuilder();
    }
    /**
     * <code>.TestService.AverageScore finalScore = 3;</code>
     */
    public generated.grpc.testservice.AverageScoreOrBuilder getFinalScoreOrBuilder() {
      if ((messageCase_ == 3) && (finalScoreBuilder_ != null)) {
        return finalScoreBuilder_.getMessageOrBuilder();
      } else {
        if (messageCase_ == 3) {
          return (generated.grpc.testservice.AverageScore) message_;
        }
        return generated.grpc.testservice.AverageScore.getDefaultInstance();
      }
    }
    /**
     * <code>.TestService.AverageScore finalScore = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        generated.grpc.testservice.AverageScore, generated.grpc.testservice.AverageScore.Builder, generated.grpc.testservice.AverageScoreOrBuilder> 
        getFinalScoreFieldBuilder() {
      if (finalScoreBuilder_ == null) {
        if (!(messageCase_ == 3)) {
          message_ = generated.grpc.testservice.AverageScore.getDefaultInstance();
        }
        finalScoreBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            generated.grpc.testservice.AverageScore, generated.grpc.testservice.AverageScore.Builder, generated.grpc.testservice.AverageScoreOrBuilder>(
                (generated.grpc.testservice.AverageScore) message_,
                getParentForChildren(),
                isClean());
        message_ = null;
      }
      messageCase_ = 3;
      onChanged();;
      return finalScoreBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:TestService.ListeningQuestionOrScore)
  }

  // @@protoc_insertion_point(class_scope:TestService.ListeningQuestionOrScore)
  private static final generated.grpc.testservice.ListeningQuestionOrScore DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new generated.grpc.testservice.ListeningQuestionOrScore();
  }

  public static generated.grpc.testservice.ListeningQuestionOrScore getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListeningQuestionOrScore>
      PARSER = new com.google.protobuf.AbstractParser<ListeningQuestionOrScore>() {
    @java.lang.Override
    public ListeningQuestionOrScore parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListeningQuestionOrScore(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListeningQuestionOrScore> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListeningQuestionOrScore> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public generated.grpc.testservice.ListeningQuestionOrScore getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

