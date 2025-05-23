package yarnwrap.block;
public class TestInstanceBlock { public net.minecraft.block.TestInstanceBlock wrapperContained; public TestInstanceBlock(net.minecraft.block.TestInstanceBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.TestInstanceBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.TestInstanceBlock.CODEC = value; }


}