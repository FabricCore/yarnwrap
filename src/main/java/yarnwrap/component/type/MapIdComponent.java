package yarnwrap.component.type;
public class MapIdComponent { public net.minecraft.component.type.MapIdComponent wrapperContained; public MapIdComponent(net.minecraft.component.type.MapIdComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.MapIdComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.MapIdComponent.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.MapIdComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.MapIdComponent.CODEC = value; }

// public yarnwrap.text.Text LOCKED_TOOLTIP_TEXT() { return new yarnwrap.text.Text(wrapperContained.LOCKED_TOOLTIP_TEXT); }
// public void LOCKED_TOOLTIP_TEXT(yarnwrap.text.Text value) { wrapperContained.LOCKED_TOOLTIP_TEXT = value.wrapperContained; }
// public static yarnwrap.text.Text LOCKED_TOOLTIP_TEXT() { return new yarnwrap.text.Text(net.minecraft.component.type.MapIdComponent.LOCKED_TOOLTIP_TEXT); }
// public static void LOCKED_TOOLTIP_TEXT(yarnwrap.text.Text value, ) { net.minecraft.component.type.MapIdComponent.LOCKED_TOOLTIP_TEXT = value.wrapperContained; }

public java.lang.String asString() { return wrapperContained.asString(); }
// public static java.lang.String asString() { return net.minecraft.component.type.MapIdComponent.asString(); }

}