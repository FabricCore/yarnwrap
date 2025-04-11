package yarnwrap.util;
public class DelegatingDataOutput { public net.minecraft.util.DelegatingDataOutput wrapperContained; public DelegatingDataOutput(net.minecraft.util.DelegatingDataOutput wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.io.DataOutput delegate() { return wrapperContained.delegate; }
// public void delegate(java.io.DataOutput value) { wrapperContained.delegate = value; }
public DelegatingDataOutput(java.io.DataOutput delegate) { this.wrapperContained = new net.minecraft.util.DelegatingDataOutput(delegate); }
// public void write(int v) { wrapperContained.write(v); }
// public void write(byte b) { wrapperContained.write(b); }
// public void write(byte bs,int off,int len) { wrapperContained.write(bs,off,len); }
// public void writeBoolean(boolean v) { wrapperContained.writeBoolean(v); }
// public void writeByte(int v) { wrapperContained.writeByte(v); }
// public void writeBytes(java.lang.String s) { wrapperContained.writeBytes(s); }
// public void writeChar(int v) { wrapperContained.writeChar(v); }
// public void writeChars(java.lang.String s) { wrapperContained.writeChars(s); }
// public void writeDouble(double v) { wrapperContained.writeDouble(v); }
// public void writeFloat(float v) { wrapperContained.writeFloat(v); }
// public void writeInt(int v) { wrapperContained.writeInt(v); }
// public void writeLong(long v) { wrapperContained.writeLong(v); }
// public void writeShort(int v) { wrapperContained.writeShort(v); }
// public void writeUTF(java.lang.String s) { wrapperContained.writeUTF(s); }

}