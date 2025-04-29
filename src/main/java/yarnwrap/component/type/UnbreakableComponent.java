package yarnwrap.component.type;
public class UnbreakableComponent { public net.minecraft.component.type.UnbreakableComponent wrapperContained; public UnbreakableComponent(net.minecraft.component.type.UnbreakableComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.UnbreakableComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.UnbreakableComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.UnbreakableComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.UnbreakableComponent.PACKET_CODEC = value.wrapperContained; }

// public yarnwrap.text.Text TOOLTIP_TEXT() { return new yarnwrap.text.Text(wrapperContained.TOOLTIP_TEXT); }
// public void TOOLTIP_TEXT(yarnwrap.text.Text value) { wrapperContained.TOOLTIP_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text TOOLTIP_TEXT() { return new yarnwrap.text.Text(net.minecraft.component.type.UnbreakableComponent.TOOLTIP_TEXT); }
// public static void TOOLTIP_TEXT(yarnwrap.text.Text value, ) { net.minecraft.component.type.UnbreakableComponent.TOOLTIP_TEXT = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App method_57515(Object instance) { return wrapperContained.method_57515(instance); }
// public static com.mojang.datafixers.kinds.App method_57515(Object instance, ) { return net.minecraft.component.type.UnbreakableComponent.method_57515(instance); }
public yarnwrap.component.type.UnbreakableComponent withShowInTooltip(boolean showInTooltip) { return new yarnwrap.component.type.UnbreakableComponent(wrapperContained.withShowInTooltip(showInTooltip)); }
// public static yarnwrap.component.type.UnbreakableComponent withShowInTooltip(boolean showInTooltip, ) { return new yarnwrap.component.type.UnbreakableComponent(net.minecraft.component.type.UnbreakableComponent.withShowInTooltip(showInTooltip)); }

}