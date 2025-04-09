package yarnwrap.util.dynamic;
public class Codecs { public net.minecraft.util.dynamic.Codecs wrapperContained; public Codecs(net.minecraft.util.dynamic.Codecs wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec NONNEGATIVE_INT() { return wrapperContained.NONNEGATIVE_INT; }
public com.mojang.serialization.Codec POSITIVE_INT() { return wrapperContained.POSITIVE_INT; }
public com.mojang.serialization.Codec POSITIVE_FLOAT() { return wrapperContained.POSITIVE_FLOAT; }
public com.mojang.serialization.Codec REGULAR_EXPRESSION() { return wrapperContained.REGULAR_EXPRESSION; }
public com.mojang.serialization.Codec INSTANT() { return wrapperContained.INSTANT; }
public com.mojang.serialization.Codec BASE_64() { return wrapperContained.BASE_64; }
public com.mojang.serialization.Codec TAG_ENTRY_ID() { return wrapperContained.TAG_ENTRY_ID; }
public java.util.function.Function OPTIONAL_OF_LONG_TO_OPTIONAL_LONG() { return wrapperContained.OPTIONAL_OF_LONG_TO_OPTIONAL_LONG; }
public java.util.function.Function OPTIONAL_LONG_TO_OPTIONAL_OF_LONG() { return wrapperContained.OPTIONAL_LONG_TO_OPTIONAL_OF_LONG; }
public com.mojang.serialization.Codec JSON_ELEMENT() { return wrapperContained.JSON_ELEMENT; }
public com.mojang.serialization.Codec VECTOR_3F() { return wrapperContained.VECTOR_3F; }
public com.mojang.serialization.Codec BIT_SET() { return wrapperContained.BIT_SET; }
public com.mojang.serialization.Codec GAME_PROFILE_PROPERTY_MAP() { return wrapperContained.GAME_PROFILE_PROPERTY_MAP; }
public com.mojang.serialization.Codec GAME_PROFILE_WITH_PROPERTIES() { return wrapperContained.GAME_PROFILE_WITH_PROPERTIES; }
// public com.mojang.serialization.Codec GAME_PROFILE_PROPERTY() { return wrapperContained.GAME_PROFILE_PROPERTY; }
public com.mojang.serialization.Codec NON_EMPTY_STRING() { return wrapperContained.NON_EMPTY_STRING; }
public com.mojang.serialization.Codec QUATERNIONF() { return wrapperContained.QUATERNIONF; }
public com.mojang.serialization.Codec AXIS_ANGLE4F() { return wrapperContained.AXIS_ANGLE4F; }
public com.mojang.serialization.Codec ROTATION() { return wrapperContained.ROTATION; }
public com.mojang.serialization.Codec MATRIX4F() { return wrapperContained.MATRIX4F; }
public com.mojang.serialization.Codec CODEPOINT() { return wrapperContained.CODEPOINT; }
public com.mojang.serialization.Codec IDENTIFIER_PATH() { return wrapperContained.IDENTIFIER_PATH; }
// public com.mojang.serialization.MapCodec GAME_PROFILE() { return wrapperContained.GAME_PROFILE; }
public com.mojang.serialization.Codec ESCAPED_STRING() { return wrapperContained.ESCAPED_STRING; }
public com.mojang.serialization.Codec BASIC_OBJECT() { return wrapperContained.BASIC_OBJECT; }
public com.mojang.serialization.Codec UNSIGNED_BYTE() { return wrapperContained.UNSIGNED_BYTE; }
public com.mojang.serialization.Codec PLAYER_NAME() { return wrapperContained.PLAYER_NAME; }
public com.mojang.serialization.Codec VECTOR_4F() { return wrapperContained.VECTOR_4F; }
public com.mojang.serialization.Codec ARGB() { return wrapperContained.ARGB; }
// public com.mojang.serialization.Codec rangedInt(int min,int max,java.util.function.Function messageFactory) { return wrapperContained.rangedInt(min,max,messageFactory); }
public com.mojang.serialization.Codec nonEmptyList(com.mojang.serialization.Codec originalCodec) { return wrapperContained.nonEmptyList(originalCodec); }
// public com.mojang.serialization.Codec rangedFloat(float min,float max,java.util.function.Function messageFactory) { return wrapperContained.rangedFloat(min,max,messageFactory); }
public com.mojang.serialization.Codec createCodecForPairObject(com.mojang.serialization.Codec codec,java.lang.String leftFieldName,java.lang.String rightFieldName,java.util.function.BiFunction combineFunction,java.util.function.Function leftFunction,java.util.function.Function rightFunction) { return wrapperContained.createCodecForPairObject(codec,leftFieldName,rightFieldName,combineFunction,leftFunction,rightFunction); }
public Object orElsePartial(java.lang.Object object) { return wrapperContained.orElsePartial(object); }
public com.mojang.serialization.Codec withLifecycle(com.mojang.serialization.Codec originalCodec,java.util.function.Function entryLifecycleGetter,java.util.function.Function lifecycleGetter) { return wrapperContained.withLifecycle(originalCodec,entryLifecycleGetter,lifecycleGetter); }
public com.mojang.serialization.Codec rawIdChecked(java.util.function.ToIntFunction elementToRawId,java.util.function.IntFunction rawIdToElement,int errorRawId) { return wrapperContained.rawIdChecked(elementToRawId,rawIdToElement,errorRawId); }
public com.mojang.serialization.Codec orCompressed(com.mojang.serialization.Codec uncompressedCodec,com.mojang.serialization.Codec compressedCodec) { return wrapperContained.orCompressed(uncompressedCodec,compressedCodec); }
public com.mojang.serialization.MapCodec createContextRetrievalCodec(java.util.function.Function retriever) { return wrapperContained.createContextRetrievalCodec(retriever); }
public com.mojang.serialization.Codec nonEmptyEntryList(com.mojang.serialization.Codec originalCodec) { return wrapperContained.nonEmptyEntryList(originalCodec); }
public java.util.function.Function createEqualTypeChecker(java.util.function.Function typeGetter) { return wrapperContained.createEqualTypeChecker(typeGetter); }
public com.mojang.serialization.Codec exceptionCatching(com.mojang.serialization.Codec codec) { return wrapperContained.exceptionCatching(codec); }
public com.mojang.serialization.MapCodec optionalLong(com.mojang.serialization.MapCodec codec) { return wrapperContained.optionalLong(codec); }
public com.mojang.serialization.Codec rangedInt(int min,int max) { return wrapperContained.rangedInt(min,max); }
public com.mojang.serialization.Codec object2BooleanMap(com.mojang.serialization.Codec keyCodec) { return wrapperContained.object2BooleanMap(keyCodec); }
public com.mojang.serialization.Codec formattedTime(java.time.format.DateTimeFormatter formatter) { return wrapperContained.formattedTime(formatter); }
public Object strictUnboundedMap(com.mojang.serialization.Codec keyCodec,com.mojang.serialization.Codec elementCodec) { return wrapperContained.strictUnboundedMap(keyCodec,elementCodec); }
public com.mojang.serialization.Codec fromOps(com.mojang.serialization.DynamicOps ops) { return wrapperContained.fromOps(ops); }
public com.mojang.serialization.MapCodec orCompressed(com.mojang.serialization.MapCodec uncompressedCodec,com.mojang.serialization.MapCodec compressedCodec) { return wrapperContained.orCompressed(uncompressedCodec,compressedCodec); }
public com.mojang.serialization.MapCodec parameters(java.lang.String typeKey,java.lang.String parametersKey,com.mojang.serialization.Codec typeCodec,java.util.function.Function typeGetter,java.util.function.Function parametersCodecGetter) { return wrapperContained.parameters(typeKey,parametersKey,typeCodec,typeGetter,parametersCodecGetter); }
public com.mojang.serialization.Codec withLifecycle(com.mojang.serialization.Codec originalCodec,java.util.function.Function lifecycleGetter) { return wrapperContained.withLifecycle(originalCodec,lifecycleGetter); }
public com.mojang.serialization.Codec map(com.mojang.serialization.Codec codec,int maxLength) { return wrapperContained.map(codec,maxLength); }
public com.mojang.serialization.Codec optional(com.mojang.serialization.Codec codec) { return wrapperContained.optional(codec); }

}