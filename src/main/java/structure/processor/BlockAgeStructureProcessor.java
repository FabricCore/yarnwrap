package yarnwrap.structure.processor;
public class BlockAgeStructureProcessor { public net.minecraft.structure.processor.BlockAgeStructureProcessor wrapperContained; public BlockAgeStructureProcessor(net.minecraft.structure.processor.BlockAgeStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public float mossiness() { return wrapperContained.mossiness; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public net.minecraft.block.BlockState[] AGEABLE_SLABS() { return wrapperContained.AGEABLE_SLABS; }
// public yarnwrap.block.BlockState processBlocks(yarnwrap.util.math.random.Random random) { return new yarnwrap.block.BlockState(wrapperContained.processBlocks(random.wrapperContained)); }
// public yarnwrap.block.BlockState randomStairProperties(yarnwrap.util.math.random.Random random,yarnwrap.block.Block stairs) { return new yarnwrap.block.BlockState(wrapperContained.randomStairProperties(random.wrapperContained,stairs.wrapperContained)); }
// public yarnwrap.block.BlockState processStairs(yarnwrap.util.math.random.Random random,yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.processStairs(random.wrapperContained,state.wrapperContained)); }
// public yarnwrap.block.BlockState randomState(yarnwrap.util.math.random.Random random,net.minecraft.block.BlockState[] states) { return new yarnwrap.block.BlockState(wrapperContained.randomState(random.wrapperContained,states)); }
// public yarnwrap.block.BlockState process(yarnwrap.util.math.random.Random random,net.minecraft.block.BlockState[] regularStates,net.minecraft.block.BlockState[] mossyStates) { return new yarnwrap.block.BlockState(wrapperContained.process(random.wrapperContained,regularStates,mossyStates)); }
// public yarnwrap.block.BlockState processSlabs(yarnwrap.util.math.random.Random random) { return new yarnwrap.block.BlockState(wrapperContained.processSlabs(random.wrapperContained)); }
// public yarnwrap.block.BlockState processWalls(yarnwrap.util.math.random.Random random) { return new yarnwrap.block.BlockState(wrapperContained.processWalls(random.wrapperContained)); }
// public yarnwrap.block.BlockState processObsidian(yarnwrap.util.math.random.Random random) { return new yarnwrap.block.BlockState(wrapperContained.processObsidian(random.wrapperContained)); }

}