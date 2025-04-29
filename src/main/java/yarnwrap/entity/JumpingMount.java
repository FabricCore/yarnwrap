package yarnwrap.entity;
public class JumpingMount { public net.minecraft.entity.JumpingMount wrapperContained; public JumpingMount(net.minecraft.entity.JumpingMount wrapperContained) { this.wrapperContained = wrapperContained; }

public int getJumpCooldown() { return wrapperContained.getJumpCooldown(); }
// public static int getJumpCooldown() { return net.minecraft.entity.JumpingMount.getJumpCooldown(); }
public boolean canJump() { return wrapperContained.canJump(); }
// public static boolean canJump() { return net.minecraft.entity.JumpingMount.canJump(); }
public void setJumpStrength(int strength) { wrapperContained.setJumpStrength(strength); }
// public static void setJumpStrength(int strength, ) { net.minecraft.entity.JumpingMount.setJumpStrength(strength); }
public void startJumping(int height) { wrapperContained.startJumping(height); }
// public static void startJumping(int height, ) { net.minecraft.entity.JumpingMount.startJumping(height); }
public void stopJumping() { wrapperContained.stopJumping(); }
// public static void stopJumping() { net.minecraft.entity.JumpingMount.stopJumping(); }

}