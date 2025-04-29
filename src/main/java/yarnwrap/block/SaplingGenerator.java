package yarnwrap.block;
public class SaplingGenerator { public net.minecraft.block.SaplingGenerator wrapperContained; public SaplingGenerator(net.minecraft.block.SaplingGenerator wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.block.SaplingGenerator.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.block.SaplingGenerator.CODEC = value; }

// public java.util.Map GENERATORS() { return wrapperContained.GENERATORS; }
// public void GENERATORS(java.util.Map value) { wrapperContained.GENERATORS = value; }
// public static java.util.Map GENERATORS() { return net.minecraft.block.SaplingGenerator.GENERATORS; }
// public static void GENERATORS(java.util.Map value, ) { net.minecraft.block.SaplingGenerator.GENERATORS = value; }

// public java.lang.String id() { return wrapperContained.id; }
// public void id(java.lang.String value) { wrapperContained.id = value; }
// public static java.lang.String id() { return net.minecraft.block.SaplingGenerator.id; }
// public static void id(java.lang.String value, ) { net.minecraft.block.SaplingGenerator.id = value; }

// public float rareChance() { return wrapperContained.rareChance; }
// public void rareChance(float value) { wrapperContained.rareChance = value; }
// public static float rareChance() { return net.minecraft.block.SaplingGenerator.rareChance; }
// public static void rareChance(float value, ) { net.minecraft.block.SaplingGenerator.rareChance = value; }

// public java.util.Optional megaVariant() { return wrapperContained.megaVariant; }
// public void megaVariant(java.util.Optional value) { wrapperContained.megaVariant = value; }
// public static java.util.Optional megaVariant() { return net.minecraft.block.SaplingGenerator.megaVariant; }
// public static void megaVariant(java.util.Optional value, ) { net.minecraft.block.SaplingGenerator.megaVariant = value; }

// public java.util.Optional rareMegaVariant() { return wrapperContained.rareMegaVariant; }
// public void rareMegaVariant(java.util.Optional value) { wrapperContained.rareMegaVariant = value; }
// public static java.util.Optional rareMegaVariant() { return net.minecraft.block.SaplingGenerator.rareMegaVariant; }
// public static void rareMegaVariant(java.util.Optional value, ) { net.minecraft.block.SaplingGenerator.rareMegaVariant = value; }

// public java.util.Optional regularVariant() { return wrapperContained.regularVariant; }
// public void regularVariant(java.util.Optional value) { wrapperContained.regularVariant = value; }
// public static java.util.Optional regularVariant() { return net.minecraft.block.SaplingGenerator.regularVariant; }
// public static void regularVariant(java.util.Optional value, ) { net.minecraft.block.SaplingGenerator.regularVariant = value; }

// public java.util.Optional rareRegularVariant() { return wrapperContained.rareRegularVariant; }
// public void rareRegularVariant(java.util.Optional value) { wrapperContained.rareRegularVariant = value; }
// public static java.util.Optional rareRegularVariant() { return net.minecraft.block.SaplingGenerator.rareRegularVariant; }
// public static void rareRegularVariant(java.util.Optional value, ) { net.minecraft.block.SaplingGenerator.rareRegularVariant = value; }

// public java.util.Optional beesVariant() { return wrapperContained.beesVariant; }
// public void beesVariant(java.util.Optional value) { wrapperContained.beesVariant = value; }
// public static java.util.Optional beesVariant() { return net.minecraft.block.SaplingGenerator.beesVariant; }
// public static void beesVariant(java.util.Optional value, ) { net.minecraft.block.SaplingGenerator.beesVariant = value; }

// public java.util.Optional rareBeesVariant() { return wrapperContained.rareBeesVariant; }
// public void rareBeesVariant(java.util.Optional value) { wrapperContained.rareBeesVariant = value; }
// public static java.util.Optional rareBeesVariant() { return net.minecraft.block.SaplingGenerator.rareBeesVariant; }
// public static void rareBeesVariant(java.util.Optional value, ) { net.minecraft.block.SaplingGenerator.rareBeesVariant = value; }

public SaplingGenerator(java.lang.String id,float rareChance,java.util.Optional megaVariant,java.util.Optional rareMegaVariant,java.util.Optional regularVariant,java.util.Optional rareRegularVariant,java.util.Optional beesVariant,java.util.Optional rareBeesVariant) { this.wrapperContained = new net.minecraft.block.SaplingGenerator(id,rareChance,megaVariant,rareMegaVariant,regularVariant,rareRegularVariant,beesVariant,rareBeesVariant); }
public SaplingGenerator(java.lang.String id,java.util.Optional megaVariant,java.util.Optional regularVariant,java.util.Optional beesVariant) { this.wrapperContained = new net.minecraft.block.SaplingGenerator(id,megaVariant,regularVariant,beesVariant); }
public boolean generate(yarnwrap.server.world.ServerWorld world,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.util.math.random.Random random) { return wrapperContained.generate(world.wrapperContained,chunkGenerator.wrapperContained,pos.wrapperContained,state.wrapperContained,random.wrapperContained); }
// public static boolean generate(yarnwrap.server.world.ServerWorld world,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,yarnwrap.util.math.random.Random random, ) { return net.minecraft.block.SaplingGenerator.generate(world.wrapperContained,chunkGenerator.wrapperContained,pos.wrapperContained,state.wrapperContained,random.wrapperContained); }
// public yarnwrap.registry.RegistryKey getMegaTreeFeature(yarnwrap.util.math.random.Random random) { return new yarnwrap.registry.RegistryKey(wrapperContained.getMegaTreeFeature(random.wrapperContained)); }
// public static yarnwrap.registry.RegistryKey getMegaTreeFeature(yarnwrap.util.math.random.Random random, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.block.SaplingGenerator.getMegaTreeFeature(random.wrapperContained)); }
// public yarnwrap.registry.RegistryKey getSmallTreeFeature(yarnwrap.util.math.random.Random random,boolean flowersNearby) { return new yarnwrap.registry.RegistryKey(wrapperContained.getSmallTreeFeature(random.wrapperContained,flowersNearby)); }
// public static yarnwrap.registry.RegistryKey getSmallTreeFeature(yarnwrap.util.math.random.Random random,boolean flowersNearby, ) { return new yarnwrap.registry.RegistryKey(net.minecraft.block.SaplingGenerator.getSmallTreeFeature(random.wrapperContained,flowersNearby)); }
// public boolean areFlowersNearby(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.areFlowersNearby(world.wrapperContained,pos.wrapperContained); }
// public static boolean areFlowersNearby(yarnwrap.world.WorldAccess world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.block.SaplingGenerator.areFlowersNearby(world.wrapperContained,pos.wrapperContained); }
// public java.lang.String method_54089(yarnwrap.block.SaplingGenerator generator) { return wrapperContained.method_54089(generator.wrapperContained); }
// public static java.lang.String method_54089(yarnwrap.block.SaplingGenerator generator, ) { return net.minecraft.block.SaplingGenerator.method_54089(generator.wrapperContained); }
// public boolean canGenerateLargeTree(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,int x,int z) { return wrapperContained.canGenerateLargeTree(state.wrapperContained,world.wrapperContained,pos.wrapperContained,x,z); }
// public static boolean canGenerateLargeTree(yarnwrap.block.BlockState state,yarnwrap.world.BlockView world,yarnwrap.util.math.BlockPos pos,int x,int z, ) { return net.minecraft.block.SaplingGenerator.canGenerateLargeTree(state.wrapperContained,world.wrapperContained,pos.wrapperContained,x,z); }

}