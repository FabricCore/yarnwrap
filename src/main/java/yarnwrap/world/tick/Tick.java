package yarnwrap.world.tick;
public class Tick { public net.minecraft.world.tick.Tick wrapperContained; public Tick(net.minecraft.world.tick.Tick wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object HASH_STRATEGY() { return wrapperContained.HASH_STRATEGY; }
// // public void HASH_STRATEGY(Object value) { wrapperContained.HASH_STRATEGY = value; }
// public static Object HASH_STRATEGY() { return net.minecraft.world.tick.Tick.HASH_STRATEGY; }
// // public static void HASH_STRATEGY(Object value, ) { net.minecraft.world.tick.Tick.HASH_STRATEGY = value; }

public yarnwrap.world.tick.OrderedTick createOrderedTick(long time,long subTickOrder) { return new yarnwrap.world.tick.OrderedTick(wrapperContained.createOrderedTick(time,subTickOrder)); }
// public static yarnwrap.world.tick.OrderedTick createOrderedTick(long time,long subTickOrder, ) { return new yarnwrap.world.tick.OrderedTick(net.minecraft.world.tick.Tick.createOrderedTick(time,subTickOrder)); }
// public yarnwrap.world.tick.Tick create(java.lang.Object type,yarnwrap.util.math.BlockPos pos) { return new yarnwrap.world.tick.Tick(wrapperContained.create(type,pos.wrapperContained)); }
// public static yarnwrap.world.tick.Tick create(java.lang.Object type,yarnwrap.util.math.BlockPos pos, ) { return new yarnwrap.world.tick.Tick(net.minecraft.world.tick.Tick.create(type,pos.wrapperContained)); }
// public boolean method_67718(long tick) { return wrapperContained.method_67718(tick); }
// public static boolean method_67718(long tick, ) { return net.minecraft.world.tick.Tick.method_67718(tick); }
// public com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec typeCodec) { return wrapperContained.createCodec(typeCodec); }
// public static com.mojang.serialization.Codec createCodec(com.mojang.serialization.Codec typeCodec, ) { return net.minecraft.world.tick.Tick.createCodec(typeCodec); }
// public com.mojang.datafixers.kinds.App method_67720(com.mojang.serialization.Codec instance) { return wrapperContained.method_67720(instance); }
// public static com.mojang.datafixers.kinds.App method_67720(com.mojang.serialization.Codec instance, ) { return net.minecraft.world.tick.Tick.method_67720(instance); }
// public com.mojang.datafixers.kinds.App method_67721(Object instance) { return wrapperContained.method_67721(instance); }
// public static com.mojang.datafixers.kinds.App method_67721(Object instance, ) { return net.minecraft.world.tick.Tick.method_67721(instance); }
// public java.util.List filter(java.util.List ticks,yarnwrap.util.math.ChunkPos chunkPos) { return wrapperContained.filter(ticks,chunkPos.wrapperContained); }
// public static java.util.List filter(java.util.List ticks,yarnwrap.util.math.ChunkPos chunkPos, ) { return net.minecraft.world.tick.Tick.filter(ticks,chunkPos.wrapperContained); }

}