package yarnwrap.structure.processor;
public class BlockRotStructureProcessor { public net.minecraft.structure.processor.BlockRotStructureProcessor wrapperContained; public BlockRotStructureProcessor(net.minecraft.structure.processor.BlockRotStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public float integrity() { return wrapperContained.integrity; }
// public void integrity(float value) { wrapperContained.integrity = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public java.util.Optional rottableBlocks() { return wrapperContained.rottableBlocks; }
// public void rottableBlocks(java.util.Optional value) { wrapperContained.rottableBlocks = value; }
public BlockRotStructureProcessor(float integrity) { this.wrapperContained = new net.minecraft.structure.processor.BlockRotStructureProcessor(integrity); }
// public BlockRotStructureProcessor(java.util.Optional rottableBlocks,float integrity) { this.wrapperContained = new net.minecraft.structure.processor.BlockRotStructureProcessor(rottableBlocks,integrity); }
public BlockRotStructureProcessor(yarnwrap.registry.entry.RegistryEntryList rottableBlocks,float integrity) { this.wrapperContained = new net.minecraft.structure.processor.BlockRotStructureProcessor(rottableBlocks.wrapperContained,integrity); }
// public com.mojang.datafixers.kinds.App method_42711(Object instance) { return wrapperContained.method_42711(instance); }
// public java.lang.Float method_42712(yarnwrap.structure.processor.BlockRotStructureProcessor processor) { return wrapperContained.method_42712(processor.wrapperContained); }
// public java.util.Optional method_42713(yarnwrap.structure.processor.BlockRotStructureProcessor processor) { return wrapperContained.method_42713(processor.wrapperContained); }

}