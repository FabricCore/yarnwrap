package yarnwrap.data.report;
public class BiomeParametersProvider { public net.minecraft.data.report.BiomeParametersProvider wrapperContained; public BiomeParametersProvider(net.minecraft.data.report.BiomeParametersProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.data.report.BiomeParametersProvider.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.data.report.BiomeParametersProvider.LOGGER = value; }

// public java.nio.file.Path path() { return wrapperContained.path; }
// public void path(java.nio.file.Path value) { wrapperContained.path = value; }
// public static java.nio.file.Path path() { return net.minecraft.data.report.BiomeParametersProvider.path; }
// public static void path(java.nio.file.Path value, ) { net.minecraft.data.report.BiomeParametersProvider.path = value; }

// public java.util.concurrent.CompletableFuture registryLookupFuture() { return wrapperContained.registryLookupFuture; }
// public void registryLookupFuture(java.util.concurrent.CompletableFuture value) { wrapperContained.registryLookupFuture = value; }
// public static java.util.concurrent.CompletableFuture registryLookupFuture() { return net.minecraft.data.report.BiomeParametersProvider.registryLookupFuture; }
// public static void registryLookupFuture(java.util.concurrent.CompletableFuture value, ) { net.minecraft.data.report.BiomeParametersProvider.registryLookupFuture = value; }

// public com.mojang.serialization.MapCodec BIOME_KEY_CODEC() { return wrapperContained.BIOME_KEY_CODEC; }
// public void BIOME_KEY_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.BIOME_KEY_CODEC = value; }
// public static com.mojang.serialization.MapCodec BIOME_KEY_CODEC() { return net.minecraft.data.report.BiomeParametersProvider.BIOME_KEY_CODEC; }
// public static void BIOME_KEY_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.data.report.BiomeParametersProvider.BIOME_KEY_CODEC = value; }

// public com.mojang.serialization.Codec BIOME_ENTRY_CODEC() { return wrapperContained.BIOME_ENTRY_CODEC; }
// public void BIOME_ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BIOME_ENTRY_CODEC = value; }
// public static com.mojang.serialization.Codec BIOME_ENTRY_CODEC() { return net.minecraft.data.report.BiomeParametersProvider.BIOME_ENTRY_CODEC; }
// public static void BIOME_ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.data.report.BiomeParametersProvider.BIOME_ENTRY_CODEC = value; }

public BiomeParametersProvider(yarnwrap.data.DataOutput output,java.util.concurrent.CompletableFuture registryLookupFuture) { this.wrapperContained = new net.minecraft.data.report.BiomeParametersProvider(output.wrapperContained,registryLookupFuture); }
// public java.util.concurrent.CompletableFuture write(java.nio.file.Path path,yarnwrap.data.DataWriter writer,com.mojang.serialization.DynamicOps ops,com.mojang.serialization.Encoder codec,java.lang.Object biomeSource) { return wrapperContained.write(path,writer.wrapperContained,ops,codec,biomeSource); }
// public static java.util.concurrent.CompletableFuture write(java.nio.file.Path path,yarnwrap.data.DataWriter writer,com.mojang.serialization.DynamicOps ops,com.mojang.serialization.Encoder codec,java.lang.Object biomeSource, ) { return net.minecraft.data.report.BiomeParametersProvider.write(path,writer.wrapperContained,ops,codec,biomeSource); }
// public void method_42031(java.nio.file.Path error) { wrapperContained.method_42031(error); }
// public static void method_42031(java.nio.file.Path error, ) { net.minecraft.data.report.BiomeParametersProvider.method_42031(error); }
// public java.nio.file.Path resolvePath(yarnwrap.util.Identifier id) { return wrapperContained.resolvePath(id.wrapperContained); }
// public static java.nio.file.Path resolvePath(yarnwrap.util.Identifier id, ) { return net.minecraft.data.report.BiomeParametersProvider.resolvePath(id.wrapperContained); }
// public java.util.concurrent.CompletionStage method_46810(yarnwrap.data.DataWriter lookup) { return wrapperContained.method_46810(lookup.wrapperContained); }
// public static java.util.concurrent.CompletionStage method_46810(yarnwrap.data.DataWriter lookup, ) { return net.minecraft.data.report.BiomeParametersProvider.method_46810(lookup.wrapperContained); }
// public void method_49648(java.util.List preset,yarnwrap.data.DataWriter entries) { wrapperContained.method_49648(preset,entries.wrapperContained); }
// public static void method_49648(java.util.List preset,yarnwrap.data.DataWriter entries, ) { net.minecraft.data.report.BiomeParametersProvider.method_49648(preset,entries.wrapperContained); }

}