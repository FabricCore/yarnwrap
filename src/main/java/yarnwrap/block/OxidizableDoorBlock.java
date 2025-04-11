package yarnwrap.block;
public class OxidizableDoorBlock { public net.minecraft.block.OxidizableDoorBlock wrapperContained; public OxidizableDoorBlock(net.minecraft.block.OxidizableDoorBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }
// // public void oxidationLevel(Object value) { wrapperContained.oxidationLevel = value; }

}