package yarnwrap.block.vault;
public class VaultClientData { public net.minecraft.block.vault.VaultClientData wrapperContained; public VaultClientData(net.minecraft.block.vault.VaultClientData wrapperContained) { this.wrapperContained = wrapperContained; }

public float DISPLAY_ROTATION_SPEED() { return wrapperContained.DISPLAY_ROTATION_SPEED; }
// public void DISPLAY_ROTATION_SPEED(float value) { wrapperContained.DISPLAY_ROTATION_SPEED = value; }
// public float displayRotation() { return wrapperContained.displayRotation; }
// public void displayRotation(float value) { wrapperContained.displayRotation = value; }
// public float prevDisplayRotation() { return wrapperContained.prevDisplayRotation; }
// public void prevDisplayRotation(float value) { wrapperContained.prevDisplayRotation = value; }
public float getDisplayRotation() { return wrapperContained.getDisplayRotation(); }
public float getPreviousDisplayRotation() { return wrapperContained.getPreviousDisplayRotation(); }
// public void rotateDisplay() { wrapperContained.rotateDisplay(); }

}