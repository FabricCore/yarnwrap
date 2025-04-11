package yarnwrap.network.encoding;
public class VarInts { public net.minecraft.network.encoding.VarInts wrapperContained; public VarInts(net.minecraft.network.encoding.VarInts wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_BYTES() { return wrapperContained.MAX_BYTES; }
// public void MAX_BYTES(int value) { wrapperContained.MAX_BYTES = value; }
// public int DATA_BITS_MASK() { return wrapperContained.DATA_BITS_MASK; }
// public void DATA_BITS_MASK(int value) { wrapperContained.DATA_BITS_MASK = value; }
// public int MORE_BITS_MASK() { return wrapperContained.MORE_BITS_MASK; }
// public void MORE_BITS_MASK(int value) { wrapperContained.MORE_BITS_MASK = value; }
// public int DATA_BITS_PER_BYTE() { return wrapperContained.DATA_BITS_PER_BYTE; }
// public void DATA_BITS_PER_BYTE(int value) { wrapperContained.DATA_BITS_PER_BYTE = value; }
public boolean shouldContinueRead(byte b) { return wrapperContained.shouldContinueRead(b); }
public int getSizeInBytes(int i) { return wrapperContained.getSizeInBytes(i); }
public int read(io.netty.buffer.ByteBuf buf) { return wrapperContained.read(buf); }
public io.netty.buffer.ByteBuf write(io.netty.buffer.ByteBuf buf,int i) { return wrapperContained.write(buf,i); }

}