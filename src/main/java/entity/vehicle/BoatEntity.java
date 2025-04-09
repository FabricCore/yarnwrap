package yarnwrap.entity.vehicle;
public class BoatEntity { public net.minecraft.entity.vehicle.BoatEntity wrapperContained; public BoatEntity(net.minecraft.entity.vehicle.BoatEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float NEXT_PADDLE_PHASE() { return wrapperContained.NEXT_PADDLE_PHASE; }
public double EMIT_SOUND_EVENT_PADDLE_ROTATION() { return wrapperContained.EMIT_SOUND_EVENT_PADDLE_ROTATION; }
// public Object leashData() { return wrapperContained.leashData; }
// public double boatPitch() { return wrapperContained.boatPitch; }
// public double z() { return wrapperContained.z; }
// public double x() { return wrapperContained.x; }
// public yarnwrap.entity.data.TrackedData LEFT_PADDLE_MOVING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LEFT_PADDLE_MOVING); }
// public boolean onBubbleColumnSurface() { return wrapperContained.onBubbleColumnSurface; }
// public float yawVelocity() { return wrapperContained.yawVelocity; }
// public yarnwrap.entity.data.TrackedData BUBBLE_WOBBLE_TICKS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BUBBLE_WOBBLE_TICKS); }
// public float velocityDecay() { return wrapperContained.velocityDecay; }
// public boolean pressingBack() { return wrapperContained.pressingBack; }
// public float bubbleWobble() { return wrapperContained.bubbleWobble; }
// public boolean pressingRight() { return wrapperContained.pressingRight; }
// public double fallVelocity() { return wrapperContained.fallVelocity; }
// public double waterLevel() { return wrapperContained.waterLevel; }
// public yarnwrap.entity.data.TrackedData BOAT_TYPE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BOAT_TYPE); }
// public double boatYaw() { return wrapperContained.boatYaw; }
// public double y() { return wrapperContained.y; }
// public Object lastLocation() { return wrapperContained.lastLocation; }
// public Object location() { return wrapperContained.location; }
// public boolean bubbleColumnIsDrag() { return wrapperContained.bubbleColumnIsDrag; }
// public float[] paddlePhases() { return wrapperContained.paddlePhases; }
// public float ticksUnderwater() { return wrapperContained.ticksUnderwater; }
// public int lerpTicks() { return wrapperContained.lerpTicks; }
// public boolean pressingForward() { return wrapperContained.pressingForward; }
// public boolean pressingLeft() { return wrapperContained.pressingLeft; }
// public float lastBubbleWobble() { return wrapperContained.lastBubbleWobble; }
// public float bubbleWobbleStrength() { return wrapperContained.bubbleWobbleStrength; }
// public yarnwrap.entity.data.TrackedData RIGHT_PADDLE_MOVING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.RIGHT_PADDLE_MOVING); }
// public float nearbySlipperiness() { return wrapperContained.nearbySlipperiness; }
public boolean canCollide(yarnwrap.entity.Entity entity,yarnwrap.entity.Entity other) { return wrapperContained.canCollide(entity.wrapperContained,other.wrapperContained); }
// public float getPassengerHorizontalOffset() { return wrapperContained.getPassengerHorizontalOffset(); }
// public int getMaxPassengers() { return wrapperContained.getMaxPassengers(); }
public boolean isSmallerThanBoat(yarnwrap.entity.Entity entity) { return wrapperContained.isSmallerThanBoat(entity.wrapperContained); }
// public void setBubbleWobbleTicks(int wobbleTicks) { wrapperContained.setBubbleWobbleTicks(wobbleTicks); }
// public Object getUnderWaterLocation() { return wrapperContained.getUnderWaterLocation(); }
// public void updateVelocity() { wrapperContained.updateVelocity(); }
public void setInputs(boolean pressingLeft,boolean pressingRight,boolean pressingForward,boolean pressingBack) { wrapperContained.setInputs(pressingLeft,pressingRight,pressingForward,pressingBack); }
// public yarnwrap.sound.SoundEvent getPaddleSoundEvent() { return new yarnwrap.sound.SoundEvent(wrapperContained.getPaddleSoundEvent()); }
public void setPaddleMovings(boolean leftMoving,boolean rightMoving) { wrapperContained.setPaddleMovings(leftMoving,rightMoving); }
// public int getBubbleWobbleTicks() { return wrapperContained.getBubbleWobbleTicks(); }
public float getWaterHeightBelow() { return wrapperContained.getWaterHeightBelow(); }
// public boolean checkBoatInWater() { return wrapperContained.checkBoatInWater(); }
// public void clampPassengerYaw(yarnwrap.entity.Entity passenger) { wrapperContained.clampPassengerYaw(passenger.wrapperContained); }
public float interpolateBubbleWobble(float tickDelta) { return wrapperContained.interpolateBubbleWobble(tickDelta); }
public float getNearbySlipperiness() { return wrapperContained.getNearbySlipperiness(); }
// public void updatePaddles() { wrapperContained.updatePaddles(); }
// public void handleBubbleColumn() { wrapperContained.handleBubbleColumn(); }
public float interpolatePaddlePhase(int paddle,float tickDelta) { return wrapperContained.interpolatePaddlePhase(paddle,tickDelta); }
// public Object checkLocation() { return wrapperContained.checkLocation(); }
// public void updatePositionAndRotation() { wrapperContained.updatePositionAndRotation(); }
public boolean isPaddleMoving(int paddle) { return wrapperContained.isPaddleMoving(paddle); }

}