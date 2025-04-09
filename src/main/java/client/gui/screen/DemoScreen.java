package yarnwrap.client.gui.screen;
public class DemoScreen { public net.minecraft.client.gui.screen.DemoScreen wrapperContained; public DemoScreen(net.minecraft.client.gui.screen.DemoScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier DEMO_BG() { return new yarnwrap.util.Identifier(wrapperContained.DEMO_BG); }
// public yarnwrap.client.font.MultilineText movementText() { return new yarnwrap.client.font.MultilineText(wrapperContained.movementText); }
// public yarnwrap.client.font.MultilineText fullWrappedText() { return new yarnwrap.client.font.MultilineText(wrapperContained.fullWrappedText); }

}