package yarnwrap.entity.decoration;
public class ArmorStandEntity { public net.minecraft.entity.decoration.ArmorStandEntity wrapperContained; public ArmorStandEntity(net.minecraft.entity.decoration.ArmorStandEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.entity.EntityDimensions MARKER_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.MARKER_DIMENSIONS); }
// public void MARKER_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.MARKER_DIMENSIONS = value.wrapperContained; }
// public yarnwrap.entity.EntityDimensions SMALL_DIMENSIONS() { return new yarnwrap.entity.EntityDimensions(wrapperContained.SMALL_DIMENSIONS); }
// public void SMALL_DIMENSIONS(yarnwrap.entity.EntityDimensions value) { wrapperContained.SMALL_DIMENSIONS = value.wrapperContained; }
public int HIDE_BASE_PLATE_FLAG() { return wrapperContained.HIDE_BASE_PLATE_FLAG; }
// public void HIDE_BASE_PLATE_FLAG(int value) { wrapperContained.HIDE_BASE_PLATE_FLAG = value; }
public int MARKER_FLAG() { return wrapperContained.MARKER_FLAG; }
// public void MARKER_FLAG(int value) { wrapperContained.MARKER_FLAG = value; }
public int SMALL_FLAG() { return wrapperContained.SMALL_FLAG; }
// public void SMALL_FLAG(int value) { wrapperContained.SMALL_FLAG = value; }
public int SHOW_ARMS_FLAG() { return wrapperContained.SHOW_ARMS_FLAG; }
// public void SHOW_ARMS_FLAG(int value) { wrapperContained.SHOW_ARMS_FLAG = value; }
// public java.util.function.Predicate RIDEABLE_MINECART_PREDICATE() { return wrapperContained.RIDEABLE_MINECART_PREDICATE; }
// public void RIDEABLE_MINECART_PREDICATE(java.util.function.Predicate value) { wrapperContained.RIDEABLE_MINECART_PREDICATE = value; }
// public yarnwrap.util.math.EulerAngle rightLegRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.rightLegRotation); }
// public void rightLegRotation(yarnwrap.util.math.EulerAngle value) { wrapperContained.rightLegRotation = value.wrapperContained; }
// public yarnwrap.util.math.EulerAngle headRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.headRotation); }
// public void headRotation(yarnwrap.util.math.EulerAngle value) { wrapperContained.headRotation = value.wrapperContained; }
public yarnwrap.entity.data.TrackedData TRACKER_RIGHT_ARM_ROTATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRACKER_RIGHT_ARM_ROTATION); }
// public void TRACKER_RIGHT_ARM_ROTATION(yarnwrap.entity.data.TrackedData value) { wrapperContained.TRACKER_RIGHT_ARM_ROTATION = value.wrapperContained; }
// public yarnwrap.util.math.EulerAngle bodyRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.bodyRotation); }
// public void bodyRotation(yarnwrap.util.math.EulerAngle value) { wrapperContained.bodyRotation = value.wrapperContained; }
public yarnwrap.entity.data.TrackedData ARMOR_STAND_FLAGS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ARMOR_STAND_FLAGS); }
// public void ARMOR_STAND_FLAGS(yarnwrap.entity.data.TrackedData value) { wrapperContained.ARMOR_STAND_FLAGS = value.wrapperContained; }
// public yarnwrap.util.collection.DefaultedList armorItems() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.armorItems); }
// public void armorItems(yarnwrap.util.collection.DefaultedList value) { wrapperContained.armorItems = value.wrapperContained; }
// public yarnwrap.util.math.EulerAngle leftLegRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.leftLegRotation); }
// public void leftLegRotation(yarnwrap.util.math.EulerAngle value) { wrapperContained.leftLegRotation = value.wrapperContained; }
// public boolean invisible() { return wrapperContained.invisible; }
// public void invisible(boolean value) { wrapperContained.invisible = value; }
public long lastHitTime() { return wrapperContained.lastHitTime; }
public void lastHitTime(long value) { wrapperContained.lastHitTime = value; }
// public yarnwrap.util.math.EulerAngle DEFAULT_HEAD_ROTATION() { return new yarnwrap.util.math.EulerAngle(wrapperContained.DEFAULT_HEAD_ROTATION); }
// public void DEFAULT_HEAD_ROTATION(yarnwrap.util.math.EulerAngle value) { wrapperContained.DEFAULT_HEAD_ROTATION = value.wrapperContained; }
// public yarnwrap.util.collection.DefaultedList heldItems() { return new yarnwrap.util.collection.DefaultedList(wrapperContained.heldItems); }
// public void heldItems(yarnwrap.util.collection.DefaultedList value) { wrapperContained.heldItems = value.wrapperContained; }
// public yarnwrap.util.math.EulerAngle DEFAULT_RIGHT_ARM_ROTATION() { return new yarnwrap.util.math.EulerAngle(wrapperContained.DEFAULT_RIGHT_ARM_ROTATION); }
// public void DEFAULT_RIGHT_ARM_ROTATION(yarnwrap.util.math.EulerAngle value) { wrapperContained.DEFAULT_RIGHT_ARM_ROTATION = value.wrapperContained; }
public yarnwrap.entity.data.TrackedData TRACKER_LEFT_ARM_ROTATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRACKER_LEFT_ARM_ROTATION); }
// public void TRACKER_LEFT_ARM_ROTATION(yarnwrap.entity.data.TrackedData value) { wrapperContained.TRACKER_LEFT_ARM_ROTATION = value.wrapperContained; }
// public yarnwrap.util.math.EulerAngle DEFAULT_RIGHT_LEG_ROTATION() { return new yarnwrap.util.math.EulerAngle(wrapperContained.DEFAULT_RIGHT_LEG_ROTATION); }
// public void DEFAULT_RIGHT_LEG_ROTATION(yarnwrap.util.math.EulerAngle value) { wrapperContained.DEFAULT_RIGHT_LEG_ROTATION = value.wrapperContained; }
// public int disabledSlots() { return wrapperContained.disabledSlots; }
// public void disabledSlots(int value) { wrapperContained.disabledSlots = value; }
// public yarnwrap.util.math.EulerAngle DEFAULT_BODY_ROTATION() { return new yarnwrap.util.math.EulerAngle(wrapperContained.DEFAULT_BODY_ROTATION); }
// public void DEFAULT_BODY_ROTATION(yarnwrap.util.math.EulerAngle value) { wrapperContained.DEFAULT_BODY_ROTATION = value.wrapperContained; }
// public yarnwrap.util.math.EulerAngle rightArmRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.rightArmRotation); }
// public void rightArmRotation(yarnwrap.util.math.EulerAngle value) { wrapperContained.rightArmRotation = value.wrapperContained; }
// public yarnwrap.util.math.EulerAngle DEFAULT_LEFT_LEG_ROTATION() { return new yarnwrap.util.math.EulerAngle(wrapperContained.DEFAULT_LEFT_LEG_ROTATION); }
// public void DEFAULT_LEFT_LEG_ROTATION(yarnwrap.util.math.EulerAngle value) { wrapperContained.DEFAULT_LEFT_LEG_ROTATION = value.wrapperContained; }
public yarnwrap.entity.data.TrackedData TRACKER_BODY_ROTATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRACKER_BODY_ROTATION); }
// public void TRACKER_BODY_ROTATION(yarnwrap.entity.data.TrackedData value) { wrapperContained.TRACKER_BODY_ROTATION = value.wrapperContained; }
public yarnwrap.entity.data.TrackedData TRACKER_HEAD_ROTATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRACKER_HEAD_ROTATION); }
// public void TRACKER_HEAD_ROTATION(yarnwrap.entity.data.TrackedData value) { wrapperContained.TRACKER_HEAD_ROTATION = value.wrapperContained; }
// public yarnwrap.util.math.EulerAngle DEFAULT_LEFT_ARM_ROTATION() { return new yarnwrap.util.math.EulerAngle(wrapperContained.DEFAULT_LEFT_ARM_ROTATION); }
// public void DEFAULT_LEFT_ARM_ROTATION(yarnwrap.util.math.EulerAngle value) { wrapperContained.DEFAULT_LEFT_ARM_ROTATION = value.wrapperContained; }
public yarnwrap.entity.data.TrackedData TRACKER_RIGHT_LEG_ROTATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRACKER_RIGHT_LEG_ROTATION); }
// public void TRACKER_RIGHT_LEG_ROTATION(yarnwrap.entity.data.TrackedData value) { wrapperContained.TRACKER_RIGHT_LEG_ROTATION = value.wrapperContained; }
// public yarnwrap.util.math.EulerAngle leftArmRotation() { return new yarnwrap.util.math.EulerAngle(wrapperContained.leftArmRotation); }
// public void leftArmRotation(yarnwrap.util.math.EulerAngle value) { wrapperContained.leftArmRotation = value.wrapperContained; }
public yarnwrap.entity.data.TrackedData TRACKER_LEFT_LEG_ROTATION() { return new yarnwrap.entity.data.TrackedData(wrapperContained.TRACKER_LEFT_LEG_ROTATION); }
// public void TRACKER_LEFT_LEG_ROTATION(yarnwrap.entity.data.TrackedData value) { wrapperContained.TRACKER_LEFT_LEG_ROTATION = value.wrapperContained; }
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