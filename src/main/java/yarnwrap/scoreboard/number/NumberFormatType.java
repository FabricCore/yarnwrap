package yarnwrap.scoreboard.number;
public class NumberFormatType { public net.minecraft.scoreboard.number.NumberFormatType wrapperContained; public NumberFormatType(net.minecraft.scoreboard.number.NumberFormatType wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec getCodec() { return wrapperContained.getCodec(); }
// public static com.mojang.serialization.MapCodec getCodec() { return net.minecraft.scoreboard.number.NumberFormatType.getCodec(); }
public yarnwrap.network.codec.PacketCodec getPacketCodec() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.getPacketCodec()); }
// public static yarnwrap.network.codec.PacketCodec getPacketCodec() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.scoreboard.number.NumberFormatType.getPacketCodec()); }

}