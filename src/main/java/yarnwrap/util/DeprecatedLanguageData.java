package yarnwrap.util;
public class DeprecatedLanguageData { public net.minecraft.util.DeprecatedLanguageData wrapperContained; public DeprecatedLanguageData(net.minecraft.util.DeprecatedLanguageData wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.DeprecatedLanguageData NONE() { return new yarnwrap.util.DeprecatedLanguageData(wrapperContained.NONE); }
// public void NONE(yarnwrap.util.DeprecatedLanguageData value) { wrapperContained.NONE = value.wrapperContained; }
public static yarnwrap.util.DeprecatedLanguageData NONE() { return new yarnwrap.util.DeprecatedLanguageData(net.minecraft.util.DeprecatedLanguageData.NONE); }
// public static void NONE(yarnwrap.util.DeprecatedLanguageData value, ) { net.minecraft.util.DeprecatedLanguageData.NONE = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.DeprecatedLanguageData.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.DeprecatedLanguageData.CODEC = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.util.DeprecatedLanguageData.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.util.DeprecatedLanguageData.LOGGER = value; }

// public yarnwrap.util.DeprecatedLanguageData create() { return new yarnwrap.util.DeprecatedLanguageData(wrapperContained.create()); }
public static yarnwrap.util.DeprecatedLanguageData create() { return new yarnwrap.util.DeprecatedLanguageData(net.minecraft.util.DeprecatedLanguageData.create()); }
// public com.mojang.datafixers.kinds.App method_62777(Object instance) { return wrapperContained.method_62777(instance); }
// public static com.mojang.datafixers.kinds.App method_62777(Object instance, ) { return net.minecraft.util.DeprecatedLanguageData.method_62777(instance); }
// public yarnwrap.util.DeprecatedLanguageData fromInputStream(java.io.InputStream stream) { return new yarnwrap.util.DeprecatedLanguageData(wrapperContained.fromInputStream(stream)); }
// public static yarnwrap.util.DeprecatedLanguageData fromInputStream(java.io.InputStream stream, ) { return new yarnwrap.util.DeprecatedLanguageData(net.minecraft.util.DeprecatedLanguageData.fromInputStream(stream)); }
// public yarnwrap.util.DeprecatedLanguageData fromPath(java.lang.String path) { return new yarnwrap.util.DeprecatedLanguageData(wrapperContained.fromPath(path)); }
// public static yarnwrap.util.DeprecatedLanguageData fromPath(java.lang.String path, ) { return new yarnwrap.util.DeprecatedLanguageData(net.minecraft.util.DeprecatedLanguageData.fromPath(path)); }
public void apply(java.util.Map map) { wrapperContained.apply(map); }
// public static void apply(java.util.Map map, ) { net.minecraft.util.DeprecatedLanguageData.apply(map); }
// public void method_62781(java.util.Map oldKey,java.lang.String newKey) { wrapperContained.method_62781(oldKey,newKey); }
// public static void method_62781(java.util.Map oldKey,java.lang.String newKey, ) { net.minecraft.util.DeprecatedLanguageData.method_62781(oldKey,newKey); }
// public java.lang.IllegalStateException method_62782(java.lang.String error) { return wrapperContained.method_62782(error); }
// public static java.lang.IllegalStateException method_62782(java.lang.String error, ) { return net.minecraft.util.DeprecatedLanguageData.method_62782(error); }

}