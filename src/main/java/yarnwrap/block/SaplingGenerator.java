package yarnwrap.block;
public class SaplingGenerator { public net.minecraft.block.SaplingGenerator wrapperContained; public SaplingGenerator(net.minecraft.block.SaplingGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public java.util.Map GENERATORS() { return wrapperContained.GENERATORS; }
// public void GENERATORS(java.util.Map value) { wrapperContained.GENERATORS = value; }
// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public float rareChance() { return wrapperContained.rareChance; }
// public void rareChance(float value) { wrapperContained.rareChance = value; }
// public java.util.Optional megaVariant() { return wrapperContained.megaVariant; }
// public void megaVariant(java.util.Optional value) { wrapperContained.megaVariant = value; }
// public java.util.Optional rareMegaVariant() { return wrapperContained.rareMegaVariant; }
// public void rareMegaVariant(java.util.Optional value) { wrapperContained.rareMegaVariant = value; }
// public java.util.Optional regularVariant() { return wrapperContained.regularVariant; }
// public void regularVariant(java.util.Optional value) { wrapperContained.regularVariant = value; }
// public java.util.Optional rareRegularVariant() { return wrapperContained.rareRegularVariant; }
// public void rareRegularVariant(java.util.Optional value) { wrapperContained.rareRegularVariant = value; }
// public java.util.Optional beesVariant() { return wrapperContained.beesVariant; }
// public void beesVariant(java.util.Optional value) { wrapperContained.beesVariant = value; }
// public java.util.Optional rareBeesVariant() { return wrapperContained.rareBeesVariant; }
// public void rareBeesVariant(java.util.Optional value) { wrapperContained.rareBeesVariant = value; }
public SaplingGenerator(java.lang.String id,float rareChance,java.util.Optional megaVariant,java.util.Optional rareMegaVariant,java.util.Optional regularVariant,java.util.Optional rareRegularVariant,java.util.Optional beesVariant,java.util.Optional rareBeesVariant) { this.wrapperContained = new net.minecraft.block.SaplingGenerator(id,rareChance,megaVariant,rareMegaVariant,regularVariant,rareRegularVariant,beesVariant,rareBeesVariant); }
public SaplingGenerator(java.lang.String id,java.util.Optional megaVariant,java.util.Optional regularVariant,java.util.Optional beesVariant) { this.wrapperContained = new net.minecraft.block.SaplingGenerator(id,megaVariant,regularVariant,beesVariant); }
public boolean generate(yarnwrap.server.world.ServerWorld world,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.util.math.random.Random random) { return wrapperContained.generate(world.wrapperContained,chunkGenerator.wrapperContained,pos.wrapperContained,state.wrapperContained,random.wrapperContained); }
// public yarnwrap.registry.RegistryKey getMegaTreeFeature(yarnwrap.util.math.random.Random random) { return new yarnwrap.registry.RegistryKey(wrapperContained.getMegaTreeFeature(random.wrapperContained)); }
// public yarnwrap.registry.RegistryKey getSmallTreeFeature(yarnwrap.util.math.random.Random random,boolean flowersNearby) { return new yarnwrap.registry.RegistryKey(wrapperContained.getSmallTreeFeature(random.wrapperContained,flowersNearby)); }
// public boolean areFlowersNearby(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.areFlowersNearby(world.wrapperContained,pos.wrapperContained); }
// public java.lang.String method_54089(yarnwrap.block.SaplingGenerator generator) { return wrapperContained.method_54089(generator.wrapperContained); }
// public boolean canGenerateLargeTree(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,int x,int z) { return wrapperContained.canGenerateLargeTree(state.wrapperContained,world.wrapperContained,pos.wrapperContained,x,z); }

}