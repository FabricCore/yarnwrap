package yarnwrap.client.gui.screen.ingame;
public class HangingSignEditScreen { public net.minecraft.client.gui.screen.ingame.HangingSignEditScreen wrapperContained; public HangingSignEditScreen(net.minecraft.client.gui.screen.ingame.HangingSignEditScreen wrapperContained) { this.wrapperContained = wrapperContained; }

public float BACKGROUND_SCALE() { return wrapperContained.BACKGROUND_SCALE; }
// public void BACKGROUND_SCALE(float value) { wrapperContained.BACKGROUND_SCALE = value; }
// public org.joml.Vector3f TEXT_SCALE() { return wrapperContained.TEXT_SCALE; }
// public void TEXT_SCALE(org.joml.Vector3f value) { wrapperContained.TEXT_SCALE = value; }
// public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }
// public void texture(yarnwrap.util.Identifier value) { wrapperContained.texture = value.wrapperContained; }

}