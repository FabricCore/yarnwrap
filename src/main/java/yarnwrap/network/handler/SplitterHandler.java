package yarnwrap.network.handler;
public class SplitterHandler { public net.minecraft.network.handler.SplitterHandler wrapperContained; public SplitterHandler(net.minecraft.network.handler.SplitterHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public int LENGTH_BYTES() { return wrapperContained.LENGTH_BYTES; }
// public void LENGTH_BYTES(int value) { wrapperContained.LENGTH_BYTES = value; }
// public static int LENGTH_BYTES() { return net.minecraft.network.handler.SplitterHandler.LENGTH_BYTES; }
// public static void LENGTH_BYTES(int value, ) { net.minecraft.network.handler.SplitterHandler.LENGTH_BYTES = value; }

// public io.netty.buffer.ByteBuf reusableBuf() { return wrapperContained.reusableBuf; }
// public void reusableBuf(io.netty.buffer.ByteBuf value) { wrapperContained.reusableBuf = value; }
// public static io.netty.buffer.ByteBuf reusableBuf() { return net.minecraft.network.handler.SplitterHandler.reusableBuf; }
// public static void reusableBuf(io.netty.buffer.ByteBuf value, ) { net.minecraft.network.handler.SplitterHandler.reusableBuf = value; }

// public yarnwrap.network.handler.PacketSizeLogger packetSizeLogger() { return new yarnwrap.network.handler.PacketSizeLogger(wrapperContained.packetSizeLogger); }
// public void packetSizeLogger(yarnwrap.network.handler.PacketSizeLogger value) { wrapperContained.packetSizeLogger = value.wrapperContained; }
// public static yarnwrap.network.handler.PacketSizeLogger packetSizeLogger() { return new yarnwrap.network.handler.PacketSizeLogger(net.minecraft.network.handler.SplitterHandler.packetSizeLogger); }
// public static void packetSizeLogger(yarnwrap.network.handler.PacketSizeLogger value, ) { net.minecraft.network.handler.SplitterHandler.packetSizeLogger = value.wrapperContained; }

public SplitterHandler(yarnwrap.network.handler.PacketSizeLogger packetSizeLogger) { this.wrapperContained = new net.minecraft.network.handler.SplitterHandler(packetSizeLogger.wrapperContained); }
// public void decode(io.netty.channel.ChannelHandlerContext ctx,io.netty.buffer.ByteBuf buf,java.util.List bytes) { wrapperContained.decode(ctx,buf,bytes); }
// public static void decode(io.netty.channel.ChannelHandlerContext ctx,io.netty.buffer.ByteBuf buf,java.util.List bytes, ) { net.minecraft.network.handler.SplitterHandler.decode(ctx,buf,bytes); }
// public void handlerRemoved0(io.netty.channel.ChannelHandlerContext context) { wrapperContained.handlerRemoved0(context); }
// public static void handlerRemoved0(io.netty.channel.ChannelHandlerContext context, ) { net.minecraft.network.handler.SplitterHandler.handlerRemoved0(context); }
// public boolean shouldSplit(io.netty.buffer.ByteBuf source,io.netty.buffer.ByteBuf sizeBuf) { return wrapperContained.shouldSplit(source,sizeBuf); }
// public static boolean shouldSplit(io.netty.buffer.ByteBuf source,io.netty.buffer.ByteBuf sizeBuf, ) { return net.minecraft.network.handler.SplitterHandler.shouldSplit(source,sizeBuf); }

}