package yarnwrap.datafixer.schema;
public class IdentifierNormalizingSchema { public net.minecraft.datafixer.schema.IdentifierNormalizingSchema wrapperContained; public IdentifierNormalizingSchema(net.minecraft.datafixer.schema.IdentifierNormalizingSchema wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.codecs.PrimitiveCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.codecs.PrimitiveCodec value) { wrapperContained.CODEC = value; }
// public com.mojang.datafixers.types.Type IDENTIFIER_TYPE() { return wrapperContained.IDENTIFIER_TYPE; }
// public void IDENTIFIER_TYPE(com.mojang.datafixers.types.Type value) { wrapperContained.IDENTIFIER_TYPE = value; }
public com.mojang.datafixers.types.Type getIdentifierType() { return wrapperContained.getIdentifierType(); }
public java.lang.String normalize(java.lang.String id) { return wrapperContained.normalize(id); }

}