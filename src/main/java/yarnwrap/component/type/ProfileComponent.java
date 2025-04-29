package yarnwrap.component.type;
public class ProfileComponent { public net.minecraft.component.type.ProfileComponent wrapperContained; public ProfileComponent(net.minecraft.component.type.ProfileComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.ProfileComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.ProfileComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.ProfileComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.ProfileComponent.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public void BASE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BASE_CODEC = value; }
// public static com.mojang.serialization.Codec BASE_CODEC() { return net.minecraft.component.type.ProfileComponent.BASE_CODEC; }
// public static void BASE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.ProfileComponent.BASE_CODEC = value; }

public ProfileComponent(com.mojang.authlib.GameProfile gameProfile) { this.wrapperContained = new net.minecraft.component.type.ProfileComponent(gameProfile); }
public ProfileComponent(java.util.Optional name,java.util.Optional id,com.mojang.authlib.properties.PropertyMap properties) { this.wrapperContained = new net.minecraft.component.type.ProfileComponent(name,id,properties); }
public java.util.concurrent.CompletableFuture getFuture() { return wrapperContained.getFuture(); }
// public static java.util.concurrent.CompletableFuture getFuture() { return net.minecraft.component.type.ProfileComponent.getFuture(); }
// public com.mojang.datafixers.kinds.App method_57508(Object instance) { return wrapperContained.method_57508(instance); }
// public static com.mojang.datafixers.kinds.App method_57508(Object instance, ) { return net.minecraft.component.type.ProfileComponent.method_57508(instance); }
// public com.mojang.authlib.GameProfile createProfile(java.util.Optional name,java.util.Optional id,com.mojang.authlib.properties.PropertyMap properties) { return wrapperContained.createProfile(name,id,properties); }
// public static com.mojang.authlib.GameProfile createProfile(java.util.Optional name,java.util.Optional id,com.mojang.authlib.properties.PropertyMap properties, ) { return net.minecraft.component.type.ProfileComponent.createProfile(name,id,properties); }
// public yarnwrap.component.type.ProfileComponent method_57510(java.util.Optional profile) { return new yarnwrap.component.type.ProfileComponent(wrapperContained.method_57510(profile)); }
// public static yarnwrap.component.type.ProfileComponent method_57510(java.util.Optional profile, ) { return new yarnwrap.component.type.ProfileComponent(net.minecraft.component.type.ProfileComponent.method_57510(profile)); }
public boolean isCompleted() { return wrapperContained.isCompleted(); }
// public static boolean isCompleted() { return net.minecraft.component.type.ProfileComponent.isCompleted(); }
// public yarnwrap.component.type.ProfileComponent method_58116(java.lang.String name) { return new yarnwrap.component.type.ProfileComponent(wrapperContained.method_58116(name)); }
// public static yarnwrap.component.type.ProfileComponent method_58116(java.lang.String name, ) { return new yarnwrap.component.type.ProfileComponent(net.minecraft.component.type.ProfileComponent.method_58116(name)); }

}