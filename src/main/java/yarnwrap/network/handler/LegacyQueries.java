package yarnwrap.network.handler;
public class LegacyQueries { public net.minecraft.network.handler.LegacyQueries wrapperContained; public LegacyQueries(net.minecraft.network.handler.LegacyQueries wrapperContained) { this.wrapperContained = wrapperContained; }

// public int HEADER() { return wrapperContained.HEADER; }
// public void HEADER(int value) { wrapperContained.HEADER = value; }
public static int HEADER() { return net.minecraft.network.handler.LegacyQueries.HEADER; }
// public static void HEADER(int value, ) { net.minecraft.network.handler.LegacyQueries.HEADER = value; }

// public java.lang.String PING_HOST() { return wrapperContained.PING_HOST; }
// public void PING_HOST(java.lang.String value) { wrapperContained.PING_HOST = value; }
public static java.lang.String PING_HOST() { return net.minecraft.network.handler.LegacyQueries.PING_HOST; }
// public static void PING_HOST(java.lang.String value, ) { net.minecraft.network.handler.LegacyQueries.PING_HOST = value; }

// public int QUERY_PACKET_ID() { return wrapperContained.QUERY_PACKET_ID; }
// public void QUERY_PACKET_ID(int value) { wrapperContained.QUERY_PACKET_ID = value; }
public static int QUERY_PACKET_ID() { return net.minecraft.network.handler.LegacyQueries.QUERY_PACKET_ID; }
// public static void QUERY_PACKET_ID(int value, ) { net.minecraft.network.handler.LegacyQueries.QUERY_PACKET_ID = value; }

// public int BUFFER_SIZE() { return wrapperContained.BUFFER_SIZE; }
// public void BUFFER_SIZE(int value) { wrapperContained.BUFFER_SIZE = value; }
public static int BUFFER_SIZE() { return net.minecraft.network.handler.LegacyQueries.BUFFER_SIZE; }
// public static void BUFFER_SIZE(int value, ) { net.minecraft.network.handler.LegacyQueries.BUFFER_SIZE = value; }

// public int PROTOCOL_VERSION() { return wrapperContained.PROTOCOL_VERSION; }
// public void PROTOCOL_VERSION(int value) { wrapperContained.PROTOCOL_VERSION = value; }
public static int PROTOCOL_VERSION() { return net.minecraft.network.handler.LegacyQueries.PROTOCOL_VERSION; }
// public static void PROTOCOL_VERSION(int value, ) { net.minecraft.network.handler.LegacyQueries.PROTOCOL_VERSION = value; }

// public java.lang.String read(io.netty.buffer.ByteBuf buf) { return wrapperContained.read(buf); }
// public static java.lang.String read(io.netty.buffer.ByteBuf buf, ) { return net.minecraft.network.handler.LegacyQueries.read(buf); }
// public void write(io.netty.buffer.ByteBuf buf,java.lang.String string) { wrapperContained.write(buf,string); }
// public static void write(io.netty.buffer.ByteBuf buf,java.lang.String string, ) { net.minecraft.network.handler.LegacyQueries.write(buf,string); }

}