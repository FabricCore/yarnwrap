package yarnwrap.block;
public class ColoredFallingBlock { public net.minecraft.block.ColoredFallingBlock wrapperContained; public ColoredFallingBlock(net.minecraft.block.ColoredFallingBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.ColorCode color() { return new yarnwrap.util.ColorCode(wrapperContained.color); }

}