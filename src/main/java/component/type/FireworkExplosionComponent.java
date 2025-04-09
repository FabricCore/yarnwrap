package yarnwrap.component.type;
public class FireworkExplosionComponent { public net.minecraft.component.type.FireworkExplosionComponent wrapperContained; public FireworkExplosionComponent(net.minecraft.component.type.FireworkExplosionComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.FireworkExplosionComponent DEFAULT() { return new yarnwrap.component.type.FireworkExplosionComponent(wrapperContained.DEFAULT); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public com.mojang.serialization.Codec COLORS_CODEC() { return wrapperContained.COLORS_CODEC; }
// public yarnwrap.network.codec.PacketCodec COLORS_PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.COLORS_PACKET_CODEC); }
// public yarnwrap.text.Text CUSTOM_COLOR_TEXT() { return new yarnwrap.text.Text(wrapperContained.CUSTOM_COLOR_TEXT); }
// public yarnwrap.text.Text getColorText(int color) { return new yarnwrap.text.Text(wrapperContained.getColorText(color)); }
public yarnwrap.component.type.FireworkExplosionComponent withFadeColors(it.unimi.dsi.fastutil.ints.IntList fadeColors) { return new yarnwrap.component.type.FireworkExplosionComponent(wrapperContained.withFadeColors(fadeColors)); }
public void appendShapeTooltip(java.util.function.Consumer textConsumer) { wrapperContained.appendShapeTooltip(textConsumer); }
// public yarnwrap.text.Text appendColorsTooltipText(yarnwrap.text.MutableText text,it.unimi.dsi.fastutil.ints.IntList colors) { return new yarnwrap.text.Text(wrapperContained.appendColorsTooltipText(text.wrapperContained,colors)); }
public void appendOptionalTooltip(java.util.function.Consumer textConsumer) { wrapperContained.appendOptionalTooltip(textConsumer); }

}