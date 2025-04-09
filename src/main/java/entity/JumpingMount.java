package yarnwrap.entity;
public class JumpingMount { public net.minecraft.entity.JumpingMount wrapperContained; public JumpingMount(net.minecraft.entity.JumpingMount wrapperContained) { this.wrapperContained = wrapperContained; }

public int getJumpCooldown() { return wrapperContained.getJumpCooldown(); }
public boolean canJump() { return wrapperContained.canJump(); }
public void setJumpStrength(int strength) { wrapperContained.setJumpStrength(strength); }
public void startJumping(int height) { wrapperContained.startJumping(height); }
public void stopJumping() { wrapperContained.stopJumping(); }

}