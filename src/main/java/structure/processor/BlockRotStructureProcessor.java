package yarnwrap.structure.processor;
public class BlockRotStructureProcessor { public net.minecraft.structure.processor.BlockRotStructureProcessor wrapperContained; public BlockRotStructureProcessor(net.minecraft.structure.processor.BlockRotStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public float integrity() { return wrapperContained.integrity; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public java.util.Optional rottableBlocks() { return wrapperContained.rottableBlocks; }

}