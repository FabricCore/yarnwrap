package yarnwrap.client.gui.screen.narration;
public class Narration { public net.minecraft.client.gui.screen.narration.Narration wrapperContained; public Narration(net.minecraft.client.gui.screen.narration.Narration wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.gui.screen.narration.Narration EMPTY() { return new yarnwrap.client.gui.screen.narration.Narration(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.client.gui.screen.narration.Narration value) { wrapperContained.EMPTY = value.wrapperContained; }
// public java.lang.Object value() { return wrapperContained.value; }
// public void value(java.lang.Object value) { wrapperContained.value = value; }
// public java.util.function.BiConsumer transformer() { return wrapperContained.transformer; }
// public void transformer(java.util.function.BiConsumer value) { wrapperContained.transformer = value; }
// public Narration(java.lang.Object value,java.util.function.BiConsumer transformer) { this.wrapperContained = new net.minecraft.client.gui.screen.narration.Narration(value,transformer); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
public yarnwrap.client.gui.screen.narration.Narration string(java.lang.String string) { return new yarnwrap.client.gui.screen.narration.Narration(wrapperContained.string(string)); }
public yarnwrap.client.gui.screen.narration.Narration texts(java.util.List texts) { return new yarnwrap.client.gui.screen.narration.Narration(wrapperContained.texts(texts)); }
// public void method_37038(java.util.List consumer,java.util.function.Consumer texts) { wrapperContained.method_37038(consumer,texts); }
public void forEachSentence(java.util.function.Consumer consumer) { wrapperContained.forEachSentence(consumer); }
// public void method_37040(java.util.function.Consumer consumer,yarnwrap.util.Unit text) { wrapperContained.method_37040(consumer,text.wrapperContained); }
// public void method_37041(java.util.function.Consumer consumer,yarnwrap.text.Text text) { wrapperContained.method_37041(consumer,text.wrapperContained); }
public yarnwrap.client.gui.screen.narration.Narration text(yarnwrap.text.Text text) { return new yarnwrap.client.gui.screen.narration.Narration(wrapperContained.text(text.wrapperContained)); }

}