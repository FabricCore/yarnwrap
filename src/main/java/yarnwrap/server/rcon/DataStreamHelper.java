package yarnwrap.server.rcon;
public class DataStreamHelper { public net.minecraft.server.rcon.DataStreamHelper wrapperContained; public DataStreamHelper(net.minecraft.server.rcon.DataStreamHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.io.ByteArrayOutputStream byteArrayOutputStream() { return wrapperContained.byteArrayOutputStream; }
// public void byteArrayOutputStream(java.io.ByteArrayOutputStream value) { wrapperContained.byteArrayOutputStream = value; }
// public java.io.DataOutputStream dataOutputStream() { return wrapperContained.dataOutputStream; }
// public void dataOutputStream(java.io.DataOutputStream value) { wrapperContained.dataOutputStream = value; }
public byte[] bytes() { return wrapperContained.bytes(); }
// public void writeBytes(java.lang.String value) { wrapperContained.writeBytes(value); }
// public void writeShort(short value) { wrapperContained.writeShort(value); }
// public void write(int value) { wrapperContained.write(value); }
public void reset() { wrapperContained.reset(); }
// public void write(byte values) { wrapperContained.write(values); }
// public void writeFloat(float value) { wrapperContained.writeFloat(value); }
// public void writeInt(int value) { wrapperContained.writeInt(value); }

}