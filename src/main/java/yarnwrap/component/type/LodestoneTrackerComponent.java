package yarnwrap.component.type;
public class LodestoneTrackerComponent { public net.minecraft.component.type.LodestoneTrackerComponent wrapperContained; public LodestoneTrackerComponent(net.minecraft.component.type.LodestoneTrackerComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public yarnwrap.component.type.LodestoneTrackerComponent forWorld(yarnwrap.server.world.ServerWorld world) { return new yarnwrap.component.type.LodestoneTrackerComponent(wrapperContained.forWorld(world.wrapperContained)); }

}