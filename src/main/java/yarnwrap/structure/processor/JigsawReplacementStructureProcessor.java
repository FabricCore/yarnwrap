package yarnwrap.structure.processor;
public class JigsawReplacementStructureProcessor { public net.minecraft.structure.processor.JigsawReplacementStructureProcessor wrapperContained; public JigsawReplacementStructureProcessor(net.minecraft.structure.processor.JigsawReplacementStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.structure.processor.JigsawReplacementStructureProcessor INSTANCE() { return new yarnwrap.structure.processor.JigsawReplacementStructureProcessor(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.structure.processor.JigsawReplacementStructureProcessor value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.structure.processor.JigsawReplacementStructureProcessor INSTANCE() { return new yarnwrap.structure.processor.JigsawReplacementStructureProcessor(net.minecraft.structure.processor.JigsawReplacementStructureProcessor.INSTANCE); }
// public static void INSTANCE(yarnwrap.structure.processor.JigsawReplacementStructureProcessor value, ) { net.minecraft.structure.processor.JigsawReplacementStructureProcessor.INSTANCE = value.wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.structure.processor.JigsawReplacementStructureProcessor.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.structure.processor.JigsawReplacementStructureProcessor.CODEC = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.structure.processor.JigsawReplacementStructureProcessor.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.structure.processor.JigsawReplacementStructureProcessor.LOGGER = value; }


}