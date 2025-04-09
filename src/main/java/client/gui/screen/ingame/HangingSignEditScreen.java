package yarnwrap.client.gui.screen.ingame;
public class HangingSignEditScreen { public net.minecraft.client.gui.screen.ingame.HangingSignEditScreen wrapperContained; public HangingSignEditScreen(net.minecraft.client.gui.screen.ingame.HangingSignEditScreen wrapperContained) { this.wrapperContained = wrapperContained; }

public float BACKGROUND_SCALE() { return wrapperContained.BACKGROUND_SCALE; }
// public org.joml.Vector3f TEXT_SCALE() { return wrapperContained.TEXT_SCALE; }
// public yarnwrap.util.Identifier texture() { return new yarnwrap.util.Identifier(wrapperContained.texture); }

}