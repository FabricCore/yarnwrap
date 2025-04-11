package yarnwrap.client.gui.screen.narration;
public class Narration { public net.minecraft.client.gui.screen.narration.Narration wrapperContained; public Narration(net.minecraft.client.gui.screen.narration.Narration wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.gui.screen.narration.Narration EMPTY() { return new yarnwrap.client.gui.screen.narration.Narration(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.client.gui.screen.narration.Narration value) { wrapperContained.EMPTY = value.wrapperContained; }
// public java.lang.Object value() { return wrapperContained.value; }
// public void value(java.lang.Object value) { wrapperContained.value = value; }
// public java.util.function.BiConsumer transformer() { return wrapperContained.transformer; }
// public void transformer(java.util.function.BiConsumer value) { wrapperContained.transformer = value; }
public yarnwrap.client.gui.screen.narration.Narration string(java.lang.String string) { return new yarnwrap.client.gui.screen.narration.Narration(wrapperContained.string(string)); }
public yarnwrap.client.gui.screen.narration.Narration texts(java.util.List texts) { return new yarnwrap.client.gui.screen.narration.Narration(wrapperContained.texts(texts)); }
public void forEachSentence(java.util.function.Consumer consumer) { wrapperContained.forEachSentence(consumer); }
public yarnwrap.client.gui.screen.narration.Narration text(yarnwrap.text.Text text) { return new yarnwrap.client.gui.screen.narration.Narration(wrapperContained.text(text.wrapperContained)); }

}