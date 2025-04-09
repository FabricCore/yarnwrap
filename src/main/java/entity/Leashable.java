package yarnwrap.entity;
public class Leashable { public net.minecraft.entity.Leashable wrapperContained; public Leashable(net.minecraft.entity.Leashable wrapperContained) { this.wrapperContained = wrapperContained; }

public java.lang.String LEASH_NBT_KEY() { return wrapperContained.LEASH_NBT_KEY; }
public double MAX_LEASH_LENGTH() { return wrapperContained.MAX_LEASH_LENGTH; }
public double SHORT_LEASH_LENGTH() { return wrapperContained.SHORT_LEASH_LENGTH; }
public boolean canBeLeashed() { return wrapperContained.canBeLeashed(); }
public void detachLeash(boolean sendPacket,boolean dropItem) { wrapperContained.detachLeash(sendPacket,dropItem); }
public yarnwrap.entity.Entity getLeashHolder() { return new yarnwrap.entity.Entity(wrapperContained.getLeashHolder()); }
public boolean isLeashed() { return wrapperContained.isLeashed(); }
public boolean mightBeLeashed() { return wrapperContained.mightBeLeashed(); }
public Object getLeashData() { return wrapperContained.getLeashData(); }
public boolean beforeLeashTick(yarnwrap.entity.Entity leashHolder,float distance) { return wrapperContained.beforeLeashTick(leashHolder.wrapperContained,distance); }
// public void attachLeash(yarnwrap.entity.Entity entity,yarnwrap.entity.Entity leashHolder,boolean sendPacket) { wrapperContained.attachLeash(entity.wrapperContained,leashHolder.wrapperContained,sendPacket); }
// public void resolveLeashData(yarnwrap.entity.Entity entity,Object leashData) { wrapperContained.resolveLeashData(entity.wrapperContained,leashData); }
// public void detachLeash(yarnwrap.entity.Entity entity,boolean sendPacket,boolean dropItem) { wrapperContained.detachLeash(entity.wrapperContained,sendPacket,dropItem); }
// public void setLeashData(Object leashData) { wrapperContained.setLeashData(leashData); }
// public void writeLeashDataToNbt(yarnwrap.nbt.NbtCompound nbt,Object leashData) { wrapperContained.writeLeashDataToNbt(nbt.wrapperContained,leashData); }
public void onShortLeashTick(yarnwrap.entity.Entity entity) { wrapperContained.onShortLeashTick(entity.wrapperContained); }
public void attachLeash(yarnwrap.entity.Entity leashHolder,boolean sendPacket) { wrapperContained.attachLeash(leashHolder.wrapperContained,sendPacket); }
// public void tickLeash(yarnwrap.entity.Entity entity) { wrapperContained.tickLeash(entity.wrapperContained); }
// public yarnwrap.entity.Entity getLeashHolder(yarnwrap.entity.Entity entity) { return new yarnwrap.entity.Entity(wrapperContained.getLeashHolder(entity.wrapperContained)); }
public Object readLeashDataFromNbt(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.readLeashDataFromNbt(nbt.wrapperContained); }
public void setUnresolvedLeashHolderId(int unresolvedLeashHolderId) { wrapperContained.setUnresolvedLeashHolderId(unresolvedLeashHolderId); }
public boolean canLeashAttachTo() { return wrapperContained.canLeashAttachTo(); }
public void detachLeash() { wrapperContained.detachLeash(); }
// public void applyLeashElasticity(yarnwrap.entity.Entity entity,yarnwrap.entity.Entity leashHolder,float distance) { wrapperContained.applyLeashElasticity(entity.wrapperContained,leashHolder.wrapperContained,distance); }
public void applyLeashElasticity(yarnwrap.entity.Entity leashHolder,float distance) { wrapperContained.applyLeashElasticity(leashHolder.wrapperContained,distance); }

}