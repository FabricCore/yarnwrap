package yarnwrap.structure.processor;
public class JigsawReplacementStructureProcessor { public net.minecraft.structure.processor.JigsawReplacementStructureProcessor wrapperContained; public JigsawReplacementStructureProcessor(net.minecraft.structure.processor.JigsawReplacementStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.structure.processor.JigsawReplacementStructureProcessor INSTANCE() { return new yarnwrap.structure.processor.JigsawReplacementStructureProcessor(wrapperContained.INSTANCE); }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }

}