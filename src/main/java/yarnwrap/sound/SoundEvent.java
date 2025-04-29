package yarnwrap.sound;
public class SoundEvent { public net.minecraft.sound.SoundEvent wrapperContained; public SoundEvent(net.minecraft.sound.SoundEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.sound.SoundEvent.id); }
// public static void id(yarnwrap.util.Identifier value, ) { net.minecraft.sound.SoundEvent.id = value.wrapperContained; }

// public float distanceToTravel() { return wrapperContained.distanceToTravel; }
// public void distanceToTravel(float value) { wrapperContained.distanceToTravel = value; }
// public static float distanceToTravel() { return net.minecraft.sound.SoundEvent.distanceToTravel; }
// public static void distanceToTravel(float value, ) { net.minecraft.sound.SoundEvent.distanceToTravel = value; }

// public boolean staticDistance() { return wrapperContained.staticDistance; }
// public void staticDistance(boolean value) { wrapperContained.staticDistance = value; }
// public static boolean staticDistance() { return net.minecraft.sound.SoundEvent.staticDistance; }
// public static void staticDistance(boolean value, ) { net.minecraft.sound.SoundEvent.staticDistance = value; }

// public float DEFAULT_DISTANCE_TO_TRAVEL() { return wrapperContained.DEFAULT_DISTANCE_TO_TRAVEL; }
// public void DEFAULT_DISTANCE_TO_TRAVEL(float value) { wrapperContained.DEFAULT_DISTANCE_TO_TRAVEL = value; }
// public static float DEFAULT_DISTANCE_TO_TRAVEL() { return net.minecraft.sound.SoundEvent.DEFAULT_DISTANCE_TO_TRAVEL; }
// public static void DEFAULT_DISTANCE_TO_TRAVEL(float value, ) { net.minecraft.sound.SoundEvent.DEFAULT_DISTANCE_TO_TRAVEL = value; }

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

// public SoundEvent(yarnwrap.util.Identifier id,float distanceToTravel,boolean useStaticDistance) { this.wrapperContained = new net.minecraft.sound.SoundEvent(id.wrapperContained,distanceToTravel,useStaticDistance); }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }
// public static yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(net.minecraft.sound.SoundEvent.getId()); }
public float getDistanceToTravel(float volume) { return wrapperContained.getDistanceToTravel(volume); }
// public static float getDistanceToTravel(float volume, ) { return net.minecraft.sound.SoundEvent.getDistanceToTravel(volume); }
// public yarnwrap.sound.SoundEvent of(yarnwrap.util.Identifier id) { return new yarnwrap.sound.SoundEvent(wrapperContained.of(id.wrapperContained)); }
// public static yarnwrap.sound.SoundEvent of(yarnwrap.util.Identifier id, ) { return new yarnwrap.sound.SoundEvent(net.minecraft.sound.SoundEvent.of(id.wrapperContained)); }
// public yarnwrap.sound.SoundEvent of(yarnwrap.util.Identifier id,float distanceToTravel) { return new yarnwrap.sound.SoundEvent(wrapperContained.of(id.wrapperContained,distanceToTravel)); }
// public static yarnwrap.sound.SoundEvent of(yarnwrap.util.Identifier id,float distanceToTravel, ) { return new yarnwrap.sound.SoundEvent(net.minecraft.sound.SoundEvent.of(id.wrapperContained,distanceToTravel)); }
// public yarnwrap.sound.SoundEvent of(yarnwrap.util.Identifier id,java.util.Optional distanceToTravel) { return new yarnwrap.sound.SoundEvent(wrapperContained.of(id.wrapperContained,distanceToTravel)); }
// public static yarnwrap.sound.SoundEvent of(yarnwrap.util.Identifier id,java.util.Optional distanceToTravel, ) { return new yarnwrap.sound.SoundEvent(net.minecraft.sound.SoundEvent.of(id.wrapperContained,distanceToTravel)); }
// public com.mojang.datafixers.kinds.App method_47957(Object instance) { return wrapperContained.method_47957(instance); }
// public static com.mojang.datafixers.kinds.App method_47957(Object instance, ) { return net.minecraft.sound.SoundEvent.method_47957(instance); }
// public java.util.Optional getStaticDistanceToTravel() { return wrapperContained.getStaticDistanceToTravel(); }
// public static java.util.Optional getStaticDistanceToTravel() { return net.minecraft.sound.SoundEvent.getStaticDistanceToTravel(); }

}