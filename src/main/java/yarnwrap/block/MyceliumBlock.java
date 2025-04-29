package yarnwrap.block;
public class MyceliumBlock { public net.minecraft.block.MyceliumBlock wrapperContained; public MyceliumBlock(net.minecraft.block.MyceliumBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.MyceliumBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.MyceliumBlock.CODEC = value; }


}