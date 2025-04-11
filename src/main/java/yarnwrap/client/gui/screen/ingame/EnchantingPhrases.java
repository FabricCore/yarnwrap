package yarnwrap.client.gui.screen.ingame;
public class EnchantingPhrases { public net.minecraft.client.gui.screen.ingame.EnchantingPhrases wrapperContained; public EnchantingPhrases(net.minecraft.client.gui.screen.ingame.EnchantingPhrases wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier FONT_ID() { return new yarnwrap.util.Identifier(wrapperContained.FONT_ID); }
// public void FONT_ID(yarnwrap.util.Identifier value) { wrapperContained.FONT_ID = value.wrapperContained; }
// public yarnwrap.text.Style STYLE() { return new yarnwrap.text.Style(wrapperContained.STYLE); }
// public void STYLE(yarnwrap.text.Style value) { wrapperContained.STYLE = value.wrapperContained; }
// public java.lang.String[] phrases() { return wrapperContained.phrases; }
// public void phrases(java.lang.String[] value) { wrapperContained.phrases = value; }
// public yarnwrap.client.gui.screen.ingame.EnchantingPhrases INSTANCE() { return new yarnwrap.client.gui.screen.ingame.EnchantingPhrases(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.client.gui.screen.ingame.EnchantingPhrases value) { wrapperContained.INSTANCE = value.wrapperContained; }
// public yarnwrap.util.math.random.Random random() { return new yarnwrap.util.math.random.Random(wrapperContained.random); }
// public void random(yarnwrap.util.math.random.Random value) { wrapperContained.random = value.wrapperContained; }
public yarnwrap.text.StringVisitable generatePhrase(yarnwrap.client.font.TextRenderer textRenderer,int width) { return new yarnwrap.text.StringVisitable(wrapperContained.generatePhrase(textRenderer.wrapperContained,width)); }
public void setSeed(long seed) { wrapperContained.setSeed(seed); }
public yarnwrap.client.gui.screen.ingame.EnchantingPhrases getInstance() { return new yarnwrap.client.gui.screen.ingame.EnchantingPhrases(wrapperContained.getInstance()); }

}