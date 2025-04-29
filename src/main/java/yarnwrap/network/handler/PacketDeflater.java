package yarnwrap.network.handler;
public class PacketDeflater { public net.minecraft.network.handler.PacketDeflater wrapperContained; public PacketDeflater(net.minecraft.network.handler.PacketDeflater wrapperContained) { this.wrapperContained = wrapperContained; }

// public int compressionThreshold() { return wrapperContained.compressionThreshold; }
// public void compressionThreshold(int value) { wrapperContained.compressionThreshold = value; }
// public static int compressionThreshold() { return net.minecraft.network.handler.PacketDeflater.compressionThreshold; }
// public static void compressionThreshold(int value, ) { net.minecraft.network.handler.PacketDeflater.compressionThreshold = value; }

// public byte[] deflateBuffer() { return wrapperContained.deflateBuffer; }
// public void deflateBuffer(byte[] value) { wrapperContained.deflateBuffer = value; }
// public static byte[] deflateBuffer() { return net.minecraft.network.handler.PacketDeflater.deflateBuffer; }
// public static void deflateBuffer(byte[] value, ) { net.minecraft.network.handler.PacketDeflater.deflateBuffer = value; }

// public java.util.zip.Deflater deflater() { return wrapperContained.deflater; }
// public void deflater(java.util.zip.Deflater value) { wrapperContained.deflater = value; }
// public static java.util.zip.Deflater deflater() { return net.minecraft.network.handler.PacketDeflater.deflater; }
// public static void deflater(java.util.zip.Deflater value, ) { net.minecraft.network.handler.PacketDeflater.deflater = value; }

public PacketDeflater(int compressionThreshold) { this.wrapperContained = new net.minecraft.network.handler.PacketDeflater(compressionThreshold); }
// public void encode(io.netty.channel.ChannelHandlerContext ctx,java.lang.Object input,io.netty.buffer.ByteBuf output) { wrapperContained.encode(ctx,input,output); }
// public static void encode(io.netty.channel.ChannelHandlerContext ctx,java.lang.Object input,io.netty.buffer.ByteBuf output, ) { net.minecraft.network.handler.PacketDeflater.encode(ctx,input,output); }
public void setCompressionThreshold(int compressionThreshold) { wrapperContained.setCompressionThreshold(compressionThreshold); }
// public static void setCompressionThreshold(int compressionThreshold, ) { net.minecraft.network.handler.PacketDeflater.setCompressionThreshold(compressionThreshold); }
public int getCompressionThreshold() { return wrapperContained.getCompressionThreshold(); }
// public static int getCompressionThreshold() { return net.minecraft.network.handler.PacketDeflater.getCompressionThreshold(); }

}