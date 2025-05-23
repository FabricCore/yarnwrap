package yarnwrap.datafixer.schema;
public class IdentifierNormalizingSchema { public net.minecraft.datafixer.schema.IdentifierNormalizingSchema wrapperContained; public IdentifierNormalizingSchema(net.minecraft.datafixer.schema.IdentifierNormalizingSchema wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.codecs.PrimitiveCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.codecs.PrimitiveCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.codecs.PrimitiveCodec CODEC() { return net.minecraft.datafixer.schema.IdentifierNormalizingSchema.CODEC; }
// public static void CODEC(com.mojang.serialization.codecs.PrimitiveCodec value, ) { net.minecraft.datafixer.schema.IdentifierNormalizingSchema.CODEC = value; }

// public com.mojang.datafixers.types.Type IDENTIFIER_TYPE() { return wrapperContained.IDENTIFIER_TYPE; }
// public void IDENTIFIER_TYPE(com.mojang.datafixers.types.Type value) { wrapperContained.IDENTIFIER_TYPE = value; }
// public static com.mojang.datafixers.types.Type IDENTIFIER_TYPE() { return net.minecraft.datafixer.schema.IdentifierNormalizingSchema.IDENTIFIER_TYPE; }
// public static void IDENTIFIER_TYPE(com.mojang.datafixers.types.Type value, ) { net.minecraft.datafixer.schema.IdentifierNormalizingSchema.IDENTIFIER_TYPE = value; }

public IdentifierNormalizingSchema(int versionKey,com.mojang.datafixers.schemas.Schema parent) { this.wrapperContained = new net.minecraft.datafixer.schema.IdentifierNormalizingSchema(versionKey,parent); }
// public com.mojang.datafixers.types.Type getChoiceType(Object type,java.lang.String choiceName) { return wrapperContained.getChoiceType(type,choiceName); }
// public static com.mojang.datafixers.types.Type getChoiceType(Object type,java.lang.String choiceName, ) { return net.minecraft.datafixer.schema.IdentifierNormalizingSchema.getChoiceType(type,choiceName); }
// public java.lang.String normalize(java.lang.String id) { return wrapperContained.normalize(id); }
// public static java.lang.String normalize(java.lang.String id, ) { return net.minecraft.datafixer.schema.IdentifierNormalizingSchema.normalize(id); }
// public com.mojang.datafixers.types.Type getIdentifierType() { return wrapperContained.getIdentifierType(); }
public static com.mojang.datafixers.types.Type getIdentifierType() { return net.minecraft.datafixer.schema.IdentifierNormalizingSchema.getIdentifierType(); }

}