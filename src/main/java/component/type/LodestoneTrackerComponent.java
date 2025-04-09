package yarnwrap.component.type;
public class LodestoneTrackerComponent { public net.minecraft.component.type.LodestoneTrackerComponent wrapperContained; public LodestoneTrackerComponent(net.minecraft.component.type.LodestoneTrackerComponent wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
public yarnwrap.component.type.LodestoneTrackerComponent forWorld(yarnwrap.server.world.ServerWorld world) { return new yarnwrap.component.type.LodestoneTrackerComponent(wrapperContained.forWorld(world.wrapperContained)); }

}