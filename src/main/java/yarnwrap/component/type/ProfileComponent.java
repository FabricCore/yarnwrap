package yarnwrap.component.type;
public class ProfileComponent { public net.minecraft.component.type.ProfileComponent wrapperContained; public ProfileComponent(net.minecraft.component.type.ProfileComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public void BASE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BASE_CODEC = value; }
public java.util.concurrent.CompletableFuture getFuture() { return wrapperContained.getFuture(); }
// public com.mojang.authlib.GameProfile createProfile(java.util.Optional name,java.util.Optional id,com.mojang.authlib.properties.PropertyMap properties) { return wrapperContained.createProfile(name,id,properties); }
public boolean isCompleted() { return wrapperContained.isCompleted(); }

}