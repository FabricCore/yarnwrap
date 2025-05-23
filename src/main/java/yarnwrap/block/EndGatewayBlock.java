package yarnwrap.block;
public class EndGatewayBlock { public net.minecraft.block.EndGatewayBlock wrapperContained; public EndGatewayBlock(net.minecraft.block.EndGatewayBlock wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.block.EndGatewayBlock.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.block.EndGatewayBlock.CODEC = value; }


}