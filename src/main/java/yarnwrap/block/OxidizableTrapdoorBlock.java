package yarnwrap.block;
public class OxidizableTrapdoorBlock { public net.minecraft.block.OxidizableTrapdoorBlock wrapperContained; public OxidizableTrapdoorBlock(net.minecraft.block.OxidizableTrapdoorBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }
// // public void oxidationLevel(Object value) { wrapperContained.oxidationLevel = value; }

}