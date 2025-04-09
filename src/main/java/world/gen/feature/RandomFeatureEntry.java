package yarnwrap.world.gen.feature;
public class RandomFeatureEntry { public net.minecraft.world.gen.feature.RandomFeatureEntry wrapperContained; public RandomFeatureEntry(net.minecraft.world.gen.feature.RandomFeatureEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public float chance() { return wrapperContained.chance; }
public yarnwrap.registry.entry.RegistryEntry feature() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.feature); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public boolean generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { return wrapperContained.generate(world.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,pos.wrapperContained); }

}