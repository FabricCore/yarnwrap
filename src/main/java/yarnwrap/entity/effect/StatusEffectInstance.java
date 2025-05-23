package yarnwrap.entity.effect;
public class StatusEffectInstance { public net.minecraft.entity.effect.StatusEffectInstance wrapperContained; public StatusEffectInstance(net.minecraft.entity.effect.StatusEffectInstance wrapperContained) { this.wrapperContained = wrapperContained; }

// public boolean showIcon() { return wrapperContained.showIcon; }
// public void showIcon(boolean value) { wrapperContained.showIcon = value; }
// public static boolean showIcon() { return net.minecraft.entity.effect.StatusEffectInstance.showIcon; }
// public static void showIcon(boolean value, ) { net.minecraft.entity.effect.StatusEffectInstance.showIcon = value; }

// public boolean showParticles() { return wrapperContained.showParticles; }
// public void showParticles(boolean value) { wrapperContained.showParticles = value; }
// public static boolean showParticles() { return net.minecraft.entity.effect.StatusEffectInstance.showParticles; }
// public static void showParticles(boolean value, ) { net.minecraft.entity.effect.StatusEffectInstance.showParticles = value; }

// public boolean ambient() { return wrapperContained.ambient; }
// public void ambient(boolean value) { wrapperContained.ambient = value; }
// public static boolean ambient() { return net.minecraft.entity.effect.StatusEffectInstance.ambient; }
// public static void ambient(boolean value, ) { net.minecraft.entity.effect.StatusEffectInstance.ambient = value; }

// public int amplifier() { return wrapperContained.amplifier; }
// public void amplifier(int value) { wrapperContained.amplifier = value; }
// public static int amplifier() { return net.minecraft.entity.effect.StatusEffectInstance.amplifier; }
// public static void amplifier(int value, ) { net.minecraft.entity.effect.StatusEffectInstance.amplifier = value; }

// public int duration() { return wrapperContained.duration; }
// public void duration(int value) { wrapperContained.duration = value; }
// public static int duration() { return net.minecraft.entity.effect.StatusEffectInstance.duration; }
// public static void duration(int value, ) { net.minecraft.entity.effect.StatusEffectInstance.duration = value; }

// public yarnwrap.registry.entry.RegistryEntry type() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.type); }
// public void type(yarnwrap.registry.entry.RegistryEntry value) { wrapperContained.type = value.wrapperContained; }
// public static yarnwrap.registry.entry.RegistryEntry type() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.entity.effect.StatusEffectInstance.type); }
// public static void type(yarnwrap.registry.entry.RegistryEntry value, ) { net.minecraft.entity.effect.StatusEffectInstance.type = value.wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.entity.effect.StatusEffectInstance.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.entity.effect.StatusEffectInstance.LOGGER = value; }

// public yarnwrap.entity.effect.StatusEffectInstance hiddenEffect() { return new yarnwrap.entity.effect.StatusEffectInstance(wrapperContained.hiddenEffect); }
// public void hiddenEffect(yarnwrap.entity.effect.StatusEffectInstance value) { wrapperContained.hiddenEffect = value.wrapperContained; }
// public static yarnwrap.entity.effect.StatusEffectInstance hiddenEffect() { return new yarnwrap.entity.effect.StatusEffectInstance(net.minecraft.entity.effect.StatusEffectInstance.hiddenEffect); }
// public static void hiddenEffect(yarnwrap.entity.effect.StatusEffectInstance value, ) { net.minecraft.entity.effect.StatusEffectInstance.hiddenEffect = value.wrapperContained; }

// public int INFINITE() { return wrapperContained.INFINITE; }
// public void INFINITE(int value) { wrapperContained.INFINITE = value; }
public static int INFINITE() { return net.minecraft.entity.effect.StatusEffectInstance.INFINITE; }
// public static void INFINITE(int value, ) { net.minecraft.entity.effect.StatusEffectInstance.INFINITE = value; }

// public Object fading() { return wrapperContained.fading; }
// // public void fading(Object value) { wrapperContained.fading = value; }
// // public static Object fading() { return net.minecraft.entity.effect.StatusEffectInstance.fading; }
// // public static void fading(Object value, ) { net.minecraft.entity.effect.StatusEffectInstance.fading = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.entity.effect.StatusEffectInstance.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.effect.StatusEffectInstance.CODEC = value; }

// public int MIN_AMPLIFIER() { return wrapperContained.MIN_AMPLIFIER; }
// public void MIN_AMPLIFIER(int value) { wrapperContained.MIN_AMPLIFIER = value; }
public static int MIN_AMPLIFIER() { return net.minecraft.entity.effect.StatusEffectInstance.MIN_AMPLIFIER; }
// public static void MIN_AMPLIFIER(int value, ) { net.minecraft.entity.effect.StatusEffectInstance.MIN_AMPLIFIER = value; }

// public int MAX_AMPLIFIER() { return wrapperContained.MAX_AMPLIFIER; }
// public void MAX_AMPLIFIER(int value) { wrapperContained.MAX_AMPLIFIER = value; }
public static int MAX_AMPLIFIER() { return net.minecraft.entity.effect.StatusEffectInstance.MAX_AMPLIFIER; }
// public static void MAX_AMPLIFIER(int value, ) { net.minecraft.entity.effect.StatusEffectInstance.MAX_AMPLIFIER = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.entity.effect.StatusEffectInstance.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.entity.effect.StatusEffectInstance.PACKET_CODEC = value.wrapperContained; }

public StatusEffectInstance(yarnwrap.entity.effect.StatusEffectInstance instance) { this.wrapperContained = new net.minecraft.entity.effect.StatusEffectInstance(instance.wrapperContained); }
public StatusEffectInstance(yarnwrap.registry.entry.RegistryEntry effect) { this.wrapperContained = new net.minecraft.entity.effect.StatusEffectInstance(effect.wrapperContained); }
public StatusEffectInstance(yarnwrap.registry.entry.RegistryEntry effect,int duration) { this.wrapperContained = new net.minecraft.entity.effect.StatusEffectInstance(effect.wrapperContained,duration); }
public StatusEffectInstance(yarnwrap.registry.entry.RegistryEntry effect,int duration,int amplifier) { this.wrapperContained = new net.minecraft.entity.effect.StatusEffectInstance(effect.wrapperContained,duration,amplifier); }
public StatusEffectInstance(yarnwrap.registry.entry.RegistryEntry effect,int duration,int amplifier,boolean ambient,boolean visible) { this.wrapperContained = new net.minecraft.entity.effect.StatusEffectInstance(effect.wrapperContained,duration,amplifier,ambient,visible); }
public StatusEffectInstance(yarnwrap.registry.entry.RegistryEntry effect,int duration,int amplifier,boolean ambient,boolean showParticles,boolean showIcon) { this.wrapperContained = new net.minecraft.entity.effect.StatusEffectInstance(effect.wrapperContained,duration,amplifier,ambient,showParticles,showIcon); }
public StatusEffectInstance(yarnwrap.registry.entry.RegistryEntry effect,int duration,int amplifier,boolean ambient,boolean showParticles,boolean showIcon,yarnwrap.entity.effect.StatusEffectInstance hiddenEffect) { this.wrapperContained = new net.minecraft.entity.effect.StatusEffectInstance(effect.wrapperContained,duration,amplifier,ambient,showParticles,showIcon,hiddenEffect.wrapperContained); }
// public StatusEffectInstance(yarnwrap.registry.entry.RegistryEntry effect,Object parameters) { this.wrapperContained = new net.minecraft.entity.effect.StatusEffectInstance(effect.wrapperContained,parameters); }
// public int compareTo(java.lang.Object that) { return wrapperContained.compareTo(that); }
// public static int compareTo(java.lang.Object that, ) { return net.minecraft.entity.effect.StatusEffectInstance.compareTo(that); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.entity.effect.StatusEffectInstance.equals(o); }
public int getAmplifier() { return wrapperContained.getAmplifier(); }
// public static int getAmplifier() { return net.minecraft.entity.effect.StatusEffectInstance.getAmplifier(); }
public yarnwrap.registry.entry.RegistryEntry getEffectType() { return new yarnwrap.registry.entry.RegistryEntry(wrapperContained.getEffectType()); }
// public static yarnwrap.registry.entry.RegistryEntry getEffectType() { return new yarnwrap.registry.entry.RegistryEntry(net.minecraft.entity.effect.StatusEffectInstance.getEffectType()); }
public boolean shouldShowParticles() { return wrapperContained.shouldShowParticles(); }
// public static boolean shouldShowParticles() { return net.minecraft.entity.effect.StatusEffectInstance.shouldShowParticles(); }
public int getDuration() { return wrapperContained.getDuration(); }
// public static int getDuration() { return net.minecraft.entity.effect.StatusEffectInstance.getDuration(); }
public boolean update(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,java.lang.Runnable hiddenEffectCallback) { return wrapperContained.update(world.wrapperContained,entity.wrapperContained,hiddenEffectCallback); }
// public static boolean update(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,java.lang.Runnable hiddenEffectCallback, ) { return net.minecraft.entity.effect.StatusEffectInstance.update(world.wrapperContained,entity.wrapperContained,hiddenEffectCallback); }
public java.lang.String getTranslationKey() { return wrapperContained.getTranslationKey(); }
// public static java.lang.String getTranslationKey() { return net.minecraft.entity.effect.StatusEffectInstance.getTranslationKey(); }
// public void updateDuration() { wrapperContained.updateDuration(); }
// public static void updateDuration() { net.minecraft.entity.effect.StatusEffectInstance.updateDuration(); }
public boolean upgrade(yarnwrap.entity.effect.StatusEffectInstance that) { return wrapperContained.upgrade(that.wrapperContained); }
// public static boolean upgrade(yarnwrap.entity.effect.StatusEffectInstance that, ) { return net.minecraft.entity.effect.StatusEffectInstance.upgrade(that.wrapperContained); }
public boolean isAmbient() { return wrapperContained.isAmbient(); }
// public static boolean isAmbient() { return net.minecraft.entity.effect.StatusEffectInstance.isAmbient(); }
public boolean shouldShowIcon() { return wrapperContained.shouldShowIcon(); }
// public static boolean shouldShowIcon() { return net.minecraft.entity.effect.StatusEffectInstance.shouldShowIcon(); }
// public void copyFrom(yarnwrap.entity.effect.StatusEffectInstance that) { wrapperContained.copyFrom(that.wrapperContained); }
// public static void copyFrom(yarnwrap.entity.effect.StatusEffectInstance that, ) { net.minecraft.entity.effect.StatusEffectInstance.copyFrom(that.wrapperContained); }
public boolean isDurationBelow(int duration) { return wrapperContained.isDurationBelow(duration); }
// public static boolean isDurationBelow(int duration, ) { return net.minecraft.entity.effect.StatusEffectInstance.isDurationBelow(duration); }
public int mapDuration(it.unimi.dsi.fastutil.ints.Int2IntFunction mapper) { return wrapperContained.mapDuration(mapper); }
// public static int mapDuration(it.unimi.dsi.fastutil.ints.Int2IntFunction mapper, ) { return net.minecraft.entity.effect.StatusEffectInstance.mapDuration(mapper); }
public boolean isInfinite() { return wrapperContained.isInfinite(); }
// public static boolean isInfinite() { return net.minecraft.entity.effect.StatusEffectInstance.isInfinite(); }
// public int method_48560(int duration) { return wrapperContained.method_48560(duration); }
// public static int method_48560(int duration, ) { return net.minecraft.entity.effect.StatusEffectInstance.method_48560(duration); }
// public boolean lastsShorterThan(yarnwrap.entity.effect.StatusEffectInstance effect) { return wrapperContained.lastsShorterThan(effect.wrapperContained); }
// public static boolean lastsShorterThan(yarnwrap.entity.effect.StatusEffectInstance effect, ) { return net.minecraft.entity.effect.StatusEffectInstance.lastsShorterThan(effect.wrapperContained); }
// public boolean isActive() { return wrapperContained.isActive(); }
// public static boolean isActive() { return net.minecraft.entity.effect.StatusEffectInstance.isActive(); }
// public java.lang.String getDurationString() { return wrapperContained.getDurationString(); }
// public static java.lang.String getDurationString() { return net.minecraft.entity.effect.StatusEffectInstance.getDurationString(); }
public void onApplied(yarnwrap.entity.LivingEntity entity) { wrapperContained.onApplied(entity.wrapperContained); }
// public static void onApplied(yarnwrap.entity.LivingEntity entity, ) { net.minecraft.entity.effect.StatusEffectInstance.onApplied(entity.wrapperContained); }
public float getFadeFactor(yarnwrap.entity.LivingEntity entity,float tickProgress) { return wrapperContained.getFadeFactor(entity.wrapperContained,tickProgress); }
// public static float getFadeFactor(yarnwrap.entity.LivingEntity entity,float tickProgress, ) { return net.minecraft.entity.effect.StatusEffectInstance.getFadeFactor(entity.wrapperContained,tickProgress); }
public boolean equals(yarnwrap.registry.entry.RegistryEntry effect) { return wrapperContained.equals(effect.wrapperContained); }
// public static boolean equals(yarnwrap.registry.entry.RegistryEntry effect, ) { return net.minecraft.entity.effect.StatusEffectInstance.equals(effect.wrapperContained); }
public void copyFadingFrom(yarnwrap.entity.effect.StatusEffectInstance effect) { wrapperContained.copyFadingFrom(effect.wrapperContained); }
// public static void copyFadingFrom(yarnwrap.entity.effect.StatusEffectInstance effect, ) { net.minecraft.entity.effect.StatusEffectInstance.copyFadingFrom(effect.wrapperContained); }
public void skipFading() { wrapperContained.skipFading(); }
// public static void skipFading() { net.minecraft.entity.effect.StatusEffectInstance.skipFading(); }
// public com.mojang.datafixers.kinds.App method_56666(Object instance) { return wrapperContained.method_56666(instance); }
// public static com.mojang.datafixers.kinds.App method_56666(Object instance, ) { return net.minecraft.entity.effect.StatusEffectInstance.method_56666(instance); }
// public yarnwrap.entity.effect.StatusEffectInstance method_56667(yarnwrap.registry.entry.RegistryEntry parametersx) { return new yarnwrap.entity.effect.StatusEffectInstance(wrapperContained.method_56667(parametersx.wrapperContained)); }
// public static yarnwrap.entity.effect.StatusEffectInstance method_56667(yarnwrap.registry.entry.RegistryEntry parametersx, ) { return new yarnwrap.entity.effect.StatusEffectInstance(net.minecraft.entity.effect.StatusEffectInstance.method_56667(parametersx.wrapperContained)); }
// public Object asParameters() { return wrapperContained.asParameters(); }
// public static Object asParameters() { return net.minecraft.entity.effect.StatusEffectInstance.asParameters(); }
public yarnwrap.particle.ParticleEffect createParticle() { return new yarnwrap.particle.ParticleEffect(wrapperContained.createParticle()); }
// public static yarnwrap.particle.ParticleEffect createParticle() { return new yarnwrap.particle.ParticleEffect(net.minecraft.entity.effect.StatusEffectInstance.createParticle()); }
public void onEntityDamage(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,yarnwrap.entity.damage.DamageSource source,float amount) { wrapperContained.onEntityDamage(world.wrapperContained,entity.wrapperContained,source.wrapperContained,amount); }
// public static void onEntityDamage(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,yarnwrap.entity.damage.DamageSource source,float amount, ) { net.minecraft.entity.effect.StatusEffectInstance.onEntityDamage(world.wrapperContained,entity.wrapperContained,source.wrapperContained,amount); }
// public void onEntityRemoval(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,Object reason) { wrapperContained.onEntityRemoval(world.wrapperContained,entity.wrapperContained,reason); }
// public static void onEntityRemoval(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.LivingEntity entity,Object reason, ) { net.minecraft.entity.effect.StatusEffectInstance.onEntityRemoval(world.wrapperContained,entity.wrapperContained,reason); }
public void playApplySound(yarnwrap.entity.LivingEntity entity) { wrapperContained.playApplySound(entity.wrapperContained); }
// public static void playApplySound(yarnwrap.entity.LivingEntity entity, ) { net.minecraft.entity.effect.StatusEffectInstance.playApplySound(entity.wrapperContained); }
public yarnwrap.entity.effect.StatusEffectInstance withScaledDuration(float durationMultiplier) { return new yarnwrap.entity.effect.StatusEffectInstance(wrapperContained.withScaledDuration(durationMultiplier)); }
// public static yarnwrap.entity.effect.StatusEffectInstance withScaledDuration(float durationMultiplier, ) { return new yarnwrap.entity.effect.StatusEffectInstance(net.minecraft.entity.effect.StatusEffectInstance.withScaledDuration(durationMultiplier)); }
// public int method_66228(float duration) { return wrapperContained.method_66228(duration); }
// public static int method_66228(float duration, ) { return net.minecraft.entity.effect.StatusEffectInstance.method_66228(duration); }
public void tickClient() { wrapperContained.tickClient(); }
// public static void tickClient() { net.minecraft.entity.effect.StatusEffectInstance.tickClient(); }
// public boolean tickHiddenEffect() { return wrapperContained.tickHiddenEffect(); }
// public static boolean tickHiddenEffect() { return net.minecraft.entity.effect.StatusEffectInstance.tickHiddenEffect(); }

}