package yarnwrap.component.type;
public class PotionContentsComponent { public net.minecraft.component.type.PotionContentsComponent wrapperContained; public PotionContentsComponent(net.minecraft.component.type.PotionContentsComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.text.Text NONE_TEXT() { return new yarnwrap.text.Text(wrapperContained.NONE_TEXT); }
// public void NONE_TEXT(yarnwrap.text.Text value) { wrapperContained.NONE_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text NONE_TEXT() { return new yarnwrap.text.Text(net.minecraft.component.type.PotionContentsComponent.NONE_TEXT); }
// public static void NONE_TEXT(yarnwrap.text.Text value, ) { net.minecraft.component.type.PotionContentsComponent.NONE_TEXT = value.wrapperContained; }

// public yarnwrap.component.type.PotionContentsComponent DEFAULT() { return new yarnwrap.component.type.PotionContentsComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.PotionContentsComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.component.type.PotionContentsComponent DEFAULT() { return new yarnwrap.component.type.PotionContentsComponent(net.minecraft.component.type.PotionContentsComponent.DEFAULT); }
// public static void DEFAULT(yarnwrap.component.type.PotionContentsComponent value, ) { net.minecraft.component.type.PotionContentsComponent.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.PotionContentsComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.PotionContentsComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.PotionContentsComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.PotionContentsComponent.PACKET_CODEC = value.wrapperContained; }

// public int EFFECTLESS_COLOR() { return wrapperContained.EFFECTLESS_COLOR; }
// public void EFFECTLESS_COLOR(int value) { wrapperContained.EFFECTLESS_COLOR = value; }
public static int EFFECTLESS_COLOR() { return net.minecraft.component.type.PotionContentsComponent.EFFECTLESS_COLOR; }
// public static void EFFECTLESS_COLOR(int value, ) { net.minecraft.component.type.PotionContentsComponent.EFFECTLESS_COLOR = value; }

// public com.mojang.serialization.Codec BASE_CODEC() { return wrapperContained.BASE_CODEC; }
// public void BASE_CODEC(com.mojang.serialization.Codec value) { wrapperContained.BASE_CODEC = value; }
// public static com.mojang.serialization.Codec BASE_CODEC() { return net.minecraft.component.type.PotionContentsComponent.BASE_CODEC; }
// public static void BASE_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.PotionContentsComponent.BASE_CODEC = value; }

public PotionContentsComponent(yarnwrap.registry.entry.RegistryEntry potion) { this.wrapperContained = new net.minecraft.component.type.PotionContentsComponent(potion.wrapperContained); }
public int getColor() { return wrapperContained.getColor(); }
// public static int getColor() { return net.minecraft.component.type.PotionContentsComponent.getColor(); }
// public void buildTooltip(java.lang.Iterable effects,java.util.function.Consumer textConsumer,float durationMultiplier,float tickRate) { wrapperContained.buildTooltip(effects,textConsumer,durationMultiplier,tickRate); }
// public static void buildTooltip(java.lang.Iterable effects,java.util.function.Consumer textConsumer,float durationMultiplier,float tickRate, ) { net.minecraft.component.type.PotionContentsComponent.buildTooltip(effects,textConsumer,durationMultiplier,tickRate); }
// public void method_55762(java.util.List attribute,yarnwrap.registry.entry.RegistryEntry modifier) { wrapperContained.method_55762(attribute,modifier.wrapperContained); }
// public static void method_55762(java.util.List attribute,yarnwrap.registry.entry.RegistryEntry modifier, ) { net.minecraft.component.type.PotionContentsComponent.method_55762(attribute,modifier.wrapperContained); }
public java.lang.Iterable getEffects() { return wrapperContained.getEffects(); }
// public static java.lang.Iterable getEffects() { return net.minecraft.component.type.PotionContentsComponent.getEffects(); }
public yarnwrap.component.type.PotionContentsComponent with(yarnwrap.entity.effect.StatusEffectInstance customEffect) { return new yarnwrap.component.type.PotionContentsComponent(wrapperContained.with(customEffect.wrapperContained)); }
// public static yarnwrap.component.type.PotionContentsComponent with(yarnwrap.entity.effect.StatusEffectInstance customEffect, ) { return new yarnwrap.component.type.PotionContentsComponent(net.minecraft.component.type.PotionContentsComponent.with(customEffect.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_57399(Object instance) { return wrapperContained.method_57399(instance); }
// public static com.mojang.datafixers.kinds.App method_57399(Object instance, ) { return net.minecraft.component.type.PotionContentsComponent.method_57399(instance); }
// public yarnwrap.item.ItemStack createStack(yarnwrap.item.Item item,yarnwrap.registry.entry.RegistryEntry potion) { return new yarnwrap.item.ItemStack(wrapperContained.createStack(item.wrapperContained,potion.wrapperContained)); }
// public static yarnwrap.item.ItemStack createStack(yarnwrap.item.Item item,yarnwrap.registry.entry.RegistryEntry potion, ) { return new yarnwrap.item.ItemStack(net.minecraft.component.type.PotionContentsComponent.createStack(item.wrapperContained,potion.wrapperContained)); }
public boolean matches(yarnwrap.registry.entry.RegistryEntry potion) { return wrapperContained.matches(potion.wrapperContained); }
// public static boolean matches(yarnwrap.registry.entry.RegistryEntry potion, ) { return net.minecraft.component.type.PotionContentsComponent.matches(potion.wrapperContained); }
public void forEachEffect(java.util.function.Consumer effectConsumer,float durationMultiplier) { wrapperContained.forEachEffect(effectConsumer,durationMultiplier); }
// public static void forEachEffect(java.util.function.Consumer effectConsumer,float durationMultiplier, ) { net.minecraft.component.type.PotionContentsComponent.forEachEffect(effectConsumer,durationMultiplier); }
public yarnwrap.component.type.PotionContentsComponent with(yarnwrap.registry.entry.RegistryEntry potion) { return new yarnwrap.component.type.PotionContentsComponent(wrapperContained.with(potion.wrapperContained)); }
// public static yarnwrap.component.type.PotionContentsComponent with(yarnwrap.registry.entry.RegistryEntry potion, ) { return new yarnwrap.component.type.PotionContentsComponent(net.minecraft.component.type.PotionContentsComponent.with(potion.wrapperContained)); }
public boolean hasEffects() { return wrapperContained.hasEffects(); }
// public static boolean hasEffects() { return net.minecraft.component.type.PotionContentsComponent.hasEffects(); }
// public java.util.OptionalInt mixColors(java.lang.Iterable effects) { return wrapperContained.mixColors(effects); }
// public static java.util.OptionalInt mixColors(java.lang.Iterable effects, ) { return net.minecraft.component.type.PotionContentsComponent.mixColors(effects); }
public void apply(yarnwrap.entity.LivingEntity user,float durationMultiplier) { wrapperContained.apply(user.wrapperContained,durationMultiplier); }
// public static void apply(yarnwrap.entity.LivingEntity user,float durationMultiplier, ) { net.minecraft.component.type.PotionContentsComponent.apply(user.wrapperContained,durationMultiplier); }
// public void method_62840(yarnwrap.server.world.ServerWorld effect) { wrapperContained.method_62840(effect.wrapperContained); }
// public static void method_62840(yarnwrap.server.world.ServerWorld effect, ) { net.minecraft.component.type.PotionContentsComponent.method_62840(effect.wrapperContained); }
public yarnwrap.text.Text getName(java.lang.String prefix) { return new yarnwrap.text.Text(wrapperContained.getName(prefix)); }
// public static yarnwrap.text.Text getName(java.lang.String prefix, ) { return new yarnwrap.text.Text(net.minecraft.component.type.PotionContentsComponent.getName(prefix)); }
// public java.lang.String method_64196(yarnwrap.registry.entry.RegistryEntry potionEntry) { return wrapperContained.method_64196(potionEntry.wrapperContained); }
// public static java.lang.String method_64196(yarnwrap.registry.entry.RegistryEntry potionEntry, ) { return net.minecraft.component.type.PotionContentsComponent.method_64196(potionEntry.wrapperContained); }
public int getColor(int defaultColor) { return wrapperContained.getColor(defaultColor); }
// public static int getColor(int defaultColor, ) { return net.minecraft.component.type.PotionContentsComponent.getColor(defaultColor); }
// public yarnwrap.text.MutableText getEffectText(yarnwrap.registry.entry.RegistryEntry effect,int amplifier) { return new yarnwrap.text.MutableText(wrapperContained.getEffectText(effect.wrapperContained,amplifier)); }
// public static yarnwrap.text.MutableText getEffectText(yarnwrap.registry.entry.RegistryEntry effect,int amplifier, ) { return new yarnwrap.text.MutableText(net.minecraft.component.type.PotionContentsComponent.getEffectText(effect.wrapperContained,amplifier)); }

}