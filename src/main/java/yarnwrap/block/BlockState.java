package yarnwrap.block;
public class BlockState { public net.minecraft.block.BlockState wrapperContained; public BlockState(net.minecraft.block.BlockState wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.block.BlockState.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.block.BlockState.CODEC = value; }


}