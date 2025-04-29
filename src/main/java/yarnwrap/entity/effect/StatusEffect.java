package yarnwrap.entity.effect;
public class StatusEffect { public net.minecraft.entity.effect.StatusEffect wrapperContained; public StatusEffect(net.minecraft.entity.effect.StatusEffect wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.effect.StatusEffectCategory category() { return new yarnwrap.entity.effect.StatusEffectCategory(wrapperContained.category); }
// public void category(yarnwrap.entity.effect.StatusEffectCategory value) { wrapperContained.category = value.wrapperContained; }
// public static yarnwrap.entity.effect.StatusEffectCategory category() { return new yarnwrap.entity.effect.StatusEffectCategory(net.minecraft.entity.effect.StatusEffect.category); }
// public static void category(yarnwrap.entity.effect.StatusEffectCategory value, ) { net.minecraft.entity.effect.StatusEffect.category = value.wrapperContained; }

// public int fadeTicks() { return wrapperContained.fadeTicks; }
// public void fadeTicks(int value) { wrapperContained.fadeTicks = value; }
// public static int fadeTicks() { return net.minecraft.entity.effect.StatusEffect.fadeTicks; }
// public static void fadeTicks(int value, ) { net.minecraft.entity.effect.StatusEffect.fadeTicks = value; }

// public int AMBIENT_PARTICLE_ALPHA() { return wrapperContained.AMBIENT_PARTICLE_ALPHA; }
// public void AMBIENT_PARTICLE_ALPHA(int value) { wrapperContained.AMBIENT_PARTICLE_ALPHA = value; }
// public static int AMBIENT_PARTICLE_ALPHA() { return net.minecraft.entity.effect.StatusEffect.AMBIENT_PARTICLE_ALPHA; }
// public static void AMBIENT_PARTICLE_ALPHA(int value, ) { net.minecraft.entity.effect.StatusEffect.AMBIENT_PARTICLE_ALPHA = value; }

// public java.util.function.Function particleFactory() { return wrapperContained.particleFactory; }
// public void particleFactory(java.util.function.Function value) { wrapperContained.particleFactory = value; }
// public static java.util.function.Function particleFactory() { return net.minecraft.entity.effect.StatusEffect.particleFactory; }
// public static void particleFactory(java.util.function.Function value, ) { net.minecraft.entity.effect.StatusEffect.particleFactory = value; }

// public java.util.Optional applySound() { return wrapperContained.applySound; }
// public void applySound(java.util.Optional value) { wrapperContained.applySound = value; }
// public static java.util.Optional applySound() { return net.minecraft.entity.effect.StatusEffect.applySound; }
// public static void applySound(java.util.Optional value, ) { net.minecraft.entity.effect.StatusEffect.applySound = value; }

// public yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.requiredFeatures); }
// public void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.requiredFeatures = value.wrapperContained; }
// public static yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.entity.effect.StatusEffect.requiredFeatures); }
// public static void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value, ) { net.minecraft.entity.effect.StatusEffect.requiredFeatures = value.wrapperContained; }

// public com.mojang.serialization.Codec ENTRY_CODEC() { return wrapperContained.ENTRY_CODEC; }
// public void ENTRY_CODEC(com.mojang.serialization.Codec value) { wrapperContained.ENTRY_CODEC = value; }
public static com.mojang.serialization.Codec ENTRY_CODEC() { return net.minecraft.entity.effect.StatusEffect.ENTRY_CODEC; }
// public static void ENTRY_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.entity.effect.StatusEffect.ENTRY_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.ENTRY_PACKET_CODEC); }
// public void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.ENTRY_PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec ENTRY_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.entity.effect.StatusEffect.ENTRY_PACKET_CODEC); }
// public static void ENTRY_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.entity.effect.StatusEffect.ENTRY_PACKET_CODEC = value.wrapperContained; }

// public java.lang.String translationKey() { return wrapperContained.translationKey; }
// public void translationKey(java.lang.String value) { wrapperContained.translationKey = value; }
// public static java.lang.String translationKey() { return net.minecraft.entity.effect.StatusEffect.translationKey; }
// public static void translationKey(java.lang.String value, ) { net.minecraft.entity.effect.StatusEffect.translationKey = value; }

// public java.util.Map attributeModifiers() { return wrapperContained.attributeModifiers; }
// public void attributeModifiers(java.util.Map value) { wrapperContained.attributeModifiers = value; }
// public static java.util.Map attributeModifiers() { return net.minecraft.entity.effect.StatusEffect.attributeModifiers; }
// public static void attributeModifiers(java.util.Map value, ) { net.minecraft.entity.effect.StatusEffect.attributeModifiers = value; }

// public int color() { return wrapperContained.color; }
// public void color(int value) { wrapperContained.color = value; }
// public static int color() { return net.minecraft.entity.effect.StatusEffect.color; }
// public static void color(int value, ) { net.minecraft.entity.effect.StatusEffect.color = value; }

// public StatusEffect(yarnwrap.entity.effect.StatusEffectCategory category,int color) { this.wrapperContained = new net.minecraft.entity.effect.StatusEffect(category.wrapperContained,color); }
// public StatusEffect(yarnwrap.entity.effect.StatusEffectCategory category,int color,yarnwrap.particle.ParticleEffect particleEffect) { this.wrapperContained = new net.minecraft.entity.effect.StatusEffect(category.wrapperContained,color,particleEffect.wrapperContained); }
public yarnwrap.entity.effect.StatusEffectCategory getCategory() { return new yarnwrap.entity.effect.StatusEffectCategory(wrapperContained.getCategory()); }
// public static yarnwrap.entity.effect.StatusEffectCategory getCategory() { return new yarnwrap.entity.effect.StatusEffectCategory(net.minecraft.entity.effect.StatusEffect.getCategory()); }
public void onApplied(yarnwrap.entity.LivingEntity entity,int amplifier) { wrapperContained.onApplied(entity.wrapperContained,amplifier); }
// public static void onApplied(yarnwrap.entity.LivingEntity entity,int amplifier, ) { net.minecraft.entity.effect.StatusEffect.onApplied(entity.wrapperContained,amplifier); }
public boolean canApplyUpdateEffect(int duration,int amplifier) { return wrapperContained.canApplyUpdateEffect(duration,amplifier); }
// public static boolean canApplyUpdateEffect(int duration,int amplifier, ) { return net.minecraft.entity.effect.StatusEffect.canApplyUpdateEffect(duration,amplifier); }
public void onApplied(yarnwrap.entity.attribute.AttributeContainer attributeContainer,int amplifier) { wrapperContained.onApplied(attributeContainer.wrapperContained,amplifier); }
// public static void onApplied(yarnwrap.entity.attribute.AttributeContainer attributeContainer,int amplifier, ) { net.minecraft.entity.effect.StatusEffect.onApplied(attributeContainer.wrapperContained,amplifier); }
public int getColor() { return wrapperContained.getColor(); }
// public static int getColor() { return net.minecraft.entity.effect.StatusEffect.getColor(); }
// public java.lang.String loadTranslationKey() { return wrapperContained.loadTranslationKey(); }
// public static java.lang.String loadTranslationKey() { return net.minecraft.entity.effect.StatusEffect.loadTranslationKey(); }
public yarnwrap.text.Text getName() { return new yarnwrap.text.Text(wrapperContained.getName()); }
// public static yarnwrap.text.Text getName() { return new yarnwrap.text.Text(net.minecraft.entity.effect.StatusEffect.getName()); }
public boolean isInstant() { return wrapperContained.isInstant(); }
// public static boolean isInstant() { return net.minecraft.entity.effect.StatusEffect.isInstant(); }
public void onRemoved(yarnwrap.entity.attribute.AttributeContainer attributeContainer) { wrapperContained.onRemoved(attributeContainer.wrapperContained); }
// public static void onRemoved(yarnwrap.entity.attribute.AttributeContainer attributeContainer, ) { net.minecraft.entity.effect.StatusEffect.onRemoved(attributeContainer.wrapperContained); }
public void applyInstantEffect(yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker,yarnwrap.entity.LivingEntity target,int amplifier,double proximity) { wrapperContained.applyInstantEffect(source.wrapperContained,attacker.wrapperContained,target.wrapperContained,amplifier,proximity); }
// public static void applyInstantEffect(yarnwrap.entity.Entity source,yarnwrap.entity.Entity attacker,yarnwrap.entity.LivingEntity target,int amplifier,double proximity, ) { net.minecraft.entity.effect.StatusEffect.applyInstantEffect(source.wrapperContained,attacker.wrapperContained,target.wrapperContained,amplifier,proximity); }
// public yarnwrap.entity.effect.StatusEffect fadeTicks(int fadeTicks) { return new yarnwrap.entity.effect.StatusEffect(wrapperContained.fadeTicks(fadeTicks)); }
// // public static yarnwrap.entity.effect.StatusEffect fadeTicks(int fadeTicks, ) { return new yarnwrap.entity.effect.StatusEffect(net.minecraft.entity.effect.StatusEffect.fadeTicks(fadeTicks)); }
public void forEachAttributeModifier(int amplifier,java.util.function.BiConsumer consumer) { wrapperContained.forEachAttributeModifier(amplifier,consumer); }
// public static void forEachAttributeModifier(int amplifier,java.util.function.BiConsumer consumer, ) { net.minecraft.entity.effect.StatusEffect.forEachAttributeModifier(amplifier,consumer); }
// public void method_55651(java.util.function.BiConsumer attribute,int attributeModifierCreator) { wrapperContained.method_55651(attribute,attributeModifierCreator); }
// public static void method_55651(java.util.function.BiConsumer attribute,int attributeModifierCreator, ) { net.minecraft.entity.effect.StatusEffect.method_55651(attribute,attributeModifierCreator); }
public int getFadeTicks() { return wrapperContained.getFadeTicks(); }
// public static int getFadeTicks() { return net.minecraft.entity.effect.StatusEffect.getFadeTicks(); }
// public yarnwrap.entity.effect.StatusEffect addAttributeModifier(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id,double amount,Object operation) { return new yarnwrap.entity.effect.StatusEffect(wrapperContained.addAttributeModifier(attribute.wrapperContained,id.wrapperContained,amount,operation)); }
// public static yarnwrap.entity.effect.StatusEffect addAttributeModifier(yarnwrap.registry.entry.RegistryEntry attribute,yarnwrap.util.Identifier id,double amount,Object operation, ) { return new yarnwrap.entity.effect.StatusEffect(net.minecraft.entity.effect.StatusEffect.addAttributeModifier(attribute.wrapperContained,id.wrapperContained,amount,operation)); }
public java.lang.String getTranslationKey() { return wrapperContained.getTranslationKey(); }
// public static java.lang.String getTranslationKey() { return net.minecraft.entity.effect.StatusEffect.getTranslationKey(); }
public boolean applyUpdateEffect(yarnwrap.entity.LivingEntity entity,int amplifier) { return wrapperContained.applyUpdateEffect(entity.wrapperContained,amplifier); }
// public static boolean applyUpdateEffect(yarnwrap.entity.LivingEntity entity,int amplifier, ) { return net.minecraft.entity.effect.StatusEffect.applyUpdateEffect(entity.wrapperContained,amplifier); }
public boolean isBeneficial() { return wrapperContained.isBeneficial(); }
// public static boolean isBeneficial() { return net.minecraft.entity.effect.StatusEffect.isBeneficial(); }
// public yarnwrap.particle.ParticleEffect method_58145(int effect) { return new yarnwrap.particle.ParticleEffect(wrapperContained.method_58145(effect)); }
// public static yarnwrap.particle.ParticleEffect method_58145(int effect, ) { return new yarnwrap.particle.ParticleEffect(net.minecraft.entity.effect.StatusEffect.method_58145(effect)); }
public yarnwrap.particle.ParticleEffect createParticle(yarnwrap.entity.effect.StatusEffectInstance effect) { return new yarnwrap.particle.ParticleEffect(wrapperContained.createParticle(effect.wrapperContained)); }
// public static yarnwrap.particle.ParticleEffect createParticle(yarnwrap.entity.effect.StatusEffectInstance effect, ) { return new yarnwrap.particle.ParticleEffect(net.minecraft.entity.effect.StatusEffect.createParticle(effect.wrapperContained)); }
// public yarnwrap.particle.ParticleEffect method_58147(yarnwrap.particle.ParticleEffect effect) { return new yarnwrap.particle.ParticleEffect(wrapperContained.method_58147(effect.wrapperContained)); }
// public static yarnwrap.particle.ParticleEffect method_58147(yarnwrap.particle.ParticleEffect effect, ) { return new yarnwrap.particle.ParticleEffect(net.minecraft.entity.effect.StatusEffect.method_58147(effect.wrapperContained)); }
public void onEntityDamage(yarnwrap.entity.LivingEntity entity,int amplifier,yarnwrap.entity.damage.DamageSource source,float amount) { wrapperContained.onEntityDamage(entity.wrapperContained,amplifier,source.wrapperContained,amount); }
// public static void onEntityDamage(yarnwrap.entity.LivingEntity entity,int amplifier,yarnwrap.entity.damage.DamageSource source,float amount, ) { net.minecraft.entity.effect.StatusEffect.onEntityDamage(entity.wrapperContained,amplifier,source.wrapperContained,amount); }
public yarnwrap.entity.effect.StatusEffect applySound(yarnwrap.sound.SoundEvent sound) { return new yarnwrap.entity.effect.StatusEffect(wrapperContained.applySound(sound.wrapperContained)); }
// public static yarnwrap.entity.effect.StatusEffect applySound(yarnwrap.sound.SoundEvent sound, ) { return new yarnwrap.entity.effect.StatusEffect(net.minecraft.entity.effect.StatusEffect.applySound(sound.wrapperContained)); }
// public void onEntityRemoval(yarnwrap.entity.LivingEntity entity,int amplifier,Object reason) { wrapperContained.onEntityRemoval(entity.wrapperContained,amplifier,reason); }
// public static void onEntityRemoval(yarnwrap.entity.LivingEntity entity,int amplifier,Object reason, ) { net.minecraft.entity.effect.StatusEffect.onEntityRemoval(entity.wrapperContained,amplifier,reason); }
// public void method_58618(yarnwrap.entity.LivingEntity sound) { wrapperContained.method_58618(sound.wrapperContained); }
// public static void method_58618(yarnwrap.entity.LivingEntity sound, ) { net.minecraft.entity.effect.StatusEffect.method_58618(sound.wrapperContained); }
public yarnwrap.entity.effect.StatusEffect requires(net.minecraft.resource.featuretoggle.FeatureFlag[] requiredFeatures) { return new yarnwrap.entity.effect.StatusEffect(wrapperContained.requires(requiredFeatures)); }
// public static yarnwrap.entity.effect.StatusEffect requires(net.minecraft.resource.featuretoggle.FeatureFlag[] requiredFeatures, ) { return new yarnwrap.entity.effect.StatusEffect(net.minecraft.entity.effect.StatusEffect.requires(requiredFeatures)); }
public void playApplySound(yarnwrap.entity.LivingEntity entity,int amplifier) { wrapperContained.playApplySound(entity.wrapperContained,amplifier); }
// public static void playApplySound(yarnwrap.entity.LivingEntity entity,int amplifier, ) { net.minecraft.entity.effect.StatusEffect.playApplySound(entity.wrapperContained,amplifier); }

}