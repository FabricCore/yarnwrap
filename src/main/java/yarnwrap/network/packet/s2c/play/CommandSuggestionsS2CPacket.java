package yarnwrap.network.packet.s2c.play;
public class CommandSuggestionsS2CPacket { public net.minecraft.network.packet.s2c.play.CommandSuggestionsS2CPacket wrapperContained; public CommandSuggestionsS2CPacket(net.minecraft.network.packet.s2c.play.CommandSuggestionsS2CPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public CommandSuggestionsS2CPacket(int completionId,com.mojang.brigadier.suggestion.Suggestions suggestions) { this.wrapperContained = new net.minecraft.network.packet.s2c.play.CommandSuggestionsS2CPacket(completionId,suggestions); }
public com.mojang.brigadier.suggestion.Suggestions getSuggestions() { return wrapperContained.getSuggestions(); }
// public com.mojang.brigadier.suggestion.Suggestion method_56608(com.mojang.brigadier.context.StringRange suggestion) { return wrapperContained.method_56608(suggestion); }
// public Object method_56609(com.mojang.brigadier.suggestion.Suggestion suggestion) { return wrapperContained.method_56609(suggestion); }

}