package yarnwrap.world.gen.feature;
public class Feature { public net.minecraft.world.gen.feature.Feature wrapperContained; public Feature(net.minecraft.world.gen.feature.Feature wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.world.gen.feature.BonusChestFeature BONUS_CHEST() { return new yarnwrap.world.gen.feature.BonusChestFeature(wrapperContained.BONUS_CHEST); }
// public void BONUS_CHEST(yarnwrap.world.gen.feature.BonusChestFeature value) { wrapperContained.BONUS_CHEST = value.wrapperContained; }
public static yarnwrap.world.gen.feature.BonusChestFeature BONUS_CHEST() { return new yarnwrap.world.gen.feature.BonusChestFeature(net.minecraft.world.gen.feature.Feature.BONUS_CHEST); }
// public static void BONUS_CHEST(yarnwrap.world.gen.feature.BonusChestFeature value, ) { net.minecraft.world.gen.feature.Feature.BONUS_CHEST = value.wrapperContained; }

// public yarnwrap.world.gen.feature.SeagrassFeature SEAGRASS() { return new yarnwrap.world.gen.feature.SeagrassFeature(wrapperContained.SEAGRASS); }
// public void SEAGRASS(yarnwrap.world.gen.feature.SeagrassFeature value) { wrapperContained.SEAGRASS = value.wrapperContained; }
public static yarnwrap.world.gen.feature.SeagrassFeature SEAGRASS() { return new yarnwrap.world.gen.feature.SeagrassFeature(net.minecraft.world.gen.feature.Feature.SEAGRASS); }
// public static void SEAGRASS(yarnwrap.world.gen.feature.SeagrassFeature value, ) { net.minecraft.world.gen.feature.Feature.SEAGRASS = value.wrapperContained; }

// public yarnwrap.world.gen.feature.Feature FLOWER() { return new yarnwrap.world.gen.feature.Feature(wrapperContained.FLOWER); }
// public void FLOWER(yarnwrap.world.gen.feature.Feature value) { wrapperContained.FLOWER = value.wrapperContained; }
public static yarnwrap.world.gen.feature.Feature FLOWER() { return new yarnwrap.world.gen.feature.Feature(net.minecraft.world.gen.feature.Feature.FLOWER); }
// public static void FLOWER(yarnwrap.world.gen.feature.Feature value, ) { net.minecraft.world.gen.feature.Feature.FLOWER = value.wrapperContained; }

// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
// public void codec(com.mojang.serialization.MapCodec value) { wrapperContained.codec = value; }
// public static com.mojang.serialization.MapCodec codec() { return net.minecraft.world.gen.feature.Feature.codec; }
// public static void codec(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.gen.feature.Feature.codec = value; }

// public yarnwrap.world.gen.feature.Feature NO_BONEMEAL_FLOWER() { return new yarnwrap.world.gen.feature.Feature(wrapperContained.NO_BONEMEAL_FLOWER); }
// public void NO_BONEMEAL_FLOWER(yarnwrap.world.gen.feature.Feature value) { wrapperContained.NO_BONEMEAL_FLOWER = value.wrapperContained; }
public static yarnwrap.world.gen.feature.Feature NO_BONEMEAL_FLOWER() { return new yarnwrap.world.gen.feature.Feature(net.minecraft.world.gen.feature.Feature.NO_BONEMEAL_FLOWER); }
// public static void NO_BONEMEAL_FLOWER(yarnwrap.world.gen.feature.Feature value, ) { net.minecraft.world.gen.feature.Feature.NO_BONEMEAL_FLOWER = value.wrapperContained; }

// public Feature(com.mojang.serialization.Codec configCodec) { this.wrapperContained = new net.minecraft.world.gen.feature.Feature(configCodec); }
// public yarnwrap.world.gen.feature.Feature register(java.lang.String name,yarnwrap.world.gen.feature.Feature feature) { return new yarnwrap.world.gen.feature.Feature(wrapperContained.register(name,feature.wrapperContained)); }
// public static yarnwrap.world.gen.feature.Feature register(java.lang.String name,yarnwrap.world.gen.feature.Feature feature, ) { return new yarnwrap.world.gen.feature.Feature(net.minecraft.world.gen.feature.Feature.register(name,feature.wrapperContained)); }
public boolean generate(yarnwrap.world.gen.feature.util.FeatureContext context) { return wrapperContained.generate(context.wrapperContained); }
// public static boolean generate(yarnwrap.world.gen.feature.util.FeatureContext context, ) { return net.minecraft.world.gen.feature.Feature.generate(context.wrapperContained); }
// public void setBlockState(yarnwrap.world.ModifiableWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.setBlockState(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public static void setBlockState(yarnwrap.world.ModifiableWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state, ) { net.minecraft.world.gen.feature.Feature.setBlockState(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean isStone(yarnwrap.block.BlockState state) { return wrapperContained.isStone(state.wrapperContained); }
// public static boolean isStone(yarnwrap.block.BlockState state, ) { return net.minecraft.world.gen.feature.Feature.isStone(state.wrapperContained); }
// public boolean isSoil(yarnwrap.block.BlockState state) { return wrapperContained.isSoil(state.wrapperContained); }
// public static boolean isSoil(yarnwrap.block.BlockState state, ) { return net.minecraft.world.gen.feature.Feature.isSoil(state.wrapperContained); }
// public boolean isSoil(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isSoil(world.wrapperContained,pos.wrapperContained); }
// public static boolean isSoil(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.gen.feature.Feature.isSoil(world.wrapperContained,pos.wrapperContained); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.world.gen.feature.Feature.getCodec(); }
// public yarnwrap.world.gen.feature.ConfiguredFeature method_28629(yarnwrap.world.gen.feature.FeatureConfig config) { return new yarnwrap.world.gen.feature.ConfiguredFeature(wrapperContained.method_28629(config.wrapperContained)); }
// public static yarnwrap.world.gen.feature.ConfiguredFeature method_28629(yarnwrap.world.gen.feature.FeatureConfig config, ) { return new yarnwrap.world.gen.feature.ConfiguredFeature(net.minecraft.world.gen.feature.Feature.method_28629(config.wrapperContained)); }
// public boolean isExposedToAir(java.util.function.Function posToState,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isExposedToAir(posToState,pos.wrapperContained); }
// public static boolean isExposedToAir(java.util.function.Function posToState,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.gen.feature.Feature.isExposedToAir(posToState,pos.wrapperContained); }
// public boolean testAdjacentStates(java.util.function.Function posToState,yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate) { return wrapperContained.testAdjacentStates(posToState,pos.wrapperContained,predicate); }
// public static boolean testAdjacentStates(java.util.function.Function posToState,yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate, ) { return net.minecraft.world.gen.feature.Feature.testAdjacentStates(posToState,pos.wrapperContained,predicate); }
// public boolean method_36997(yarnwrap.registry.tag.TagKey state) { return wrapperContained.method_36997(state.wrapperContained); }
// public static boolean method_36997(yarnwrap.registry.tag.TagKey state, ) { return net.minecraft.world.gen.feature.Feature.method_36997(state.wrapperContained); }
// public void setBlockStateIf(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,java.util.function.Predicate predicate) { wrapperContained.setBlockStateIf(world.wrapperContained,pos.wrapperContained,state.wrapperContained,predicate); }
// public static void setBlockStateIf(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,java.util.function.Predicate predicate, ) { net.minecraft.world.gen.feature.Feature.setBlockStateIf(world.wrapperContained,pos.wrapperContained,state.wrapperContained,predicate); }
// public java.util.function.Predicate notInBlockTagPredicate(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.notInBlockTagPredicate(tag.wrapperContained); }
// public static java.util.function.Predicate notInBlockTagPredicate(yarnwrap.registry.tag.TagKey tag, ) { return net.minecraft.world.gen.feature.Feature.notInBlockTagPredicate(tag.wrapperContained); }
// public void markBlocksAboveForPostProcessing(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.markBlocksAboveForPostProcessing(world.wrapperContained,pos.wrapperContained); }
// public static void markBlocksAboveForPostProcessing(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockPos pos, ) { net.minecraft.world.gen.feature.Feature.markBlocksAboveForPostProcessing(world.wrapperContained,pos.wrapperContained); }
public boolean generateIfValid(yarnwrap.world.gen.feature.FeatureConfig config,yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { return wrapperContained.generateIfValid(config.wrapperContained,world.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,pos.wrapperContained); }
// public static boolean generateIfValid(yarnwrap.world.gen.feature.FeatureConfig config,yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.world.gen.feature.Feature.generateIfValid(config.wrapperContained,world.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,pos.wrapperContained); }

}