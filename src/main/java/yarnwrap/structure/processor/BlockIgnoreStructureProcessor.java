package yarnwrap.structure.processor;
public class BlockIgnoreStructureProcessor { public net.minecraft.structure.processor.BlockIgnoreStructureProcessor wrapperContained; public BlockIgnoreStructureProcessor(net.minecraft.structure.processor.BlockIgnoreStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.structure.processor.BlockIgnoreStructureProcessor IGNORE_STRUCTURE_BLOCKS() { return new yarnwrap.structure.processor.BlockIgnoreStructureProcessor(wrapperContained.IGNORE_STRUCTURE_BLOCKS); }
// public void IGNORE_STRUCTURE_BLOCKS(yarnwrap.structure.processor.BlockIgnoreStructureProcessor value) { wrapperContained.IGNORE_STRUCTURE_BLOCKS = value.wrapperContained; }
public static yarnwrap.structure.processor.BlockIgnoreStructureProcessor IGNORE_STRUCTURE_BLOCKS() { return new yarnwrap.structure.processor.BlockIgnoreStructureProcessor(net.minecraft.structure.processor.BlockIgnoreStructureProcessor.IGNORE_STRUCTURE_BLOCKS); }
// public static void IGNORE_STRUCTURE_BLOCKS(yarnwrap.structure.processor.BlockIgnoreStructureProcessor value, ) { net.minecraft.structure.processor.BlockIgnoreStructureProcessor.IGNORE_STRUCTURE_BLOCKS = value.wrapperContained; }

// public yarnwrap.structure.processor.BlockIgnoreStructureProcessor IGNORE_AIR() { return new yarnwrap.structure.processor.BlockIgnoreStructureProcessor(wrapperContained.IGNORE_AIR); }
// public void IGNORE_AIR(yarnwrap.structure.processor.BlockIgnoreStructureProcessor value) { wrapperContained.IGNORE_AIR = value.wrapperContained; }
public static yarnwrap.structure.processor.BlockIgnoreStructureProcessor IGNORE_AIR() { return new yarnwrap.structure.processor.BlockIgnoreStructureProcessor(net.minecraft.structure.processor.BlockIgnoreStructureProcessor.IGNORE_AIR); }
// public static void IGNORE_AIR(yarnwrap.structure.processor.BlockIgnoreStructureProcessor value, ) { net.minecraft.structure.processor.BlockIgnoreStructureProcessor.IGNORE_AIR = value.wrapperContained; }

// public com.google.common.collect.ImmutableList blocks() { return wrapperContained.blocks; }
// public void blocks(com.google.common.collect.ImmutableList value) { wrapperContained.blocks = value; }
// public static com.google.common.collect.ImmutableList blocks() { return net.minecraft.structure.processor.BlockIgnoreStructureProcessor.blocks; }
// public static void blocks(com.google.common.collect.ImmutableList value, ) { net.minecraft.structure.processor.BlockIgnoreStructureProcessor.blocks = value; }

// public yarnwrap.structure.processor.BlockIgnoreStructureProcessor IGNORE_AIR_AND_STRUCTURE_BLOCKS() { return new yarnwrap.structure.processor.BlockIgnoreStructureProcessor(wrapperContained.IGNORE_AIR_AND_STRUCTURE_BLOCKS); }
// public void IGNORE_AIR_AND_STRUCTURE_BLOCKS(yarnwrap.structure.processor.BlockIgnoreStructureProcessor value) { wrapperContained.IGNORE_AIR_AND_STRUCTURE_BLOCKS = value.wrapperContained; }
public static yarnwrap.structure.processor.BlockIgnoreStructureProcessor IGNORE_AIR_AND_STRUCTURE_BLOCKS() { return new yarnwrap.structure.processor.BlockIgnoreStructureProcessor(net.minecraft.structure.processor.BlockIgnoreStructureProcessor.IGNORE_AIR_AND_STRUCTURE_BLOCKS); }
// public static void IGNORE_AIR_AND_STRUCTURE_BLOCKS(yarnwrap.structure.processor.BlockIgnoreStructureProcessor value, ) { net.minecraft.structure.processor.BlockIgnoreStructureProcessor.IGNORE_AIR_AND_STRUCTURE_BLOCKS = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.structure.processor.BlockIgnoreStructureProcessor.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.structure.processor.BlockIgnoreStructureProcessor.CODEC = value; }

public BlockIgnoreStructureProcessor(java.util.List blocks) { this.wrapperContained = new net.minecraft.structure.processor.BlockIgnoreStructureProcessor(blocks); }
// public java.util.List method_28968(yarnwrap.structure.processor.BlockIgnoreStructureProcessor processor) { return wrapperContained.method_28968(processor.wrapperContained); }
// public static java.util.List method_28968(yarnwrap.structure.processor.BlockIgnoreStructureProcessor processor, ) { return net.minecraft.structure.processor.BlockIgnoreStructureProcessor.method_28968(processor.wrapperContained); }

}