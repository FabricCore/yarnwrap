package yarnwrap.component.type;
public class LoreComponent { public net.minecraft.component.type.LoreComponent wrapperContained; public LoreComponent(net.minecraft.component.type.LoreComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.component.type.LoreComponent DEFAULT() { return new yarnwrap.component.type.LoreComponent(wrapperContained.DEFAULT); }
// public void DEFAULT(yarnwrap.component.type.LoreComponent value) { wrapperContained.DEFAULT = value.wrapperContained; }
public static yarnwrap.component.type.LoreComponent DEFAULT() { return new yarnwrap.component.type.LoreComponent(net.minecraft.component.type.LoreComponent.DEFAULT); }
// public static void DEFAULT(yarnwrap.component.type.LoreComponent value, ) { net.minecraft.component.type.LoreComponent.DEFAULT = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.LoreComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.LoreComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.LoreComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.LoreComponent.PACKET_CODEC = value.wrapperContained; }

// public int MAX_LORES() { return wrapperContained.MAX_LORES; }
// public void MAX_LORES(int value) { wrapperContained.MAX_LORES = value; }
public static int MAX_LORES() { return net.minecraft.component.type.LoreComponent.MAX_LORES; }
// public static void MAX_LORES(int value, ) { net.minecraft.component.type.LoreComponent.MAX_LORES = value; }

// public yarnwrap.text.Style STYLE() { return new yarnwrap.text.Style(wrapperContained.STYLE); }
// public void STYLE(yarnwrap.text.Style value) { wrapperContained.STYLE = value.wrapperContained; }
// public static yarnwrap.text.Style STYLE() { return new yarnwrap.text.Style(net.minecraft.component.type.LoreComponent.STYLE); }
// public static void STYLE(yarnwrap.text.Style value, ) { net.minecraft.component.type.LoreComponent.STYLE = value.wrapperContained; }

public LoreComponent(java.util.List lines) { this.wrapperContained = new net.minecraft.component.type.LoreComponent(lines); }
public LoreComponent(java.util.List lines,java.util.List styledLines) { this.wrapperContained = new net.minecraft.component.type.LoreComponent(lines,styledLines); }
public yarnwrap.component.type.LoreComponent with(yarnwrap.text.Text line) { return new yarnwrap.component.type.LoreComponent(wrapperContained.with(line.wrapperContained)); }
// public static yarnwrap.component.type.LoreComponent with(yarnwrap.text.Text line, ) { return new yarnwrap.component.type.LoreComponent(net.minecraft.component.type.LoreComponent.with(line.wrapperContained)); }
// public yarnwrap.text.Text method_57500(yarnwrap.text.Text style) { return new yarnwrap.text.Text(wrapperContained.method_57500(style.wrapperContained)); }
// public static yarnwrap.text.Text method_57500(yarnwrap.text.Text style, ) { return new yarnwrap.text.Text(net.minecraft.component.type.LoreComponent.method_57500(style.wrapperContained)); }

}