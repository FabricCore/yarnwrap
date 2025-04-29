package yarnwrap.text;
public class Decoration { public net.minecraft.text.Decoration wrapperContained; public Decoration(net.minecraft.text.Decoration wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.text.Decoration.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.text.Decoration.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.text.Decoration.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.text.Decoration.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App method_43830(Object instance) { return wrapperContained.method_43830(instance); }
// public static com.mojang.datafixers.kinds.App method_43830(Object instance, ) { return net.minecraft.text.Decoration.method_43830(instance); }
// public yarnwrap.text.Decoration ofChat(java.lang.String translationKey) { return new yarnwrap.text.Decoration(wrapperContained.ofChat(translationKey)); }
// public static yarnwrap.text.Decoration ofChat(java.lang.String translationKey, ) { return new yarnwrap.text.Decoration(net.minecraft.text.Decoration.ofChat(translationKey)); }
// public yarnwrap.text.Text apply(yarnwrap.text.Text content,Object params) { return new yarnwrap.text.Text(wrapperContained.apply(content.wrapperContained,params)); }
// public static yarnwrap.text.Text apply(yarnwrap.text.Text content,Object params, ) { return new yarnwrap.text.Text(net.minecraft.text.Decoration.apply(content.wrapperContained,params)); }
// public net.minecraft.text.Text[] collectArguments(yarnwrap.text.Text content,Object params) { return wrapperContained.collectArguments(content.wrapperContained,params); }
// public static net.minecraft.text.Text[] collectArguments(yarnwrap.text.Text content,Object params, ) { return net.minecraft.text.Decoration.collectArguments(content.wrapperContained,params); }
// public yarnwrap.text.Decoration ofTeamMessage(java.lang.String translationKey) { return new yarnwrap.text.Decoration(wrapperContained.ofTeamMessage(translationKey)); }
// public static yarnwrap.text.Decoration ofTeamMessage(java.lang.String translationKey, ) { return new yarnwrap.text.Decoration(net.minecraft.text.Decoration.ofTeamMessage(translationKey)); }
// public yarnwrap.text.Decoration ofIncomingMessage(java.lang.String translationKey) { return new yarnwrap.text.Decoration(wrapperContained.ofIncomingMessage(translationKey)); }
// public static yarnwrap.text.Decoration ofIncomingMessage(java.lang.String translationKey, ) { return new yarnwrap.text.Decoration(net.minecraft.text.Decoration.ofIncomingMessage(translationKey)); }
// public yarnwrap.text.Decoration ofOutgoingMessage(java.lang.String translationKey) { return new yarnwrap.text.Decoration(wrapperContained.ofOutgoingMessage(translationKey)); }
// public static yarnwrap.text.Decoration ofOutgoingMessage(java.lang.String translationKey, ) { return new yarnwrap.text.Decoration(net.minecraft.text.Decoration.ofOutgoingMessage(translationKey)); }

}