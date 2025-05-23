package yarnwrap.item.map;
public class MapFrameMarker { public net.minecraft.item.map.MapFrameMarker wrapperContained; public MapFrameMarker(net.minecraft.item.map.MapFrameMarker wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.item.map.MapFrameMarker.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.item.map.MapFrameMarker.pos = value.wrapperContained; }

// public int rotation() { return wrapperContained.rotation; }
// public void rotation(int value) { wrapperContained.rotation = value; }
// public static int rotation() { return net.minecraft.item.map.MapFrameMarker.rotation; }
// public static void rotation(int value, ) { net.minecraft.item.map.MapFrameMarker.rotation = value; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.item.map.MapFrameMarker.entityId; }
// public static void entityId(int value, ) { net.minecraft.item.map.MapFrameMarker.entityId = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.item.map.MapFrameMarker.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.item.map.MapFrameMarker.CODEC = value; }

public MapFrameMarker(yarnwrap.util.math.BlockPos pos,int rotation,int entityId) { this.wrapperContained = new net.minecraft.item.map.MapFrameMarker(pos.wrapperContained,rotation,entityId); }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos()); }
// // public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.item.map.MapFrameMarker.pos()); }
// public int rotation() { return wrapperContained.rotation(); }
// // public static int rotation() { return net.minecraft.item.map.MapFrameMarker.rotation(); }
// public int entityId() { return wrapperContained.entityId(); }
// // public static int entityId() { return net.minecraft.item.map.MapFrameMarker.entityId(); }
// public java.lang.String getKey(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getKey(pos.wrapperContained); }
// public static java.lang.String getKey(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.item.map.MapFrameMarker.getKey(pos.wrapperContained); }
public java.lang.String getKey() { return wrapperContained.getKey(); }
// public static java.lang.String getKey() { return net.minecraft.item.map.MapFrameMarker.getKey(); }
// public com.mojang.datafixers.kinds.App method_67420(Object instance) { return wrapperContained.method_67420(instance); }
// public static com.mojang.datafixers.kinds.App method_67420(Object instance, ) { return net.minecraft.item.map.MapFrameMarker.method_67420(instance); }

}