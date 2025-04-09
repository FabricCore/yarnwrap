package yarnwrap.block;
public class OxidizableDoorBlock { public net.minecraft.block.OxidizableDoorBlock wrapperContained; public OxidizableDoorBlock(net.minecraft.block.OxidizableDoorBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }

}