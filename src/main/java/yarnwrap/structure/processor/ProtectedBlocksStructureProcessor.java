package yarnwrap.structure.processor;
public class ProtectedBlocksStructureProcessor { public net.minecraft.structure.processor.ProtectedBlocksStructureProcessor wrapperContained; public ProtectedBlocksStructureProcessor(net.minecraft.structure.processor.ProtectedBlocksStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.registry.tag.TagKey protectedBlocksTag() { return new yarnwrap.registry.tag.TagKey(wrapperContained.protectedBlocksTag); }
// public void protectedBlocksTag(yarnwrap.registry.tag.TagKey value) { wrapperContained.protectedBlocksTag = value.wrapperContained; }
// public static yarnwrap.registry.tag.TagKey protectedBlocksTag() { return new yarnwrap.registry.tag.TagKey(net.minecraft.structure.processor.ProtectedBlocksStructureProcessor.protectedBlocksTag); }
// public static void protectedBlocksTag(yarnwrap.registry.tag.TagKey value, ) { net.minecraft.structure.processor.ProtectedBlocksStructureProcessor.protectedBlocksTag = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.structure.processor.ProtectedBlocksStructureProcessor.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.structure.processor.ProtectedBlocksStructureProcessor.CODEC = value; }

public ProtectedBlocksStructureProcessor(yarnwrap.registry.tag.TagKey protectedBlocksTag) { this.wrapperContained = new net.minecraft.structure.processor.ProtectedBlocksStructureProcessor(protectedBlocksTag.wrapperContained); }
// public yarnwrap.registry.tag.TagKey method_37002(yarnwrap.structure.processor.ProtectedBlocksStructureProcessor processor) { return new yarnwrap.registry.tag.TagKey(wrapperContained.method_37002(processor.wrapperContained)); }
// public static yarnwrap.registry.tag.TagKey method_37002(yarnwrap.structure.processor.ProtectedBlocksStructureProcessor processor, ) { return new yarnwrap.registry.tag.TagKey(net.minecraft.structure.processor.ProtectedBlocksStructureProcessor.method_37002(processor.wrapperContained)); }

}