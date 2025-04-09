package yarnwrap.block;
public class MyceliumBlock { public net.minecraft.block.MyceliumBlock wrapperContained; public MyceliumBlock(net.minecraft.block.MyceliumBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }

}