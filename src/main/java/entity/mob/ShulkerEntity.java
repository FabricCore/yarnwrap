package yarnwrap.entity.mob;
public class ShulkerEntity { public net.minecraft.entity.mob.ShulkerEntity wrapperContained; public ShulkerEntity(net.minecraft.entity.mob.ShulkerEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.joml.Vector3f SOUTH_VECTOR() { return wrapperContained.SOUTH_VECTOR; }
// public float openProgress() { return wrapperContained.openProgress; }
// public float prevOpenProgress() { return wrapperContained.prevOpenProgress; }
// public int teleportLerpTimer() { return wrapperContained.teleportLerpTimer; }
// public yarnwrap.util.Identifier COVERED_ARMOR_MODIFIER_ID() { return new yarnwrap.util.Identifier(wrapperContained.COVERED_ARMOR_MODIFIER_ID); }
// public yarnwrap.entity.attribute.EntityAttributeModifier COVERED_ARMOR_BONUS() { return new yarnwrap.entity.attribute.EntityAttributeModifier(wrapperContained.COVERED_ARMOR_BONUS); }
// public yarnwrap.entity.data.TrackedData COLOR() { return new yarnwrap.entity.data.TrackedData(wrapperContained.COLOR); }
// public yarnwrap.entity.data.TrackedData ATTACHED_FACE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.ATTACHED_FACE); }
// public yarnwrap.util.math.BlockPos prevAttachedBlock() { return new yarnwrap.util.math.BlockPos(wrapperContained.prevAttachedBlock); }
// public yarnwrap.entity.data.TrackedData PEEK_AMOUNT() { return new yarnwrap.entity.data.TrackedData(wrapperContained.PEEK_AMOUNT); }
// public boolean canStay(yarnwrap.util.math.BlockPos pos,yarnwrap.util.math.Direction direction) { return wrapperContained.canStay(pos.wrapperContained,direction.wrapperContained); }
// public yarnwrap.util.math.Direction findAttachSide(yarnwrap.util.math.BlockPos pos) { return new yarnwrap.util.math.Direction(wrapperContained.findAttachSide(pos.wrapperContained)); }
public Object createShulkerAttributes() { return wrapperContained.createShulkerAttributes(); }
// public void spawnNewShulker() { wrapperContained.spawnNewShulker(); }
// public float getExtraLength(float openProgress) { return wrapperContained.getExtraLength(openProgress); }
public yarnwrap.util.math.Box calculateBoundingBox(float scale,yarnwrap.util.math.Direction facing,float extraLength) { return new yarnwrap.util.math.Box(wrapperContained.calculateBoundingBox(scale,facing.wrapperContained,extraLength)); }
public yarnwrap.util.math.Box calculateBoundingBox(float scale,yarnwrap.util.math.Direction facing,float prevExtraLength,float extraLength) { return new yarnwrap.util.math.Box(wrapperContained.calculateBoundingBox(scale,facing.wrapperContained,prevExtraLength,extraLength)); }
// public void tryAttachOrTeleport() { wrapperContained.tryAttachOrTeleport(); }
// public boolean tickOpenProgress() { return wrapperContained.tickOpenProgress(); }
// public void moveEntities() { wrapperContained.moveEntities(); }
// public boolean isInvalidPosition(yarnwrap.util.math.BlockPos pos) { return wrapperContained.isInvalidPosition(pos.wrapperContained); }
public java.util.Optional getRenderPositionOffset(float tickDelta) { return wrapperContained.getRenderPositionOffset(tickDelta); }
// public void setAttachedFace(yarnwrap.util.math.Direction face) { wrapperContained.setAttachedFace(face.wrapperContained); }
// public int getPeekAmount() { return wrapperContained.getPeekAmount(); }
public float getOpenProgress(float delta) { return wrapperContained.getOpenProgress(delta); }
public yarnwrap.util.math.Direction getAttachedFace() { return new yarnwrap.util.math.Direction(wrapperContained.getAttachedFace()); }
public yarnwrap.util.DyeColor getColor() { return new yarnwrap.util.DyeColor(wrapperContained.getColor()); }
// public void setPeekAmount(int peekAmount) { wrapperContained.setPeekAmount(peekAmount); }
// public boolean isClosed() { return wrapperContained.isClosed(); }
// public boolean tryTeleport() { return wrapperContained.tryTeleport(); }

}