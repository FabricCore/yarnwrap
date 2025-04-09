package yarnwrap.component.type;
public class LoreComponent { public net.minecraft.component.type.LoreComponent wrapperContained; public LoreComponent(net.minecraft.component.type.LoreComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.component.type.LoreComponent DEFAULT() { return new yarnwrap.component.type.LoreComponent(wrapperContained.DEFAULT); }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public int MAX_LORES() { return wrapperContained.MAX_LORES; }
// public yarnwrap.text.Style STYLE() { return new yarnwrap.text.Style(wrapperContained.STYLE); }
public yarnwrap.component.type.LoreComponent with(yarnwrap.text.Text line) { return new yarnwrap.component.type.LoreComponent(wrapperContained.with(line.wrapperContained)); }

}