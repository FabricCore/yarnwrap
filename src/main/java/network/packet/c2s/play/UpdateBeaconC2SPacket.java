package yarnwrap.network.packet.c2s.play;
public class UpdateBeaconC2SPacket { public net.minecraft.network.packet.c2s.play.UpdateBeaconC2SPacket wrapperContained; public UpdateBeaconC2SPacket(net.minecraft.network.packet.c2s.play.UpdateBeaconC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }

}