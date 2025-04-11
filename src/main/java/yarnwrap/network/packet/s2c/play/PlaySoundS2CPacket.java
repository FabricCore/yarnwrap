package yarnwrap.network.packet.s2c.play;
public class PlaySoundS2CPacket { public net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket wrapperContained; public PlaySoundS2CPacket(net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float volume() { return wrapperContained.volume; }
// public void volume(float value) { wrapperContained.volume = value; }
// public int fixedZ() { return wrapperContained.fixedZ; }
// public void fixedZ(int value) { wrapperContained.fixedZ = value; }
// public int fixedY() { return wrapperContained.fixedY; }
// public void fixedY(int value) { wrapperContained.fixedY = value; }
// public int fixedX() { return wrapperContained.fixedX; }
// public void fixedX(int value) { wrapperContained.fixedX = value; }
// public yarnwrap.sound.SoundCategory category() { return new yarnwrap.sound.SoundCategory(wrapperContained.category); }
// public void category(yarnwrap.sound.SoundCategory value) { wrapperContained.category = value.wrapperContained; }
// public yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.sound); }
// public void sound(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.sound = value.wrapperContained; }
// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
public float COORDINATE_SCALE() { return wrapperContained.COORDINATE_SCALE; }
// public void COORDINATE_SCALE(float value) { wrapperContained.COORDINATE_SCALE = value; }
// public long seed() { return wrapperContained.seed; }
// public void seed(long value) { wrapperContained.seed = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public PlaySoundS2CPacket(yarnwrap.registry.entry.RegistryEntry sound,yarnwrap.sound.SoundCategory category,double x,double y,double z,float volume,float pitch,long seed) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket(sound.wrapperContained,category.wrapperContained,x,y,z,volume,pitch,seed); }
// public PlaySoundS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket(buf.wrapperContained); }
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