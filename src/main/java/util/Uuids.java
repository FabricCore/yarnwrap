package yarnwrap.util;
public class Uuids { public net.minecraft.util.Uuids wrapperContained; public Uuids(net.minecraft.util.Uuids wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec INT_STREAM_CODEC() { return wrapperContained.INT_STREAM_CODEC; }
// public java.lang.String OFFLINE_PLAYER_UUID_PREFIX() { return wrapperContained.OFFLINE_PLAYER_UUID_PREFIX; }
public int BYTE_ARRAY_SIZE() { return wrapperContained.BYTE_ARRAY_SIZE; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec STRING_CODEC() { return wrapperContained.STRING_CODEC; }
public com.mojang.serialization.Codec STRICT_CODEC() { return wrapperContained.STRICT_CODEC; }
public com.mojang.serialization.Codec SET_CODEC() { return wrapperContained.SET_CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public com.mojang.serialization.Codec LINKED_SET_CODEC() { return wrapperContained.LINKED_SET_CODEC; }
// public int[] toIntArray(long uuidMost,long uuidLeast) { return wrapperContained.toIntArray(uuidMost,uuidLeast); }
public int[] toIntArray(java.util.UUID uuid) { return wrapperContained.toIntArray(uuid); }
// public java.util.UUID toUuid(int array) { return wrapperContained.toUuid(array); }
public java.util.UUID toUuid(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.toUuid(dynamic); }
public java.util.UUID getOfflinePlayerUuid(java.lang.String nickname) { return wrapperContained.getOfflinePlayerUuid(nickname); }
public byte[] toByteArray(java.util.UUID uuid) { return wrapperContained.toByteArray(uuid); }
public com.mojang.authlib.GameProfile getOfflinePlayerProfile(java.lang.String nickname) { return wrapperContained.getOfflinePlayerProfile(nickname); }

}