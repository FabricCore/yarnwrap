package yarnwrap.client.gui.screen.ingame;
public class GenericContainerScreen { public net.minecraft.client.gui.screen.ingame.GenericContainerScreen wrapperContained; public GenericContainerScreen(net.minecraft.client.gui.screen.ingame.GenericContainerScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier TEXTURE() { return new yarnwrap.util.Identifier(wrapperContained.TEXTURE); }
// public int rows() { return wrapperContained.rows; }

}