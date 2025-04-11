package yarnwrap.network.packet.s2c.play;
public class PlaySoundFromEntityS2CPacket { public net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket wrapperContained; public PlaySoundFromEntityS2CPacket(net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public float volume() { return wrapperContained.volume; }
// public void volume(float value) { wrapperContained.volume = value; }
// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public yarnwrap.sound.SoundCategory category() { return new yarnwrap.sound.SoundCategory(wrapperContained.category); }
// public void category(yarnwrap.sound.SoundCategory value) { wrapperContained.category = value.wrapperContained; }
// public yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.sound); }
// public void sound(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.sound = value.wrapperContained; }
// public long seed() { return wrapperContained.seed; }
// public void seed(long value) { wrapperContained.seed = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public float getPitch() { return wrapperContained.getPitch(); }
public yarnwrap.sound.SoundCategory getCategory() { return new yarnwrap.sound.SoundCategory(wrapperContained.getCategory()); }
public yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSound()); }
public int getEntityId() { return wrapperContained.getEntityId(); }
public float getVolume() { return wrapperContained.getVolume(); }
public long getSeed() { return wrapperContained.getSeed(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}