package yarnwrap.block;
public class OxidizableGrateBlock { public net.minecraft.block.OxidizableGrateBlock wrapperContained; public OxidizableGrateBlock(net.minecraft.block.OxidizableGrateBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public Object oxidationLevel() { return wrapperContained.oxidationLevel; }

}