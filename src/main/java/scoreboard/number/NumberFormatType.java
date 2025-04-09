package yarnwrap.scoreboard.number;
public class NumberFormatType { public net.minecraft.scoreboard.number.NumberFormatType wrapperContained; public NumberFormatType(net.minecraft.scoreboard.number.NumberFormatType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
public yarnwrap.network.codec.PacketCodec getPacketCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.getPacketCodec()); }

}