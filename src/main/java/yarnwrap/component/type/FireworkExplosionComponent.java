package yarnwrap.component.type;
public class FireworkExplosionComponent { public net.minecraft.component.type.FireworkExplosionComponent wrapperContained; public FireworkExplosionComponent(net.minecraft.component.type.FireworkExplosionComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.type.FireworkExplosionComponent DEFAULT() { return new yarnwrap.component.type.FireworkExplosionComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.FireworkExplosionComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.component.type.FireworkExplosionComponent DEFAULT() { return new yarnwrap.component.type.FireworkExplosionComponent(net.minecraft.component.type.FireworkExplosionComponent.DEFAULT); }
// public static void DEFAULT(yarnwrap.component.type.FireworkExplosionComponent value, ) { net.minecraft.component.type.FireworkExplosionComponent.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.FireworkExplosionComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.FireworkExplosionComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.FireworkExplosionComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.FireworkExplosionComponent.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.serialization.Codec COLORS_CODEC() { return wrapperContained.COLORS_CODEC; }
// public void COLORS_CODEC(com.mojang.serialization.Codec value) { wrapperContained.COLORS_CODEC = value; }
public static com.mojang.serialization.Codec COLORS_CODEC() { return net.minecraft.component.type.FireworkExplosionComponent.COLORS_CODEC; }
// public static void COLORS_CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.FireworkExplosionComponent.COLORS_CODEC = value; }

// public yarnwrap.network.codec.PacketCodec COLORS_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.COLORS_PACKET_CODEC); }
// public void COLORS_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.COLORS_PACKET_CODEC = value.wrapperContained; }
// public static yarnwrap.network.codec.PacketCodec COLORS_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.FireworkExplosionComponent.COLORS_PACKET_CODEC); }
// public static void COLORS_PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.FireworkExplosionComponent.COLORS_PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.text.Text CUSTOM_COLOR_TEXT() { return new yarnwrap.text.Text(wrapperContained.CUSTOM_COLOR_TEXT); }
// public void CUSTOM_COLOR_TEXT(yarnwrap.text.Text value) { wrapperContained.CUSTOM_COLOR_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text CUSTOM_COLOR_TEXT() { return new yarnwrap.text.Text(net.minecraft.component.type.FireworkExplosionComponent.CUSTOM_COLOR_TEXT); }
// public static void CUSTOM_COLOR_TEXT(yarnwrap.text.Text value, ) { net.minecraft.component.type.FireworkExplosionComponent.CUSTOM_COLOR_TEXT = value.wrapperContained; }

// public yarnwrap.text.Text getColorText(int color) { return new yarnwrap.text.Text(wrapperContained.getColorText(color)); }
// public static yarnwrap.text.Text getColorText(int color, ) { return new yarnwrap.text.Text(net.minecraft.component.type.FireworkExplosionComponent.getColorText(color)); }
// public com.mojang.datafixers.kinds.App method_57473(Object instance) { return wrapperContained.method_57473(instance); }
// public static com.mojang.datafixers.kinds.App method_57473(Object instance, ) { return net.minecraft.component.type.FireworkExplosionComponent.method_57473(instance); }
public yarnwrap.component.type.FireworkExplosionComponent withFadeColors(it.unimi.dsi.fastutil.ints.IntList fadeColors) { return new yarnwrap.component.type.FireworkExplosionComponent(wrapperContained.withFadeColors(fadeColors)); }
// public static yarnwrap.component.type.FireworkExplosionComponent withFadeColors(it.unimi.dsi.fastutil.ints.IntList fadeColors, ) { return new yarnwrap.component.type.FireworkExplosionComponent(net.minecraft.component.type.FireworkExplosionComponent.withFadeColors(fadeColors)); }
public void appendShapeTooltip(java.util.function.Consumer textConsumer) { wrapperContained.appendShapeTooltip(textConsumer); }
// public static void appendShapeTooltip(java.util.function.Consumer textConsumer, ) { net.minecraft.component.type.FireworkExplosionComponent.appendShapeTooltip(textConsumer); }
// public yarnwrap.text.Text appendColorsTooltipText(yarnwrap.text.MutableText text,it.unimi.dsi.fastutil.ints.IntList colors) { return new yarnwrap.text.Text(wrapperContained.appendColorsTooltipText(text.wrapperContained,colors)); }
// public static yarnwrap.text.Text appendColorsTooltipText(yarnwrap.text.MutableText text,it.unimi.dsi.fastutil.ints.IntList colors, ) { return new yarnwrap.text.Text(net.minecraft.component.type.FireworkExplosionComponent.appendColorsTooltipText(text.wrapperContained,colors)); }
public void appendOptionalTooltip(java.util.function.Consumer textConsumer) { wrapperContained.appendOptionalTooltip(textConsumer); }
// public static void appendOptionalTooltip(java.util.function.Consumer textConsumer, ) { net.minecraft.component.type.FireworkExplosionComponent.appendOptionalTooltip(textConsumer); }

}