package yarnwrap.network.handler;
public class PacketDeflater { public net.minecraft.network.handler.PacketDeflater wrapperContained; public PacketDeflater(net.minecraft.network.handler.PacketDeflater wrapperContained) { this.wrapperContained = wrapperContained; }

// public int compressionThreshold() { return wrapperContained.compressionThreshold; }
// public void compressionThreshold(int value) { wrapperContained.compressionThreshold = value; }
// public byte[] deflateBuffer() { return wrapperContained.deflateBuffer; }
// public void deflateBuffer(byte[] value) { wrapperContained.deflateBuffer = value; }
// public java.util.zip.Deflater deflater() { return wrapperContained.deflater; }
// public void deflater(java.util.zip.Deflater value) { wrapperContained.deflater = value; }
public void setCompressionThreshold(int compressionThreshold) { wrapperContained.setCompressionThreshold(compressionThreshold); }
public int getCompressionThreshold() { return wrapperContained.getCompressionThreshold(); }

}