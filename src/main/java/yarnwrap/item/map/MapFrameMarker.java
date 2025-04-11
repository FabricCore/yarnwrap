package yarnwrap.item.map;
public class MapFrameMarker { public net.minecraft.item.map.MapFrameMarker wrapperContained; public MapFrameMarker(net.minecraft.item.map.MapFrameMarker wrapperContained) { this.wrapperContained = wrapperContained; }

// public int entityId() { return wrapperContained.entityId; }
// public void entityId(int value) { wrapperContained.entityId = value; }
// public int rotation() { return wrapperContained.rotation; }
// public void rotation(int value) { wrapperContained.rotation = value; }
// public yarnwrap.util.math.BlockPos pos() { return new yarnwrap.util.math.BlockPos(wrapperContained.pos); }
// public void pos(yarnwrap.util.math.BlockPos value) { wrapperContained.pos = value.wrapperContained; }
public MapFrameMarker(yarnwrap.util.math.BlockPos pos,int rotation,int entityId) { this.wrapperContained = new net.minecraft.item.map.MapFrameMarker(pos.wrapperContained,rotation,entityId); }
public java.lang.String getKey(yarnwrap.util.math.BlockPos pos) { return wrapperContained.getKey(pos.wrapperContained); }
public java.lang.String getKey() { return wrapperContained.getKey(); }
public int getRotation() { return wrapperContained.getRotation(); }
public yarnwrap.nbt.NbtCompound toNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.toNbt()); }
public int getEntityId() { return wrapperContained.getEntityId(); }
public yarnwrap.util.math.BlockPos getPos() { return new yarnwrap.util.math.BlockPos(wrapperContained.getPos()); }
public yarnwrap.item.map.MapFrameMarker fromNbt(yarnwrap.nbt.NbtCompound nbt) { return new yarnwrap.item.map.MapFrameMarker(wrapperContained.fromNbt(nbt.wrapperContained)); }

}