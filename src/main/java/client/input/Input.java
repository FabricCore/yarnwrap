package yarnwrap.client.input;
public class Input { public net.minecraft.client.input.Input wrapperContained; public Input(net.minecraft.client.input.Input wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean sneaking() { return wrapperContained.sneaking; }
public boolean jumping() { return wrapperContained.jumping; }
public float movementForward() { return wrapperContained.movementForward; }
public boolean pressingRight() { return wrapperContained.pressingRight; }
public float movementSideways() { return wrapperContained.movementSideways; }
public boolean pressingLeft() { return wrapperContained.pressingLeft; }
public boolean pressingBack() { return wrapperContained.pressingBack; }
public boolean pressingForward() { return wrapperContained.pressingForward; }
public boolean hasForwardMovement() { return wrapperContained.hasForwardMovement(); }
public yarnwrap.util.math.Vec2f getMovementInput() { return new yarnwrap.util.math.Vec2f(wrapperContained.getMovementInput()); }
public void tick(boolean slowDown,float slowDownFactor) { wrapperContained.tick(slowDown,slowDownFactor); }

}