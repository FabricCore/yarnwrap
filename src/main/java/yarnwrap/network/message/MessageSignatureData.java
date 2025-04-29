package yarnwrap.network.message;
public class MessageSignatureData { public net.minecraft.network.message.MessageSignatureData wrapperContained; public MessageSignatureData(net.minecraft.network.message.MessageSignatureData wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte[] data() { return wrapperContained.data; }
// public void data(byte[] value) { wrapperContained.data = value; }
// public static byte[] data() { return net.minecraft.network.message.MessageSignatureData.data; }
// public static void data(byte[] value, ) { net.minecraft.network.message.MessageSignatureData.data = value; }

// public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
public static int SIZE() { return net.minecraft.network.message.MessageSignatureData.SIZE; }
// public static void SIZE(int value, ) { net.minecraft.network.message.MessageSignatureData.SIZE = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.network.message.MessageSignatureData.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.network.message.MessageSignatureData.CODEC = value; }

// public byte[] data() { return wrapperContained.data(); }
// // public static byte[] data() { return net.minecraft.network.message.MessageSignatureData.data(); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.network.message.MessageSignatureData.equals(o); }
public boolean verify(yarnwrap.network.encryption.SignatureVerifier verifier,yarnwrap.network.encryption.SignatureUpdatable updatable) { return wrapperContained.verify(verifier.wrapperContained,updatable.wrapperContained); }
// public static boolean verify(yarnwrap.network.encryption.SignatureVerifier verifier,yarnwrap.network.encryption.SignatureUpdatable updatable, ) { return net.minecraft.network.message.MessageSignatureData.verify(verifier.wrapperContained,updatable.wrapperContained); }
// public void write(yarnwrap.network.PacketByteBuf buf,yarnwrap.network.message.MessageSignatureData signature) { wrapperContained.write(buf.wrapperContained,signature.wrapperContained); }
// public static void write(yarnwrap.network.PacketByteBuf buf,yarnwrap.network.message.MessageSignatureData signature, ) { net.minecraft.network.message.MessageSignatureData.write(buf.wrapperContained,signature.wrapperContained); }
public java.nio.ByteBuffer toByteBuffer() { return wrapperContained.toByteBuffer(); }
// public static java.nio.ByteBuffer toByteBuffer() { return net.minecraft.network.message.MessageSignatureData.toByteBuffer(); }
// public yarnwrap.network.message.MessageSignatureData fromBuf(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.network.message.MessageSignatureData(wrapperContained.fromBuf(buf.wrapperContained)); }
// public static yarnwrap.network.message.MessageSignatureData fromBuf(yarnwrap.network.PacketByteBuf buf, ) { return new yarnwrap.network.message.MessageSignatureData(net.minecraft.network.message.MessageSignatureData.fromBuf(buf.wrapperContained)); }
public Object pack(yarnwrap.network.message.MessageSignatureStorage storage) { return wrapperContained.pack(storage.wrapperContained); }
// public static Object pack(yarnwrap.network.message.MessageSignatureStorage storage, ) { return net.minecraft.network.message.MessageSignatureData.pack(storage.wrapperContained); }

}