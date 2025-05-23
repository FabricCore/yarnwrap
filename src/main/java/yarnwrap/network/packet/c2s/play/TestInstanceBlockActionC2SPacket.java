package yarnwrap.network.packet.c2s.play;
public class TestInstanceBlockActionC2SPacket { public net.minecraft.network.packet.c2s.play.TestInstanceBlockActionC2SPacket wrapperContained; public TestInstanceBlockActionC2SPacket(net.minecraft.network.packet.c2s.play.TestInstanceBlockActionC2SPacket wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.CODEC); }
// public void CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.network.packet.c2s.play.TestInstanceBlockActionC2SPacket.CODEC); }
// public static void CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.network.packet.c2s.play.TestInstanceBlockActionC2SPacket.CODEC = value.wrapperContained; }

// public TestInstanceBlockActionC2SPacket(yarnwrap.util.math.BlockPos pos,Object actin) { this.wrapperContained = new net.minecraft.network.packet.c2s.play.TestInstanceBlockActionC2SPacket(pos.wrapperContained,actin); }

}