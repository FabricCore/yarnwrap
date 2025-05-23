package yarnwrap.util.math;
public class GlobalPos { public net.minecraft.util.math.GlobalPos wrapperContained; public GlobalPos(net.minecraft.util.math.GlobalPos wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.util.math.GlobalPos.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.util.math.GlobalPos.CODEC = value; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.util.math.GlobalPos.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.util.math.GlobalPos.PACKET_CODEC = value.wrapperContained; }

// public com.mojang.serialization.MapCodec MAP_CODEC() { return wrapperContained.MAP_CODEC; }
// public void MAP_CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.MAP_CODEC = value; }
public static com.mojang.serialization.MapCodec MAP_CODEC() { return net.minecraft.util.math.GlobalPos.MAP_CODEC; }
// public static void MAP_CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.util.math.GlobalPos.MAP_CODEC = value; }

public GlobalPos(yarnwrap.registry.RegistryKey dimension,yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.util.math.GlobalPos(dimension.wrapperContained,pos.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.util.math.GlobalPos.equals(o); }
// public yarnwrap.util.math.GlobalPos create(yarnwrap.registry.RegistryKey dimension,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.GlobalPos(wrapperContained.create(dimension.wrapperContained,pos.wrapperContained)); }
// public static yarnwrap.util.math.GlobalPos create(yarnwrap.registry.RegistryKey dimension,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.util.math.GlobalPos(net.minecraft.util.math.GlobalPos.create(dimension.wrapperContained,pos.wrapperContained)); }
// public com.mojang.datafixers.kinds.App method_29096(Object instance) { return wrapperContained.method_29096(instance); }
// public static com.mojang.datafixers.kinds.App method_29096(Object instance, ) { return net.minecraft.util.math.GlobalPos.method_29096(instance); }
public boolean isWithinRange(yarnwrap.registry.RegistryKey dimension,yarnwrap.util.math.BlockPos otherPos,int maxDistance) { return wrapperContained.isWithinRange(dimension.wrapperContained,otherPos.wrapperContained,maxDistance); }
// public static boolean isWithinRange(yarnwrap.registry.RegistryKey dimension,yarnwrap.util.math.BlockPos otherPos,int maxDistance, ) { return net.minecraft.util.math.GlobalPos.isWithinRange(dimension.wrapperContained,otherPos.wrapperContained,maxDistance); }

}