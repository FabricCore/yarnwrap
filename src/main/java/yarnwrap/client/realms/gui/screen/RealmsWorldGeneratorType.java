package yarnwrap.client.realms.gui.screen;
public class RealmsWorldGeneratorType { public net.minecraft.client.realms.gui.screen.RealmsWorldGeneratorType wrapperContained; public RealmsWorldGeneratorType(net.minecraft.client.realms.gui.screen.RealmsWorldGeneratorType wrapperContained) { this.wrapperContained = wrapperContained; }

// public int id() { return wrapperContained.id; }
// public void id(int value) { wrapperContained.id = value; }
// public yarnwrap.text.Text text() { return new yarnwrap.text.Text(wrapperContained.text); }
// public void text(yarnwrap.text.Text value) { wrapperContained.text = value.wrapperContained; }
// // public RealmsWorldGeneratorType(java.lang.String id,int presetKey) { this.wrapperContained = new net.minecraft.client.realms.gui.screen.RealmsWorldGeneratorType(id,presetKey); }
public yarnwrap.text.Text getText() { return new yarnwrap.text.Text(wrapperContained.getText()); }
public int getId() { return wrapperContained.getId(); }

}