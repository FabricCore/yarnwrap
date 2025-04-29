package yarnwrap.item.map;
public class MapFrameMarker { public net.minecraft.item.map.MapFrameMarker wrapperContained; public MapFrameMarker(net.minecraft.item.map.MapFrameMarker wrapperContained) { this.wrapperContained = wrapperContained; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public static int entityId() { return net.minecraft.item.map.MapFrameMarker.entityId; }
// public static void entityId(int value, ) { net.minecraft.item.map.MapFrameMarker.entityId = value; }

// public int rotation() { return wrapperContained.rotation; }
// public void rotation(int value) { wrapperContained.rotation = value; }
// public static int rotation() { return net.minecraft.item.map.MapFrameMarker.rotation; }
// public static void rotation(int value, ) { net.minecraft.item.map.MapFrameMarker.rotation = value; }

// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
// public static yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(net.minecraft.item.map.MapFrameMarker.pos); }
// public static void pos(yarnwrap.util.math.BlockPos value, ) { net.minecraft.item.map.MapFrameMarker.pos = value.wrapperContained; }

public MapFrameMarker(yarnwrap.util.math.BlockPos pos,int rotation,int entityId) { this.wrapperContained = new net.minecraft.item.map.MapFrameMarker(pos.wrapperContained,rotation,entityId); }
// public java.lang.String getKey(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getKey(pos.wrapperContained); }
// public static java.lang.String getKey(yarnwrap.util.math.BlockPos pos, ) { return net.minecraft.item.map.MapFrameMarker.getKey(pos.wrapperContained); }
public java.lang.String getKey() { return wrapperContained.getKey(); }
// public static java.lang.String getKey() { return net.minecraft.item.map.MapFrameMarker.getKey(); }
public int getRotation() { return wrapperContained.getRotation(); }
// public static int getRotation() { return net.minecraft.item.map.MapFrameMarker.getRotation(); }
public yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt()); }
// public static yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(net.minecraft.item.map.MapFrameMarker.toNbt()); }
public int getEntityId() { return wrapperContained.getEntityId(); }
// public static int getEntityId() { return net.minecraft.item.map.MapFrameMarker.getEntityId(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
// public static yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(net.minecraft.item.map.MapFrameMarker.getPos()); }
// public yarnwrap.item.map.MapFrameMarker fromNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.item.map.MapFrameMarker(wrapperContained.fromNbt(nbt.wrapperContained)); }
// public static yarnwrap.item.map.MapFrameMarker fromNbt(yarnwrap.nbt.NbtCompound nbt, ) { return new yarnwrap.item.map.MapFrameMarker(net.minecraft.item.map.MapFrameMarker.fromNbt(nbt.wrapperContained)); }

}