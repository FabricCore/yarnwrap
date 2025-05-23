package yarnwrap.entity;
public class Bucketable { public net.minecraft.entity.Bucketable wrapperContained; public Bucketable(net.minecraft.entity.Bucketable wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.item.ItemStack getBucketItem() { return new yarnwrap.item.ItemStack(wrapperContained.getBucketItem()); }
// public static yarnwrap.item.ItemStack getBucketItem() { return new yarnwrap.item.ItemStack(net.minecraft.entity.Bucketable.getBucketItem()); }
public boolean isFromBucket() { return wrapperContained.isFromBucket(); }
// public static boolean isFromBucket() { return net.minecraft.entity.Bucketable.isFromBucket(); }
public void setFromBucket(boolean fromBucket) { wrapperContained.setFromBucket(fromBucket); }
// public static void setFromBucket(boolean fromBucket, ) { net.minecraft.entity.Bucketable.setFromBucket(fromBucket); }
public void copyDataToStack(yarnwrap.item.ItemStack stack) { wrapperContained.copyDataToStack(stack.wrapperContained); }
// public static void copyDataToStack(yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.Bucketable.copyDataToStack(stack.wrapperContained); }
// public void copyDataToStack(yarnwrap.entity.mob.MobEntity entity,yarnwrap.item.ItemStack stack) { wrapperContained.copyDataToStack(entity.wrapperContained,stack.wrapperContained); }
// public static void copyDataToStack(yarnwrap.entity.mob.MobEntity entity,yarnwrap.item.ItemStack stack, ) { net.minecraft.entity.Bucketable.copyDataToStack(entity.wrapperContained,stack.wrapperContained); }
// public void copyDataFromNbt(yarnwrap.entity.mob.MobEntity entity,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.copyDataFromNbt(entity.wrapperContained,nbt.wrapperContained); }
// public static void copyDataFromNbt(yarnwrap.entity.mob.MobEntity entity,yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.entity.Bucketable.copyDataFromNbt(entity.wrapperContained,nbt.wrapperContained); }
// public java.util.Optional tryBucket(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.entity.LivingEntity entity) { return wrapperContained.tryBucket(player.wrapperContained,hand.wrapperContained,entity.wrapperContained); }
// public static java.util.Optional tryBucket(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.entity.LivingEntity entity, ) { return net.minecraft.entity.Bucketable.tryBucket(player.wrapperContained,hand.wrapperContained,entity.wrapperContained); }
public void copyDataFromNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.copyDataFromNbt(nbt.wrapperContained); }
// public static void copyDataFromNbt(yarnwrap.nbt.NbtCompound nbt, ) { net.minecraft.entity.Bucketable.copyDataFromNbt(nbt.wrapperContained); }
public yarnwrap.sound.SoundEvent getBucketFillSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getBucketFillSound()); }
// public static yarnwrap.sound.SoundEvent getBucketFillSound() { return new yarnwrap.sound.SoundEvent(net.minecraft.entity.Bucketable.getBucketFillSound()); }

}