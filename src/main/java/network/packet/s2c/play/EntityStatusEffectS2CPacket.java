package yarnwrap.network.packet.s2c.play;
public class EntityStatusEffectS2CPacket { public net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket wrapperContained; public EntityStatusEffectS2CPacket(net.minecraft.network.packet.s2c.play.EntityStatusEffectS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.registry.entry.RegistryEntry effectId() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.effectId); }
// public int duration() { return wrapperContained.duration; }
// public int entityId() { return wrapperContained.entityId; }
// public byte flags() { return wrapperContained.flags; }
// public int amplifier() { return wrapperContained.amplifier; }
// public int AMBIENT_MASK() { return wrapperContained.AMBIENT_MASK; }
// public int SHOW_PARTICLES_MASK() { return wrapperContained.SHOW_PARTICLES_MASK; }
// public int SHOW_ICON_MASK() { return wrapperContained.SHOW_ICON_MASK; }
// public int KEEP_FADING_MASK() { return wrapperContained.KEEP_FADING_MASK; }
public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
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