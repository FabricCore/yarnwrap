package yarnwrap.block.vault;
public class VaultClientData { public net.minecraft.block.vault.VaultClientData wrapperContained; public VaultClientData(net.minecraft.block.vault.VaultClientData wrapperContained) { this.wrapperContained = wrapperContained; }

// public float DISPLAY_ROTATION_SPEED() { return wrapperContained.DISPLAY_ROTATION_SPEED; }
// public void DISPLAY_ROTATION_SPEED(float value) { wrapperContained.DISPLAY_ROTATION_SPEED = value; }
public static float DISPLAY_ROTATION_SPEED() { return net.minecraft.block.vault.VaultClientData.DISPLAY_ROTATION_SPEED; }
// public static void DISPLAY_ROTATION_SPEED(float value, ) { net.minecraft.block.vault.VaultClientData.DISPLAY_ROTATION_SPEED = value; }

// public float displayRotation() { return wrapperContained.displayRotation; }
// public void displayRotation(float value) { wrapperContained.displayRotation = value; }
// public static float displayRotation() { return net.minecraft.block.vault.VaultClientData.displayRotation; }
// public static void displayRotation(float value, ) { net.minecraft.block.vault.VaultClientData.displayRotation = value; }

// public float prevDisplayRotation() { return wrapperContained.prevDisplayRotation; }
// public void prevDisplayRotation(float value) { wrapperContained.prevDisplayRotation = value; }
// public static float prevDisplayRotation() { return net.minecraft.block.vault.VaultClientData.prevDisplayRotation; }
// public static void prevDisplayRotation(float value, ) { net.minecraft.block.vault.VaultClientData.prevDisplayRotation = value; }

public float getDisplayRotation() { return wrapperContained.getDisplayRotation(); }
// public static float getDisplayRotation() { return net.minecraft.block.vault.VaultClientData.getDisplayRotation(); }
public float getPreviousDisplayRotation() { return wrapperContained.getPreviousDisplayRotation(); }
// public static float getPreviousDisplayRotation() { return net.minecraft.block.vault.VaultClientData.getPreviousDisplayRotation(); }
// public void rotateDisplay() { wrapperContained.rotateDisplay(); }
// public static void rotateDisplay() { net.minecraft.block.vault.VaultClientData.rotateDisplay(); }

}