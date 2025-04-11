package yarnwrap.text;
public class Decoration { public net.minecraft.text.Decoration wrapperContained; public Decoration(net.minecraft.text.Decoration wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public yarnwrap.text.Decoration ofChat(java.lang.String translationKey) { return new yarnwrap.text.Decoration(wrapperContained.ofChat(translationKey)); }
// public yarnwrap.text.Text apply(yarnwrap.text.Text content,Object params) { return new yarnwrap.text.Text(wrapperContained.apply(content.wrapperContained,params)); }
// public net.minecraft.text.Text[] collectArguments(yarnwrap.text.Text content,Object params) { return wrapperContained.collectArguments(content.wrapperContained,params); }
public yarnwrap.text.Decoration ofTeamMessage(java.lang.String translationKey) { return new yarnwrap.text.Decoration(wrapperContained.ofTeamMessage(translationKey)); }
public yarnwrap.text.Decoration ofIncomingMessage(java.lang.String translationKey) { return new yarnwrap.text.Decoration(wrapperContained.ofIncomingMessage(translationKey)); }
public yarnwrap.text.Decoration ofOutgoingMessage(java.lang.String translationKey) { return new yarnwrap.text.Decoration(wrapperContained.ofOutgoingMessage(translationKey)); }

}