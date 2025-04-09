package yarnwrap.network.handler;
public class LegacyQueryHandler { public net.minecraft.network.handler.LegacyQueryHandler wrapperContained; public LegacyQueryHandler(net.minecraft.network.handler.LegacyQueryHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.network.QueryableServer server() { return new yarnwrap.network.QueryableServer(wrapperContained.server); }
// public void reply(io.netty.channel.ChannelHandlerContext context,io.netty.buffer.ByteBuf buf) { wrapperContained.reply(context,buf); }
// public java.lang.String getResponseFor1_2(yarnwrap.network.QueryableServer server) { return wrapperContained.getResponseFor1_2(server.wrapperContained); }
// public boolean isLegacyQuery(io.netty.buffer.ByteBuf buf) { return wrapperContained.isLegacyQuery(buf); }
// public io.netty.buffer.ByteBuf createBuf(io.netty.buffer.ByteBufAllocator allocator,java.lang.String string) { return wrapperContained.createBuf(allocator,string); }
// public java.lang.String getResponse(yarnwrap.network.QueryableServer server) { return wrapperContained.getResponse(server.wrapperContained); }

}