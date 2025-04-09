package yarnwrap.data.report;
public class BiomeParametersProvider { public net.minecraft.data.report.BiomeParametersProvider wrapperContained; public BiomeParametersProvider(net.minecraft.data.report.BiomeParametersProvider wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public java.nio.file.Path path() { return wrapperContained.path; }
// public java.util.concurrent.CompletableFuture registryLookupFuture() { return wrapperContained.registryLookupFuture; }
// public com.mojang.serialization.MapCodec BIOME_KEY_CODEC() { return wrapperContained.BIOME_KEY_CODEC; }
// public com.mojang.serialization.Codec BIOME_ENTRY_CODEC() { return wrapperContained.BIOME_ENTRY_CODEC; }
// public java.util.concurrent.CompletableFuture write(java.nio.file.Path path,yarnwrap.data.DataWriter writer,com.mojang.serialization.DynamicOps ops,com.mojang.serialization.Encoder codec,java.lang.Object biomeSource) { return wrapperContained.write(path,writer.wrapperContained,ops,codec,biomeSource); }
// public java.nio.file.Path resolvePath(yarnwrap.util.Identifier id) { return wrapperContained.resolvePath(id.wrapperContained); }

}