package yarnwrap.util;
public class Identifier { public net.minecraft.util.Identifier wrapperContained; public Identifier(net.minecraft.util.Identifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String namespace() { return wrapperContained.namespace; }
public com.mojang.brigadier.exceptions.SimpleCommandExceptionType COMMAND_EXCEPTION() { return wrapperContained.COMMAND_EXCEPTION; }
// public java.lang.String path() { return wrapperContained.path; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public char NAMESPACE_SEPARATOR() { return wrapperContained.NAMESPACE_SEPARATOR; }
public java.lang.String DEFAULT_NAMESPACE() { return wrapperContained.DEFAULT_NAMESPACE; }
public java.lang.String REALMS_NAMESPACE() { return wrapperContained.REALMS_NAMESPACE; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public yarnwrap.util.Identifier tryParse(java.lang.String id) { return new yarnwrap.util.Identifier(wrapperContained.tryParse(id)); }
public boolean isCharValid(char c) { return wrapperContained.isCharValid(c); }
public java.lang.String getPath() { return wrapperContained.getPath(); }
// public yarnwrap.util.Identifier fromCommandInput(com.mojang.brigadier.StringReader reader) { return new yarnwrap.util.Identifier(wrapperContained.fromCommandInput(reader)); }
public java.lang.String getNamespace() { return wrapperContained.getNamespace(); }
public yarnwrap.util.Identifier splitOn(java.lang.String id,char delimiter) { return new yarnwrap.util.Identifier(wrapperContained.splitOn(id,delimiter)); }
public boolean isPathValid(java.lang.String path) { return wrapperContained.isPathValid(path); }
public boolean isNamespaceValid(java.lang.String namespace) { return wrapperContained.isNamespaceValid(namespace); }
public boolean isPathCharacterValid(char character) { return wrapperContained.isPathCharacterValid(character); }
// public boolean isNamespaceCharacterValid(char character) { return wrapperContained.isNamespaceCharacterValid(character); }
public com.mojang.serialization.DataResult validate(java.lang.String id) { return wrapperContained.validate(id); }
public java.lang.String toUnderscoreSeparatedString() { return wrapperContained.toUnderscoreSeparatedString(); }
public java.lang.String toTranslationKey(java.lang.String prefix) { return wrapperContained.toTranslationKey(prefix); }
public java.lang.String toTranslationKey() { return wrapperContained.toTranslationKey(); }
public yarnwrap.util.Identifier tryParse(java.lang.String namespace,java.lang.String path) { return new yarnwrap.util.Identifier(wrapperContained.tryParse(namespace,path)); }
public java.lang.String toShortTranslationKey() { return wrapperContained.toShortTranslationKey(); }
public yarnwrap.util.Identifier withPath(java.util.function.UnaryOperator pathFunction) { return new yarnwrap.util.Identifier(wrapperContained.withPath(pathFunction)); }
// public java.lang.String validateNamespace(java.lang.String namespace,java.lang.String path) { return wrapperContained.validateNamespace(namespace,path); }
public yarnwrap.util.Identifier withPath(java.lang.String path) { return new yarnwrap.util.Identifier(wrapperContained.withPath(path)); }
// public java.lang.String validatePath(java.lang.String namespace,java.lang.String path) { return wrapperContained.validatePath(namespace,path); }
public yarnwrap.util.Identifier withPrefixedPath(java.lang.String prefix) { return new yarnwrap.util.Identifier(wrapperContained.withPrefixedPath(prefix)); }
public yarnwrap.util.Identifier withSuffixedPath(java.lang.String suffix) { return new yarnwrap.util.Identifier(wrapperContained.withSuffixedPath(suffix)); }
public java.lang.String toTranslationKey(java.lang.String prefix,java.lang.String suffix) { return wrapperContained.toTranslationKey(prefix,suffix); }
// public yarnwrap.util.Identifier fromCommandInputNonEmpty(com.mojang.brigadier.StringReader reader) { return new yarnwrap.util.Identifier(wrapperContained.fromCommandInputNonEmpty(reader)); }
// public java.lang.String readString(com.mojang.brigadier.StringReader reader) { return wrapperContained.readString(reader); }
public yarnwrap.util.Identifier of(java.lang.String id) { return new yarnwrap.util.Identifier(wrapperContained.of(id)); }
public yarnwrap.util.Identifier of(java.lang.String namespace,java.lang.String path) { return new yarnwrap.util.Identifier(wrapperContained.of(namespace,path)); }
public yarnwrap.util.Identifier ofVanilla(java.lang.String path) { return new yarnwrap.util.Identifier(wrapperContained.ofVanilla(path)); }
public yarnwrap.util.Identifier trySplitOn(java.lang.String id,char delimiter) { return new yarnwrap.util.Identifier(wrapperContained.trySplitOn(id,delimiter)); }
// public yarnwrap.util.Identifier ofValidated(java.lang.String namespace,java.lang.String path) { return new yarnwrap.util.Identifier(wrapperContained.ofValidated(namespace,path)); }

}