package yarnwrap.entity.decoration;
public class ArmorStandEntity { public net.minecraft.entity.decoration.ArmorStandEntity wrapperContained; public ArmorStandEntity(net.minecraft.entity.decoration.ArmorStandEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions MARKER_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.MARKER_DIMENSIONS); }
// public yarnwrap.entity.EntityDimensions SMALL_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.SMALL_DIMENSIONS); }
public int HIDE_BASE_PLATE_FLAG() { return wrapperContained.HIDE_BASE_PLATE_FLAG; }
public int MARKER_FLAG() { return wrapperContained.MARKER_FLAG; }
public int SMALL_FLAG() { return wrapperContained.SMALL_FLAG; }
public int SHOW_ARMS_FLAG() { return wrapperContained.SHOW_ARMS_FLAG; }
// public java.util.function.Predicate RIDEABLE_MINECART_PREDICATE() { return wrapperContained.RIDEABLE_MINECART_PREDICATE; }
// public yarnwrap.util.math.EulerAngle rightLegRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.rightLegRotation); }
// public yarnwrap.util.math.EulerAngle headRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.headRotation); }
public yarnwrap.entity.data.TrackedData TRACKER_RIGHT_ARM_ROTATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRACKER_RIGHT_ARM_ROTATION); }
// public yarnwrap.util.math.EulerAngle bodyRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.bodyRotation); }
public yarnwrap.entity.data.TrackedData ARMOR_STAND_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ARMOR_STAND_FLAGS); }
// public yarnwrap.util.collection.DefaultedList armorItems() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.armorItems); }
// public yarnwrap.util.math.EulerAngle leftLegRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.leftLegRotation); }
// public boolean invisible() { return wrapperContained.invisible; }
public long lastHitTime() { return wrapperContained.lastHitTime; }
// public yarnwrap.util.math.EulerAngle DEFAULT_HEAD_ROTATION() { return new yarnwrap.util.math.EulerAngle(wrapperContained.DEFAULT_HEAD_ROTATION); }
// public yarnwrap.util.collection.DefaultedList heldItems() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.heldItems); }
// public yarnwrap.util.math.EulerAngle DEFAULT_RIGHT_ARM_ROTATION() { return new yarnwrap.util.math.EulerAngle(wrapperContained.DEFAULT_RIGHT_ARM_ROTATION); }
public yarnwrap.entity.data.TrackedData TRACKER_LEFT_ARM_ROTATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRACKER_LEFT_ARM_ROTATION); }
// public yarnwrap.util.math.EulerAngle DEFAULT_RIGHT_LEG_ROTATION() { return new yarnwrap.util.math.EulerAngle(wrapperContained.DEFAULT_RIGHT_LEG_ROTATION); }
// public int disabledSlots() { return wrapperContained.disabledSlots; }
// public yarnwrap.util.math.EulerAngle DEFAULT_BODY_ROTATION() { return new yarnwrap.util.math.EulerAngle(wrapperContained.DEFAULT_BODY_ROTATION); }
// public yarnwrap.util.math.EulerAngle rightArmRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.rightArmRotation); }
// public yarnwrap.util.math.EulerAngle DEFAULT_LEFT_LEG_ROTATION() { return new yarnwrap.util.math.EulerAngle(wrapperContained.DEFAULT_LEFT_LEG_ROTATION); }
public yarnwrap.entity.data.TrackedData TRACKER_BODY_ROTATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRACKER_BODY_ROTATION); }
public yarnwrap.entity.data.TrackedData TRACKER_HEAD_ROTATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRACKER_HEAD_ROTATION); }
// public yarnwrap.util.math.EulerAngle DEFAULT_LEFT_ARM_ROTATION() { return new yarnwrap.util.math.EulerAngle(wrapperContained.DEFAULT_LEFT_ARM_ROTATION); }
public yarnwrap.entity.data.TrackedData TRACKER_RIGHT_LEG_ROTATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRACKER_RIGHT_LEG_ROTATION); }
// public yarnwrap.util.math.EulerAngle leftArmRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.leftArmRotation); }
public yarnwrap.entity.data.TrackedData TRACKER_LEFT_LEG_ROTATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRACKER_LEFT_LEG_ROTATION); }
// public boolean canClip() { return wrapperContained.canClip(); }
// public yarnwrap.entity.EntityDimensions getDimensions(boolean marker) { return new yarnwrap.entity.EntityDimensions(wrapperContained.getDimensions(marker)); }
public Object createArmorStandAttributes() { return wrapperContained.createArmorStandAttributes(); }
// public void spawnBreakParticles() { wrapperContained.spawnBreakParticles(); }
public yarnwrap.util.math.EulerAngle getRightLegRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.getRightLegRotation()); }
public boolean shouldHideBasePlate() { return wrapperContained.shouldHideBasePlate(); }
// public void setMarker(boolean marker) { wrapperContained.setMarker(marker); }
public yarnwrap.util.math.EulerAngle getRightArmRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.getRightArmRotation()); }
// public boolean equip(yarnwrap.entity.player.PlayerEntity player,yarnwrap.entity.EquipmentSlot slot,yarnwrap.item.ItemStack stack,yarnwrap.util.Hand hand) { return wrapperContained.equip(player.wrapperContained,slot.wrapperContained,stack.wrapperContained,hand.wrapperContained); }
// public void updateHealth(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource damageSource,float amount) { wrapperContained.updateHealth(world.wrapperContained,damageSource.wrapperContained,amount); }
// public byte setBitField(byte value,int bitField,boolean set) { return wrapperContained.setBitField(value,bitField,set); }
public void setHideBasePlate(boolean hideBasePlate) { wrapperContained.setHideBasePlate(hideBasePlate); }
// public void onBreak(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.onBreak(world.wrapperContained,damageSource.wrapperContained); }
public void setLeftLegRotation(yarnwrap.util.math.EulerAngle angle) { wrapperContained.setLeftLegRotation(angle.wrapperContained); }
public void setLeftArmRotation(yarnwrap.util.math.EulerAngle angle) { wrapperContained.setLeftArmRotation(angle.wrapperContained); }
// public yarnwrap.nbt.NbtCompound poseToNbt() { return new yarnwrap.nbt.NbtCompound(wrapperContained.poseToNbt()); }
public boolean isMarker() { return wrapperContained.isMarker(); }
public void setShowArms(boolean showArms) { wrapperContained.setShowArms(showArms); }
public boolean isSmall() { return wrapperContained.isSmall(); }
// public boolean isSlotDisabled(yarnwrap.entity.EquipmentSlot slot) { return wrapperContained.isSlotDisabled(slot.wrapperContained); }
// public yarnwrap.entity.EquipmentSlot getSlotFromPosition(yarnwrap.util.math.Vec3d hitPos) { return new yarnwrap.entity.EquipmentSlot(wrapperContained.getSlotFromPosition(hitPos.wrapperContained)); }
public yarnwrap.util.math.EulerAngle getLeftLegRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.getLeftLegRotation()); }
public void setHeadRotation(yarnwrap.util.math.EulerAngle angle) { wrapperContained.setHeadRotation(angle.wrapperContained); }
// public void playBreakSound() { wrapperContained.playBreakSound(); }
public yarnwrap.util.math.EulerAngle getHeadRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.getHeadRotation()); }
// public void setSmall(boolean small) { wrapperContained.setSmall(small); }
public yarnwrap.util.math.EulerAngle getBodyRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.getBodyRotation()); }
// public void breakAndDropItem(yarnwrap.server.world.ServerWorld world,yarnwrap.entity.damage.DamageSource damageSource) { wrapperContained.breakAndDropItem(world.wrapperContained,damageSource.wrapperContained); }
public void setRightArmRotation(yarnwrap.util.math.EulerAngle angle) { wrapperContained.setRightArmRotation(angle.wrapperContained); }
public void setRightLegRotation(yarnwrap.util.math.EulerAngle angle) { wrapperContained.setRightLegRotation(angle.wrapperContained); }
public void setBodyRotation(yarnwrap.util.math.EulerAngle angle) { wrapperContained.setBodyRotation(angle.wrapperContained); }
// public void readPoseNbt(yarnwrap.nbt.NbtCompound nbt) { wrapperContained.readPoseNbt(nbt.wrapperContained); }
public boolean shouldShowArms() { return wrapperContained.shouldShowArms(); }
public yarnwrap.util.math.EulerAngle getLeftArmRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.getLeftArmRotation()); }

}