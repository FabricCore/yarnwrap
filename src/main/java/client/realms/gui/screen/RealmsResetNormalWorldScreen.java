package yarnwrap.client.realms.gui.screen;
public class RealmsResetNormalWorldScreen { public net.minecraft.client.realms.gui.screen.RealmsResetNormalWorldScreen wrapperContained; public RealmsResetNormalWorldScreen(net.minecraft.client.realms.gui.screen.RealmsResetNormalWorldScreen wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.widget.TextFieldWidget seedEdit() { return new yarnwrap.client.gui.widget.TextFieldWidget(wrapperContained.seedEdit); }
// public yarnwrap.text.Text parentTitle() { return new yarnwrap.text.Text(wrapperContained.parentTitle); }
// public yarnwrap.text.Text RESET_SEED_TEXT() { return new yarnwrap.text.Text(wrapperContained.RESET_SEED_TEXT); }
// public java.util.function.Consumer callback() { return wrapperContained.callback; }
// public yarnwrap.client.realms.gui.screen.RealmsWorldGeneratorType generatorType() { return new yarnwrap.client.realms.gui.screen.RealmsWorldGeneratorType(wrapperContained.generatorType); }
// public boolean mapFeatures() { return wrapperContained.mapFeatures; }
// public yarnwrap.client.gui.widget.ThreePartsLayoutWidget layout() { return new yarnwrap.client.gui.widget.ThreePartsLayoutWidget(wrapperContained.layout); }
public yarnwrap.text.Text TITLE() { return new yarnwrap.text.Text(wrapperContained.TITLE); }
// public java.util.Set experiments() { return wrapperContained.experiments; }
// public yarnwrap.client.realms.gui.screen.ResetWorldInfo createResetWorldInfo() { return new yarnwrap.client.realms.gui.screen.ResetWorldInfo(wrapperContained.createResetWorldInfo()); }
// public void addExperimentsButton(yarnwrap.client.gui.widget.DirectionalLayoutWidget layout) { wrapperContained.addExperimentsButton(layout.wrapperContained); }

}