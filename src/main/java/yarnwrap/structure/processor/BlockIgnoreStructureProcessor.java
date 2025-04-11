package yarnwrap.structure.processor;
public class BlockIgnoreStructureProcessor { public net.minecraft.structure.processor.BlockIgnoreStructureProcessor wrapperContained; public BlockIgnoreStructureProcessor(net.minecraft.structure.processor.BlockIgnoreStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.structure.processor.BlockIgnoreStructureProcessor IGNORE_STRUCTURE_BLOCKS() { return new yarnwrap.structure.processor.BlockIgnoreStructureProcessor(wrapperContained.IGNORE_STRUCTURE_BLOCKS); }
// public void IGNORE_STRUCTURE_BLOCKS(yarnwrap.structure.processor.BlockIgnoreStructureProcessor value) { wrapperContained.IGNORE_STRUCTURE_BLOCKS = value.wrapperContained; }
public yarnwrap.structure.processor.BlockIgnoreStructureProcessor IGNORE_AIR() { return new yarnwrap.structure.processor.BlockIgnoreStructureProcessor(wrapperContained.IGNORE_AIR); }
// public void IGNORE_AIR(yarnwrap.structure.processor.BlockIgnoreStructureProcessor value) { wrapperContained.IGNORE_AIR = value.wrapperContained; }
// public com.google.common.collect.ImmutableList blocks() { return wrapperContained.blocks; }
// public void blocks(com.google.common.collect.ImmutableList value) { wrapperContained.blocks = value; }
public yarnwrap.structure.processor.BlockIgnoreStructureProcessor IGNORE_AIR_AND_STRUCTURE_BLOCKS() { return new yarnwrap.structure.processor.BlockIgnoreStructureProcessor(wrapperContained.IGNORE_AIR_AND_STRUCTURE_BLOCKS); }
// public void IGNORE_AIR_AND_STRUCTURE_BLOCKS(yarnwrap.structure.processor.BlockIgnoreStructureProcessor value) { wrapperContained.IGNORE_AIR_AND_STRUCTURE_BLOCKS = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}