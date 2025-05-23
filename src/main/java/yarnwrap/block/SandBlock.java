package yarnwrap.block;
public class SandBlock { public net.minecraft.block.SandBlock wrapperContained; public SandBlock(net.minecraft.block.SandBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.SandBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.SandBlock.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_67404(Object instance) { return wrapperContained.method_67404(instance); }
// public static com.mojang.datafixers.kinds.App method_67404(Object instance, ) { return net.minecraft.block.SandBlock.method_67404(instance); }
// public yarnwrap.util.ColorCode method_67405(yarnwrap.block.SandBlock block) { return new yarnwrap.util.ColorCode(wrapperContained.method_67405(block.wrapperContained)); }
// public static yarnwrap.util.ColorCode method_67405(yarnwrap.block.SandBlock block, ) { return new yarnwrap.util.ColorCode(net.minecraft.block.SandBlock.method_67405(block.wrapperContained)); }

}