package yarnwrap.network.handler;
public class LocalBufUnpacker { public net.minecraft.network.handler.LocalBufUnpacker wrapperContained; public LocalBufUnpacker(net.minecraft.network.handler.LocalBufUnpacker wrapperContained) { this.wrapperContained = wrapperContained; }

public void channelRead(io.netty.channel.ChannelHandlerContext context,java.lang.Object buf) { wrapperContained.channelRead(context,buf); }
// public static void channelRead(io.netty.channel.ChannelHandlerContext context,java.lang.Object buf, ) { net.minecraft.network.handler.LocalBufUnpacker.channelRead(context,buf); }

}