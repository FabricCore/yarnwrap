package yarnwrap.util;
public class Identifier { public net.minecraft.util.Identifier wrapperContained; public Identifier(net.minecraft.util.Identifier wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String namespace() { return wrapperContained.namespace; }
// public void namespace(java.lang.String value) { wrapperContained.namespace = value; }
// public static java.lang.String namespace() { return net.minecraft.util.Identifier.namespace; }
// public static void namespace(java.lang.String value, ) { net.minecraft.util.Identifier.namespace = value; }

// public com.mojang.brigadier.exceptions.SimpleCommandExceptionType COMMAND_EXCEPTION() { return wrapperContained.COMMAND_EXCEPTION; }
// public void COMMAND_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value) { wrapperContained.COMMAND_EXCEPTION = value; }
public static com.mojang.brigadier.exceptions.SimpleCommandExceptionType COMMAND_EXCEPTION() { return net.minecraft.util.Identifier.COMMAND_EXCEPTION; }
// public static void COMMAND_EXCEPTION(com.mojang.brigadier.exceptions.SimpleCommandExceptionType value, ) { net.minecraft.util.Identifier.COMMAND_EXCEPTION = value; }

// public java.lang.String path() { return wrapperContained.path; }
// public void path(java.lang.String value) { wrapperContained.path = value; }
// public static java.lang.String path() { return net.minecraft.util.Identifier.path; }
// public static void path(java.lang.String value, ) { net.minecraft.util.Identifier.path = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.Identifier.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.Identifier.CODEC = value; }

// public char NAMESPACE_SEPARATOR() { return wrapperContained.NAMESPACE_SEPARATOR; }
// public void NAMESPACE_SEPARATOR(char value) { wrapperContained.NAMESPACE_SEPARATOR = value; }
public static char NAMESPACE_SEPARATOR() { return net.minecraft.util.Identifier.NAMESPACE_SEPARATOR; }
// public static void NAMESPACE_SEPARATOR(char value, ) { net.minecraft.util.Identifier.NAMESPACE_SEPARATOR = value; }

// public java.lang.String DEFAULT_NAMESPACE() { return wrapperContained.DEFAULT_NAMESPACE; }
// public void DEFAULT_NAMESPACE(java.lang.String value) { wrapperContained.DEFAULT_NAMESPACE = value; }
public static java.lang.String DEFAULT_NAMESPACE() { return net.minecraft.util.Identifier.DEFAULT_NAMESPACE; }
// public static void DEFAULT_NAMESPACE(java.lang.String value, ) { net.minecraft.util.Identifier.DEFAULT_NAMESPACE = value; }

// public java.lang.String REALMS_NAMESPACE() { return wrapperContained.REALMS_NAMESPACE; }
// public void REALMS_NAMESPACE(java.lang.String value) { wrapperContained.REALMS_NAMESPACE = value; }
public static java.lang.String REALMS_NAMESPACE() { return net.minecraft.util.Identifier.REALMS_NAMESPACE; }
// public static void REALMS_NAMESPACE(java.lang.String value, ) { net.minecraft.util.Identifier.REALMS_NAMESPACE = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.util.Identifier.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.util.Identifier.PACKET_CODEC = value.wrapperContained; }

// public Identifier(java.lang.String namespace,java.lang.String path) { this.wrapperContained = new net.minecraft.util.Identifier(namespace,path); }
// public int compareTo(java.lang.Object other) { return wrapperContained.compareTo(other); }
// public static int compareTo(java.lang.Object other, ) { return net.minecraft.util.Identifier.compareTo(other); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.util.Identifier.equals(o); }
// public yarnwrap.util.Identifier tryParse(java.lang.String id) { return new yarnwrap.util.Identifier(wrapperContained.tryParse(id)); }
// public static yarnwrap.util.Identifier tryParse(java.lang.String id, ) { return new yarnwrap.util.Identifier(net.minecraft.util.Identifier.tryParse(id)); }
// public boolean isCharValid(char c) { return wrapperContained.isCharValid(c); }
// public static boolean isCharValid(char c, ) { return net.minecraft.util.Identifier.isCharValid(c); }
public java.lang.String getPath() { return wrapperContained.getPath(); }
// public static java.lang.String getPath() { return net.minecraft.util.Identifier.getPath(); }
// public yarnwrap.util.Identifier fromCommandInput(com.mojang.brigadier.StringReader reader) { return new yarnwrap.util.Identifier(wrapperContained.fromCommandInput(reader)); }
// public static yarnwrap.util.Identifier fromCommandInput(com.mojang.brigadier.StringReader reader, ) { return new yarnwrap.util.Identifier(net.minecraft.util.Identifier.fromCommandInput(reader)); }
public java.lang.String getNamespace() { return wrapperContained.getNamespace(); }
// public static java.lang.String getNamespace() { return net.minecraft.util.Identifier.getNamespace(); }
// public yarnwrap.util.Identifier splitOn(java.lang.String id,char delimiter) { return new yarnwrap.util.Identifier(wrapperContained.splitOn(id,delimiter)); }
// public static yarnwrap.util.Identifier splitOn(java.lang.String id,char delimiter, ) { return new yarnwrap.util.Identifier(net.minecraft.util.Identifier.splitOn(id,delimiter)); }
// public boolean isPathValid(java.lang.String path) { return wrapperContained.isPathValid(path); }
// public static boolean isPathValid(java.lang.String path, ) { return net.minecraft.util.Identifier.isPathValid(path); }
// public boolean isNamespaceValid(java.lang.String namespace) { return wrapperContained.isNamespaceValid(namespace); }
// public static boolean isNamespaceValid(java.lang.String namespace, ) { return net.minecraft.util.Identifier.isNamespaceValid(namespace); }
// public boolean isPathCharacterValid(char character) { return wrapperContained.isPathCharacterValid(character); }
// public static boolean isPathCharacterValid(char character, ) { return net.minecraft.util.Identifier.isPathCharacterValid(character); }
// public boolean isNamespaceCharacterValid(char character) { return wrapperContained.isNamespaceCharacterValid(character); }
// public static boolean isNamespaceCharacterValid(char character, ) { return net.minecraft.util.Identifier.isNamespaceCharacterValid(character); }
// public com.mojang.serialization.DataResult validate(java.lang.String id) { return wrapperContained.validate(id); }
// public static com.mojang.serialization.DataResult validate(java.lang.String id, ) { return net.minecraft.util.Identifier.validate(id); }
public java.lang.String toUnderscoreSeparatedString() { return wrapperContained.toUnderscoreSeparatedString(); }
// public static java.lang.String toUnderscoreSeparatedString() { return net.minecraft.util.Identifier.toUnderscoreSeparatedString(); }
public java.lang.String toTranslationKey(java.lang.String prefix) { return wrapperContained.toTranslationKey(prefix); }
// public static java.lang.String toTranslationKey(java.lang.String prefix, ) { return net.minecraft.util.Identifier.toTranslationKey(prefix); }
public java.lang.String toTranslationKey() { return wrapperContained.toTranslationKey(); }
// public static java.lang.String toTranslationKey() { return net.minecraft.util.Identifier.toTranslationKey(); }
// public yarnwrap.util.Identifier tryParse(java.lang.String namespace,java.lang.String path) { return new yarnwrap.util.Identifier(wrapperContained.tryParse(namespace,path)); }
// public static yarnwrap.util.Identifier tryParse(java.lang.String namespace,java.lang.String path, ) { return new yarnwrap.util.Identifier(net.minecraft.util.Identifier.tryParse(namespace,path)); }
public java.lang.String toShortTranslationKey() { return wrapperContained.toShortTranslationKey(); }
// public static java.lang.String toShortTranslationKey() { return net.minecraft.util.Identifier.toShortTranslationKey(); }
public yarnwrap.util.Identifier withPath(java.util.function.UnaryOperator pathFunction) { return new yarnwrap.util.Identifier(wrapperContained.withPath(pathFunction)); }
// public static yarnwrap.util.Identifier withPath(java.util.function.UnaryOperator pathFunction, ) { return new yarnwrap.util.Identifier(net.minecraft.util.Identifier.withPath(pathFunction)); }
// public java.lang.String validateNamespace(java.lang.String namespace,java.lang.String path) { return wrapperContained.validateNamespace(namespace,path); }
// public static java.lang.String validateNamespace(java.lang.String namespace,java.lang.String path, ) { return net.minecraft.util.Identifier.validateNamespace(namespace,path); }
public yarnwrap.util.Identifier withPath(java.lang.String path) { return new yarnwrap.util.Identifier(wrapperContained.withPath(path)); }
// public static yarnwrap.util.Identifier withPath(java.lang.String path, ) { return new yarnwrap.util.Identifier(net.minecraft.util.Identifier.withPath(path)); }
// public java.lang.String validatePath(java.lang.String namespace,java.lang.String path) { return wrapperContained.validatePath(namespace,path); }
// public static java.lang.String validatePath(java.lang.String namespace,java.lang.String path, ) { return net.minecraft.util.Identifier.validatePath(namespace,path); }
public yarnwrap.util.Identifier withPrefixedPath(java.lang.String prefix) { return new yarnwrap.util.Identifier(wrapperContained.withPrefixedPath(prefix)); }
// public static yarnwrap.util.Identifier withPrefixedPath(java.lang.String prefix, ) { return new yarnwrap.util.Identifier(net.minecraft.util.Identifier.withPrefixedPath(prefix)); }
public yarnwrap.util.Identifier withSuffixedPath(java.lang.String suffix) { return new yarnwrap.util.Identifier(wrapperContained.withSuffixedPath(suffix)); }
// public static yarnwrap.util.Identifier withSuffixedPath(java.lang.String suffix, ) { return new yarnwrap.util.Identifier(net.minecraft.util.Identifier.withSuffixedPath(suffix)); }
public java.lang.String toTranslationKey(java.lang.String prefix,java.lang.String suffix) { return wrapperContained.toTranslationKey(prefix,suffix); }
// public static java.lang.String toTranslationKey(java.lang.String prefix,java.lang.String suffix, ) { return net.minecraft.util.Identifier.toTranslationKey(prefix,suffix); }
// public yarnwrap.util.Identifier fromCommandInputNonEmpty(com.mojang.brigadier.StringReader reader) { return new yarnwrap.util.Identifier(wrapperContained.fromCommandInputNonEmpty(reader)); }
// public static yarnwrap.util.Identifier fromCommandInputNonEmpty(com.mojang.brigadier.StringReader reader, ) { return new yarnwrap.util.Identifier(net.minecraft.util.Identifier.fromCommandInputNonEmpty(reader)); }
// public java.lang.String readString(com.mojang.brigadier.StringReader reader) { return wrapperContained.readString(reader); }
// public static java.lang.String readString(com.mojang.brigadier.StringReader reader, ) { return net.minecraft.util.Identifier.readString(reader); }
// public yarnwrap.util.Identifier of(java.lang.String id) { return new yarnwrap.util.Identifier(wrapperContained.of(id)); }
// public static yarnwrap.util.Identifier of(java.lang.String id, ) { return new yarnwrap.util.Identifier(net.minecraft.util.Identifier.of(id)); }
// public yarnwrap.util.Identifier of(java.lang.String namespace,java.lang.String path) { return new yarnwrap.util.Identifier(wrapperContained.of(namespace,path)); }
// public static yarnwrap.util.Identifier of(java.lang.String namespace,java.lang.String path, ) { return new yarnwrap.util.Identifier(net.minecraft.util.Identifier.of(namespace,path)); }
// public yarnwrap.util.Identifier ofVanilla(java.lang.String path) { return new yarnwrap.util.Identifier(wrapperContained.ofVanilla(path)); }
// public static yarnwrap.util.Identifier ofVanilla(java.lang.String path, ) { return new yarnwrap.util.Identifier(net.minecraft.util.Identifier.ofVanilla(path)); }
// public yarnwrap.util.Identifier trySplitOn(java.lang.String id,char delimiter) { return new yarnwrap.util.Identifier(wrapperContained.trySplitOn(id,delimiter)); }
// public static yarnwrap.util.Identifier trySplitOn(java.lang.String id,char delimiter, ) { return new yarnwrap.util.Identifier(net.minecraft.util.Identifier.trySplitOn(id,delimiter)); }
// public yarnwrap.util.Identifier ofValidated(java.lang.String namespace,java.lang.String path) { return new yarnwrap.util.Identifier(wrapperContained.ofValidated(namespace,path)); }
// public static yarnwrap.util.Identifier ofValidated(java.lang.String namespace,java.lang.String path, ) { return new yarnwrap.util.Identifier(net.minecraft.util.Identifier.ofValidated(namespace,path)); }

}