package yarnwrap.network.packet.s2c.play;
public class EntityStatusEffectS2CPacket { public net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket wrapperContained; public EntityStatusEffectS2CPacket(net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry effectId() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.effectId); }
// public void effectId(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.effectId = value.wrapperContained; }
// public int duration() { return wrapperContained.duration; }
// public void duration(int value) { wrapperContained.duration = value; }
// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public byte flags() { return wrapperContained.flags; }
// public void flags(byte value) { wrapperContained.flags = value; }
// public int amplifier() { return wrapperContained.amplifier; }
// public void amplifier(int value) { wrapperContained.amplifier = value; }
// public int AMBIENT_MASK() { return wrapperContained.AMBIENT_MASK; }
// public void AMBIENT_MASK(int value) { wrapperContained.AMBIENT_MASK = value; }
// public int SHOW_PARTICLES_MASK() { return wrapperContained.SHOW_PARTICLES_MASK; }
// public void SHOW_PARTICLES_MASK(int value) { wrapperContained.SHOW_PARTICLES_MASK = value; }
// public int SHOW_ICON_MASK() { return wrapperContained.SHOW_ICON_MASK; }
// public void SHOW_ICON_MASK(int value) { wrapperContained.SHOW_ICON_MASK = value; }
// public int KEEP_FADING_MASK() { return wrapperContained.KEEP_FADING_MASK; }
// public void KEEP_FADING_MASK(int value) { wrapperContained.KEEP_FADING_MASK = value; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public boolean shouldShowIcon() { return wrapperContained.shouldShowIcon(); }
public int getEntityId() { return wrapperContained.getEntityId(); }
public int getDuration() { return wrapperContained.getDuration(); }
public int getAmplifier() { return wrapperContained.getAmplifier(); }
public yarnwrap.registry.entry.RegistryEntry getEffectId() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getEffectId()); }
public boolean shouldShowParticles() { return wrapperContained.shouldShowParticles(); }
public boolean isAmbient() { return wrapperContained.isAmbient(); }
public boolean keepFading() { return wrapperContained.keepFading(); }
// public void write(yarnwrap.network.RegistryByteBuf buf) { wrapperContained.write(buf.wrapperContained); }

}