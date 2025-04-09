package yarnwrap.block;
public class CherryLeavesBlock { public net.minecraft.block.CherryLeavesBlock wrapperContained; public CherryLeavesBlock(net.minecraft.block.CherryLeavesBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}