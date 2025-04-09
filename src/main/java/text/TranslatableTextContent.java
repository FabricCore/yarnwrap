package yarnwrap.text;
public class TranslatableTextContent { public net.minecraft.text.TranslatableTextContent wrapperContained; public TranslatableTextContent(net.minecraft.text.TranslatableTextContent wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.regex.Pattern ARG_FORMAT() { return wrapperContained.ARG_FORMAT; }
// public java.lang.Object[] args() { return wrapperContained.args; }
// public java.lang.String key() { return wrapperContained.key; }
// public java.util.List translations() { return wrapperContained.translations; }
public java.lang.Object[] EMPTY_ARGUMENTS() { return wrapperContained.EMPTY_ARGUMENTS; }
// public yarnwrap.text.StringVisitable LITERAL_PERCENT_SIGN() { return new yarnwrap.text.StringVisitable(wrapperContained.LITERAL_PERCENT_SIGN); }
// public yarnwrap.text.StringVisitable NULL_ARGUMENT() { return new yarnwrap.text.StringVisitable(wrapperContained.NULL_ARGUMENT); }
// public yarnwrap.util.Language languageCache() { return new yarnwrap.util.Language(wrapperContained.languageCache); }
// public java.lang.String fallback() { return wrapperContained.fallback; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
public Object TYPE() { return wrapperContained.TYPE; }
// public com.mojang.serialization.Codec OBJECT_ARGUMENT_CODEC() { return wrapperContained.OBJECT_ARGUMENT_CODEC; }
// public com.mojang.serialization.Codec ARGUMENT_CODEC() { return wrapperContained.ARGUMENT_CODEC; }
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