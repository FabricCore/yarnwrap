package yarnwrap.world.gen.feature;
public class RandomFeatureEntry { public net.minecraft.world.gen.feature.RandomFeatureEntry wrapperContained; public RandomFeatureEntry(net.minecraft.world.gen.feature.RandomFeatureEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public float chance() { return wrapperContained.chance; }
// public void chance(float value) { wrapperContained.chance = value; }
// public static float chance() { return net.minecraft.world.gen.feature.RandomFeatureEntry.chance; }
// public static void chance(float value, ) { net.minecraft.world.gen.feature.RandomFeatureEntry.chance = value; }

public yarnwrap.registry.entry.RegistryEntry feature() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.feature); }
// public void feature(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.feature = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry feature() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.gen.feature.RandomFeatureEntry.feature); }
// public static void feature(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.world.gen.feature.RandomFeatureEntry.feature = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.world.gen.feature.RandomFeatureEntry.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.world.gen.feature.RandomFeatureEntry.CODEC = value; }

public RandomFeatureEntry(yarnwrap.registry.entry.RegistryEntry feature,float chance) { this.wrapperContained = new net.minecraft.world.gen.feature.RandomFeatureEntry(feature.wrapperContained,chance); }
public boolean generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { return wrapperContained.generate(world.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,pos.wrapperContained); }
// public static boolean generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.gen.feature.RandomFeatureEntry.generate(world.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,pos.wrapperContained); }
// public java.lang.Float method_28668(yarnwrap.world.gen.feature.RandomFeatureEntry config) { return wrapperContained.method_28668(config.wrapperContained); }
// public static java.lang.Float method_28668(yarnwrap.world.gen.feature.RandomFeatureEntry config, ) { return net.minecraft.world.gen.feature.RandomFeatureEntry.method_28668(config.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_28669(Object instance) { return wrapperContained.method_28669(instance); }
// public static com.mojang.datafixers.kinds.App method_28669(Object instance, ) { return net.minecraft.world.gen.feature.RandomFeatureEntry.method_28669(instance); }
// public yarnwrap.registry.entry.RegistryEntry method_28670(yarnwrap.world.gen.feature.RandomFeatureEntry config) { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.method_28670(config.wrapperContained)); }
// public static yarnwrap.registry.entry.RegistryEntry method_28670(yarnwrap.world.gen.feature.RandomFeatureEntry config, ) { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.world.gen.feature.RandomFeatureEntry.method_28670(config.wrapperContained)); }

}