package yarnwrap.structure.processor;
public class BlockRotStructureProcessor { public net.minecraft.structure.processor.BlockRotStructureProcessor wrapperContained; public BlockRotStructureProcessor(net.minecraft.structure.processor.BlockRotStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public float integrity() { return wrapperContained.integrity; }
// public void integrity(float value) { wrapperContained.integrity = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public java.util.Optional rottableBlocks() { return wrapperContained.rottableBlocks; }
// public void rottableBlocks(java.util.Optional value) { wrapperContained.rottableBlocks = value; }

}