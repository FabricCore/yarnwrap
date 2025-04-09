package yarnwrap.world.event;
public class BlockPositionSource { public net.minecraft.world.event.BlockPositionSource wrapperContained; public BlockPositionSource(net.minecraft.world.event.BlockPositionSource wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }

}