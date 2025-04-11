package yarnwrap.block;
public class OxidizableSlabBlock { public net.minecraft.block.OxidizableSlabBlock wrapperContained; public OxidizableSlabBlock(net.minecraft.block.OxidizableSlabBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }
// // public void oxidationLevel(Object value) { wrapperContained.oxidationLevel = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public OxidizableSlabBlock(Object oxidationLevel,Object settings) { this.wrapperContained = new net.minecraft.block.OxidizableSlabBlock(oxidationLevel,settings); }
// public com.mojang.datafixers.kinds.App method_54069(Object instance) { return wrapperContained.method_54069(instance); }

}