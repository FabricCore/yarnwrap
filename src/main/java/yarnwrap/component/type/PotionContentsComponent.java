package yarnwrap.component.type;
public class PotionContentsComponent { public net.minecraft.component.type.PotionContentsComponent wrapperContained; public PotionContentsComponent(net.minecraft.component.type.PotionContentsComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text NONE_TEXT() { return new yarnwrap.text.Text(wrapperContained.NONE_TEXT); }
// public void NONE_TEXT(yarnwrap.text.Text value) { wrapperContained.NONE_TEXT = value.wrapperContained; }
public yarnwrap.component.type.PotionContentsComponent DEFAULT() { return new yarnwrap.component.type.PotionContentsComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.PotionContentsComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
// public int EFFECTLESS_COLOR() { return wrapperContained.EFFECTLESS_COLOR; }
// public void EFFECTLESS_COLOR(int value) { wrapperContained.EFFECTLESS_COLOR = value; }
// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public void BASE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BASE_CODEC = value; }
public PotionContentsComponent(yarnwrap.registry.entry.RegistryEntry potion) { this.wrapperContained = new net.minecraft.component.type.PotionContentsComponent(potion.wrapperContained); }
public void buildTooltip(java.util.function.Consumer textConsumer,float durationMultiplier,float tickRate) { wrapperContained.buildTooltip(textConsumer,durationMultiplier,tickRate); }
// public void method_55762(java.util.List attribute,yarnwrap.registry.entry.RegistryEntry modifier) { wrapperContained.method_55762(attribute,modifier.wrapperContained); }
public java.lang.Iterable getEffects() { return wrapperContained.getEffects(); }
public yarnwrap.component.type.PotionContentsComponent with(yarnwrap.entity.effect.StatusEffectInstance customEffect) { return new yarnwrap.component.type.PotionContentsComponent(wrapperContained.with(customEffect.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_57399(Object instance) { return wrapperContained.method_57399(instance); }
public yarnwrap.item.ItemStack createStack(yarnwrap.item.Item item,yarnwrap.registry.entry.RegistryEntry potion) { return new yarnwrap.item.ItemStack(wrapperContained.createStack(item.wrapperContained,potion.wrapperContained)); }
public boolean matches(yarnwrap.registry.entry.RegistryEntry potion) { return wrapperContained.matches(potion.wrapperContained); }
public void forEachEffect(java.util.function.Consumer effectConsumer) { wrapperContained.forEachEffect(effectConsumer); }
public yarnwrap.component.type.PotionContentsComponent with(yarnwrap.registry.entry.RegistryEntry potion) { return new yarnwrap.component.type.PotionContentsComponent(wrapperContained.with(potion.wrapperContained)); }
public boolean hasEffects() { return wrapperContained.hasEffects(); }
public java.util.OptionalInt mixColors(java.lang.Iterable effects) { return wrapperContained.mixColors(effects); }
public int getColor(java.lang.Iterable effects) { return wrapperContained.getColor(effects); }
public int getColor(yarnwrap.registry.entry.RegistryEntry potion) { return wrapperContained.getColor(potion.wrapperContained); }
public int getColor() { return wrapperContained.getColor(); }
public void buildTooltip(java.lang.Iterable effects,java.util.function.Consumer textConsumer,float durationMultiplier,float tickRate) { wrapperContained.buildTooltip(effects,textConsumer,durationMultiplier,tickRate); }

}