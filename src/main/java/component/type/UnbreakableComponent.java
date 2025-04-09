package yarnwrap.component.type;
public class UnbreakableComponent { public net.minecraft.component.type.UnbreakableComponent wrapperContained; public UnbreakableComponent(net.minecraft.component.type.UnbreakableComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public yarnwrap.text.Text TOOLTIP_TEXT() { return new yarnwrap.text.Text(wrapperContained.TOOLTIP_TEXT); }
public yarnwrap.component.type.UnbreakableComponent withShowInTooltip(boolean showInTooltip) { return new yarnwrap.component.type.UnbreakableComponent(wrapperContained.withShowInTooltip(showInTooltip)); }

}