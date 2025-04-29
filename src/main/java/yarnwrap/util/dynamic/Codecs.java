package yarnwrap.util.dynamic;
public class Codecs { public net.minecraft.util.dynamic.Codecs wrapperContained; public Codecs(net.minecraft.util.dynamic.Codecs wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec NONNEGATIVE_INT() { return wrapperContained.NONNEGATIVE_INT; }
// public void NONNEGATIVE_INT(com.mojang.serialization.Codec value) { wrapperContained.NONNEGATIVE_INT = value; }
public static com.mojang.serialization.Codec NONNEGATIVE_INT() { return net.minecraft.util.dynamic.Codecs.NONNEGATIVE_INT; }
// public static void NONNEGATIVE_INT(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.NONNEGATIVE_INT = value; }

// public com.mojang.serialization.Codec POSITIVE_INT() { return wrapperContained.POSITIVE_INT; }
// public void POSITIVE_INT(com.mojang.serialization.Codec value) { wrapperContained.POSITIVE_INT = value; }
public static com.mojang.serialization.Codec POSITIVE_INT() { return net.minecraft.util.dynamic.Codecs.POSITIVE_INT; }
// public static void POSITIVE_INT(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.POSITIVE_INT = value; }

// public com.mojang.serialization.Codec POSITIVE_FLOAT() { return wrapperContained.POSITIVE_FLOAT; }
// public void POSITIVE_FLOAT(com.mojang.serialization.Codec value) { wrapperContained.POSITIVE_FLOAT = value; }
public static com.mojang.serialization.Codec POSITIVE_FLOAT() { return net.minecraft.util.dynamic.Codecs.POSITIVE_FLOAT; }
// public static void POSITIVE_FLOAT(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.POSITIVE_FLOAT = value; }

// public com.mojang.serialization.Codec REGULAR_EXPRESSION() { return wrapperContained.REGULAR_EXPRESSION; }
// public void REGULAR_EXPRESSION(com.mojang.serialization.Codec value) { wrapperContained.REGULAR_EXPRESSION = value; }
public static com.mojang.serialization.Codec REGULAR_EXPRESSION() { return net.minecraft.util.dynamic.Codecs.REGULAR_EXPRESSION; }
// public static void REGULAR_EXPRESSION(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.REGULAR_EXPRESSION = value; }

// public com.mojang.serialization.Codec INSTANT() { return wrapperContained.INSTANT; }
// public void INSTANT(com.mojang.serialization.Codec value) { wrapperContained.INSTANT = value; }
public static com.mojang.serialization.Codec INSTANT() { return net.minecraft.util.dynamic.Codecs.INSTANT; }
// public static void INSTANT(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.INSTANT = value; }

// public com.mojang.serialization.Codec BASE_64() { return wrapperContained.BASE_64; }
// public void BASE_64(com.mojang.serialization.Codec value) { wrapperContained.BASE_64 = value; }
public static com.mojang.serialization.Codec BASE_64() { return net.minecraft.util.dynamic.Codecs.BASE_64; }
// public static void BASE_64(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.BASE_64 = value; }

// public com.mojang.serialization.Codec TAG_ENTRY_ID() { return wrapperContained.TAG_ENTRY_ID; }
// public void TAG_ENTRY_ID(com.mojang.serialization.Codec value) { wrapperContained.TAG_ENTRY_ID = value; }
public static com.mojang.serialization.Codec TAG_ENTRY_ID() { return net.minecraft.util.dynamic.Codecs.TAG_ENTRY_ID; }
// public static void TAG_ENTRY_ID(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.TAG_ENTRY_ID = value; }

// public java.util.function.Function OPTIONAL_OF_LONG_TO_OPTIONAL_LONG() { return wrapperContained.OPTIONAL_OF_LONG_TO_OPTIONAL_LONG; }
// public void OPTIONAL_OF_LONG_TO_OPTIONAL_LONG(java.util.function.Function value) { wrapperContained.OPTIONAL_OF_LONG_TO_OPTIONAL_LONG = value; }
public static java.util.function.Function OPTIONAL_OF_LONG_TO_OPTIONAL_LONG() { return net.minecraft.util.dynamic.Codecs.OPTIONAL_OF_LONG_TO_OPTIONAL_LONG; }
// public static void OPTIONAL_OF_LONG_TO_OPTIONAL_LONG(java.util.function.Function value, ) { net.minecraft.util.dynamic.Codecs.OPTIONAL_OF_LONG_TO_OPTIONAL_LONG = value; }

// public java.util.function.Function OPTIONAL_LONG_TO_OPTIONAL_OF_LONG() { return wrapperContained.OPTIONAL_LONG_TO_OPTIONAL_OF_LONG; }
// public void OPTIONAL_LONG_TO_OPTIONAL_OF_LONG(java.util.function.Function value) { wrapperContained.OPTIONAL_LONG_TO_OPTIONAL_OF_LONG = value; }
public static java.util.function.Function OPTIONAL_LONG_TO_OPTIONAL_OF_LONG() { return net.minecraft.util.dynamic.Codecs.OPTIONAL_LONG_TO_OPTIONAL_OF_LONG; }
// public static void OPTIONAL_LONG_TO_OPTIONAL_OF_LONG(java.util.function.Function value, ) { net.minecraft.util.dynamic.Codecs.OPTIONAL_LONG_TO_OPTIONAL_OF_LONG = value; }

// public com.mojang.serialization.Codec JSON_ELEMENT() { return wrapperContained.JSON_ELEMENT; }
// public void JSON_ELEMENT(com.mojang.serialization.Codec value) { wrapperContained.JSON_ELEMENT = value; }
public static com.mojang.serialization.Codec JSON_ELEMENT() { return net.minecraft.util.dynamic.Codecs.JSON_ELEMENT; }
// public static void JSON_ELEMENT(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.JSON_ELEMENT = value; }

// public com.mojang.serialization.Codec VECTOR_3F() { return wrapperContained.VECTOR_3F; }
// public void VECTOR_3F(com.mojang.serialization.Codec value) { wrapperContained.VECTOR_3F = value; }
public static com.mojang.serialization.Codec VECTOR_3F() { return net.minecraft.util.dynamic.Codecs.VECTOR_3F; }
// public static void VECTOR_3F(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.VECTOR_3F = value; }

// public com.mojang.serialization.Codec BIT_SET() { return wrapperContained.BIT_SET; }
// public void BIT_SET(com.mojang.serialization.Codec value) { wrapperContained.BIT_SET = value; }
public static com.mojang.serialization.Codec BIT_SET() { return net.minecraft.util.dynamic.Codecs.BIT_SET; }
// public static void BIT_SET(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.BIT_SET = value; }

// public com.mojang.serialization.Codec GAME_PROFILE_PROPERTY_MAP() { return wrapperContained.GAME_PROFILE_PROPERTY_MAP; }
// public void GAME_PROFILE_PROPERTY_MAP(com.mojang.serialization.Codec value) { wrapperContained.GAME_PROFILE_PROPERTY_MAP = value; }
public static com.mojang.serialization.Codec GAME_PROFILE_PROPERTY_MAP() { return net.minecraft.util.dynamic.Codecs.GAME_PROFILE_PROPERTY_MAP; }
// public static void GAME_PROFILE_PROPERTY_MAP(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.GAME_PROFILE_PROPERTY_MAP = value; }

// public com.mojang.serialization.Codec GAME_PROFILE_WITH_PROPERTIES() { return wrapperContained.GAME_PROFILE_WITH_PROPERTIES; }
// public void GAME_PROFILE_WITH_PROPERTIES(com.mojang.serialization.Codec value) { wrapperContained.GAME_PROFILE_WITH_PROPERTIES = value; }
public static com.mojang.serialization.Codec GAME_PROFILE_WITH_PROPERTIES() { return net.minecraft.util.dynamic.Codecs.GAME_PROFILE_WITH_PROPERTIES; }
// public static void GAME_PROFILE_WITH_PROPERTIES(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.GAME_PROFILE_WITH_PROPERTIES = value; }

// public com.mojang.serialization.Codec GAME_PROFILE_PROPERTY() { return wrapperContained.GAME_PROFILE_PROPERTY; }
// public void GAME_PROFILE_PROPERTY(com.mojang.serialization.Codec value) { wrapperContained.GAME_PROFILE_PROPERTY = value; }
// public static com.mojang.serialization.Codec GAME_PROFILE_PROPERTY() { return net.minecraft.util.dynamic.Codecs.GAME_PROFILE_PROPERTY; }
// public static void GAME_PROFILE_PROPERTY(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.GAME_PROFILE_PROPERTY = value; }

// public com.mojang.serialization.Codec NON_EMPTY_STRING() { return wrapperContained.NON_EMPTY_STRING; }
// public void NON_EMPTY_STRING(com.mojang.serialization.Codec value) { wrapperContained.NON_EMPTY_STRING = value; }
public static com.mojang.serialization.Codec NON_EMPTY_STRING() { return net.minecraft.util.dynamic.Codecs.NON_EMPTY_STRING; }
// public static void NON_EMPTY_STRING(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.NON_EMPTY_STRING = value; }

// public com.mojang.serialization.Codec QUATERNIONF() { return wrapperContained.QUATERNIONF; }
// public void QUATERNIONF(com.mojang.serialization.Codec value) { wrapperContained.QUATERNIONF = value; }
public static com.mojang.serialization.Codec QUATERNIONF() { return net.minecraft.util.dynamic.Codecs.QUATERNIONF; }
// public static void QUATERNIONF(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.QUATERNIONF = value; }

// public com.mojang.serialization.Codec AXIS_ANGLE4F() { return wrapperContained.AXIS_ANGLE4F; }
// public void AXIS_ANGLE4F(com.mojang.serialization.Codec value) { wrapperContained.AXIS_ANGLE4F = value; }
public static com.mojang.serialization.Codec AXIS_ANGLE4F() { return net.minecraft.util.dynamic.Codecs.AXIS_ANGLE4F; }
// public static void AXIS_ANGLE4F(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.AXIS_ANGLE4F = value; }

// public com.mojang.serialization.Codec ROTATION() { return wrapperContained.ROTATION; }
// public void ROTATION(com.mojang.serialization.Codec value) { wrapperContained.ROTATION = value; }
public static com.mojang.serialization.Codec ROTATION() { return net.minecraft.util.dynamic.Codecs.ROTATION; }
// public static void ROTATION(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.ROTATION = value; }

// public com.mojang.serialization.Codec MATRIX4F() { return wrapperContained.MATRIX4F; }
// public void MATRIX4F(com.mojang.serialization.Codec value) { wrapperContained.MATRIX4F = value; }
public static com.mojang.serialization.Codec MATRIX4F() { return net.minecraft.util.dynamic.Codecs.MATRIX4F; }
// public static void MATRIX4F(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.MATRIX4F = value; }

// public com.mojang.serialization.Codec CODEPOINT() { return wrapperContained.CODEPOINT; }
// public void CODEPOINT(com.mojang.serialization.Codec value) { wrapperContained.CODEPOINT = value; }
public static com.mojang.serialization.Codec CODEPOINT() { return net.minecraft.util.dynamic.Codecs.CODEPOINT; }
// public static void CODEPOINT(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.CODEPOINT = value; }

// public com.mojang.serialization.Codec IDENTIFIER_PATH() { return wrapperContained.IDENTIFIER_PATH; }
// public void IDENTIFIER_PATH(com.mojang.serialization.Codec value) { wrapperContained.IDENTIFIER_PATH = value; }
public static com.mojang.serialization.Codec IDENTIFIER_PATH() { return net.minecraft.util.dynamic.Codecs.IDENTIFIER_PATH; }
// public static void IDENTIFIER_PATH(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.IDENTIFIER_PATH = value; }

// public com.mojang.serialization.MapCodec GAME_PROFILE() { return wrapperContained.GAME_PROFILE; }
// public void GAME_PROFILE(com.mojang.serialization.MapCodec value) { wrapperContained.GAME_PROFILE = value; }
// public static com.mojang.serialization.MapCodec GAME_PROFILE() { return net.minecraft.util.dynamic.Codecs.GAME_PROFILE; }
// public static void GAME_PROFILE(com.mojang.serialization.MapCodec value, ) { net.minecraft.util.dynamic.Codecs.GAME_PROFILE = value; }

// public com.mojang.serialization.Codec ESCAPED_STRING() { return wrapperContained.ESCAPED_STRING; }
// public void ESCAPED_STRING(com.mojang.serialization.Codec value) { wrapperContained.ESCAPED_STRING = value; }
public static com.mojang.serialization.Codec ESCAPED_STRING() { return net.minecraft.util.dynamic.Codecs.ESCAPED_STRING; }
// public static void ESCAPED_STRING(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.ESCAPED_STRING = value; }

// public com.mojang.serialization.Codec BASIC_OBJECT() { return wrapperContained.BASIC_OBJECT; }
// public void BASIC_OBJECT(com.mojang.serialization.Codec value) { wrapperContained.BASIC_OBJECT = value; }
public static com.mojang.serialization.Codec BASIC_OBJECT() { return net.minecraft.util.dynamic.Codecs.BASIC_OBJECT; }
// public static void BASIC_OBJECT(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.BASIC_OBJECT = value; }

// public com.mojang.serialization.Codec UNSIGNED_BYTE() { return wrapperContained.UNSIGNED_BYTE; }
// public void UNSIGNED_BYTE(com.mojang.serialization.Codec value) { wrapperContained.UNSIGNED_BYTE = value; }
public static com.mojang.serialization.Codec UNSIGNED_BYTE() { return net.minecraft.util.dynamic.Codecs.UNSIGNED_BYTE; }
// public static void UNSIGNED_BYTE(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.UNSIGNED_BYTE = value; }

// public com.mojang.serialization.Codec PLAYER_NAME() { return wrapperContained.PLAYER_NAME; }
// public void PLAYER_NAME(com.mojang.serialization.Codec value) { wrapperContained.PLAYER_NAME = value; }
public static com.mojang.serialization.Codec PLAYER_NAME() { return net.minecraft.util.dynamic.Codecs.PLAYER_NAME; }
// public static void PLAYER_NAME(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.PLAYER_NAME = value; }

// public com.mojang.serialization.Codec VECTOR_4F() { return wrapperContained.VECTOR_4F; }
// public void VECTOR_4F(com.mojang.serialization.Codec value) { wrapperContained.VECTOR_4F = value; }
public static com.mojang.serialization.Codec VECTOR_4F() { return net.minecraft.util.dynamic.Codecs.VECTOR_4F; }
// public static void VECTOR_4F(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.VECTOR_4F = value; }

// public com.mojang.serialization.Codec ARGB() { return wrapperContained.ARGB; }
// public void ARGB(com.mojang.serialization.Codec value) { wrapperContained.ARGB = value; }
public static com.mojang.serialization.Codec ARGB() { return net.minecraft.util.dynamic.Codecs.ARGB; }
// public static void ARGB(com.mojang.serialization.Codec value, ) { net.minecraft.util.dynamic.Codecs.ARGB = value; }

// public com.mojang.serialization.Codec rangedInt(int min,int max,java.util.function.Function messageFactory) { return wrapperContained.rangedInt(min,max,messageFactory); }
// public static com.mojang.serialization.Codec rangedInt(int min,int max,java.util.function.Function messageFactory, ) { return net.minecraft.util.dynamic.Codecs.rangedInt(min,max,messageFactory); }
// public java.lang.String method_36242(java.lang.Integer v) { return wrapperContained.method_36242(v); }
// public static java.lang.String method_36242(java.lang.Integer v, ) { return net.minecraft.util.dynamic.Codecs.method_36242(v); }
// public java.lang.String method_36246(java.lang.Integer v) { return wrapperContained.method_36246(v); }
// public static java.lang.String method_36246(java.lang.Integer v, ) { return net.minecraft.util.dynamic.Codecs.method_36246(v); }
// public com.mojang.serialization.Codec nonEmptyList(com.mojang.serialization.Codec originalCodec) { return wrapperContained.nonEmptyList(originalCodec); }
// public static com.mojang.serialization.Codec nonEmptyList(com.mojang.serialization.Codec originalCodec, ) { return net.minecraft.util.dynamic.Codecs.nonEmptyList(originalCodec); }
// public com.mojang.serialization.Codec rangedFloat(float min,float max,java.util.function.Function messageFactory) { return wrapperContained.rangedFloat(min,max,messageFactory); }
// public static com.mojang.serialization.Codec rangedFloat(float min,float max,java.util.function.Function messageFactory, ) { return net.minecraft.util.dynamic.Codecs.rangedFloat(min,max,messageFactory); }
// public com.mojang.datafixers.kinds.App method_37930(com.mojang.serialization.Codec instance) { return wrapperContained.method_37930(instance); }
// public static com.mojang.datafixers.kinds.App method_37930(com.mojang.serialization.Codec instance, ) { return net.minecraft.util.dynamic.Codecs.method_37930(instance); }
// public com.mojang.serialization.Codec createCodecForPairObject(com.mojang.serialization.Codec codec,java.lang.String leftFieldName,java.lang.String rightFieldName,java.util.function.BiFunction combineFunction,java.util.function.Function leftFunction,java.util.function.Function rightFunction) { return wrapperContained.createCodecForPairObject(codec,leftFieldName,rightFieldName,combineFunction,leftFunction,rightFunction); }
// public static com.mojang.serialization.Codec createCodecForPairObject(com.mojang.serialization.Codec codec,java.lang.String leftFieldName,java.lang.String rightFieldName,java.util.function.BiFunction combineFunction,java.util.function.Function leftFunction,java.util.function.Function rightFunction, ) { return net.minecraft.util.dynamic.Codecs.createCodecForPairObject(codec,leftFieldName,rightFieldName,combineFunction,leftFunction,rightFunction); }
// public java.lang.String method_37932(java.lang.Float v) { return wrapperContained.method_37932(v); }
// public static java.lang.String method_37932(java.lang.Float v, ) { return net.minecraft.util.dynamic.Codecs.method_37932(v); }
// public com.mojang.serialization.DataResult method_37935(java.util.function.BiFunction either) { return wrapperContained.method_37935(either); }
// public static com.mojang.serialization.DataResult method_37935(java.util.function.BiFunction either, ) { return net.minecraft.util.dynamic.Codecs.method_37935(either); }
// public com.mojang.serialization.DataResult method_37936(java.util.function.BiFunction pair) { return wrapperContained.method_37936(pair); }
// public static com.mojang.serialization.DataResult method_37936(java.util.function.BiFunction pair, ) { return net.minecraft.util.dynamic.Codecs.method_37936(pair); }
// public com.mojang.serialization.DataResult method_37937(java.util.function.BiFunction object) { return wrapperContained.method_37937(object); }
// public static com.mojang.serialization.DataResult method_37937(java.util.function.BiFunction object, ) { return net.minecraft.util.dynamic.Codecs.method_37937(object); }
// public com.mojang.serialization.DataResult method_37938(java.util.function.BiFunction list) { return wrapperContained.method_37938(list); }
// public static com.mojang.serialization.DataResult method_37938(java.util.function.BiFunction list, ) { return net.minecraft.util.dynamic.Codecs.method_37938(list); }
// public com.mojang.datafixers.util.Either method_37939(java.util.function.Function pair) { return wrapperContained.method_37939(pair); }
// public static com.mojang.datafixers.util.Either method_37939(java.util.function.Function pair, ) { return net.minecraft.util.dynamic.Codecs.method_37939(pair); }
// public com.mojang.serialization.DataResult method_37942(java.util.function.BiFunction listx) { return wrapperContained.method_37942(listx); }
// public static com.mojang.serialization.DataResult method_37942(java.util.function.BiFunction listx, ) { return net.minecraft.util.dynamic.Codecs.method_37942(listx); }
// public com.mojang.datafixers.util.Pair method_37943(java.util.function.Function pair) { return wrapperContained.method_37943(pair); }
// public static com.mojang.datafixers.util.Pair method_37943(java.util.function.Function pair, ) { return net.minecraft.util.dynamic.Codecs.method_37943(pair); }
// public java.util.List method_37944(java.util.function.Function pair) { return wrapperContained.method_37944(pair); }
// public static java.util.List method_37944(java.util.function.Function pair, ) { return net.minecraft.util.dynamic.Codecs.method_37944(pair); }
// public Object orElsePartial(java.lang.Object object) { return wrapperContained.orElsePartial(object); }
// public static Object orElsePartial(java.lang.Object object, ) { return net.minecraft.util.dynamic.Codecs.orElsePartial(object); }
// public com.mojang.serialization.Codec withLifecycle(com.mojang.serialization.Codec originalCodec,java.util.function.Function entryLifecycleGetter,java.util.function.Function lifecycleGetter) { return wrapperContained.withLifecycle(originalCodec,entryLifecycleGetter,lifecycleGetter); }
// public static com.mojang.serialization.Codec withLifecycle(com.mojang.serialization.Codec originalCodec,java.util.function.Function entryLifecycleGetter,java.util.function.Function lifecycleGetter, ) { return net.minecraft.util.dynamic.Codecs.withLifecycle(originalCodec,entryLifecycleGetter,lifecycleGetter); }
// public com.mojang.serialization.DataResult method_39509(java.util.function.IntFunction rawId) { return wrapperContained.method_39509(rawId); }
// public static com.mojang.serialization.DataResult method_39509(java.util.function.IntFunction rawId, ) { return net.minecraft.util.dynamic.Codecs.method_39509(rawId); }
// public com.mojang.serialization.DataResult method_39510(java.util.function.ToIntFunction element) { return wrapperContained.method_39510(element); }
// public static com.mojang.serialization.DataResult method_39510(java.util.function.ToIntFunction element, ) { return net.minecraft.util.dynamic.Codecs.method_39510(element); }
// public com.mojang.serialization.Codec rawIdChecked(java.util.function.ToIntFunction elementToRawId,java.util.function.IntFunction rawIdToElement,int errorRawId) { return wrapperContained.rawIdChecked(elementToRawId,rawIdToElement,errorRawId); }
// public static com.mojang.serialization.Codec rawIdChecked(java.util.function.ToIntFunction elementToRawId,java.util.function.IntFunction rawIdToElement,int errorRawId, ) { return net.minecraft.util.dynamic.Codecs.rawIdChecked(elementToRawId,rawIdToElement,errorRawId); }
// public com.mojang.serialization.Codec orCompressed(com.mojang.serialization.Codec uncompressedCodec,com.mojang.serialization.Codec compressedCodec) { return wrapperContained.orCompressed(uncompressedCodec,compressedCodec); }
// public static com.mojang.serialization.Codec orCompressed(com.mojang.serialization.Codec uncompressedCodec,com.mojang.serialization.Codec compressedCodec, ) { return net.minecraft.util.dynamic.Codecs.orCompressed(uncompressedCodec,compressedCodec); }
// public com.mojang.serialization.MapCodec createContextRetrievalCodec(java.util.function.Function retriever) { return wrapperContained.createContextRetrievalCodec(retriever); }
// public static com.mojang.serialization.MapCodec createContextRetrievalCodec(java.util.function.Function retriever, ) { return net.minecraft.util.dynamic.Codecs.createContextRetrievalCodec(retriever); }
// public com.mojang.serialization.DataResult method_40111(java.util.function.Function collection) { return wrapperContained.method_40111(collection); }
// public static com.mojang.serialization.DataResult method_40111(java.util.function.Function collection, ) { return net.minecraft.util.dynamic.Codecs.method_40111(collection); }
// public com.mojang.serialization.Codec nonEmptyEntryList(com.mojang.serialization.Codec originalCodec) { return wrapperContained.nonEmptyEntryList(originalCodec); }
// public static com.mojang.serialization.Codec nonEmptyEntryList(com.mojang.serialization.Codec originalCodec, ) { return net.minecraft.util.dynamic.Codecs.nonEmptyEntryList(originalCodec); }
// public java.util.function.Function createEqualTypeChecker(java.util.function.Function typeGetter) { return wrapperContained.createEqualTypeChecker(typeGetter); }
// public static java.util.function.Function createEqualTypeChecker(java.util.function.Function typeGetter, ) { return net.minecraft.util.dynamic.Codecs.createEqualTypeChecker(typeGetter); }
// public com.mojang.serialization.DataResult method_41302(java.lang.String pattern) { return wrapperContained.method_41302(pattern); }
// public static com.mojang.serialization.DataResult method_41302(java.lang.String pattern, ) { return net.minecraft.util.dynamic.Codecs.method_41302(pattern); }
// public com.mojang.serialization.Codec exceptionCatching(com.mojang.serialization.Codec codec) { return wrapperContained.exceptionCatching(codec); }
// public static com.mojang.serialization.Codec exceptionCatching(com.mojang.serialization.Codec codec, ) { return net.minecraft.util.dynamic.Codecs.exceptionCatching(codec); }
// public Object method_43958(yarnwrap.util.Identifier id) { return wrapperContained.method_43958(id.wrapperContained); }
// public static Object method_43958(yarnwrap.util.Identifier id, ) { return net.minecraft.util.dynamic.Codecs.method_43958(id.wrapperContained); }
// public com.mojang.serialization.DataResult method_43959(java.lang.String tagEntry) { return wrapperContained.method_43959(tagEntry); }
// public static com.mojang.serialization.DataResult method_43959(java.lang.String tagEntry, ) { return net.minecraft.util.dynamic.Codecs.method_43959(tagEntry); }
// public java.lang.String method_43960(byte data) { return wrapperContained.method_43960(data); }
// public static java.lang.String method_43960(byte data, ) { return net.minecraft.util.dynamic.Codecs.method_43960(data); }
// public Object method_43961(yarnwrap.util.Identifier id) { return wrapperContained.method_43961(id.wrapperContained); }
// public static Object method_43961(yarnwrap.util.Identifier id, ) { return net.minecraft.util.dynamic.Codecs.method_43961(id.wrapperContained); }
// public com.mojang.serialization.DataResult method_43962(java.lang.String encoded) { return wrapperContained.method_43962(encoded); }
// public static com.mojang.serialization.DataResult method_43962(java.lang.String encoded, ) { return net.minecraft.util.dynamic.Codecs.method_43962(encoded); }
// public com.mojang.serialization.MapCodec optionalLong(com.mojang.serialization.MapCodec codec) { return wrapperContained.optionalLong(codec); }
// public static com.mojang.serialization.MapCodec optionalLong(com.mojang.serialization.MapCodec codec, ) { return net.minecraft.util.dynamic.Codecs.optionalLong(codec); }
// public java.util.OptionalLong method_44168(java.util.Optional optional) { return wrapperContained.method_44168(optional); }
// public static java.util.OptionalLong method_44168(java.util.Optional optional, ) { return net.minecraft.util.dynamic.Codecs.method_44168(optional); }
// public java.util.Optional method_44169(java.util.OptionalLong optionalLong) { return wrapperContained.method_44169(optionalLong); }
// public static java.util.Optional method_44169(java.util.OptionalLong optionalLong, ) { return net.minecraft.util.dynamic.Codecs.method_44169(optionalLong); }
// public com.mojang.authlib.GameProfile method_46370(com.mojang.authlib.GameProfile profile,com.mojang.authlib.properties.PropertyMap properties) { return wrapperContained.method_46370(profile,properties); }
// public static com.mojang.authlib.GameProfile method_46370(com.mojang.authlib.GameProfile profile,com.mojang.authlib.properties.PropertyMap properties, ) { return net.minecraft.util.dynamic.Codecs.method_46370(profile,properties); }
// public void method_46371(com.mojang.authlib.GameProfile key,java.lang.String property) { wrapperContained.method_46371(key,property); }
// public static void method_46371(com.mojang.authlib.GameProfile key,java.lang.String property, ) { net.minecraft.util.dynamic.Codecs.method_46371(key,property); }
// public java.util.Optional method_46372(com.mojang.authlib.properties.Property property) { return wrapperContained.method_46372(property); }
// public static java.util.Optional method_46372(com.mojang.authlib.properties.Property property, ) { return net.minecraft.util.dynamic.Codecs.method_46372(property); }
// public com.mojang.datafixers.util.Either method_46373(com.mojang.authlib.properties.PropertyMap properties) { return wrapperContained.method_46373(properties); }
// public static com.mojang.datafixers.util.Either method_46373(com.mojang.authlib.properties.PropertyMap properties, ) { return net.minecraft.util.dynamic.Codecs.method_46373(properties); }
// public void method_46374(com.mojang.authlib.properties.PropertyMap key,java.lang.String values) { wrapperContained.method_46374(key,values); }
// public static void method_46374(com.mojang.authlib.properties.PropertyMap key,java.lang.String values, ) { net.minecraft.util.dynamic.Codecs.method_46374(key,values); }
// public void method_46375(com.mojang.authlib.properties.PropertyMap properties) { wrapperContained.method_46375(properties); }
// public static void method_46375(com.mojang.authlib.properties.PropertyMap properties, ) { net.minecraft.util.dynamic.Codecs.method_46375(properties); }
// public void method_46376(com.mojang.authlib.properties.PropertyMap map) { wrapperContained.method_46376(map); }
// public static void method_46376(com.mojang.authlib.properties.PropertyMap map, ) { net.minecraft.util.dynamic.Codecs.method_46376(map); }
// public com.mojang.authlib.properties.PropertyMap method_46377(com.mojang.datafixers.util.Either either) { return wrapperContained.method_46377(either); }
// public static com.mojang.authlib.properties.PropertyMap method_46377(com.mojang.datafixers.util.Either either, ) { return net.minecraft.util.dynamic.Codecs.method_46377(either); }
// public com.mojang.authlib.properties.Property method_46381(java.lang.String key,java.lang.String value,java.util.Optional signature) { return wrapperContained.method_46381(key,value,signature); }
// public static com.mojang.authlib.properties.Property method_46381(java.lang.String key,java.lang.String value,java.util.Optional signature, ) { return net.minecraft.util.dynamic.Codecs.method_46381(key,value,signature); }
// public java.util.stream.LongStream method_46382(java.util.BitSet set) { return wrapperContained.method_46382(set); }
// public static java.util.stream.LongStream method_46382(java.util.BitSet set, ) { return net.minecraft.util.dynamic.Codecs.method_46382(set); }
// public java.util.BitSet method_46384(java.util.stream.LongStream stream) { return wrapperContained.method_46384(stream); }
// public static java.util.BitSet method_46384(java.util.stream.LongStream stream, ) { return net.minecraft.util.dynamic.Codecs.method_46384(stream); }
// public java.util.List method_46385(org.joml.Vector3f vec3f) { return wrapperContained.method_46385(vec3f); }
// public static java.util.List method_46385(org.joml.Vector3f vec3f, ) { return net.minecraft.util.dynamic.Codecs.method_46385(vec3f); }
// public com.mojang.datafixers.kinds.App method_46388(Object instance) { return wrapperContained.method_46388(instance); }
// public static com.mojang.datafixers.kinds.App method_46388(Object instance, ) { return net.minecraft.util.dynamic.Codecs.method_46388(instance); }
// public com.mojang.serialization.DataResult method_46389(java.util.List list) { return wrapperContained.method_46389(list); }
// public static com.mojang.serialization.DataResult method_46389(java.util.List list, ) { return net.minecraft.util.dynamic.Codecs.method_46389(list); }
// public org.joml.Vector3f method_46391(java.util.List listx) { return wrapperContained.method_46391(listx); }
// public static org.joml.Vector3f method_46391(java.util.List listx, ) { return net.minecraft.util.dynamic.Codecs.method_46391(listx); }
// public com.mojang.serialization.DataResult method_48108(float value) { return wrapperContained.method_48108(value); }
// public static com.mojang.serialization.DataResult method_48108(float value, ) { return net.minecraft.util.dynamic.Codecs.method_48108(value); }
// public com.mojang.serialization.DataResult method_48111(int value) { return wrapperContained.method_48111(value); }
// public static com.mojang.serialization.DataResult method_48111(int value, ) { return net.minecraft.util.dynamic.Codecs.method_48111(value); }
// public com.mojang.serialization.DataResult method_48113(yarnwrap.registry.entry.RegistryEntryList entryList) { return wrapperContained.method_48113(entryList.wrapperContained); }
// public static com.mojang.serialization.DataResult method_48113(yarnwrap.registry.entry.RegistryEntryList entryList, ) { return net.minecraft.util.dynamic.Codecs.method_48113(entryList.wrapperContained); }
// public com.mojang.serialization.DataResult method_48114(java.lang.String string) { return wrapperContained.method_48114(string); }
// public static com.mojang.serialization.DataResult method_48114(java.lang.String string, ) { return net.minecraft.util.dynamic.Codecs.method_48114(string); }
// public com.mojang.serialization.DataResult method_48115(java.util.List list) { return wrapperContained.method_48115(list); }
// public static com.mojang.serialization.DataResult method_48115(java.util.List list, ) { return net.minecraft.util.dynamic.Codecs.method_48115(list); }
// public com.mojang.serialization.Codec rangedInt(int min,int max) { return wrapperContained.rangedInt(min,max); }
// public static com.mojang.serialization.Codec rangedInt(int min,int max, ) { return net.minecraft.util.dynamic.Codecs.rangedInt(min,max); }
// public java.lang.String method_48767(int value) { return wrapperContained.method_48767(value); }
// public static java.lang.String method_48767(int value, ) { return net.minecraft.util.dynamic.Codecs.method_48767(value); }
// public org.joml.Vector3f method_48768(org.joml.AxisAngle4f axisAngle) { return wrapperContained.method_48768(axisAngle); }
// public static org.joml.Vector3f method_48768(org.joml.AxisAngle4f axisAngle, ) { return net.minecraft.util.dynamic.Codecs.method_48768(axisAngle); }
// public java.util.List method_48769(org.joml.Matrix4f matrix4f) { return wrapperContained.method_48769(matrix4f); }
// public static java.util.List method_48769(org.joml.Matrix4f matrix4f, ) { return net.minecraft.util.dynamic.Codecs.method_48769(matrix4f); }
// public com.mojang.serialization.DataResult method_48771(java.util.List list) { return wrapperContained.method_48771(list); }
// public static com.mojang.serialization.DataResult method_48771(java.util.List list, ) { return net.minecraft.util.dynamic.Codecs.method_48771(list); }
// public java.lang.Float method_48772(org.joml.AxisAngle4f axisAngle) { return wrapperContained.method_48772(axisAngle); }
// public static java.lang.Float method_48772(org.joml.AxisAngle4f axisAngle, ) { return net.minecraft.util.dynamic.Codecs.method_48772(axisAngle); }
// public com.mojang.datafixers.kinds.App method_48775(Object instance) { return wrapperContained.method_48775(instance); }
// public static com.mojang.datafixers.kinds.App method_48775(Object instance, ) { return net.minecraft.util.dynamic.Codecs.method_48775(instance); }
// public org.joml.Matrix4f method_48776(java.util.List listx) { return wrapperContained.method_48776(listx); }
// public static org.joml.Matrix4f method_48776(java.util.List listx, ) { return net.minecraft.util.dynamic.Codecs.method_48776(listx); }
// public java.util.List method_48777(org.joml.Quaternionf quaternion) { return wrapperContained.method_48777(quaternion); }
// public static java.util.List method_48777(org.joml.Quaternionf quaternion, ) { return net.minecraft.util.dynamic.Codecs.method_48777(quaternion); }
// public com.mojang.serialization.DataResult method_48778(java.util.List list) { return wrapperContained.method_48778(list); }
// public static com.mojang.serialization.DataResult method_48778(java.util.List list, ) { return net.minecraft.util.dynamic.Codecs.method_48778(list); }
// public org.joml.Vector4f method_48779(java.util.List listx) { return wrapperContained.method_48779(listx); }
// public static org.joml.Vector4f method_48779(java.util.List listx, ) { return net.minecraft.util.dynamic.Codecs.method_48779(listx); }
// public com.mojang.serialization.DataResult method_51494(java.lang.String string) { return wrapperContained.method_51494(string); }
// public static com.mojang.serialization.DataResult method_51494(java.lang.String string, ) { return net.minecraft.util.dynamic.Codecs.method_51494(string); }
// public com.mojang.datafixers.kinds.App method_52459(Object instance) { return wrapperContained.method_52459(instance); }
// public static com.mojang.datafixers.kinds.App method_52459(Object instance, ) { return net.minecraft.util.dynamic.Codecs.method_52459(instance); }
// public com.mojang.serialization.DataResult method_52460(java.lang.String path) { return wrapperContained.method_52460(path); }
// public static com.mojang.serialization.DataResult method_52460(java.lang.String path, ) { return net.minecraft.util.dynamic.Codecs.method_52460(path); }
// public com.mojang.datafixers.kinds.App method_52462(Object instance) { return wrapperContained.method_52462(instance); }
// public static com.mojang.datafixers.kinds.App method_52462(Object instance, ) { return net.minecraft.util.dynamic.Codecs.method_52462(instance); }
// public com.mojang.serialization.Codec object2BooleanMap(com.mojang.serialization.Codec keyCodec) { return wrapperContained.object2BooleanMap(keyCodec); }
// public static com.mojang.serialization.Codec object2BooleanMap(com.mojang.serialization.Codec keyCodec, ) { return net.minecraft.util.dynamic.Codecs.object2BooleanMap(keyCodec); }
// public com.mojang.serialization.Codec formattedTime(java.time.format.DateTimeFormatter formatter) { return wrapperContained.formattedTime(formatter); }
// public static com.mojang.serialization.Codec formattedTime(java.time.format.DateTimeFormatter formatter, ) { return net.minecraft.util.dynamic.Codecs.formattedTime(formatter); }
// public com.mojang.serialization.DataResult method_53701(java.time.format.DateTimeFormatter string) { return wrapperContained.method_53701(string); }
// public static com.mojang.serialization.DataResult method_53701(java.time.format.DateTimeFormatter string, ) { return net.minecraft.util.dynamic.Codecs.method_53701(string); }
// public Object strictUnboundedMap(com.mojang.serialization.Codec keyCodec,com.mojang.serialization.Codec elementCodec) { return wrapperContained.strictUnboundedMap(keyCodec,elementCodec); }
// public static Object strictUnboundedMap(com.mojang.serialization.Codec keyCodec,com.mojang.serialization.Codec elementCodec, ) { return net.minecraft.util.dynamic.Codecs.strictUnboundedMap(keyCodec,elementCodec); }
// public com.mojang.serialization.DataResult method_53826(java.lang.String string) { return wrapperContained.method_53826(string); }
// public static com.mojang.serialization.DataResult method_53826(java.lang.String string, ) { return net.minecraft.util.dynamic.Codecs.method_53826(string); }
// public com.mojang.serialization.Codec fromOps(com.mojang.serialization.DynamicOps ops) { return wrapperContained.fromOps(ops); }
// public static com.mojang.serialization.Codec fromOps(com.mojang.serialization.DynamicOps ops, ) { return net.minecraft.util.dynamic.Codecs.fromOps(ops); }
// public java.lang.Object method_53919(com.mojang.serialization.DynamicOps dynamic) { return wrapperContained.method_53919(dynamic); }
// public static java.lang.Object method_53919(com.mojang.serialization.DynamicOps dynamic, ) { return net.minecraft.util.dynamic.Codecs.method_53919(dynamic); }
// public com.mojang.serialization.Dynamic method_53920(com.mojang.serialization.DynamicOps object) { return wrapperContained.method_53920(object); }
// public static com.mojang.serialization.Dynamic method_53920(com.mojang.serialization.DynamicOps object, ) { return net.minecraft.util.dynamic.Codecs.method_53920(object); }
// public com.mojang.serialization.MapCodec orCompressed(com.mojang.serialization.MapCodec uncompressedCodec,com.mojang.serialization.MapCodec compressedCodec) { return wrapperContained.orCompressed(uncompressedCodec,compressedCodec); }
// public static com.mojang.serialization.MapCodec orCompressed(com.mojang.serialization.MapCodec uncompressedCodec,com.mojang.serialization.MapCodec compressedCodec, ) { return net.minecraft.util.dynamic.Codecs.orCompressed(uncompressedCodec,compressedCodec); }
// public com.mojang.serialization.MapCodec parameters(java.lang.String typeKey,java.lang.String parametersKey,com.mojang.serialization.Codec typeCodec,java.util.function.Function typeGetter,java.util.function.Function parametersCodecGetter) { return wrapperContained.parameters(typeKey,parametersKey,typeCodec,typeGetter,parametersCodecGetter); }
// public static com.mojang.serialization.MapCodec parameters(java.lang.String typeKey,java.lang.String parametersKey,com.mojang.serialization.Codec typeCodec,java.util.function.Function typeGetter,java.util.function.Function parametersCodecGetter, ) { return net.minecraft.util.dynamic.Codecs.parameters(typeKey,parametersKey,typeCodec,typeGetter,parametersCodecGetter); }
// public com.mojang.serialization.DataResult method_56907(java.lang.Integer value) { return wrapperContained.method_56907(value); }
// public static com.mojang.serialization.DataResult method_56907(java.lang.Integer value, ) { return net.minecraft.util.dynamic.Codecs.method_56907(value); }
// public com.mojang.serialization.Codec withLifecycle(com.mojang.serialization.Codec originalCodec,java.util.function.Function lifecycleGetter) { return wrapperContained.withLifecycle(originalCodec,lifecycleGetter); }
// public static com.mojang.serialization.Codec withLifecycle(com.mojang.serialization.Codec originalCodec,java.util.function.Function lifecycleGetter, ) { return net.minecraft.util.dynamic.Codecs.withLifecycle(originalCodec,lifecycleGetter); }
// public com.mojang.serialization.DataResult method_57149(int map) { return wrapperContained.method_57149(map); }
// public static com.mojang.serialization.DataResult method_57149(int map, ) { return net.minecraft.util.dynamic.Codecs.method_57149(map); }
// public com.mojang.serialization.Codec map(com.mojang.serialization.Codec codec,int maxLength) { return wrapperContained.map(codec,maxLength); }
// public static com.mojang.serialization.Codec map(com.mojang.serialization.Codec codec,int maxLength, ) { return net.minecraft.util.dynamic.Codecs.map(codec,maxLength); }
// public com.mojang.serialization.Codec optional(com.mojang.serialization.Codec codec) { return wrapperContained.optional(codec); }
// public static com.mojang.serialization.Codec optional(com.mojang.serialization.Codec codec, ) { return net.minecraft.util.dynamic.Codecs.optional(codec); }
// public com.mojang.serialization.DataResult method_57156(java.lang.String name) { return wrapperContained.method_57156(name); }
// public static com.mojang.serialization.DataResult method_57156(java.lang.String name, ) { return net.minecraft.util.dynamic.Codecs.method_57156(name); }
// public java.lang.Integer method_59549(org.joml.Vector4f vec4f) { return wrapperContained.method_59549(vec4f); }
// public static java.lang.Integer method_59549(org.joml.Vector4f vec4f, ) { return net.minecraft.util.dynamic.Codecs.method_59549(vec4f); }
// public java.util.List method_59550(org.joml.Vector4f vec4f) { return wrapperContained.method_59550(vec4f); }
// public static java.util.List method_59550(org.joml.Vector4f vec4f, ) { return net.minecraft.util.dynamic.Codecs.method_59550(vec4f); }

}