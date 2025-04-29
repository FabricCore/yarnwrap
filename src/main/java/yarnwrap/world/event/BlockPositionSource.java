package yarnwrap.world.event;
public class BlockPositionSource { public net.minecraft.world.event.BlockPositionSource wrapperContained; public BlockPositionSource(net.minecraft.world.event.BlockPositionSource wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.mojang.serialization.MapCodec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.MapCodec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.MapCodec CODEC() { return net.minecraft.world.event.BlockPositionSource.CODEC; }
// public static void CODEC(com.mojang.serialization.MapCodec value, ) { net.minecraft.world.event.BlockPositionSource.CODEC = value; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.world.event.BlockPositionSource.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.world.event.BlockPositionSource.pos = value.wrapperContained; }

// public yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(wrapperContained.PACKET_CODEC); }
// public void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value) { wrapperContained.PACKET_CODEC = value.wrapperContained; }
public static yarnwrap.network.codec.PacketCodec PACKET_CODEC() { return new yarnwrap.network.codec.PacketCodec(net.minecraft.world.event.BlockPositionSource.PACKET_CODEC); }
// public static void PACKET_CODEC(yarnwrap.network.codec.PacketCodec value, ) { net.minecraft.world.event.BlockPositionSource.PACKET_CODEC = value.wrapperContained; }

public BlockPositionSource(yarnwrap.util.math.BlockPos pos) { this.wrapperContained = new net.minecraft.world.event.BlockPositionSource(pos.wrapperContained); }
// public com.mojang.datafixers.kinds.App method_32927(Object instance) { return wrapperContained.method_32927(instance); }
// public static com.mojang.datafixers.kinds.App method_32927(Object instance, ) { return net.minecraft.world.event.BlockPositionSource.method_32927(instance); }
// public yarnwrap.util.math.BlockPos method_32928(yarnwrap.world.event.BlockPositionSource blockPositionSource) { return new yarnwrap.util.math.BlockPos(wrapperContained.method_32928(blockPositionSource.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos method_32928(yarnwrap.world.event.BlockPositionSource blockPositionSource, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.world.event.BlockPositionSource.method_32928(blockPositionSource.wrapperContained)); }
// public yarnwrap.util.math.BlockPos method_56122(yarnwrap.world.event.BlockPositionSource source) { return new yarnwrap.util.math.BlockPos(wrapperContained.method_56122(source.wrapperContained)); }
// public static yarnwrap.util.math.BlockPos method_56122(yarnwrap.world.event.BlockPositionSource source, ) { return new yarnwrap.util.math.BlockPos(net.minecraft.world.event.BlockPositionSource.method_56122(source.wrapperContained)); }

}