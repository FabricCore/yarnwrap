package yarnwrap.block;
public class SaplingGenerator { public net.minecraft.block.SaplingGenerator wrapperContained; public SaplingGenerator(net.minecraft.block.SaplingGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public java.util.Map GENERATORS() { return wrapperContained.GENERATORS; }
// public java.lang.String id() { return wrapperContained.id; }
// public float rareChance() { return wrapperContained.rareChance; }
// public java.util.Optional megaVariant() { return wrapperContained.megaVariant; }
// public java.util.Optional rareMegaVariant() { return wrapperContained.rareMegaVariant; }
// public java.util.Optional regularVariant() { return wrapperContained.regularVariant; }
// public java.util.Optional rareRegularVariant() { return wrapperContained.rareRegularVariant; }
// public java.util.Optional beesVariant() { return wrapperContained.beesVariant; }
// public java.util.Optional rareBeesVariant() { return wrapperContained.rareBeesVariant; }
public boolean generate(yarnwrap.server.world.ServerWorld world,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.util.math.random.Random random) { return wrapperContained.generate(world.wrapperContained,chunkGenerator.wrapperContained,pos.wrapperContained,state.wrapperContained,random.wrapperContained); }
// public yarnwrap.registry.RegistryKey getMegaTreeFeature(yarnwrap.util.math.random.Random random) { return new yarnwrap.registry.RegistryKey(wrapperContained.getMegaTreeFeature(random.wrapperContained)); }
// public yarnwrap.registry.RegistryKey getSmallTreeFeature(yarnwrap.util.math.random.Random random,boolean flowersNearby) { return new yarnwrap.registry.RegistryKey(wrapperContained.getSmallTreeFeature(random.wrapperContained,flowersNearby)); }
// public boolean areFlowersNearby(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.areFlowersNearby(world.wrapperContained,pos.wrapperContained); }
// public boolean canGenerateLargeTree(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,int x,int z) { return wrapperContained.canGenerateLargeTree(state.wrapperContained,world.wrapperContained,pos.wrapperContained,x,z); }

}