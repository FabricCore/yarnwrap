package yarnwrap.server.rcon;
public class DataStreamHelper { public net.minecraft.server.rcon.DataStreamHelper wrapperContained; public DataStreamHelper(net.minecraft.server.rcon.DataStreamHelper wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.io.ByteArrayOutputStream byteArrayOutputStream() { return wrapperContained.byteArrayOutputStream; }
// public void byteArrayOutputStream(java.io.ByteArrayOutputStream value) { wrapperContained.byteArrayOutputStream = value; }
// public static java.io.ByteArrayOutputStream byteArrayOutputStream() { return net.minecraft.server.rcon.DataStreamHelper.byteArrayOutputStream; }
// public static void byteArrayOutputStream(java.io.ByteArrayOutputStream value, ) { net.minecraft.server.rcon.DataStreamHelper.byteArrayOutputStream = value; }

// public java.io.DataOutputStream dataOutputStream() { return wrapperContained.dataOutputStream; }
// public void dataOutputStream(java.io.DataOutputStream value) { wrapperContained.dataOutputStream = value; }
// public static java.io.DataOutputStream dataOutputStream() { return net.minecraft.server.rcon.DataStreamHelper.dataOutputStream; }
// public static void dataOutputStream(java.io.DataOutputStream value, ) { net.minecraft.server.rcon.DataStreamHelper.dataOutputStream = value; }

public DataStreamHelper(int size) { this.wrapperContained = new net.minecraft.server.rcon.DataStreamHelper(size); }
public byte[] bytes() { return wrapperContained.bytes(); }
// public static byte[] bytes() { return net.minecraft.server.rcon.DataStreamHelper.bytes(); }
// public void writeBytes(java.lang.String value) { wrapperContained.writeBytes(value); }
// public static void writeBytes(java.lang.String value, ) { net.minecraft.server.rcon.DataStreamHelper.writeBytes(value); }
// public void writeShort(short value) { wrapperContained.writeShort(value); }
// public static void writeShort(short value, ) { net.minecraft.server.rcon.DataStreamHelper.writeShort(value); }
// public void write(int value) { wrapperContained.write(value); }
// public static void write(int value, ) { net.minecraft.server.rcon.DataStreamHelper.write(value); }
public void reset() { wrapperContained.reset(); }
// public static void reset() { net.minecraft.server.rcon.DataStreamHelper.reset(); }
// public void write(byte values) { wrapperContained.write(values); }
// public static void write(byte values, ) { net.minecraft.server.rcon.DataStreamHelper.write(values); }
// public void writeFloat(float value) { wrapperContained.writeFloat(value); }
// public static void writeFloat(float value, ) { net.minecraft.server.rcon.DataStreamHelper.writeFloat(value); }
// public void writeInt(int value) { wrapperContained.writeInt(value); }
// public static void writeInt(int value, ) { net.minecraft.server.rcon.DataStreamHelper.writeInt(value); }

}