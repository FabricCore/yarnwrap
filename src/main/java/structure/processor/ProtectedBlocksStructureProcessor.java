package yarnwrap.structure.processor;
public class ProtectedBlocksStructureProcessor { public net.minecraft.structure.processor.ProtectedBlocksStructureProcessor wrapperContained; public ProtectedBlocksStructureProcessor(net.minecraft.structure.processor.ProtectedBlocksStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.tag.TagKey protectedBlocksTag() { return new yarnwrap.registry.tag.TagKey(wrapperContained.protectedBlocksTag); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}