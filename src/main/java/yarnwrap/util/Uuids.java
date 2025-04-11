package yarnwrap.util;
public class Uuids { public net.minecraft.util.Uuids wrapperContained; public Uuids(net.minecraft.util.Uuids wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec INT_STREAM_CODEC() { return wrapperContained.INT_STREAM_CODEC; }
// public void INT_STREAM_CODEC(com.mojang.serialization.Codec value) { wrapperContained.INT_STREAM_CODEC = value; }
// public java.lang.String OFFLINE_PLAYER_UUID_PREFIX() { return wrapperContained.OFFLINE_PLAYER_UUID_PREFIX; }
// public void OFFLINE_PLAYER_UUID_PREFIX(java.lang.String value) { wrapperContained.OFFLINE_PLAYER_UUID_PREFIX = value; }
public int BYTE_ARRAY_SIZE() { return wrapperContained.BYTE_ARRAY_SIZE; }
// public void BYTE_ARRAY_SIZE(int value) { wrapperContained.BYTE_ARRAY_SIZE = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public com.mojang.serialization.Codec STRING_CODEC() { return wrapperContained.STRING_CODEC; }
// public void STRING_CODEC(com.mojang.serialization.Codec value) { wrapperContained.STRING_CODEC = value; }
public com.mojang.serialization.Codec STRICT_CODEC() { return wrapperContained.STRICT_CODEC; }
// public void STRICT_CODEC(com.mojang.serialization.Codec value) { wrapperContained.STRICT_CODEC = value; }
public com.mojang.serialization.Codec SET_CODEC() { return wrapperContained.SET_CODEC; }
// public void SET_CODEC(com.mojang.serialization.Codec value) { wrapperContained.SET_CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public com.mojang.serialization.Codec LINKED_SET_CODEC() { return wrapperContained.LINKED_SET_CODEC; }
// public void LINKED_SET_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LINKED_SET_CODEC = value; }
// public int[] toIntArray(long uuidMost,long uuidLeast) { return wrapperContained.toIntArray(uuidMost,uuidLeast); }
public int[] toIntArray(java.util.UUID uuid) { return wrapperContained.toIntArray(uuid); }
// public java.util.UUID toUuid(int array) { return wrapperContained.toUuid(array); }
// public com.mojang.serialization.DataResult method_29122(java.util.stream.IntStream uuidStream) { return wrapperContained.method_29122(uuidStream); }
// public java.util.stream.IntStream method_29727(java.util.UUID uuid) { return wrapperContained.method_29727(uuid); }
public java.util.UUID toUuid(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.toUuid(dynamic); }
public java.util.UUID getOfflinePlayerUuid(java.lang.String nickname) { return wrapperContained.getOfflinePlayerUuid(nickname); }
public byte[] toByteArray(java.util.UUID uuid) { return wrapperContained.toByteArray(uuid); }
// public com.mojang.serialization.DataResult method_46560(java.lang.String string) { return wrapperContained.method_46560(string); }
// public com.mojang.serialization.DataResult method_47804(java.lang.String string) { return wrapperContained.method_47804(string); }
public com.mojang.authlib.GameProfile getOfflinePlayerProfile(java.lang.String nickname) { return wrapperContained.getOfflinePlayerProfile(nickname); }

}