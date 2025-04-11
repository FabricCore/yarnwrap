package yarnwrap.structure.processor;
public class RuleStructureProcessor { public net.minecraft.structure.processor.RuleStructureProcessor wrapperContained; public RuleStructureProcessor(net.minecraft.structure.processor.RuleStructureProcessor wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.collect.ImmutableList rules() { return wrapperContained.rules; }
// public void rules(com.google.common.collect.ImmutableList value) { wrapperContained.rules = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}