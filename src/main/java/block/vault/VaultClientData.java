package yarnwrap.block.vault;
public class VaultClientData { public net.minecraft.block.vault.VaultClientData wrapperContained; public VaultClientData(net.minecraft.block.vault.VaultClientData wrapperContained) { this.wrapperContained = wrapperContained; }

public float DISPLAY_ROTATION_SPEED() { return wrapperContained.DISPLAY_ROTATION_SPEED; }
// public float displayRotation() { return wrapperContained.displayRotation; }
// public float prevDisplayRotation() { return wrapperContained.prevDisplayRotation; }
public float getDisplayRotation() { return wrapperContained.getDisplayRotation(); }
public float getPreviousDisplayRotation() { return wrapperContained.getPreviousDisplayRotation(); }
// public void rotateDisplay() { wrapperContained.rotateDisplay(); }

}