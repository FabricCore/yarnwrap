package yarnwrap.block;
public class MangroveLeavesBlock { public net.minecraft.block.MangroveLeavesBlock wrapperContained; public MangroveLeavesBlock(net.minecraft.block.MangroveLeavesBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}