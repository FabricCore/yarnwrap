package yarnwrap.structure.processor;
public class BlockAgeStructureProcessor { public net.minecraft.structure.processor.BlockAgeStructureProcessor wrapperContained; public BlockAgeStructureProcessor(net.minecraft.structure.processor.BlockAgeStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public float mossiness() { return wrapperContained.mossiness; }
// public void mossiness(float value) { wrapperContained.mossiness = value; }
// public static float mossiness() { return net.minecraft.structure.processor.BlockAgeStructureProcessor.mossiness; }
// public static void mossiness(float value, ) { net.minecraft.structure.processor.BlockAgeStructureProcessor.mossiness = value; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.structure.processor.BlockAgeStructureProcessor.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.structure.processor.BlockAgeStructureProcessor.CODEC = value; }

// public net.minecraft.block.BlockState[] AGEABLE_SLABS() { return wrapperContained.AGEABLE_SLABS; }
// public void AGEABLE_SLABS(net.minecraft.block.BlockState[] value) { wrapperContained.AGEABLE_SLABS = value; }
// public static net.minecraft.block.BlockState[] AGEABLE_SLABS() { return net.minecraft.structure.processor.BlockAgeStructureProcessor.AGEABLE_SLABS; }
// public static void AGEABLE_SLABS(net.minecraft.block.BlockState[] value, ) { net.minecraft.structure.processor.BlockAgeStructureProcessor.AGEABLE_SLABS = value; }

public BlockAgeStructureProcessor(float mossiness) { this.wrapperContained = new net.minecraft.structure.processor.BlockAgeStructureProcessor(mossiness); }
// public yarnwrap.block.BlockState processBlocks(yarnwrap.util.math.random.Random random) { return new yarnwrap.block.BlockState(wrapperContained.processBlocks(random.wrapperContained)); }
// public static yarnwrap.block.BlockState processBlocks(yarnwrap.util.math.random.Random random, ) { return new yarnwrap.block.BlockState(net.minecraft.structure.processor.BlockAgeStructureProcessor.processBlocks(random.wrapperContained)); }
// public yarnwrap.block.BlockState randomStairProperties(yarnwrap.util.math.random.Random random,yarnwrap.block.Block stairs) { return new yarnwrap.block.BlockState(wrapperContained.randomStairProperties(random.wrapperContained,stairs.wrapperContained)); }
// public static yarnwrap.block.BlockState randomStairProperties(yarnwrap.util.math.random.Random random,yarnwrap.block.Block stairs, ) { return new yarnwrap.block.BlockState(net.minecraft.structure.processor.BlockAgeStructureProcessor.randomStairProperties(random.wrapperContained,stairs.wrapperContained)); }
// public yarnwrap.block.BlockState processStairs(yarnwrap.util.math.random.Random random,yarnwrap.block.BlockState state) { return new yarnwrap.block.BlockState(wrapperContained.processStairs(random.wrapperContained,state.wrapperContained)); }
// public static yarnwrap.block.BlockState processStairs(yarnwrap.util.math.random.Random random,yarnwrap.block.BlockState state, ) { return new yarnwrap.block.BlockState(net.minecraft.structure.processor.BlockAgeStructureProcessor.processStairs(random.wrapperContained,state.wrapperContained)); }
// public yarnwrap.block.BlockState randomState(yarnwrap.util.math.random.Random random,net.minecraft.block.BlockState[] states) { return new yarnwrap.block.BlockState(wrapperContained.randomState(random.wrapperContained,states)); }
// public static yarnwrap.block.BlockState randomState(yarnwrap.util.math.random.Random random,net.minecraft.block.BlockState[] states, ) { return new yarnwrap.block.BlockState(net.minecraft.structure.processor.BlockAgeStructureProcessor.randomState(random.wrapperContained,states)); }
// public yarnwrap.block.BlockState process(yarnwrap.util.math.random.Random random,net.minecraft.block.BlockState[] regularStates,net.minecraft.block.BlockState[] mossyStates) { return new yarnwrap.block.BlockState(wrapperContained.process(random.wrapperContained,regularStates,mossyStates)); }
// public static yarnwrap.block.BlockState process(yarnwrap.util.math.random.Random random,net.minecraft.block.BlockState[] regularStates,net.minecraft.block.BlockState[] mossyStates, ) { return new yarnwrap.block.BlockState(net.minecraft.structure.processor.BlockAgeStructureProcessor.process(random.wrapperContained,regularStates,mossyStates)); }
// public yarnwrap.block.BlockState processSlabs(yarnwrap.util.math.random.Random random) { return new yarnwrap.block.BlockState(wrapperContained.processSlabs(random.wrapperContained)); }
// public static yarnwrap.block.BlockState processSlabs(yarnwrap.util.math.random.Random random, ) { return new yarnwrap.block.BlockState(net.minecraft.structure.processor.BlockAgeStructureProcessor.processSlabs(random.wrapperContained)); }
// public yarnwrap.block.BlockState processWalls(yarnwrap.util.math.random.Random random) { return new yarnwrap.block.BlockState(wrapperContained.processWalls(random.wrapperContained)); }
// public static yarnwrap.block.BlockState processWalls(yarnwrap.util.math.random.Random random, ) { return new yarnwrap.block.BlockState(net.minecraft.structure.processor.BlockAgeStructureProcessor.processWalls(random.wrapperContained)); }
// public yarnwrap.block.BlockState processObsidian(yarnwrap.util.math.random.Random random) { return new yarnwrap.block.BlockState(wrapperContained.processObsidian(random.wrapperContained)); }
// public static yarnwrap.block.BlockState processObsidian(yarnwrap.util.math.random.Random random, ) { return new yarnwrap.block.BlockState(net.minecraft.structure.processor.BlockAgeStructureProcessor.processObsidian(random.wrapperContained)); }
// public java.lang.Float method_28967(yarnwrap.structure.processor.BlockAgeStructureProcessor processor) { return wrapperContained.method_28967(processor.wrapperContained); }
// public static java.lang.Float method_28967(yarnwrap.structure.processor.BlockAgeStructureProcessor processor, ) { return net.minecraft.structure.processor.BlockAgeStructureProcessor.method_28967(processor.wrapperContained); }

}