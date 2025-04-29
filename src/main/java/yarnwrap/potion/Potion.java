package yarnwrap.potion;
public class Potion { public net.minecraft.potion.Potion wrapperContained; public Potion(net.minecraft.potion.Potion wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.requiredFeatures); }
// public void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.requiredFeatures = value.wrapperContained; }
// public static yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.potion.Potion.requiredFeatures); }
// public static void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value, ) { net.minecraft.potion.Potion.requiredFeatures = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.potion.Potion.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.potion.Potion.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.potion.Potion.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.potion.Potion.PACKET_CODEC = value.wrapperContained; }

// public java.lang.String baseName() { return wrapperContained.baseName; }
// public void baseName(java.lang.String value) { wrapperContained.baseName = value; }
// public static java.lang.String baseName() { return net.minecraft.potion.Potion.baseName; }
// public static void baseName(java.lang.String value, ) { net.minecraft.potion.Potion.baseName = value; }

// public java.util.List effects() { return wrapperContained.effects; }
// public void effects(java.util.List value) { wrapperContained.effects = value; }
// public static java.util.List effects() { return net.minecraft.potion.Potion.effects; }
// public static void effects(java.util.List value, ) { net.minecraft.potion.Potion.effects = value; }

public Potion(java.lang.String baseName,net.minecraft.entity.effect.StatusEffectInstance[] effects) { this.wrapperContained = new net.minecraft.potion.Potion(baseName,effects); }
public Potion(net.minecraft.entity.effect.StatusEffectInstance[] effects) { this.wrapperContained = new net.minecraft.potion.Potion(effects); }
// public java.lang.String method_57396(yarnwrap.registry.RegistryKey key) { return wrapperContained.method_57396(key.wrapperContained); }
// public static java.lang.String method_57396(yarnwrap.registry.RegistryKey key, ) { return net.minecraft.potion.Potion.method_57396(key.wrapperContained); }
public yarnwrap.potion.Potion requires(net.minecraft.resource.featuretoggle.FeatureFlag[] requiredFeatures) { return new yarnwrap.potion.Potion(wrapperContained.requires(requiredFeatures)); }
// public static yarnwrap.potion.Potion requires(net.minecraft.resource.featuretoggle.FeatureFlag[] requiredFeatures, ) { return new yarnwrap.potion.Potion(net.minecraft.potion.Potion.requires(requiredFeatures)); }
public java.util.List getEffects() { return wrapperContained.getEffects(); }
// public static java.util.List getEffects() { return net.minecraft.potion.Potion.getEffects(); }
public boolean hasInstantEffect() { return wrapperContained.hasInstantEffect(); }
// public static boolean hasInstantEffect() { return net.minecraft.potion.Potion.hasInstantEffect(); }
// public java.lang.String finishTranslationKey(java.util.Optional potion,java.lang.String prefix) { return wrapperContained.finishTranslationKey(potion,prefix); }
// public static java.lang.String finishTranslationKey(java.util.Optional potion,java.lang.String prefix, ) { return net.minecraft.potion.Potion.finishTranslationKey(potion,prefix); }

}