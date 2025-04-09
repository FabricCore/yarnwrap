package yarnwrap.entity;
public class Bucketable { public net.minecraft.entity.Bucketable wrapperContained; public Bucketable(net.minecraft.entity.Bucketable wrapperContained) { this.wrapperContained = wrapperContained; }

// public void copyDataToStack(yarnwrap.entity.mob.MobEntity entity,yarnwrap.item.ItemStack stack) { wrapperContained.copyDataToStack(entity.wrapperContained,stack.wrapperContained); }
// public void copyDataFromNbt(yarnwrap.entity.mob.MobEntity entity,yarnwrap.nbt.NbtCompound nbt) { wrapperContained.copyDataFromNbt(entity.wrapperContained,nbt.wrapperContained); }
// public java.util.Optional tryBucket(yarnwrap.entity.player.PlayerEntity player,yarnwrap.util.Hand hand,yarnwrap.entity.LivingEntity entity) { return wrapperContained.tryBucket(player.wrapperContained,hand.wrapperContained,entity.wrapperContained); }
public void copyDataFromNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.copyDataFromNbt(nbt.wrapperContained); }
public yarnwrap.sound.SoundEvent getBucketFillSound() { return new yarnwrap.sound.SoundEvent(wrapperContained.getBucketFillSound()); }
public yarnwrap.item.ItemStack getBucketItem() { return new yarnwrap.item.ItemStack(wrapperContained.getBucketItem()); }
public boolean isFromBucket() { return wrapperContained.isFromBucket(); }
public void setFromBucket(boolean fromBucket) { wrapperContained.setFromBucket(fromBucket); }
public void copyDataToStack(yarnwrap.item.ItemStack stack) { wrapperContained.copyDataToStack(stack.wrapperContained); }

}