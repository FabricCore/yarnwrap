package yarnwrap.network.handler;
public class PacketInflater { public net.minecraft.network.handler.PacketInflater wrapperContained; public PacketInflater(net.minecraft.network.handler.PacketInflater wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.zip.Inflater inflater() { return wrapperContained.inflater; }
// public int compressionThreshold() { return wrapperContained.compressionThreshold; }
public int MAXIMUM_PACKET_SIZE() { return wrapperContained.MAXIMUM_PACKET_SIZE; }
// public boolean rejectsBadPackets() { return wrapperContained.rejectsBadPackets; }
public void setCompressionThreshold(int compressionThreshold,boolean rejectsBadPackets) { wrapperContained.setCompressionThreshold(compressionThreshold,rejectsBadPackets); }
// public void setInputBuf(io.netty.buffer.ByteBuf buf) { wrapperContained.setInputBuf(buf); }
// public io.netty.buffer.ByteBuf inflate(io.netty.channel.ChannelHandlerContext context,int expectedSize) { return wrapperContained.inflate(context,expectedSize); }

}