package yarnwrap.world.gen.feature;
public class Feature { public net.minecraft.world.gen.feature.Feature wrapperContained; public Feature(net.minecraft.world.gen.feature.Feature wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.world.gen.feature.BonusChestFeature BONUS_CHEST() { return new yarnwrap.world.gen.feature.BonusChestFeature(wrapperContained.BONUS_CHEST); }
public yarnwrap.world.gen.feature.SeagrassFeature SEAGRASS() { return new yarnwrap.world.gen.feature.SeagrassFeature(wrapperContained.SEAGRASS); }
public yarnwrap.world.gen.feature.Feature FLOWER() { return new yarnwrap.world.gen.feature.Feature(wrapperContained.FLOWER); }
// public com.mojang.serialization.MapCodec codec() { return wrapperContained.codec; }
public yarnwrap.world.gen.feature.Feature NO_BONEMEAL_FLOWER() { return new yarnwrap.world.gen.feature.Feature(wrapperContained.NO_BONEMEAL_FLOWER); }
// public yarnwrap.world.gen.feature.Feature register(java.lang.String name,yarnwrap.world.gen.feature.Feature feature) { return new yarnwrap.world.gen.feature.Feature(wrapperContained.register(name,feature.wrapperContained)); }
public boolean generate(yarnwrap.world.gen.feature.util.FeatureContext context) { return wrapperContained.generate(context.wrapperContained); }
// public void setBlockState(yarnwrap.world.ModifiableWorld world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state) { wrapperContained.setBlockState(world.wrapperContained,pos.wrapperContained,state.wrapperContained); }
// public boolean isStone(yarnwrap.block.BlockState state) { return wrapperContained.isStone(state.wrapperContained); }
public boolean isSoil(yarnwrap.block.BlockState state) { return wrapperContained.isSoil(state.wrapperContained); }
public boolean isSoil(yarnwrap.world.TestableWorld world,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isSoil(world.wrapperContained,pos.wrapperContained); }
public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
public boolean isExposedToAir(java.util.function.Function posToState,yarnwrap.util.math.BlockPos pos) { return wrapperContained.isExposedToAir(posToState,pos.wrapperContained); }
public boolean testAdjacentStates(java.util.function.Function posToState,yarnwrap.util.math.BlockPos pos,java.util.function.Predicate predicate) { return wrapperContained.testAdjacentStates(posToState,pos.wrapperContained,predicate); }
// public void setBlockStateIf(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockPos pos,yarnwrap.block.BlockState state,java.util.function.Predicate predicate) { wrapperContained.setBlockStateIf(world.wrapperContained,pos.wrapperContained,state.wrapperContained,predicate); }
public java.util.function.Predicate notInBlockTagPredicate(yarnwrap.registry.tag.TagKey tag) { return wrapperContained.notInBlockTagPredicate(tag.wrapperContained); }
// public void markBlocksAboveForPostProcessing(yarnwrap.world.StructureWorldAccess world,yarnwrap.util.math.BlockPos pos) { wrapperContained.markBlocksAboveForPostProcessing(world.wrapperContained,pos.wrapperContained); }
public boolean generateIfValid(yarnwrap.world.gen.feature.FeatureConfig config,yarnwrap.world.StructureWorldAccess world,yarnwrap.world.gen.chunk.ChunkGenerator chunkGenerator,yarnwrap.util.math.random.Random random,yarnwrap.util.math.BlockPos pos) { return wrapperContained.generateIfValid(config.wrapperContained,world.wrapperContained,chunkGenerator.wrapperContained,random.wrapperContained,pos.wrapperContained); }

}