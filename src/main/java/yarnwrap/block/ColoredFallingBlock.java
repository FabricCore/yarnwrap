package yarnwrap.block;
public class ColoredFallingBlock { public net.minecraft.block.ColoredFallingBlock wrapperContained; public ColoredFallingBlock(net.minecraft.block.ColoredFallingBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.ColoredFallingBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.ColoredFallingBlock.CODEC = value; }

// public yarnwrap.util.ColorCode color() { return new yarnwrap.util.ColorCode(wrapperContained.color); }
// public void color(yarnwrap.util.ColorCode value) { wrapperContained.color = value.wrapperContained; }
// public static yarnwrap.util.ColorCode color() { return new yarnwrap.util.ColorCode(net.minecraft.block.ColoredFallingBlock.color); }
// public static void color(yarnwrap.util.ColorCode value, ) { net.minecraft.block.ColoredFallingBlock.color = value.wrapperContained; }

// public ColoredFallingBlock(yarnwrap.util.ColorCode color,Object settings) { this.wrapperContained = new net.minecraft.block.ColoredFallingBlock(color.wrapperContained,settings); }
// public com.mojang.datafixers.kinds.App method_53996(Object instance) { return wrapperContained.method_53996(instance); }
// public static com.mojang.datafixers.kinds.App method_53996(Object instance, ) { return net.minecraft.block.ColoredFallingBlock.method_53996(instance); }
// public yarnwrap.util.ColorCode method_53997(yarnwrap.block.ColoredFallingBlock block) { return new yarnwrap.util.ColorCode(wrapperContained.method_53997(block.wrapperContained)); }
// public static yarnwrap.util.ColorCode method_53997(yarnwrap.block.ColoredFallingBlock block, ) { return new yarnwrap.util.ColorCode(net.minecraft.block.ColoredFallingBlock.method_53997(block.wrapperContained)); }

}