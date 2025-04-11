package yarnwrap.text;
public class TranslatableTextContent { public net.minecraft.text.TranslatableTextContent wrapperContained; public TranslatableTextContent(net.minecraft.text.TranslatableTextContent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.regex.Pattern ARG_FORMAT() { return wrapperContained.ARG_FORMAT; }
// public void ARG_FORMAT(java.util.regex.Pattern value) { wrapperContained.ARG_FORMAT = value; }
// public java.lang.Object[] args() { return wrapperContained.args; }
// public void args(java.lang.Object[] value) { wrapperContained.args = value; }
// public java.lang.String key() { return wrapperContained.key; }
// public void key(java.lang.String value) { wrapperContained.key = value; }
// public java.util.List translations() { return wrapperContained.translations; }
// public void translations(java.util.List value) { wrapperContained.translations = value; }
public java.lang.Object[] EMPTY_ARGUMENTS() { return wrapperContained.EMPTY_ARGUMENTS; }
// public void EMPTY_ARGUMENTS(java.lang.Object[] value) { wrapperContained.EMPTY_ARGUMENTS = value; }
// public yarnwrap.text.StringVisitable LITERAL_PERCENT_SIGN() { return new yarnwrap.text.StringVisitable(wrapperContained.LITERAL_PERCENT_SIGN); }
// public void LITERAL_PERCENT_SIGN(yarnwrap.text.StringVisitable value) { wrapperContained.LITERAL_PERCENT_SIGN = value.wrapperContained; }
// public yarnwrap.text.StringVisitable NULL_ARGUMENT() { return new yarnwrap.text.StringVisitable(wrapperContained.NULL_ARGUMENT); }
// public void NULL_ARGUMENT(yarnwrap.text.StringVisitable value) { wrapperContained.NULL_ARGUMENT = value.wrapperContained; }
// public yarnwrap.util.Language languageCache() { return new yarnwrap.util.Language(wrapperContained.languageCache); }
// public void languageCache(yarnwrap.util.Language value) { wrapperContained.languageCache = value.wrapperContained; }
// public java.lang.String fallback() { return wrapperContained.fallback; }
// public void fallback(java.lang.String value) { wrapperContained.fallback = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public Object TYPE() { return wrapperContained.TYPE; }
// // public void TYPE(Object value) { wrapperContained.TYPE = value; }
// public com.mojang.serialization.Codec OBJECT_ARGUMENT_CODEC() { return wrapperContained.OBJECT_ARGUMENT_CODEC; }
// public void OBJECT_ARGUMENT_CODEC(com.mojang.serialization.Codec value) { wrapperContained.OBJECT_ARGUMENT_CODEC = value; }
// public com.mojang.serialization.Codec ARGUMENT_CODEC() { return wrapperContained.ARGUMENT_CODEC; }
// public void ARGUMENT_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ARGUMENT_CODEC = value; }
public java.lang.String getKey() { return wrapperContained.getKey(); }
public java.lang.Object[] getArgs() { return wrapperContained.getArgs(); }
// public void forEachPart(java.lang.String translation,java.util.function.Consumer partsConsumer) { wrapperContained.forEachPart(translation,partsConsumer); }
// public void updateTranslations() { wrapperContained.updateTranslations(); }
// public yarnwrap.text.StringVisitable getArg(int index) { return new yarnwrap.text.StringVisitable(wrapperContained.getArg(index)); }
public java.lang.String getFallback() { return wrapperContained.getFallback(); }
public boolean isPrimitive(java.lang.Object argument) { return wrapperContained.isPrimitive(argument); }
// public yarnwrap.text.TranslatableTextContent of(java.lang.String key,java.util.Optional fallback,java.util.Optional args) { return new yarnwrap.text.TranslatableTextContent(wrapperContained.of(key,fallback,args)); }
// public java.lang.Object[] toArray(java.util.Optional args) { return wrapperContained.toArray(args); }
// public java.util.Optional toOptionalList(java.lang.Object[] args) { return wrapperContained.toOptionalList(args); }
// public com.mojang.serialization.DataResult validate(java.lang.Object object) { return wrapperContained.validate(object); }

}