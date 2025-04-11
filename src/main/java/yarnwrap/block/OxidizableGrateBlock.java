package yarnwrap.block;
public class OxidizableGrateBlock { public net.minecraft.block.OxidizableGrateBlock wrapperContained; public OxidizableGrateBlock(net.minecraft.block.OxidizableGrateBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }
// // public void oxidationLevel(Object value) { wrapperContained.oxidationLevel = value; }

}