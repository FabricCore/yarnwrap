package yarnwrap.util;
public class FixedBufferInputStream { public net.minecraft.util.FixedBufferInputStream wrapperContained; public FixedBufferInputStream(net.minecraft.util.FixedBufferInputStream wrapperContained) { this.wrapperContained = wrapperContained; }

// public int DEFAULT_BUFFER_SIZE() { return wrapperContained.DEFAULT_BUFFER_SIZE; }
// public void DEFAULT_BUFFER_SIZE(int value) { wrapperContained.DEFAULT_BUFFER_SIZE = value; }
// public static int DEFAULT_BUFFER_SIZE() { return net.minecraft.util.FixedBufferInputStream.DEFAULT_BUFFER_SIZE; }
// public static void DEFAULT_BUFFER_SIZE(int value, ) { net.minecraft.util.FixedBufferInputStream.DEFAULT_BUFFER_SIZE = value; }

// public java.io.InputStream stream() { return wrapperContained.stream; }
// public void stream(java.io.InputStream value) { wrapperContained.stream = value; }
// public static java.io.InputStream stream() { return net.minecraft.util.FixedBufferInputStream.stream; }
// public static void stream(java.io.InputStream value, ) { net.minecraft.util.FixedBufferInputStream.stream = value; }

// public byte[] buf() { return wrapperContained.buf; }
// public void buf(byte[] value) { wrapperContained.buf = value; }
// public static byte[] buf() { return net.minecraft.util.FixedBufferInputStream.buf; }
// public static void buf(byte[] value, ) { net.minecraft.util.FixedBufferInputStream.buf = value; }

// public int end() { return wrapperContained.end; }
// public void end(int value) { wrapperContained.end = value; }
// public static int end() { return net.minecraft.util.FixedBufferInputStream.end; }
// public static void end(int value, ) { net.minecraft.util.FixedBufferInputStream.end = value; }

// public int start() { return wrapperContained.start; }
// public void start(int value) { wrapperContained.start = value; }
// public static int start() { return net.minecraft.util.FixedBufferInputStream.start; }
// public static void start(int value, ) { net.minecraft.util.FixedBufferInputStream.start = value; }

public FixedBufferInputStream(java.io.InputStream stream) { this.wrapperContained = new net.minecraft.util.FixedBufferInputStream(stream); }
public FixedBufferInputStream(java.io.InputStream stream,int size) { this.wrapperContained = new net.minecraft.util.FixedBufferInputStream(stream,size); }
// public int getAvailableBuffer() { return wrapperContained.getAvailableBuffer(); }
// public static int getAvailableBuffer() { return net.minecraft.util.FixedBufferInputStream.getAvailableBuffer(); }
// public void fill() { wrapperContained.fill(); }
// public static void fill() { net.minecraft.util.FixedBufferInputStream.fill(); }
// public int read(byte buf,int offset,int length) { return wrapperContained.read(buf,offset,length); }
// public static int read(byte buf,int offset,int length, ) { return net.minecraft.util.FixedBufferInputStream.read(buf,offset,length); }
// public long skip(long n) { return wrapperContained.skip(n); }
// public static long skip(long n, ) { return net.minecraft.util.FixedBufferInputStream.skip(n); }

}