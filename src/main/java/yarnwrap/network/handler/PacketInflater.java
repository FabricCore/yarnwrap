package yarnwrap.network.handler;
public class PacketInflater { public net.minecraft.network.handler.PacketInflater wrapperContained; public PacketInflater(net.minecraft.network.handler.PacketInflater wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.zip.Inflater inflater() { return wrapperContained.inflater; }
// public void inflater(java.util.zip.Inflater value) { wrapperContained.inflater = value; }
// public int compressionThreshold() { return wrapperContained.compressionThreshold; }
// public void compressionThreshold(int value) { wrapperContained.compressionThreshold = value; }
public int MAXIMUM_PACKET_SIZE() { return wrapperContained.MAXIMUM_PACKET_SIZE; }
// public void MAXIMUM_PACKET_SIZE(int value) { wrapperContained.MAXIMUM_PACKET_SIZE = value; }
// public boolean rejectsBadPackets() { return wrapperContained.rejectsBadPackets; }
// public void rejectsBadPackets(boolean value) { wrapperContained.rejectsBadPackets = value; }
public PacketInflater(int compressionThreshold,boolean rejectsBadPackets) { this.wrapperContained = new net.minecraft.network.handler.PacketInflater(compressionThreshold,rejectsBadPackets); }
// public void decode(io.netty.channel.ChannelHandlerContext ctx,io.netty.buffer.ByteBuf buf,java.util.List objects) { wrapperContained.decode(ctx,buf,objects); }
public void setCompressionThreshold(int compressionThreshold,boolean rejectsBadPackets) { wrapperContained.setCompressionThreshold(compressionThreshold,rejectsBadPackets); }
// public void setInputBuf(io.netty.buffer.ByteBuf buf) { wrapperContained.setInputBuf(buf); }
// public io.netty.buffer.ByteBuf inflate(io.netty.channel.ChannelHandlerContext context,int expectedSize) { return wrapperContained.inflate(context,expectedSize); }

}