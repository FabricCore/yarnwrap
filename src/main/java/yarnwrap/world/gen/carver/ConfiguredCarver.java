package yarnwrap.world.gen.carver;
public class ConfiguredCarver { public net.minecraft.world.gen.carver.ConfiguredCarver wrapperContained; public ConfiguredCarver(net.minecraft.world.gen.carver.ConfiguredCarver wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.carver.Carver carver() { return new yarnwrap.world.gen.carver.Carver(wrapperContained.carver); }
// public void carver(yarnwrap.world.gen.carver.Carver value) { wrapperContained.carver = value.wrapperContained; }
// public static yarnwrap.world.gen.carver.Carver carver() { return new yarnwrap.world.gen.carver.Carver(net.minecraft.world.gen.carver.ConfiguredCarver.carver); }
// public static void carver(yarnwrap.world.gen.carver.Carver value, ) { net.minecraft.world.gen.carver.ConfiguredCarver.carver = value.wrapperContained; }

// public yarnwrap.world.gen.carver.CarverConfig config() { return new yarnwrap.world.gen.carver.CarverConfig(wrapperContained.config); }
// public void config(yarnwrap.world.gen.carver.CarverConfig value) { wrapperContained.config = value.wrapperContained; }
// public static yarnwrap.world.gen.carver.CarverConfig config() { return new yarnwrap.world.gen.carver.CarverConfig(net.minecraft.world.gen.carver.ConfiguredCarver.config); }
// public static void config(yarnwrap.world.gen.carver.CarverConfig value, ) { net.minecraft.world.gen.carver.ConfiguredCarver.config = value.wrapperContained; }

// public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
// public void REGISTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.REGISTRY_CODEC = value; }
public static com.mojang.serialization.Codec REGISTRY_CODEC() { return net.minecraft.world.gen.carver.ConfiguredCarver.REGISTRY_CODEC; }
// public static void REGISTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.carver.ConfiguredCarver.REGISTRY_CODEC = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.carver.ConfiguredCarver.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.carver.ConfiguredCarver.CODEC = value; }

// public com.mojang.serialization.Codec LIST_CODEC() { return wrapperContained.LIST_CODEC; }
// public void LIST_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LIST_CODEC = value; }
public static com.mojang.serialization.Codec LIST_CODEC() { return net.minecraft.world.gen.carver.ConfiguredCarver.LIST_CODEC; }
// public static void LIST_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.carver.ConfiguredCarver.LIST_CODEC = value; }

public ConfiguredCarver(yarnwrap.world.gen.carver.Carver carver,yarnwrap.world.gen.carver.CarverConfig config) { this.wrapperContained = new net.minecraft.world.gen.carver.ConfiguredCarver(carver.wrapperContained,config.wrapperContained); }
// public yarnwrap.world.gen.carver.Carver carver() { return new yarnwrap.world.gen.carver.Carver(wrapperContained.carver()); }
// // public static yarnwrap.world.gen.carver.Carver carver() { return new yarnwrap.world.gen.carver.Carver(net.minecraft.world.gen.carver.ConfiguredCarver.carver()); }
// public yarnwrap.world.gen.carver.CarverConfig config() { return new yarnwrap.world.gen.carver.CarverConfig(wrapperContained.config()); }
// // public static yarnwrap.world.gen.carver.CarverConfig config() { return new yarnwrap.world.gen.carver.CarverConfig(net.minecraft.world.gen.carver.ConfiguredCarver.config()); }
public boolean carve(yarnwrap.world.gen.carver.CarverContext context,yarnwrap.world.chunk.Chunk chunk,java.util.function.Function posToBiome,yarnwrap.util.math.random.Random random,yarnwrap.world.gen.chunk.AquiferSampler aquiferSampler,yarnwrap.util.math.ChunkPos pos,yarnwrap.world.gen.carver.CarvingMask mask) { return wrapperContained.carve(context.wrapperContained,chunk.wrapperContained,posToBiome,random.wrapperContained,aquiferSampler.wrapperContained,pos.wrapperContained,mask.wrapperContained); }
// public static boolean carve(yarnwrap.world.gen.carver.CarverContext context,yarnwrap.world.chunk.Chunk chunk,java.util.function.Function posToBiome,yarnwrap.util.math.random.Random random,yarnwrap.world.gen.chunk.AquiferSampler aquiferSampler,yarnwrap.util.math.ChunkPos pos,yarnwrap.world.gen.carver.CarvingMask mask, ) { return net.minecraft.world.gen.carver.ConfiguredCarver.carve(context.wrapperContained,chunk.wrapperContained,posToBiome,random.wrapperContained,aquiferSampler.wrapperContained,pos.wrapperContained,mask.wrapperContained); }
public boolean shouldCarve(yarnwrap.util.math.random.Random random) { return wrapperContained.shouldCarve(random.wrapperContained); }
// public static boolean shouldCarve(yarnwrap.util.math.random.Random random, ) { return net.minecraft.world.gen.carver.ConfiguredCarver.shouldCarve(random.wrapperContained); }
// public yarnwrap.world.gen.carver.Carver method_28612(yarnwrap.world.gen.carver.ConfiguredCarver configuredCarver) { return new yarnwrap.world.gen.carver.Carver(wrapperContained.method_28612(configuredCarver.wrapperContained)); }
// public static yarnwrap.world.gen.carver.Carver method_28612(yarnwrap.world.gen.carver.ConfiguredCarver configuredCarver, ) { return new yarnwrap.world.gen.carver.Carver(net.minecraft.world.gen.carver.ConfiguredCarver.method_28612(configuredCarver.wrapperContained)); }

}