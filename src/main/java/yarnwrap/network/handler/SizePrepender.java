package yarnwrap.network.handler;
public class SizePrepender { public net.minecraft.network.handler.SizePrepender wrapperContained; public SizePrepender(net.minecraft.network.handler.SizePrepender wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_PREPEND_LENGTH() { return wrapperContained.MAX_PREPEND_LENGTH; }
// public void MAX_PREPEND_LENGTH(int value) { wrapperContained.MAX_PREPEND_LENGTH = value; }
public static int MAX_PREPEND_LENGTH() { return net.minecraft.network.handler.SizePrepender.MAX_PREPEND_LENGTH; }
// public static void MAX_PREPEND_LENGTH(int value, ) { net.minecraft.network.handler.SizePrepender.MAX_PREPEND_LENGTH = value; }

// public void encode(io.netty.channel.ChannelHandlerContext ctx,java.lang.Object input,io.netty.buffer.ByteBuf output) { wrapperContained.encode(ctx,input,output); }
// public static void encode(io.netty.channel.ChannelHandlerContext ctx,java.lang.Object input,io.netty.buffer.ByteBuf output, ) { net.minecraft.network.handler.SizePrepender.encode(ctx,input,output); }

}