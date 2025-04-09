package yarnwrap.structure.processor;
public class BlockIgnoreStructureProcessor { public net.minecraft.structure.processor.BlockIgnoreStructureProcessor wrapperContained; public BlockIgnoreStructureProcessor(net.minecraft.structure.processor.BlockIgnoreStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.structure.processor.BlockIgnoreStructureProcessor IGNORE_STRUCTURE_BLOCKS() { return new yarnwrap.structure.processor.BlockIgnoreStructureProcessor(wrapperContained.IGNORE_STRUCTURE_BLOCKS); }
public yarnwrap.structure.processor.BlockIgnoreStructureProcessor IGNORE_AIR() { return new yarnwrap.structure.processor.BlockIgnoreStructureProcessor(wrapperContained.IGNORE_AIR); }
// public com.google.common.collect.ImmutableList blocks() { return wrapperContained.blocks; }
public yarnwrap.structure.processor.BlockIgnoreStructureProcessor IGNORE_AIR_AND_STRUCTURE_BLOCKS() { return new yarnwrap.structure.processor.BlockIgnoreStructureProcessor(wrapperContained.IGNORE_AIR_AND_STRUCTURE_BLOCKS); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}