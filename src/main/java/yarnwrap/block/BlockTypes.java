package yarnwrap.block;
public class BlockTypes { public net.minecraft.block.BlockTypes wrapperContained; public BlockTypes(net.minecraft.block.BlockTypes wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.BlockTypes.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.BlockTypes.CODEC = value; }

// public com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry) { return wrapperContained.registerAndGetDefault(registry.wrapperContained); }
// public static com.mojang.serialization.MapCodec registerAndGetDefault(yarnwrap.registry.Registry registry, ) { return net.minecraft.block.BlockTypes.registerAndGetDefault(registry.wrapperContained); }

}