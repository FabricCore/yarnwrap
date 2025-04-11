package yarnwrap.util;
public class FixedBufferInputStream { public net.minecraft.util.FixedBufferInputStream wrapperContained; public FixedBufferInputStream(net.minecraft.util.FixedBufferInputStream wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_BUFFER_SIZE() { return wrapperContained.DEFAULT_BUFFER_SIZE; }
// public void DEFAULT_BUFFER_SIZE(int value) { wrapperContained.DEFAULT_BUFFER_SIZE = value; }
// public java.io.InputStream stream() { return wrapperContained.stream; }
// public void stream(java.io.InputStream value) { wrapperContained.stream = value; }
// public byte[] buf() { return wrapperContained.buf; }
// public void buf(byte[] value) { wrapperContained.buf = value; }
// public int end() { return wrapperContained.end; }
// public void end(int value) { wrapperContained.end = value; }
// public int start() { return wrapperContained.start; }
// public void start(int value) { wrapperContained.start = value; }
public FixedBufferInputStream(java.io.InputStream stream) { this.wrapperContained = new net.minecraft.util.FixedBufferInputStream(stream); }
public FixedBufferInputStream(java.io.InputStream stream,int size) { this.wrapperContained = new net.minecraft.util.FixedBufferInputStream(stream,size); }
// public int getAvailableBuffer() { return wrapperContained.getAvailableBuffer(); }
// public void fill() { wrapperContained.fill(); }
// public int read(byte buf,int offset,int length) { return wrapperContained.read(buf,offset,length); }
// public long skip(long n) { return wrapperContained.skip(n); }

}