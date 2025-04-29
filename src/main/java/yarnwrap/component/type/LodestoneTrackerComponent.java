package yarnwrap.component.type;
public class LodestoneTrackerComponent { public net.minecraft.component.type.LodestoneTrackerComponent wrapperContained; public LodestoneTrackerComponent(net.minecraft.component.type.LodestoneTrackerComponent wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.component.type.LodestoneTrackerComponent.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.component.type.LodestoneTrackerComponent.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.component.type.LodestoneTrackerComponent.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.component.type.LodestoneTrackerComponent.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.datafixers.kinds.App method_57502(Object instance) { return wrapperContained.method_57502(instance); }
// public static com.mojang.datafixers.kinds.App method_57502(Object instance, ) { return net.minecraft.component.type.LodestoneTrackerComponent.method_57502(instance); }
public yarnwrap.component.type.LodestoneTrackerComponent forWorld(yarnwrap.server.world.ServerWorld world) { return new yarnwrap.component.type.LodestoneTrackerComponent(wrapperContained.forWorld(world.wrapperContained)); }
// public static yarnwrap.component.type.LodestoneTrackerComponent forWorld(yarnwrap.server.world.ServerWorld world, ) { return new yarnwrap.component.type.LodestoneTrackerComponent(net.minecraft.component.type.LodestoneTrackerComponent.forWorld(world.wrapperContained)); }

}