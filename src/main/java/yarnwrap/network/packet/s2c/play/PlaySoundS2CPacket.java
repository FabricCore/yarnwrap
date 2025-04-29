package yarnwrap.network.packet.s2c.play;
public class PlaySoundS2CPacket { public net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket wrapperContained; public PlaySoundS2CPacket(net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float volume() { return wrapperContained.volume; }
// public void volume(float value) { wrapperContained.volume = value; }
// public static float volume() { return net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.volume; }
// public static void volume(float value, ) { net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.volume = value; }

// public int fixedZ() { return wrapperContained.fixedZ; }
// public void fixedZ(int value) { wrapperContained.fixedZ = value; }
// public static int fixedZ() { return net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.fixedZ; }
// public static void fixedZ(int value, ) { net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.fixedZ = value; }

// public int fixedY() { return wrapperContained.fixedY; }
// public void fixedY(int value) { wrapperContained.fixedY = value; }
// public static int fixedY() { return net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.fixedY; }
// public static void fixedY(int value, ) { net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.fixedY = value; }

// public int fixedX() { return wrapperContained.fixedX; }
// public void fixedX(int value) { wrapperContained.fixedX = value; }
// public static int fixedX() { return net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.fixedX; }
// public static void fixedX(int value, ) { net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.fixedX = value; }

// public yarnwrap.sound.SoundCategory category() { return new yarnwrap.sound.SoundCategory(wrapperContained.category); }
// public void category(yarnwrap.sound.SoundCategory value) { wrapperContained.category = value.wrapperContained; }
// public static yarnwrap.sound.SoundCategory category() { return new yarnwrap.sound.SoundCategory(net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.category); }
// public static void category(yarnwrap.sound.SoundCategory value, ) { net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.category = value.wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.sound); }
// public void sound(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.sound = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.sound); }
// public static void sound(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.sound = value.wrapperContained; }

// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.pitch; }
// public static void pitch(float value, ) { net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.pitch = value; }

// public float COORDINATE_SCALE() { return wrapperContained.COORDINATE_SCALE; }
// public void COORDINATE_SCALE(float value) { wrapperContained.COORDINATE_SCALE = value; }
public static float COORDINATE_SCALE() { return net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.COORDINATE_SCALE; }
// public static void COORDINATE_SCALE(float value, ) { net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.COORDINATE_SCALE = value; }

// public long seed() { return wrapperContained.seed; }
// public void seed(long value) { wrapperContained.seed = value; }
// public static long seed() { return net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.seed; }
// public static void seed(long value, ) { net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.seed = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.CODEC = value.wrapperContained; }

public PlaySoundS2CPacket(yarnwrap.registry.entry.RegistryEntry sound,yarnwrap.sound.SoundCategory category,double x,double y,double z,float volume,float pitch,long seed) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket(sound.wrapperContained,category.wrapperContained,x,y,z,volume,pitch,seed); }
// public PlaySoundS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket(buf.wrapperContained); }
public yarnwrap.sound.SoundCategory getCategory() { return new yarnwrap.sound.SoundCategory(wrapperContained.getCategory()); }
// public static yarnwrap.sound.SoundCategory getCategory() { return new yarnwrap.sound.SoundCategory(net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.getCategory()); }
public double getY() { return wrapperContained.getY(); }
// public static double getY() { return net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.getY(); }
public double getX() { return wrapperContained.getX(); }
// public static double getX() { return net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.getX(); }
public float getVolume() { return wrapperContained.getVolume(); }
// public static float getVolume() { return net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.getVolume(); }
public float getPitch() { return wrapperContained.getPitch(); }
// public static float getPitch() { return net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.getPitch(); }
public double getZ() { return wrapperContained.getZ(); }
// public static double getZ() { return net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.getZ(); }
public yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSound()); }
// public static yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.getSound()); }
public long getSeed() { return wrapperContained.getSeed(); }
// public static long getSeed() { return net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.getSeed(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.PlaySoundS2CPacket.write(buf.wrapperContained); }

}