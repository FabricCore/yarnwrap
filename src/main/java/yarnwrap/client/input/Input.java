package yarnwrap.client.input;
public class Input { public net.minecraft.client.input.Input wrapperContained; public Input(net.minecraft.client.input.Input wrapperContained) { this.wrapperContained = wrapperContained; }

public boolean sneaking() { return wrapperContained.sneaking; }
public void sneaking(boolean value) { wrapperContained.sneaking = value; }
// public static boolean sneaking() { return net.minecraft.client.input.Input.sneaking; }
// public static void sneaking(boolean value, ) { net.minecraft.client.input.Input.sneaking = value; }

public boolean jumping() { return wrapperContained.jumping; }
public void jumping(boolean value) { wrapperContained.jumping = value; }
// public static boolean jumping() { return net.minecraft.client.input.Input.jumping; }
// public static void jumping(boolean value, ) { net.minecraft.client.input.Input.jumping = value; }

public float movementForward() { return wrapperContained.movementForward; }
public void movementForward(float value) { wrapperContained.movementForward = value; }
// public static float movementForward() { return net.minecraft.client.input.Input.movementForward; }
// public static void movementForward(float value, ) { net.minecraft.client.input.Input.movementForward = value; }

public boolean pressingRight() { return wrapperContained.pressingRight; }
public void pressingRight(boolean value) { wrapperContained.pressingRight = value; }
// public static boolean pressingRight() { return net.minecraft.client.input.Input.pressingRight; }
// public static void pressingRight(boolean value, ) { net.minecraft.client.input.Input.pressingRight = value; }

public float movementSideways() { return wrapperContained.movementSideways; }
public void movementSideways(float value) { wrapperContained.movementSideways = value; }
// public static float movementSideways() { return net.minecraft.client.input.Input.movementSideways; }
// public static void movementSideways(float value, ) { net.minecraft.client.input.Input.movementSideways = value; }

public boolean pressingLeft() { return wrapperContained.pressingLeft; }
public void pressingLeft(boolean value) { wrapperContained.pressingLeft = value; }
// public static boolean pressingLeft() { return net.minecraft.client.input.Input.pressingLeft; }
// public static void pressingLeft(boolean value, ) { net.minecraft.client.input.Input.pressingLeft = value; }

public boolean pressingBack() { return wrapperContained.pressingBack; }
public void pressingBack(boolean value) { wrapperContained.pressingBack = value; }
// public static boolean pressingBack() { return net.minecraft.client.input.Input.pressingBack; }
// public static void pressingBack(boolean value, ) { net.minecraft.client.input.Input.pressingBack = value; }

public boolean pressingForward() { return wrapperContained.pressingForward; }
public void pressingForward(boolean value) { wrapperContained.pressingForward = value; }
// public static boolean pressingForward() { return net.minecraft.client.input.Input.pressingForward; }
// public static void pressingForward(boolean value, ) { net.minecraft.client.input.Input.pressingForward = value; }

public boolean hasForwardMovement() { return wrapperContained.hasForwardMovement(); }
// public static boolean hasForwardMovement() { return net.minecraft.client.input.Input.hasForwardMovement(); }
public yarnwrap.util.math.Vec2f getMovementInput() { return new yarnwrap.util.math.Vec2f(wrapperContained.getMovementInput()); }
// public static yarnwrap.util.math.Vec2f getMovementInput() { return new yarnwrap.util.math.Vec2f(net.minecraft.client.input.Input.getMovementInput()); }
public void tick(boolean slowDown,float slowDownFactor) { wrapperContained.tick(slowDown,slowDownFactor); }
// public static void tick(boolean slowDown,float slowDownFactor, ) { net.minecraft.client.input.Input.tick(slowDown,slowDownFactor); }

}