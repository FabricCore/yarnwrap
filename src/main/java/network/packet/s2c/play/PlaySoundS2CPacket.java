package yarnwrap.network.packet.s2c.play;
public class PlaySoundS2CPacket { public net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket wrapperContained; public PlaySoundS2CPacket(net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float volume() { return wrapperContained.volume; }
// public int fixedZ() { return wrapperContained.fixedZ; }
// public int fixedY() { return wrapperContained.fixedY; }
// public int fixedX() { return wrapperContained.fixedX; }
// public yarnwrap.sound.SoundCategory category() { return new yarnwrap.sound.SoundCategory(wrapperContained.category); }
// public yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.sound); }
// public float pitch() { return wrapperContained.pitch; }
public float COORDINATE_SCALE() { return wrapperContained.COORDINATE_SCALE; }
// public long seed() { return wrapperContained.seed; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
public yarnwrap.sound.SoundCategory getCategory() { return new yarnwrap.sound.SoundCategory(wrapperContained.getCategory()); }
public double getY() { return wrapperContained.getY(); }
public double getX() { return wrapperContained.getX(); }
public float getVolume() { return wrapperContained.getVolume(); }
public float getPitch() { return wrapperContained.getPitch(); }
public double getZ() { return wrapperContained.getZ(); }
public yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSound()); }
public long getSeed() { return wrapperContained.getSeed(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}