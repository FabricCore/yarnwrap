package yarnwrap.structure.processor;
public class JigsawReplacementStructureProcessor { public net.minecraft.structure.processor.JigsawReplacementStructureProcessor wrapperContained; public JigsawReplacementStructureProcessor(net.minecraft.structure.processor.JigsawReplacementStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.structure.processor.JigsawReplacementStructureProcessor INSTANCE() { return new yarnwrap.structure.processor.JigsawReplacementStructureProcessor(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.structure.processor.JigsawReplacementStructureProcessor value) { wrapperContained.INSTANCE = value.wrapperContained; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }

}