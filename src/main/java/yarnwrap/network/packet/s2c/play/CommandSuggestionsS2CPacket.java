package yarnwrap.network.packet.s2c.play;
public class CommandSuggestionsS2CPacket { public net.minecraft.network.packet.s2c.play.CommandSuggestionsS2CPacket wrapperContained; public CommandSuggestionsS2CPacket(net.minecraft.network.packet.s2c.play.CommandSuggestionsS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public com.mojang.brigadier.suggestion.Suggestions getSuggestions() { return wrapperContained.getSuggestions(); }

}