package yarnwrap.structure.processor;
public class StructureProcessorType { public net.minecraft.structure.processor.StructureProcessorType wrapperContained; public StructureProcessorType(net.minecraft.structure.processor.StructureProcessorType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec PROCESSORS_CODEC() { return wrapperContained.PROCESSORS_CODEC; }
public com.mojang.serialization.Codec REGISTRY_CODEC() { return wrapperContained.REGISTRY_CODEC; }
public com.mojang.serialization.Codec LIST_CODEC() { return wrapperContained.LIST_CODEC; }
// public yarnwrap.structure.processor.StructureProcessorType register(java.lang.String id,com.mojang.serialization.MapCodec codec) { return new yarnwrap.structure.processor.StructureProcessorType(wrapperContained.register(id,codec)); }

}