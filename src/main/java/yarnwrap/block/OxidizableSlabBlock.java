package yarnwrap.block;
public class OxidizableSlabBlock { public net.minecraft.block.OxidizableSlabBlock wrapperContained; public OxidizableSlabBlock(net.minecraft.block.OxidizableSlabBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }
// // public void oxidationLevel(Object value) { wrapperContained.oxidationLevel = value; }
public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }

}