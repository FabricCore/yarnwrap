package yarnwrap.network.packet.s2c.play;
public class EntityStatusEffectS2CPacket { public net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket wrapperContained; public EntityStatusEffectS2CPacket(net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry effectId() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.effectId); }
// public void effectId(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.effectId = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry effectId() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.effectId); }
// public static void effectId(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.effectId = value.wrapperContained; }

// public int duration() { return wrapperContained.duration; }
// public void duration(int value) { wrapperContained.duration = value; }
// public static int duration() { return net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.duration; }
// public static void duration(int value, ) { net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.duration = value; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.entityId; }
// public static void entityId(int value, ) { net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.entityId = value; }

// public byte flags() { return wrapperContained.flags; }
// public void flags(byte value) { wrapperContained.flags = value; }
// public static byte flags() { return net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.flags; }
// public static void flags(byte value, ) { net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.flags = value; }

// public int amplifier() { return wrapperContained.amplifier; }
// public void amplifier(int value) { wrapperContained.amplifier = value; }
// public static int amplifier() { return net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.amplifier; }
// public static void amplifier(int value, ) { net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.amplifier = value; }

// public int AMBIENT_MASK() { return wrapperContained.AMBIENT_MASK; }
// public void AMBIENT_MASK(int value) { wrapperContained.AMBIENT_MASK = value; }
// public static int AMBIENT_MASK() { return net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.AMBIENT_MASK; }
// public static void AMBIENT_MASK(int value, ) { net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.AMBIENT_MASK = value; }

// public int SHOW_PARTICLES_MASK() { return wrapperContained.SHOW_PARTICLES_MASK; }
// public void SHOW_PARTICLES_MASK(int value) { wrapperContained.SHOW_PARTICLES_MASK = value; }
// public static int SHOW_PARTICLES_MASK() { return net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.SHOW_PARTICLES_MASK; }
// public static void SHOW_PARTICLES_MASK(int value, ) { net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.SHOW_PARTICLES_MASK = value; }

// public int SHOW_ICON_MASK() { return wrapperContained.SHOW_ICON_MASK; }
// public void SHOW_ICON_MASK(int value) { wrapperContained.SHOW_ICON_MASK = value; }
// public static int SHOW_ICON_MASK() { return net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.SHOW_ICON_MASK; }
// public static void SHOW_ICON_MASK(int value, ) { net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.SHOW_ICON_MASK = value; }

// public int KEEP_FADING_MASK() { return wrapperContained.KEEP_FADING_MASK; }
// public void KEEP_FADING_MASK(int value) { wrapperContained.KEEP_FADING_MASK = value; }
// public static int KEEP_FADING_MASK() { return net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.KEEP_FADING_MASK; }
// public static void KEEP_FADING_MASK(int value, ) { net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.KEEP_FADING_MASK = value; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.CODEC = value.wrapperContained; }

public EntityStatusEffectS2CPacket(int entityId,yarnwrap.entity.effect.StatusEffectInstance effect,boolean keepFading) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket(entityId,effect.wrapperContained,keepFading); }
// public EntityStatusEffectS2CPacket(yarnwrap.network.RegistryByteBuf buf) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket(buf.wrapperContained); }
public boolean shouldShowIcon() { return wrapperContained.shouldShowIcon(); }
// public static boolean shouldShowIcon() { return net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.shouldShowIcon(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public static int getEntityId() { return net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.getEntityId(); }
public int getDuration() { return wrapperContained.getDuration(); }
// public static int getDuration() { return net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.getDuration(); }
public int getAmplifier() { return wrapperContained.getAmplifier(); }
// public static int getAmplifier() { return net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.getAmplifier(); }
public yarnwrap.registry.entry.RegistryEntry getEffectId() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getEffectId()); }
// public static yarnwrap.registry.entry.RegistryEntry getEffectId() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.getEffectId()); }
public boolean shouldShowParticles() { return wrapperContained.shouldShowParticles(); }
// public static boolean shouldShowParticles() { return net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.shouldShowParticles(); }
public boolean isAmbient() { return wrapperContained.isAmbient(); }
// public static boolean isAmbient() { return net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.isAmbient(); }
public boolean keepFading() { return wrapperContained.keepFading(); }
// public static boolean keepFading() { return net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.keepFading(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }
// public static void write(yarnwrap.network.RegistryByteBuf buf, ) { net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket.write(buf.wrapperContained); }

}