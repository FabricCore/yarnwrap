package yarnwrap.block;
public class FletchingTableBlock { public net.minecraft.block.FletchingTableBlock wrapperContained; public FletchingTableBlock(net.minecraft.block.FletchingTableBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}