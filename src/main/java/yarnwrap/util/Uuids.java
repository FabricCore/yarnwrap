package yarnwrap.util;
public class Uuids { public net.minecraft.util.Uuids wrapperContained; public Uuids(net.minecraft.util.Uuids wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec INT_STREAM_CODEC() { return wrapperContained.INT_STREAM_CODEC; }
// public void INT_STREAM_CODEC(com.mojang.serialization.Codec value) { wrapperContained.INT_STREAM_CODEC = value; }
public static com.mojang.serialization.Codec INT_STREAM_CODEC() { return net.minecraft.util.Uuids.INT_STREAM_CODEC; }
// public static void INT_STREAM_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.Uuids.INT_STREAM_CODEC = value; }

// public java.lang.String OFFLINE_PLAYER_UUID_PREFIX() { return wrapperContained.OFFLINE_PLAYER_UUID_PREFIX; }
// public void OFFLINE_PLAYER_UUID_PREFIX(java.lang.String value) { wrapperContained.OFFLINE_PLAYER_UUID_PREFIX = value; }
// public static java.lang.String OFFLINE_PLAYER_UUID_PREFIX() { return net.minecraft.util.Uuids.OFFLINE_PLAYER_UUID_PREFIX; }
// public static void OFFLINE_PLAYER_UUID_PREFIX(java.lang.String value, ) { net.minecraft.util.Uuids.OFFLINE_PLAYER_UUID_PREFIX = value; }

// public int BYTE_ARRAY_SIZE() { return wrapperContained.BYTE_ARRAY_SIZE; }
// public void BYTE_ARRAY_SIZE(int value) { wrapperContained.BYTE_ARRAY_SIZE = value; }
public static int BYTE_ARRAY_SIZE() { return net.minecraft.util.Uuids.BYTE_ARRAY_SIZE; }
// public static void BYTE_ARRAY_SIZE(int value, ) { net.minecraft.util.Uuids.BYTE_ARRAY_SIZE = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.Uuids.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.Uuids.CODEC = value; }

// public com.mojang.serialization.Codec STRING_CODEC() { return wrapperContained.STRING_CODEC; }
// public void STRING_CODEC(com.mojang.serialization.Codec value) { wrapperContained.STRING_CODEC = value; }
public static com.mojang.serialization.Codec STRING_CODEC() { return net.minecraft.util.Uuids.STRING_CODEC; }
// public static void STRING_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.Uuids.STRING_CODEC = value; }

// public com.mojang.serialization.Codec STRICT_CODEC() { return wrapperContained.STRICT_CODEC; }
// public void STRICT_CODEC(com.mojang.serialization.Codec value) { wrapperContained.STRICT_CODEC = value; }
public static com.mojang.serialization.Codec STRICT_CODEC() { return net.minecraft.util.Uuids.STRICT_CODEC; }
// public static void STRICT_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.Uuids.STRICT_CODEC = value; }

// public com.mojang.serialization.Codec SET_CODEC() { return wrapperContained.SET_CODEC; }
// public void SET_CODEC(com.mojang.serialization.Codec value) { wrapperContained.SET_CODEC = value; }
public static com.mojang.serialization.Codec SET_CODEC() { return net.minecraft.util.Uuids.SET_CODEC; }
// public static void SET_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.Uuids.SET_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.util.Uuids.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.util.Uuids.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.serialization.Codec LINKED_SET_CODEC() { return wrapperContained.LINKED_SET_CODEC; }
// public void LINKED_SET_CODEC(com.mojang.serialization.Codec value) { wrapperContained.LINKED_SET_CODEC = value; }
public static com.mojang.serialization.Codec LINKED_SET_CODEC() { return net.minecraft.util.Uuids.LINKED_SET_CODEC; }
// public static void LINKED_SET_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.Uuids.LINKED_SET_CODEC = value; }

// public int[] toIntArray(long uuidMost,long uuidLeast) { return wrapperContained.toIntArray(uuidMost,uuidLeast); }
// public static int[] toIntArray(long uuidMost,long uuidLeast, ) { return net.minecraft.util.Uuids.toIntArray(uuidMost,uuidLeast); }
// public int[] toIntArray(java.util.UUID uuid) { return wrapperContained.toIntArray(uuid); }
// public static int[] toIntArray(java.util.UUID uuid, ) { return net.minecraft.util.Uuids.toIntArray(uuid); }
// public java.util.UUID toUuid(int array) { return wrapperContained.toUuid(array); }
// public static java.util.UUID toUuid(int array, ) { return net.minecraft.util.Uuids.toUuid(array); }
// public com.mojang.serialization.DataResult method_29122(java.util.stream.IntStream uuidStream) { return wrapperContained.method_29122(uuidStream); }
// public static com.mojang.serialization.DataResult method_29122(java.util.stream.IntStream uuidStream, ) { return net.minecraft.util.Uuids.method_29122(uuidStream); }
// public java.util.stream.IntStream method_29727(java.util.UUID uuid) { return wrapperContained.method_29727(uuid); }
// public static java.util.stream.IntStream method_29727(java.util.UUID uuid, ) { return net.minecraft.util.Uuids.method_29727(uuid); }
// public java.util.UUID toUuid(com.mojang.serialization.Dynamic dynamic) { return wrapperContained.toUuid(dynamic); }
// public static java.util.UUID toUuid(com.mojang.serialization.Dynamic dynamic, ) { return net.minecraft.util.Uuids.toUuid(dynamic); }
// public java.util.UUID getOfflinePlayerUuid(java.lang.String nickname) { return wrapperContained.getOfflinePlayerUuid(nickname); }
// public static java.util.UUID getOfflinePlayerUuid(java.lang.String nickname, ) { return net.minecraft.util.Uuids.getOfflinePlayerUuid(nickname); }
// public byte[] toByteArray(java.util.UUID uuid) { return wrapperContained.toByteArray(uuid); }
// public static byte[] toByteArray(java.util.UUID uuid, ) { return net.minecraft.util.Uuids.toByteArray(uuid); }
// public com.mojang.serialization.DataResult method_46560(java.lang.String string) { return wrapperContained.method_46560(string); }
// public static com.mojang.serialization.DataResult method_46560(java.lang.String string, ) { return net.minecraft.util.Uuids.method_46560(string); }
// public com.mojang.serialization.DataResult method_47804(java.lang.String string) { return wrapperContained.method_47804(string); }
// public static com.mojang.serialization.DataResult method_47804(java.lang.String string, ) { return net.minecraft.util.Uuids.method_47804(string); }
// public com.mojang.authlib.GameProfile getOfflinePlayerProfile(java.lang.String nickname) { return wrapperContained.getOfflinePlayerProfile(nickname); }
// public static com.mojang.authlib.GameProfile getOfflinePlayerProfile(java.lang.String nickname, ) { return net.minecraft.util.Uuids.getOfflinePlayerProfile(nickname); }

}