package yarnwrap.entity.effect;
public class StatusEffect { public net.minecraft.entity.effect.StatusEffect wrapperContained; public StatusEffect(net.minecraft.entity.effect.StatusEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.effect.StatusEffectCategory category() { return new yarnwrap.entity.effect.StatusEffectCategory(wrapperContained.category); }
// public void category(yarnwrap.entity.effect.StatusEffectCategory value) { wrapperContained.category = value.wrapperContained; }
// public int fadeTicks() { return wrapperContained.fadeTicks; }
// public void fadeTicks(int value) { wrapperContained.fadeTicks = value; }
// public int AMBIENT_PARTICLE_ALPHA() { return wrapperContained.AMBIENT_PARTICLE_ALPHA; }
// public void AMBIENT_PARTICLE_ALPHA(int value) { wrapperContained.AMBIENT_PARTICLE_ALPHA = value; }
// public java.util.function.Function particleFactory() { return wrapperContained.particleFactory; }
// public void particleFactory(java.util.function.Function value) { wrapperContained.particleFactory = value; }
// public java.util.Optional applySound() { return wrapperContained.applySound; }
// public void applySound(java.util.Optional value) { wrapperContained.applySound = value; }
// public yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.requiredFeatures); }
// public void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.requiredFeatures = value.wrapperContained; }
public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
// public void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.ENTRY_PACKET_CODEC = value.wrapperContained; }
// public java.lang.String translationKey() { return wrapperContained.translationKey; }
// public void translationKey(java.lang.String value) { wrapperContained.translationKey = value; }
// public java.util.Map attributeModifiers() { return wrapperContained.attributeModifiers; }
// public void attributeModifiers(java.util.Map value) { wrapperContained.attributeModifiers = value; }
// public int color() { return wrapperContained.color; }
// public void color(int value) { wrapperContained.color = value; }
public yarnwrap.entity.effect.StatusEffectCategory getCategory() { return new yarnwrap.entity.effect.StatusEffectCategory(wrapperContained.getCategory()); }
public void onApplied(yarnwrap.entity.LivingEntity entity,int amplifier) { wrapperContained.onApplied(entity.wrapperContained,amplifier); }
public boolean canApplyUpdateEffect(int duration,int amplifier) { return wrapperContained.canApplyUpdateEffect(duration,amplifier); }
public void onApplied(yarnwrap.entity.attribute.AttributeContainer attributeContainer,int amplifier) { wrapperContained.onApplied(attributeContainer.wrapperContained,amplifier); }
public int getColor() { return wrapperContained.getColor(); }
// public java.lang.String loadTranslationKey() { return wrapperContained.loadTranslationKey(); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
public boolean isInstant() { return wrapperContained.isInstant(); }
public void onRemoved(yarnwrap.entity.attribute.AttributeContainer attributeContainer) { wrapperContained.onRemoved(attributeContainer.wrapperContained); }
public void applyInstantEffect(yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker,yarnwrap.entity.LivingEntity target,int amplifier,double proximity) { wrapperContained.applyInstantEffect(source.wrapperContained,attacker.wrapperContained,target.wrapperContained,amplifier,proximity); }
// public yarnwrap.entity.effect.StatusEffect fadeTicks(int fadeTicks) { return new yarnwrap.entity.effect.StatusEffect(wrapperContained.fadeTicks(fadeTicks)); }
public void forEachAttributeModifier(int amplifier,java.util.function.BiConsumer consumer) { wrapperContained.forEachAttributeModifier(amplifier,consumer); }
public int getFadeTicks() { return wrapperContained.getFadeTicks(); }
// public yarnwrap.entity.effect.StatusEffect addAttributeModifier(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id,double amount,Object operation) { return new yarnwrap.entity.effect.StatusEffect(wrapperContained.addAttributeModifier(attribute.wrapperContained,id.wrapperContained,amount,operation)); }
public java.lang.String getTranslationKey() { return wrapperContained.getTranslationKey(); }
public boolean applyUpdateEffect(yarnwrap.entity.LivingEntity entity,int amplifier) { return wrapperContained.applyUpdateEffect(entity.wrapperContained,amplifier); }
public boolean isBeneficial() { return wrapperContained.isBeneficial(); }
public yarnwrap.particle.ParticleEffect createParticle(yarnwrap.entity.effect.StatusEffectInstance effect) { return new yarnwrap.particle.ParticleEffect(wrapperContained.createParticle(effect.wrapperContained)); }
public void onEntityDamage(yarnwrap.entity.LivingEntity entity,int amplifier,yarnwrap.entity.damage.DamageSource source,float amount) { wrapperContained.onEntityDamage(entity.wrapperContained,amplifier,source.wrapperContained,amount); }
public yarnwrap.entity.effect.StatusEffect applySound(yarnwrap.sound.SoundEvent sound) { return new yarnwrap.entity.effect.StatusEffect(wrapperContained.applySound(sound.wrapperContained)); }
// public void onEntityRemoval(yarnwrap.entity.LivingEntity entity,int amplifier,Object reason) { wrapperContained.onEntityRemoval(entity.wrapperContained,amplifier,reason); }
public yarnwrap.entity.effect.StatusEffect requires(net.minecraft.resource.featuretoggle.FeatureFlag[] requiredFeatures) { return new yarnwrap.entity.effect.StatusEffect(wrapperContained.requires(requiredFeatures)); }
public void playApplySound(yarnwrap.entity.LivingEntity entity,int amplifier) { wrapperContained.playApplySound(entity.wrapperContained,amplifier); }

}