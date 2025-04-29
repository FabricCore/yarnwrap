package yarnwrap.network.handler;
public class PacketSizeLogHandler { public net.minecraft.network.handler.PacketSizeLogHandler wrapperContained; public PacketSizeLogHandler(net.minecraft.network.handler.PacketSizeLogHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.handler.PacketSizeLogger logger() { return new yarnwrap.network.handler.PacketSizeLogger(wrapperContained.logger); }
// public void logger(yarnwrap.network.handler.PacketSizeLogger value) { wrapperContained.logger = value.wrapperContained; }
// public static yarnwrap.network.handler.PacketSizeLogger logger() { return new yarnwrap.network.handler.PacketSizeLogger(net.minecraft.network.handler.PacketSizeLogHandler.logger); }
// public static void logger(yarnwrap.network.handler.PacketSizeLogger value, ) { net.minecraft.network.handler.PacketSizeLogHandler.logger = value.wrapperContained; }

public PacketSizeLogHandler(yarnwrap.network.handler.PacketSizeLogger logger) { this.wrapperContained = new net.minecraft.network.handler.PacketSizeLogHandler(logger.wrapperContained); }
public void channelRead(io.netty.channel.ChannelHandlerContext context,java.lang.Object value) { wrapperContained.channelRead(context,value); }
// public static void channelRead(io.netty.channel.ChannelHandlerContext context,java.lang.Object value, ) { net.minecraft.network.handler.PacketSizeLogHandler.channelRead(context,value); }

}