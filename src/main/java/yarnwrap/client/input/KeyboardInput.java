package yarnwrap.client.input;
public class KeyboardInput { public net.minecraft.client.input.KeyboardInput wrapperContained; public KeyboardInput(net.minecraft.client.input.KeyboardInput wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.option.GameOptions settings() { return new yarnwrap.client.option.GameOptions(wrapperContained.settings); }
// public void settings(yarnwrap.client.option.GameOptions value) { wrapperContained.settings = value.wrapperContained; }
public KeyboardInput(yarnwrap.client.option.GameOptions settings) { this.wrapperContained = new net.minecraft.client.input.KeyboardInput(settings.wrapperContained); }
// public float getMovementMultiplier(boolean positive,boolean negative) { return wrapperContained.getMovementMultiplier(positive,negative); }

}