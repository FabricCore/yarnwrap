package yarnwrap.util;
public class DelegatingDataOutput { public net.minecraft.util.DelegatingDataOutput wrapperContained; public DelegatingDataOutput(net.minecraft.util.DelegatingDataOutput wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.io.DataOutput delegate() { return wrapperContained.delegate; }
// public void delegate(java.io.DataOutput value) { wrapperContained.delegate = value; }
// public static java.io.DataOutput delegate() { return net.minecraft.util.DelegatingDataOutput.delegate; }
// public static void delegate(java.io.DataOutput value, ) { net.minecraft.util.DelegatingDataOutput.delegate = value; }

public DelegatingDataOutput(java.io.DataOutput delegate) { this.wrapperContained = new net.minecraft.util.DelegatingDataOutput(delegate); }
// public void write(int v) { wrapperContained.write(v); }
// public static void write(int v, ) { net.minecraft.util.DelegatingDataOutput.write(v); }
// public void write(byte b) { wrapperContained.write(b); }
// public static void write(byte b, ) { net.minecraft.util.DelegatingDataOutput.write(b); }
// public void write(byte bs,int off,int len) { wrapperContained.write(bs,off,len); }
// public static void write(byte bs,int off,int len, ) { net.minecraft.util.DelegatingDataOutput.write(bs,off,len); }
// public void writeBoolean(boolean v) { wrapperContained.writeBoolean(v); }
// public static void writeBoolean(boolean v, ) { net.minecraft.util.DelegatingDataOutput.writeBoolean(v); }
// public void writeByte(int v) { wrapperContained.writeByte(v); }
// public static void writeByte(int v, ) { net.minecraft.util.DelegatingDataOutput.writeByte(v); }
// public void writeBytes(java.lang.String s) { wrapperContained.writeBytes(s); }
// public static void writeBytes(java.lang.String s, ) { net.minecraft.util.DelegatingDataOutput.writeBytes(s); }
// public void writeChar(int v) { wrapperContained.writeChar(v); }
// public static void writeChar(int v, ) { net.minecraft.util.DelegatingDataOutput.writeChar(v); }
// public void writeChars(java.lang.String s) { wrapperContained.writeChars(s); }
// public static void writeChars(java.lang.String s, ) { net.minecraft.util.DelegatingDataOutput.writeChars(s); }
// public void writeDouble(double v) { wrapperContained.writeDouble(v); }
// public static void writeDouble(double v, ) { net.minecraft.util.DelegatingDataOutput.writeDouble(v); }
// public void writeFloat(float v) { wrapperContained.writeFloat(v); }
// public static void writeFloat(float v, ) { net.minecraft.util.DelegatingDataOutput.writeFloat(v); }
// public void writeInt(int v) { wrapperContained.writeInt(v); }
// public static void writeInt(int v, ) { net.minecraft.util.DelegatingDataOutput.writeInt(v); }
// public void writeLong(long v) { wrapperContained.writeLong(v); }
// public static void writeLong(long v, ) { net.minecraft.util.DelegatingDataOutput.writeLong(v); }
// public void writeShort(int v) { wrapperContained.writeShort(v); }
// public static void writeShort(int v, ) { net.minecraft.util.DelegatingDataOutput.writeShort(v); }
// public void writeUTF(java.lang.String s) { wrapperContained.writeUTF(s); }
// public static void writeUTF(java.lang.String s, ) { net.minecraft.util.DelegatingDataOutput.writeUTF(s); }

}