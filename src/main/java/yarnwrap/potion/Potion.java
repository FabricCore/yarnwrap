package yarnwrap.potion;
public class Potion { public net.minecraft.potion.Potion wrapperContained; public Potion(net.minecraft.potion.Potion wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.featuretoggle.FeatureSet requiredFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.requiredFeatures); }
// public void requiredFeatures(yarnwrap.resource.featuretoggle.FeatureSet value) { wrapperContained.requiredFeatures = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public java.lang.String baseName() { return wrapperContained.baseName; }
// public void baseName(java.lang.String value) { wrapperContained.baseName = value; }
// public java.util.List effects() { return wrapperContained.effects; }
// public void effects(java.util.List value) { wrapperContained.effects = value; }
public yarnwrap.potion.Potion requires(net.minecraft.resource.featuretoggle.FeatureFlag[] requiredFeatures) { return new yarnwrap.potion.Potion(wrapperContained.requires(requiredFeatures)); }
public java.util.List getEffects() { return wrapperContained.getEffects(); }
public boolean hasInstantEffect() { return wrapperContained.hasInstantEffect(); }
public java.lang.String finishTranslationKey(java.util.Optional potion,java.lang.String prefix) { return wrapperContained.finishTranslationKey(potion,prefix); }

}