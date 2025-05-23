package yarnwrap.network.handler;
public class LocalBufPacker { public net.minecraft.network.handler.LocalBufPacker wrapperContained; public LocalBufPacker(net.minecraft.network.handler.LocalBufPacker wrapperContained) { this.wrapperContained = wrapperContained; }

public void write(io.netty.channel.ChannelHandlerContext context,java.lang.Object buf,io.netty.channel.ChannelPromise channelPromise) { wrapperContained.write(context,buf,channelPromise); }
// public static void write(io.netty.channel.ChannelHandlerContext context,java.lang.Object buf,io.netty.channel.ChannelPromise channelPromise, ) { net.minecraft.network.handler.LocalBufPacker.write(context,buf,channelPromise); }

}