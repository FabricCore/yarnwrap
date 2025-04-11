package yarnwrap.entity.effect;
public class StatusEffectInstance { public net.minecraft.entity.effect.StatusEffectInstance wrapperContained; public StatusEffectInstance(net.minecraft.entity.effect.StatusEffectInstance wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.effect.StatusEffectInstance hiddenEffect() { return new yarnwrap.entity.effect.StatusEffectInstance(wrapperContained.hiddenEffect); }
// public void hiddenEffect(yarnwrap.entity.effect.StatusEffectInstance value) { wrapperContained.hiddenEffect = value.wrapperContained; }
public int INFINITE() { return wrapperContained.INFINITE; }
// public void INFINITE(int value) { wrapperContained.INFINITE = value; }
// public Object fading() { return wrapperContained.fading; }
// // public void fading(Object value) { wrapperContained.fading = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public int MIN_AMPLIFIER() { return wrapperContained.MIN_AMPLIFIER; }
// public void MIN_AMPLIFIER(int value) { wrapperContained.MIN_AMPLIFIER = value; }
public int MAX_AMPLIFIER() { return wrapperContained.MAX_AMPLIFIER; }
// public void MAX_AMPLIFIER(int value) { wrapperContained.MAX_AMPLIFIER = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public boolean showIcon() { return wrapperContained.showIcon; }
// public void showIcon(boolean value) { wrapperContained.showIcon = value; }
// public boolean showParticles() { return wrapperContained.showParticles; }
// public void showParticles(boolean value) { wrapperContained.showParticles = value; }
// public boolean ambient() { return wrapperContained.ambient; }
// public void ambient(boolean value) { wrapperContained.ambient = value; }
// public int amplifier() { return wrapperContained.amplifier; }
// public void amplifier(int value) { wrapperContained.amplifier = value; }
// public int duration() { return wrapperContained.duration; }
// public void duration(int value) { wrapperContained.duration = value; }
// public yarnwrap.registry.entry.RegistryEntry type() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.type); }
// public void type(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.type = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public void copyFrom(yarnwrap.entity.effect.StatusEffectInstance that) { wrapperContained.copyFrom(that.wrapperContained); }
public boolean isDurationBelow(int duration) { return wrapperContained.isDurationBelow(duration); }
public int mapDuration(it.unimi.dsi.fastutil.ints.Int2IntFunction mapper) { return wrapperContained.mapDuration(mapper); }
public boolean isInfinite() { return wrapperContained.isInfinite(); }
// public boolean lastsShorterThan(yarnwrap.entity.effect.StatusEffectInstance effect) { return wrapperContained.lastsShorterThan(effect.wrapperContained); }
// public boolean isActive() { return wrapperContained.isActive(); }
// public java.lang.String getDurationString() { return wrapperContained.getDurationString(); }
public void onApplied(yarnwrap.entity.LivingEntity entity) { wrapperContained.onApplied(entity.wrapperContained); }
public float getFadeFactor(yarnwrap.entity.LivingEntity entity,float tickDelta) { return wrapperContained.getFadeFactor(entity.wrapperContained,tickDelta); }
public boolean equals(yarnwrap.registry.entry.RegistryEntry effect) { return wrapperContained.equals(effect.wrapperContained); }
public void copyFadingFrom(yarnwrap.entity.effect.StatusEffectInstance effect) { wrapperContained.copyFadingFrom(effect.wrapperContained); }
public void skipFading() { wrapperContained.skipFading(); }
public int getAmplifier() { return wrapperContained.getAmplifier(); }
public yarnwrap.registry.entry.RegistryEntry getEffectType() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getEffectType()); }
public boolean shouldShowParticles() { return wrapperContained.shouldShowParticles(); }
public yarnwrap.nbt.NbtElement writeNbt() { return new yarnwrap.nbt.NbtElement(wrapperContained.writeNbt()); }
public yarnwrap.entity.effect.StatusEffectInstance fromNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.entity.effect.StatusEffectInstance(wrapperContained.fromNbt(nbt.wrapperContained)); }
public int getDuration() { return wrapperContained.getDuration(); }
public boolean update(yarnwrap.entity.LivingEntity entity,java.lang.Runnable overwriteCallback) { return wrapperContained.update(entity.wrapperContained,overwriteCallback); }
public java.lang.String getTranslationKey() { return wrapperContained.getTranslationKey(); }
// public int updateDuration() { return wrapperContained.updateDuration(); }
public boolean upgrade(yarnwrap.entity.effect.StatusEffectInstance that) { return wrapperContained.upgrade(that.wrapperContained); }
public boolean isAmbient() { return wrapperContained.isAmbient(); }
public boolean shouldShowIcon() { return wrapperContained.shouldShowIcon(); }
// public Object asParameters() { return wrapperContained.asParameters(); }
public yarnwrap.particle.ParticleEffect createParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.createParticle()); }
public void onEntityDamage(yarnwrap.entity.LivingEntity entity,yarnwrap.entity.damage.DamageSource source,float amount) { wrapperContained.onEntityDamage(entity.wrapperContained,source.wrapperContained,amount); }
// public void onEntityRemoval(yarnwrap.entity.LivingEntity entity,Object reason) { wrapperContained.onEntityRemoval(entity.wrapperContained,reason); }
public void playApplySound(yarnwrap.entity.LivingEntity entity) { wrapperContained.playApplySound(entity.wrapperContained); }

}