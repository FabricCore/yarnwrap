package yarnwrap.client.realms.gui.screen;
public class RealmsWorldGeneratorType { public net.minecraft.client.realms.gui.screen.RealmsWorldGeneratorType wrapperContained; public RealmsWorldGeneratorType(net.minecraft.client.realms.gui.screen.RealmsWorldGeneratorType wrapperContained) { this.wrapperContained = wrapperContained; }

// public int id() { return wrapperContained.id; }
// public yarnwrap.text.Text text() { return new yarnwrap.text.Text(wrapperContained.text); }
public yarnwrap.text.Text getText() { return new yarnwrap.text.Text(wrapperContained.getText()); }
public int getId() { return wrapperContained.getId(); }

}