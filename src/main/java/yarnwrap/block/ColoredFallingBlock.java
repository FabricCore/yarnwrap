package yarnwrap.block;
public class ColoredFallingBlock { public net.minecraft.block.ColoredFallingBlock wrapperContained; public ColoredFallingBlock(net.minecraft.block.ColoredFallingBlock wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
// public yarnwrap.util.ColorCode color() { return new yarnwrap.util.ColorCode(wrapperContained.color); }
// public void color(yarnwrap.util.ColorCode value) { wrapperContained.color = value.wrapperContained; }

}