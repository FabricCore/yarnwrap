package yarnwrap.network.packet.s2c.play;
public class PlaySoundFromEntityS2CPacket { public net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket wrapperContained; public PlaySoundFromEntityS2CPacket(net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public float pitch() { return wrapperContained.pitch; }
// public void pitch(float value) { wrapperContained.pitch = value; }
// public static float pitch() { return net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.pitch; }
// public static void pitch(float value, ) { net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.pitch = value; }

// public float volume() { return wrapperContained.volume; }
// public void volume(float value) { wrapperContained.volume = value; }
// public static float volume() { return net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.volume; }
// public static void volume(float value, ) { net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.volume = value; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.entityId; }
// public static void entityId(int value, ) { net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.entityId = value; }

// public yarnwrap.sound.SoundCategory category() { return new yarnwrap.sound.SoundCategory(wrapperContained.category); }
// public void category(yarnwrap.sound.SoundCategory value) { wrapperContained.category = value.wrapperContained; }
// public static yarnwrap.sound.SoundCategory category() { return new yarnwrap.sound.SoundCategory(net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.category); }
// public static void category(yarnwrap.sound.SoundCategory value, ) { net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.category = value.wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.sound); }
// public void sound(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.sound = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry sound() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.sound); }
// public static void sound(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.sound = value.wrapperContained; }

// public long seed() { return wrapperContained.seed; }
// public void seed(long value) { wrapperContained.seed = value; }
// public static long seed() { return net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.seed; }
// public static void seed(long value, ) { net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.seed = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.CODEC = value.wrapperContained; }

public PlaySoundFromEntityS2CPacket(yarnwrap.registry.entry.RegistryEntry sound,yarnwrap.sound.SoundCategory category,yarnwrap.entity.Entity entity,float volume,float pitch,long seed) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket(sound.wrapperContained,category.wrapperContained,entity.wrapperContained,volume,pitch,seed); }
// public PlaySoundFromEntityS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket(buf.wrapperContained); }
public float getPitch() { return wrapperContained.getPitch(); }
// public static float getPitch() { return net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.getPitch(); }
public yarnwrap.sound.SoundCategory getCategory() { return new yarnwrap.sound.SoundCategory(wrapperContained.getCategory()); }
// public static yarnwrap.sound.SoundCategory getCategory() { return new yarnwrap.sound.SoundCategory(net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.getCategory()); }
public yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getSound()); }
// public static yarnwrap.registry.entry.RegistryEntry getSound() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.getSound()); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public static int getEntityId() { return net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.getEntityId(); }
public float getVolume() { return wrapperContained.getVolume(); }
// public static float getVolume() { return net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.getVolume(); }
public long getSeed() { return wrapperContained.getSeed(); }
// public static long getSeed() { return net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.getSeed(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.PlaySoundFromEntityS2CPacket.write(buf.wrapperContained); }

}