package yarnwrap.network.message;
public class MessageSignatureData { public net.minecraft.network.message.MessageSignatureData wrapperContained; public MessageSignatureData(net.minecraft.network.message.MessageSignatureData wrapperContained) { this.wrapperContained = wrapperContained; }

// public byte[] data() { return wrapperContained.data; }
// public void data(byte[] value) { wrapperContained.data = value; }
public int SIZE() { return wrapperContained.SIZE; }
// public void SIZE(int value) { wrapperContained.SIZE = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public byte[] data() { return wrapperContained.data(); }
public boolean verify(yarnwrap.network.encryption.SignatureVerifier verifier,yarnwrap.network.encryption.SignatureUpdatable updatable) { return wrapperContained.verify(verifier.wrapperContained,updatable.wrapperContained); }
public void write(yarnwrap.network.PacketByteBuf buf,yarnwrap.network.message.MessageSignatureData signature) { wrapperContained.write(buf.wrapperContained,signature.wrapperContained); }
public java.nio.ByteBuffer toByteBuffer() { return wrapperContained.toByteBuffer(); }
public yarnwrap.network.message.MessageSignatureData fromBuf(yarnwrap.network.PacketByteBuf buf) { return new yarnwrap.network.message.MessageSignatureData(wrapperContained.fromBuf(buf.wrapperContained)); }
public Object pack(yarnwrap.network.message.MessageSignatureStorage storage) { return wrapperContained.pack(storage.wrapperContained); }

}