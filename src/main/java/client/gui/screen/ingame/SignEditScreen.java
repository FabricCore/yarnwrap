package yarnwrap.client.gui.screen.ingame;
public class SignEditScreen { public net.minecraft.client.gui.screen.ingame.SignEditScreen wrapperContained; public SignEditScreen(net.minecraft.client.gui.screen.ingame.SignEditScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object model() { return wrapperContained.model; }
public float BACKGROUND_SCALE() { return wrapperContained.BACKGROUND_SCALE; }
public float TEXT_SCALE_MULTIPLIER() { return wrapperContained.TEXT_SCALE_MULTIPLIER; }
// public org.joml.Vector3f TEXT_SCALE() { return wrapperContained.TEXT_SCALE; }

}