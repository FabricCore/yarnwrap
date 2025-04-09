package yarnwrap.sound;
public class SoundEvent { public net.minecraft.sound.SoundEvent wrapperContained; public SoundEvent(net.minecraft.sound.SoundEvent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public float distanceToTravel() { return wrapperContained.distanceToTravel; }
// public boolean staticDistance() { return wrapperContained.staticDistance; }
// public float DEFAULT_DISTANCE_TO_TRAVEL() { return wrapperContained.DEFAULT_DISTANCE_TO_TRAVEL; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
public yarnwrap.util.Identifier getId() { return new yarnwrap.util.Identifier(wrapperContained.getId()); }
public float getDistanceToTravel(float volume) { return wrapperContained.getDistanceToTravel(volume); }
public yarnwrap.sound.SoundEvent of(yarnwrap.util.Identifier id) { return new yarnwrap.sound.SoundEvent(wrapperContained.of(id.wrapperContained)); }
public yarnwrap.sound.SoundEvent of(yarnwrap.util.Identifier id,float distanceToTravel) { return new yarnwrap.sound.SoundEvent(wrapperContained.of(id.wrapperContained,distanceToTravel)); }
// public yarnwrap.sound.SoundEvent of(yarnwrap.util.Identifier id,java.util.Optional distanceToTravel) { return new yarnwrap.sound.SoundEvent(wrapperContained.of(id.wrapperContained,distanceToTravel)); }
// public java.util.Optional getStaticDistanceToTravel() { return wrapperContained.getStaticDistanceToTravel(); }

}