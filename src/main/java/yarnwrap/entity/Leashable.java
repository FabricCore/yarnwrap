package yarnwrap.entity;
public class Leashable { public net.minecraft.entity.Leashable wrapperContained; public Leashable(net.minecraft.entity.Leashable wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.lang.String LEASH_NBT_KEY() { return wrapperContained.LEASH_NBT_KEY; }
// public void LEASH_NBT_KEY(java.lang.String value) { wrapperContained.LEASH_NBT_KEY = value; }
public static java.lang.String LEASH_NBT_KEY() { return net.minecraft.entity.Leashable.LEASH_NBT_KEY; }
// public static void LEASH_NBT_KEY(java.lang.String value, ) { net.minecraft.entity.Leashable.LEASH_NBT_KEY = value; }

// public double MAX_LEASH_LENGTH() { return wrapperContained.MAX_LEASH_LENGTH; }
// public void MAX_LEASH_LENGTH(double value) { wrapperContained.MAX_LEASH_LENGTH = value; }
public static double MAX_LEASH_LENGTH() { return net.minecraft.entity.Leashable.MAX_LEASH_LENGTH; }
// public static void MAX_LEASH_LENGTH(double value, ) { net.minecraft.entity.Leashable.MAX_LEASH_LENGTH = value; }

// public double SHORT_LEASH_LENGTH() { return wrapperContained.SHORT_LEASH_LENGTH; }
// public void SHORT_LEASH_LENGTH(double value) { wrapperContained.SHORT_LEASH_LENGTH = value; }
public static double SHORT_LEASH_LENGTH() { return net.minecraft.entity.Leashable.SHORT_LEASH_LENGTH; }
// public static void SHORT_LEASH_LENGTH(double value, ) { net.minecraft.entity.Leashable.SHORT_LEASH_LENGTH = value; }

public boolean canBeLeashed() { return wrapperContained.canBeLeashed(); }
// public static boolean canBeLeashed() { return net.minecraft.entity.Leashable.canBeLeashed(); }
public void detachLeash(boolean sendPacket,boolean dropItem) { wrapperContained.detachLeash(sendPacket,dropItem); }
// public static void detachLeash(boolean sendPacket,boolean dropItem, ) { net.minecraft.entity.Leashable.detachLeash(sendPacket,dropItem); }
public yarnwrap.entity.Entity getLeashHolder() { return new yarnwrap.entity.Entity(wrapperContained.getLeashHolder()); }
// public static yarnwrap.entity.Entity getLeashHolder() { return new yarnwrap.entity.Entity(net.minecraft.entity.Leashable.getLeashHolder()); }
public boolean isLeashed() { return wrapperContained.isLeashed(); }
// public static boolean isLeashed() { return net.minecraft.entity.Leashable.isLeashed(); }
public boolean mightBeLeashed() { return wrapperContained.mightBeLeashed(); }
// public static boolean mightBeLeashed() { return net.minecraft.entity.Leashable.mightBeLeashed(); }
public Object getLeashData() { return wrapperContained.getLeashData(); }
// public static Object getLeashData() { return net.minecraft.entity.Leashable.getLeashData(); }
public boolean beforeLeashTick(yarnwrap.entity.Entity leashHolder,float distance) { return wrapperContained.beforeLeashTick(leashHolder.wrapperContained,distance); }
// public static boolean beforeLeashTick(yarnwrap.entity.Entity leashHolder,float distance, ) { return net.minecraft.entity.Leashable.beforeLeashTick(leashHolder.wrapperContained,distance); }
// public void attachLeash(yarnwrap.entity.Entity entity,yarnwrap.entity.Entity leashHolder,boolean sendPacket) { wrapperContained.attachLeash(entity.wrapperContained,leashHolder.wrapperContained,sendPacket); }
// public static void attachLeash(yarnwrap.entity.Entity entity,yarnwrap.entity.Entity leashHolder,boolean sendPacket, ) { net.minecraft.entity.Leashable.attachLeash(entity.wrapperContained,leashHolder.wrapperContained,sendPacket); }
// public void resolveLeashData(yarnwrap.entity.Entity entity,Object leashData) { wrapperContained.resolveLeashData(entity.wrapperContained,leashData); }
// public static void resolveLeashData(yarnwrap.entity.Entity entity,Object leashData, ) { net.minecraft.entity.Leashable.resolveLeashData(entity.wrapperContained,leashData); }
// public void detachLeash(yarnwrap.entity.Entity entity,boolean sendPacket,boolean dropItem) { wrapperContained.detachLeash(entity.wrapperContained,sendPacket,dropItem); }
// public static void detachLeash(yarnwrap.entity.Entity entity,boolean sendPacket,boolean dropItem, ) { net.minecraft.entity.Leashable.detachLeash(entity.wrapperContained,sendPacket,dropItem); }
// public void setLeashData(Object leashData) { wrapperContained.setLeashData(leashData); }
// public static void setLeashData(Object leashData, ) { net.minecraft.entity.Leashable.setLeashData(leashData); }
// public yarnwrap.nbt.NbtElement method_60961(java.util.UUID uuid) { return new yarnwrap.nbt.NbtElement(wrapperContained.method_60961(uuid)); }
// public static yarnwrap.nbt.NbtElement method_60961(java.util.UUID uuid, ) { return new yarnwrap.nbt.NbtElement(net.minecraft.entity.Leashable.method_60961(uuid)); }
// public void writeLeashDataToNbt(yarnwrap.nbt.NbtCompound nbt,Object leashData) { wrapperContained.writeLeashDataToNbt(nbt.wrapperContained,leashData); }
// public static void writeLeashDataToNbt(yarnwrap.nbt.NbtCompound nbt,Object leashData, ) { net.minecraft.entity.Leashable.writeLeashDataToNbt(nbt.wrapperContained,leashData); }
public void onShortLeashTick(yarnwrap.entity.Entity entity) { wrapperContained.onShortLeashTick(entity.wrapperContained); }
// public static void onShortLeashTick(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.Leashable.onShortLeashTick(entity.wrapperContained); }
public void attachLeash(yarnwrap.entity.Entity leashHolder,boolean sendPacket) { wrapperContained.attachLeash(leashHolder.wrapperContained,sendPacket); }
// public static void attachLeash(yarnwrap.entity.Entity leashHolder,boolean sendPacket, ) { net.minecraft.entity.Leashable.attachLeash(leashHolder.wrapperContained,sendPacket); }
// public void tickLeash(yarnwrap.entity.Entity entity) { wrapperContained.tickLeash(entity.wrapperContained); }
// public static void tickLeash(yarnwrap.entity.Entity entity, ) { net.minecraft.entity.Leashable.tickLeash(entity.wrapperContained); }
// public yarnwrap.entity.Entity getLeashHolder(yarnwrap.entity.Entity entity) { return new yarnwrap.entity.Entity(wrapperContained.getLeashHolder(entity.wrapperContained)); }
// public static yarnwrap.entity.Entity getLeashHolder(yarnwrap.entity.Entity entity, ) { return new yarnwrap.entity.Entity(net.minecraft.entity.Leashable.getLeashHolder(entity.wrapperContained)); }
public Object readLeashDataFromNbt(yarnwrap.nbt.NbtCompound nbt) { return wrapperContained.readLeashDataFromNbt(nbt.wrapperContained); }
// public static Object readLeashDataFromNbt(yarnwrap.nbt.NbtCompound nbt, ) { return net.minecraft.entity.Leashable.readLeashDataFromNbt(nbt.wrapperContained); }
public void setUnresolvedLeashHolderId(int unresolvedLeashHolderId) { wrapperContained.setUnresolvedLeashHolderId(unresolvedLeashHolderId); }
// public static void setUnresolvedLeashHolderId(int unresolvedLeashHolderId, ) { net.minecraft.entity.Leashable.setUnresolvedLeashHolderId(unresolvedLeashHolderId); }
public boolean canLeashAttachTo() { return wrapperContained.canLeashAttachTo(); }
// public static boolean canLeashAttachTo() { return net.minecraft.entity.Leashable.canLeashAttachTo(); }
public void detachLeash() { wrapperContained.detachLeash(); }
// public static void detachLeash() { net.minecraft.entity.Leashable.detachLeash(); }
// public void applyLeashElasticity(yarnwrap.entity.Entity entity,yarnwrap.entity.Entity leashHolder,float distance) { wrapperContained.applyLeashElasticity(entity.wrapperContained,leashHolder.wrapperContained,distance); }
// public static void applyLeashElasticity(yarnwrap.entity.Entity entity,yarnwrap.entity.Entity leashHolder,float distance, ) { net.minecraft.entity.Leashable.applyLeashElasticity(entity.wrapperContained,leashHolder.wrapperContained,distance); }
public void applyLeashElasticity(yarnwrap.entity.Entity leashHolder,float distance) { wrapperContained.applyLeashElasticity(leashHolder.wrapperContained,distance); }
// public static void applyLeashElasticity(yarnwrap.entity.Entity leashHolder,float distance, ) { net.minecraft.entity.Leashable.applyLeashElasticity(leashHolder.wrapperContained,distance); }

}