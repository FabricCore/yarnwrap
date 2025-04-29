package yarnwrap.network.handler;
public class LegacyQueryHandler { public net.minecraft.network.handler.LegacyQueryHandler wrapperContained; public LegacyQueryHandler(net.minecraft.network.handler.LegacyQueryHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.network.handler.LegacyQueryHandler.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.network.handler.LegacyQueryHandler.LOGGER = value; }

// public yarnwrap.network.QueryableServer server() { return new yarnwrap.network.QueryableServer(wrapperContained.server); }
// public void server(yarnwrap.network.QueryableServer value) { wrapperContained.server = value.wrapperContained; }
// public static yarnwrap.network.QueryableServer server() { return new yarnwrap.network.QueryableServer(net.minecraft.network.handler.LegacyQueryHandler.server); }
// public static void server(yarnwrap.network.QueryableServer value, ) { net.minecraft.network.handler.LegacyQueryHandler.server = value.wrapperContained; }

public LegacyQueryHandler(yarnwrap.network.QueryableServer server) { this.wrapperContained = new net.minecraft.network.handler.LegacyQueryHandler(server.wrapperContained); }
public void channelRead(io.netty.channel.ChannelHandlerContext ctx,java.lang.Object msg) { wrapperContained.channelRead(ctx,msg); }
// public static void channelRead(io.netty.channel.ChannelHandlerContext ctx,java.lang.Object msg, ) { net.minecraft.network.handler.LegacyQueryHandler.channelRead(ctx,msg); }
// public void reply(io.netty.channel.ChannelHandlerContext context,io.netty.buffer.ByteBuf buf) { wrapperContained.reply(context,buf); }
// public static void reply(io.netty.channel.ChannelHandlerContext context,io.netty.buffer.ByteBuf buf, ) { net.minecraft.network.handler.LegacyQueryHandler.reply(context,buf); }
// public java.lang.String getResponseFor1_2(yarnwrap.network.QueryableServer server) { return wrapperContained.getResponseFor1_2(server.wrapperContained); }
// public static java.lang.String getResponseFor1_2(yarnwrap.network.QueryableServer server, ) { return net.minecraft.network.handler.LegacyQueryHandler.getResponseFor1_2(server.wrapperContained); }
// public boolean isLegacyQuery(io.netty.buffer.ByteBuf buf) { return wrapperContained.isLegacyQuery(buf); }
// public static boolean isLegacyQuery(io.netty.buffer.ByteBuf buf, ) { return net.minecraft.network.handler.LegacyQueryHandler.isLegacyQuery(buf); }
// public io.netty.buffer.ByteBuf createBuf(io.netty.buffer.ByteBufAllocator allocator,java.lang.String string) { return wrapperContained.createBuf(allocator,string); }
// public static io.netty.buffer.ByteBuf createBuf(io.netty.buffer.ByteBufAllocator allocator,java.lang.String string, ) { return net.minecraft.network.handler.LegacyQueryHandler.createBuf(allocator,string); }
// public java.lang.String getResponse(yarnwrap.network.QueryableServer server) { return wrapperContained.getResponse(server.wrapperContained); }
// public static java.lang.String getResponse(yarnwrap.network.QueryableServer server, ) { return net.minecraft.network.handler.LegacyQueryHandler.getResponse(server.wrapperContained); }

}