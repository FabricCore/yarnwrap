package yarnwrap.network.handler;
public class PacketDeflater { public net.minecraft.network.handler.PacketDeflater wrapperContained; public PacketDeflater(net.minecraft.network.handler.PacketDeflater wrapperContained) { this.wrapperContained = wrapperContained; }

// public int compressionThreshold() { return wrapperContained.compressionThreshold; }
// public byte[] deflateBuffer() { return wrapperContained.deflateBuffer; }
// public java.util.zip.Deflater deflater() { return wrapperContained.deflater; }
public void setCompressionThreshold(int compressionThreshold) { wrapperContained.setCompressionThreshold(compressionThreshold); }
public int getCompressionThreshold() { return wrapperContained.getCompressionThreshold(); }

}