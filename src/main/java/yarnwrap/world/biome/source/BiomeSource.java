package yarnwrap.world.biome.source;
public class BiomeSource { public net.minecraft.world.biome.source.BiomeSource wrapperContained; public BiomeSource(net.minecraft.world.biome.source.BiomeSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.function.Supplier biomes() { return wrapperContained.biomes; }
// public void biomes(java.util.function.Supplier value) { wrapperContained.biomes = value; }
// public static java.util.function.Supplier biomes() { return net.minecraft.world.biome.source.BiomeSource.biomes; }
// public static void biomes(java.util.function.Supplier value, ) { net.minecraft.world.biome.source.BiomeSource.biomes = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.biome.source.BiomeSource.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.biome.source.BiomeSource.CODEC = value; }

// public com.mojang.datafixers.util.Pair locateBiome(int x,int y,int z,int radius,int blockCheckInterval,java.util.function.Predicate predicate,yarnwrap.util.math.random.Random random,boolean noiseSampler) { return wrapperContained.locateBiome(x,y,z,radius,blockCheckInterval,predicate,random.wrapperContained,noiseSampler); }
// public static com.mojang.datafixers.util.Pair locateBiome(int x,int y,int z,int radius,int blockCheckInterval,java.util.function.Predicate predicate,yarnwrap.util.math.random.Random random,boolean noiseSampler, ) { return net.minecraft.world.biome.source.BiomeSource.locateBiome(x,y,z,radius,blockCheckInterval,predicate,random.wrapperContained,noiseSampler); }
// public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.world.biome.source.BiomeSource.getCodec(); }
public java.util.Set getBiomes() { return wrapperContained.getBiomes(); }
// public static java.util.Set getBiomes() { return net.minecraft.world.biome.source.BiomeSource.getBiomes(); }
// public void addDebugInfo(java.util.List info,yarnwrap.util.math.BlockPos pos,Object noiseSampler) { wrapperContained.addDebugInfo(info,pos.wrapperContained,noiseSampler); }
// public static void addDebugInfo(java.util.List info,yarnwrap.util.math.BlockPos pos,Object noiseSampler, ) { net.minecraft.world.biome.source.BiomeSource.addDebugInfo(info,pos.wrapperContained,noiseSampler); }
// public com.mojang.datafixers.util.Pair locateBiome(yarnwrap.util.math.BlockPos origin,int radius,int horizontalBlockCheckInterval,int verticalBlockCheckInterval,java.util.function.Predicate predicate,Object noiseSampler,yarnwrap.world.WorldView world) { return wrapperContained.locateBiome(origin.wrapperContained,radius,horizontalBlockCheckInterval,verticalBlockCheckInterval,predicate,noiseSampler,world.wrapperContained); }
// public static com.mojang.datafixers.util.Pair locateBiome(yarnwrap.util.math.BlockPos origin,int radius,int horizontalBlockCheckInterval,int verticalBlockCheckInterval,java.util.function.Predicate predicate,Object noiseSampler,yarnwrap.world.WorldView world, ) { return net.minecraft.world.biome.source.BiomeSource.locateBiome(origin.wrapperContained,radius,horizontalBlockCheckInterval,verticalBlockCheckInterval,predicate,noiseSampler,world.wrapperContained); }
// public java.util.stream.Stream biomeStream() { return wrapperContained.biomeStream(); }
// public static java.util.stream.Stream biomeStream() { return net.minecraft.world.biome.source.BiomeSource.biomeStream(); }
// public com.mojang.datafixers.util.Pair locateBiome(int x,int y,int z,int radius,java.util.function.Predicate predicate,yarnwrap.util.math.random.Random random,Object noiseSampler) { return wrapperContained.locateBiome(x,y,z,radius,predicate,random.wrapperContained,noiseSampler); }
// public static com.mojang.datafixers.util.Pair locateBiome(int x,int y,int z,int radius,java.util.function.Predicate predicate,yarnwrap.util.math.random.Random random,Object noiseSampler, ) { return net.minecraft.world.biome.source.BiomeSource.locateBiome(x,y,z,radius,predicate,random.wrapperContained,noiseSampler); }
// public java.util.Set getBiomesInArea(int x,int y,int z,int radius,Object sampler) { return wrapperContained.getBiomesInArea(x,y,z,radius,sampler); }
// public static java.util.Set getBiomesInArea(int x,int y,int z,int radius,Object sampler, ) { return net.minecraft.world.biome.source.BiomeSource.getBiomesInArea(x,y,z,radius,sampler); }

}