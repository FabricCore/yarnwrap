package yarnwrap.sound;
public class SoundEvent { public net.minecraft.sound.SoundEvent wrapperContained; public SoundEvent(net.minecraft.sound.SoundEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.sound.SoundEvent.id); }
// public static void id(yarnwrap.util.Identifier value, ) { net.minecraft.sound.SoundEvent.id = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.sound.SoundEvent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.sound.SoundEvent.CODEC = value; }

// public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec ENTRY_CODEC() { return net.minecraft.sound.SoundEvent.ENTRY_CODEC; }
// public static void ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.sound.SoundEvent.ENTRY_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.sound.SoundEvent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.sound.SoundEvent.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
// public void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.ENTRY_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.sound.SoundEvent.ENTRY_PACKET_CODEC); }
// public static void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.sound.SoundEvent.ENTRY_PACKET_CODEC = value.wrapperContained; }

// public SoundEvent(yarnwrap.util.Identifier id) { this.wrapperContained = new net.minecraft.sound.SoundEvent(id.wrapperContained); }
// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id()); }
// // public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.sound.SoundEvent.id()); }
public float getDistanceToTravel(float volume) { return wrapperContained.getDistanceToTravel(volume); }
// public static float getDistanceToTravel(float volume, ) { return net.minecraft.sound.SoundEvent.getDistanceToTravel(volume); }
// public yarnwrap.sound.SoundEvent of(yarnwrap.util.Identifier id) { return new yarnwrap.sound.SoundEvent(wrapperContained.of(id.wrapperContained)); }
// public static yarnwrap.sound.SoundEvent of(yarnwrap.util.Identifier id, ) { return new yarnwrap.sound.SoundEvent(net.minecraft.sound.SoundEvent.of(id.wrapperContained)); }
// public yarnwrap.sound.SoundEvent of(yarnwrap.util.Identifier id,float fixedRange) { return new yarnwrap.sound.SoundEvent(wrapperContained.of(id.wrapperContained,fixedRange)); }
// public static yarnwrap.sound.SoundEvent of(yarnwrap.util.Identifier id,float fixedRange, ) { return new yarnwrap.sound.SoundEvent(net.minecraft.sound.SoundEvent.of(id.wrapperContained,fixedRange)); }
// public yarnwrap.sound.SoundEvent method_47955(yarnwrap.util.Identifier fixedRangex) { return new yarnwrap.sound.SoundEvent(wrapperContained.method_47955(fixedRangex.wrapperContained)); }
// public static yarnwrap.sound.SoundEvent method_47955(yarnwrap.util.Identifier fixedRangex, ) { return new yarnwrap.sound.SoundEvent(net.minecraft.sound.SoundEvent.method_47955(fixedRangex.wrapperContained)); }
// public yarnwrap.sound.SoundEvent of(yarnwrap.util.Identifier id,java.util.Optional fixedRange) { return new yarnwrap.sound.SoundEvent(wrapperContained.of(id.wrapperContained,fixedRange)); }
// public static yarnwrap.sound.SoundEvent of(yarnwrap.util.Identifier id,java.util.Optional fixedRange, ) { return new yarnwrap.sound.SoundEvent(net.minecraft.sound.SoundEvent.of(id.wrapperContained,fixedRange)); }
// public com.mojang.datafixers.kinds.App method_47957(Object instance) { return wrapperContained.method_47957(instance); }
// public static com.mojang.datafixers.kinds.App method_47957(Object instance, ) { return net.minecraft.sound.SoundEvent.method_47957(instance); }

}