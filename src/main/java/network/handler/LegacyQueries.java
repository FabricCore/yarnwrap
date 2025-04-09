package yarnwrap.network.handler;
public class LegacyQueries { public net.minecraft.network.handler.LegacyQueries wrapperContained; public LegacyQueries(net.minecraft.network.handler.LegacyQueries wrapperContained) { this.wrapperContained = wrapperContained; }

public int HEADER() { return wrapperContained.HEADER; }
public java.lang.String PING_HOST() { return wrapperContained.PING_HOST; }
public int QUERY_PACKET_ID() { return wrapperContained.QUERY_PACKET_ID; }
public int BUFFER_SIZE() { return wrapperContained.BUFFER_SIZE; }
public int PROTOCOL_VERSION() { return wrapperContained.PROTOCOL_VERSION; }
public java.lang.String read(io.netty.buffer.ByteBuf buf) { return wrapperContained.read(buf); }
public void write(io.netty.buffer.ByteBuf buf,java.lang.String string) { wrapperContained.write(buf,string); }

}