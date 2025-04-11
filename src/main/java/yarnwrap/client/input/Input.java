package yarnwrap.client.input;
public class Input { public net.minecraft.client.input.Input wrapperContained; public Input(net.minecraft.client.input.Input wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean sneaking() { return wrapperContained.sneaking; }
public void sneaking(boolean value) { wrapperContained.sneaking = value; }
public boolean jumping() { return wrapperContained.jumping; }
public void jumping(boolean value) { wrapperContained.jumping = value; }
public float movementForward() { return wrapperContained.movementForward; }
public void movementForward(float value) { wrapperContained.movementForward = value; }
public boolean pressingRight() { return wrapperContained.pressingRight; }
public void pressingRight(boolean value) { wrapperContained.pressingRight = value; }
public float movementSideways() { return wrapperContained.movementSideways; }
public void movementSideways(float value) { wrapperContained.movementSideways = value; }
public boolean pressingLeft() { return wrapperContained.pressingLeft; }
public void pressingLeft(boolean value) { wrapperContained.pressingLeft = value; }
public boolean pressingBack() { return wrapperContained.pressingBack; }
public void pressingBack(boolean value) { wrapperContained.pressingBack = value; }
public boolean pressingForward() { return wrapperContained.pressingForward; }
public void pressingForward(boolean value) { wrapperContained.pressingForward = value; }
public boolean hasForwardMovement() { return wrapperContained.hasForwardMovement(); }
public yarnwrap.util.math.Vec2f getMovementInput() { return new yarnwrap.util.math.Vec2f(wrapperContained.getMovementInput()); }
public void tick(boolean slowDown,float slowDownFactor) { wrapperContained.tick(slowDown,slowDownFactor); }

}