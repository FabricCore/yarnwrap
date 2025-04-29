package yarnwrap.block;
public class RotatedInfestedBlock { public net.minecraft.block.RotatedInfestedBlock wrapperContained; public RotatedInfestedBlock(net.minecraft.block.RotatedInfestedBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.RotatedInfestedBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.RotatedInfestedBlock.CODEC = value; }

// public com.mojang.datafixers.kinds.App method_54023(Object instance) { return wrapperContained.method_54023(instance); }
// public static com.mojang.datafixers.kinds.App method_54023(Object instance, ) { return net.minecraft.block.RotatedInfestedBlock.method_54023(instance); }

}