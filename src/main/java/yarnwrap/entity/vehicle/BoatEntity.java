package yarnwrap.entity.vehicle;
public class BoatEntity { public net.minecraft.entity.vehicle.BoatEntity wrapperContained; public BoatEntity(net.minecraft.entity.vehicle.BoatEntity wrapperContained) { this.wrapperContained = wrapperContained; }

// public float NEXT_PADDLE_PHASE() { return wrapperContained.NEXT_PADDLE_PHASE; }
// public void NEXT_PADDLE_PHASE(float value) { wrapperContained.NEXT_PADDLE_PHASE = value; }
public double EMIT_SOUND_EVENT_PADDLE_ROTATION() { return wrapperContained.EMIT_SOUND_EVENT_PADDLE_ROTATION; }
// public void EMIT_SOUND_EVENT_PADDLE_ROTATION(double value) { wrapperContained.EMIT_SOUND_EVENT_PADDLE_ROTATION = value; }
// public Object leashData() { return wrapperContained.leashData; }
// // public void leashData(Object value) { wrapperContained.leashData = value; }
// public double boatPitch() { return wrapperContained.boatPitch; }
// public void boatPitch(double value) { wrapperContained.boatPitch = value; }
// public double z() { return wrapperContained.z; }
// public void z(double value) { wrapperContained.z = value; }
// public double x() { return wrapperContained.x; }
// public void x(double value) { wrapperContained.x = value; }
// public yarnwrap.entity.data.TrackedData LEFT_PADDLE_MOVING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.LEFT_PADDLE_MOVING); }
// public void LEFT_PADDLE_MOVING(yarnwrap.entity.data.TrackedData value) { wrapperContained.LEFT_PADDLE_MOVING = value.wrapperContained; }
// public boolean onBubbleColumnSurface() { return wrapperContained.onBubbleColumnSurface; }
// public void onBubbleColumnSurface(boolean value) { wrapperContained.onBubbleColumnSurface = value; }
// public float yawVelocity() { return wrapperContained.yawVelocity; }
// public void yawVelocity(float value) { wrapperContained.yawVelocity = value; }
// public yarnwrap.entity.data.TrackedData BUBBLE_WOBBLE_TICKS() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BUBBLE_WOBBLE_TICKS); }
// public void BUBBLE_WOBBLE_TICKS(yarnwrap.entity.data.TrackedData value) { wrapperContained.BUBBLE_WOBBLE_TICKS = value.wrapperContained; }
// public float velocityDecay() { return wrapperContained.velocityDecay; }
// public void velocityDecay(float value) { wrapperContained.velocityDecay = value; }
// public boolean pressingBack() { return wrapperContained.pressingBack; }
// public void pressingBack(boolean value) { wrapperContained.pressingBack = value; }
// public float bubbleWobble() { return wrapperContained.bubbleWobble; }
// public void bubbleWobble(float value) { wrapperContained.bubbleWobble = value; }
// public boolean pressingRight() { return wrapperContained.pressingRight; }
// public void pressingRight(boolean value) { wrapperContained.pressingRight = value; }
// public double fallVelocity() { return wrapperContained.fallVelocity; }
// public void fallVelocity(double value) { wrapperContained.fallVelocity = value; }
// public double waterLevel() { return wrapperContained.waterLevel; }
// public void waterLevel(double value) { wrapperContained.waterLevel = value; }
// public yarnwrap.entity.data.TrackedData BOAT_TYPE() { return new yarnwrap.entity.data.TrackedData(wrapperContained.BOAT_TYPE); }
// public void BOAT_TYPE(yarnwrap.entity.data.TrackedData value) { wrapperContained.BOAT_TYPE = value.wrapperContained; }
// public double boatYaw() { return wrapperContained.boatYaw; }
// public void boatYaw(double value) { wrapperContained.boatYaw = value; }
// public double y() { return wrapperContained.y; }
// public void y(double value) { wrapperContained.y = value; }
// public Object lastLocation() { return wrapperContained.lastLocation; }
// // public void lastLocation(Object value) { wrapperContained.lastLocation = value; }
// public Object location() { return wrapperContained.location; }
// // public void location(Object value) { wrapperContained.location = value; }
// public boolean bubbleColumnIsDrag() { return wrapperContained.bubbleColumnIsDrag; }
// public void bubbleColumnIsDrag(boolean value) { wrapperContained.bubbleColumnIsDrag = value; }
// public float[] paddlePhases() { return wrapperContained.paddlePhases; }
// public void paddlePhases(float[] value) { wrapperContained.paddlePhases = value; }
// public float ticksUnderwater() { return wrapperContained.ticksUnderwater; }
// public void ticksUnderwater(float value) { wrapperContained.ticksUnderwater = value; }
// public int lerpTicks() { return wrapperContained.lerpTicks; }
// public void lerpTicks(int value) { wrapperContained.lerpTicks = value; }
// public boolean pressingForward() { return wrapperContained.pressingForward; }
// public void pressingForward(boolean value) { wrapperContained.pressingForward = value; }
// public boolean pressingLeft() { return wrapperContained.pressingLeft; }
// public void pressingLeft(boolean value) { wrapperContained.pressingLeft = value; }
// public float lastBubbleWobble() { return wrapperContained.lastBubbleWobble; }
// public void lastBubbleWobble(float value) { wrapperContained.lastBubbleWobble = value; }
// public float bubbleWobbleStrength() { return wrapperContained.bubbleWobbleStrength; }
// public void bubbleWobbleStrength(float value) { wrapperContained.bubbleWobbleStrength = value; }
// public yarnwrap.entity.data.TrackedData RIGHT_PADDLE_MOVING() { return new yarnwrap.entity.data.TrackedData(wrapperContained.RIGHT_PADDLE_MOVING); }
// public void RIGHT_PADDLE_MOVING(yarnwrap.entity.data.TrackedData value) { wrapperContained.RIGHT_PADDLE_MOVING = value.wrapperContained; }
// public float nearbySlipperiness() { return wrapperContained.nearbySlipperiness; }
// public void nearbySlipperiness(float value) { wrapperContained.nearbySlipperiness = value; }
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