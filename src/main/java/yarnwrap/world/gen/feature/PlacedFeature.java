package yarnwrap.world.gen.feature;
public class PlacedFeature { public net.minecraft.world.gen.feature.PlacedFeature wrapperContained; public PlacedFeature(net.minecraft.world.gen.feature.PlacedFeature wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry feature() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.feature); }
// public void feature(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.feature = value.wrapperContained; }
// public java.util.List placementModifiers() { return wrapperContained.placementModifiers; }
// public void placementModifiers(java.util.List value) { wrapperContained.placementModifiers = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
// public void REGISTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.REGISTRY_CODEC = value; }
public com.mojang.serialization.Codec LIST_CODEC() { return wrapperContained.LIST_CODEC; }
// public void LIST_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LIST_CODEC = value; }
public com.mojang.serialization.Codec LISTS_CODEC() { return wrapperContained.LISTS_CODEC; }
// public void LISTS_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LISTS_CODEC = value; }
// public PlacedFeature(yarnwrap.registry.entry.RegistryEntry placementModifiers) { this.wrapperContained = new net.minecraft.world.gen.feature.PlacedFeature(placementModifiers.wrapperContained); }
// public yarnwrap.registry.entry.RegistryEntry feature() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.feature()); }
// public java.util.List placementModifiers() { return wrapperContained.placementModifiers(); }
public java.util.stream.Stream getDecoratedFeatures() { return wrapperContained.getDecoratedFeatures(); }
public boolean generateUnregistered(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.chunk.ChunkGenerator generator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { return wrapperContained.generateUnregistered(world.wrapperContained,generator.wrapperContained,random.wrapperContained,pos.wrapperContained); }
// public void method_39646(yarnwrap.world.gen.feature.ConfiguredFeature placedPos) { wrapperContained.method_39646(placedPos.wrapperContained); }
// public boolean generate(yarnwrap.world.gen.feature.FeaturePlacementContext context,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { return wrapperContained.generate(context.wrapperContained,random.wrapperContained,pos.wrapperContained); }
// public java.util.stream.Stream method_39649(yarnwrap.world.gen.placementmodifier.PlacementModifier posx) { return wrapperContained.method_39649(posx.wrapperContained); }
public boolean generate(yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.chunk.ChunkGenerator generator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { return wrapperContained.generate(world.wrapperContained,generator.wrapperContained,random.wrapperContained,pos.wrapperContained); }

}