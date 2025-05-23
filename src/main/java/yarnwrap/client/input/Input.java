package yarnwrap.client.input;
public class Input { public net.minecraft.client.input.Input wrapperContained; public Input(net.minecraft.client.input.Input wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.PlayerInput playerInput() { return new yarnwrap.util.PlayerInput(wrapperContained.playerInput); }
public void playerInput(yarnwrap.util.PlayerInput value) { wrapperContained.playerInput = value.wrapperContained; }
// public static yarnwrap.util.PlayerInput playerInput() { return new yarnwrap.util.PlayerInput(net.minecraft.client.input.Input.playerInput); }
// public static void playerInput(yarnwrap.util.PlayerInput value, ) { net.minecraft.client.input.Input.playerInput = value.wrapperContained; }

// public yarnwrap.util.math.Vec2f movementVector() { return new yarnwrap.util.math.Vec2f(wrapperContained.movementVector); }
// public void movementVector(yarnwrap.util.math.Vec2f value) { wrapperContained.movementVector = value.wrapperContained; }
// public static yarnwrap.util.math.Vec2f movementVector() { return new yarnwrap.util.math.Vec2f(net.minecraft.client.input.Input.movementVector); }
// public static void movementVector(yarnwrap.util.math.Vec2f value, ) { net.minecraft.client.input.Input.movementVector = value.wrapperContained; }

public yarnwrap.util.math.Vec2f getMovementInput() { return new yarnwrap.util.math.Vec2f(wrapperContained.getMovementInput()); }
// public static yarnwrap.util.math.Vec2f getMovementInput() { return new yarnwrap.util.math.Vec2f(net.minecraft.client.input.Input.getMovementInput()); }
public void tick() { wrapperContained.tick(); }
// public static void tick() { net.minecraft.client.input.Input.tick(); }
public boolean hasForwardMovement() { return wrapperContained.hasForwardMovement(); }
// public static boolean hasForwardMovement() { return net.minecraft.client.input.Input.hasForwardMovement(); }
public void jump() { wrapperContained.jump(); }
// public static void jump() { net.minecraft.client.input.Input.jump(); }

}