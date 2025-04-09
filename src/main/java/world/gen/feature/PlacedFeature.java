package yarnwrap.world.gen.feature;
public class PlacedFeature { public net.minecraft.world.gen.feature.PlacedFeature wrapperContained; public PlacedFeature(net.minecraft.world.gen.feature.PlacedFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry feature() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.feature); }
// public java.util.List placementModifiers() { return wrapperContained.placementModifiers; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
public com.mojang.serialization.Codec LIST_CODEC() { return wrapperContained.LIST_CODEC; }
public com.mojang.serialization.Codec LISTS_CODEC() { return wrapperContained.LISTS_CODEC; }
// public yarnwrap.registry.entry.RegistryEntry feature() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.feature()); }
// public java.util.List placementModifiers() { return wrapperContained.placementModifiers(); }
public java.util.stream.Stream getDecoratedFeatures() { return wrapperContained.getDecoratedFeatures(); }
public boolean generateUnregistered(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.chunk.ChunkGenerator generator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { return wrapperContained.generateUnregistered(world.wrapperContained,generator.wrapperContained,random.wrapperContained,pos.wrapperContained); }
// public boolean generate(yarnwrap.world.gen.feature.FeaturePlacementContext context,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { return wrapperContained.generate(context.wrapperContained,random.wrapperContained,pos.wrapperContained); }
public boolean generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.chunk.ChunkGenerator generator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { return wrapperContained.generate(world.wrapperContained,generator.wrapperContained,random.wrapperContained,pos.wrapperContained); }

}