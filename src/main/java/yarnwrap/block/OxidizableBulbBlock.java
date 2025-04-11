package yarnwrap.block;
public class OxidizableBulbBlock { public net.minecraft.block.OxidizableBulbBlock wrapperContained; public OxidizableBulbBlock(net.minecraft.block.OxidizableBulbBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }
// // public void oxidationLevel(Object value) { wrapperContained.oxidationLevel = value; }

}