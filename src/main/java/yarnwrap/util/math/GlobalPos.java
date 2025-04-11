package yarnwrap.util.math;
public class GlobalPos { public net.minecraft.util.math.GlobalPos wrapperContained; public GlobalPos(net.minecraft.util.math.GlobalPos wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public com.mojang.serialization.MapCodec MAP_CODEC() { return wrapperContained.MAP_CODEC; }
// public void MAP_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MAP_CODEC = value; }
public yarnwrap.util.math.GlobalPos create(yarnwrap.registry.RegistryKey dimension,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.GlobalPos(wrapperContained.create(dimension.wrapperContained,pos.wrapperContained)); }

}