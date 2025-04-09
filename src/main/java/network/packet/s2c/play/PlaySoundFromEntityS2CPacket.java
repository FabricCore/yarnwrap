package yarnwrap.network.packet.s2c.play;
public class PlaySoundFromEntityS2CPacket { public net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket wrapperContained; public PlaySoundFromEntityS2CPacket(net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float pitch() { return wrapperContained.pitch; }
// public float volume() { return wrapperContained.volume; }
// public int entityId() { return wrapperContained.entityId; }
// public yarnwrap.sound.SoundCategory category() { return new yarnwrap.sound.SoundCategory(wrapperContained.category); }
// public yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.sound); }
// public long seed() { return wrapperContained.seed; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public float getPitch() { return wrapperContained.getPitch(); }
public yarnwrap.sound.SoundCategory getCategory() { return new yarnwrap.sound.SoundCategory(wrapperContained.getCategory()); }
public yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSound()); }
public int getEntityId() { return wrapperContained.getEntityId(); }
public float getVolume() { return wrapperContained.getVolume(); }
public long getSeed() { return wrapperContained.getSeed(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}