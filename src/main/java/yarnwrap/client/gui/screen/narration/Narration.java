package yarnwrap.client.gui.screen.narration;
public class Narration { public net.minecraft.client.gui.screen.narration.Narration wrapperContained; public Narration(net.minecraft.client.gui.screen.narration.Narration wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.gui.screen.narration.Narration EMPTY() { return new yarnwrap.client.gui.screen.narration.Narration(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.client.gui.screen.narration.Narration value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.client.gui.screen.narration.Narration EMPTY() { return new yarnwrap.client.gui.screen.narration.Narration(net.minecraft.client.gui.screen.narration.Narration.EMPTY); }
// public static void EMPTY(yarnwrap.client.gui.screen.narration.Narration value, ) { net.minecraft.client.gui.screen.narration.Narration.EMPTY = value.wrapperContained; }

// public java.lang.Object value() { return wrapperContained.value; }
// public void value(java.lang.Object value) { wrapperContained.value = value; }
// // public static java.lang.Object value() { return net.minecraft.client.gui.screen.narration.Narration.value; }
// public static void value(java.lang.Object value, ) { net.minecraft.client.gui.screen.narration.Narration.value = value; }

// public java.util.function.BiConsumer transformer() { return wrapperContained.transformer; }
// public void transformer(java.util.function.BiConsumer value) { wrapperContained.transformer = value; }
// public static java.util.function.BiConsumer transformer() { return net.minecraft.client.gui.screen.narration.Narration.transformer; }
// public static void transformer(java.util.function.BiConsumer value, ) { net.minecraft.client.gui.screen.narration.Narration.transformer = value; }

// public Narration(java.lang.Object value,java.util.function.BiConsumer transformer) { this.wrapperContained = new net.minecraft.client.gui.screen.narration.Narration(value,transformer); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.client.gui.screen.narration.Narration.equals(o); }
// public yarnwrap.client.gui.screen.narration.Narration string(java.lang.String string) { return new yarnwrap.client.gui.screen.narration.Narration(wrapperContained.string(string)); }
// public static yarnwrap.client.gui.screen.narration.Narration string(java.lang.String string, ) { return new yarnwrap.client.gui.screen.narration.Narration(net.minecraft.client.gui.screen.narration.Narration.string(string)); }
// public yarnwrap.client.gui.screen.narration.Narration texts(java.util.List texts) { return new yarnwrap.client.gui.screen.narration.Narration(wrapperContained.texts(texts)); }
// public static yarnwrap.client.gui.screen.narration.Narration texts(java.util.List texts, ) { return new yarnwrap.client.gui.screen.narration.Narration(net.minecraft.client.gui.screen.narration.Narration.texts(texts)); }
// public void method_37038(java.util.List consumer,java.util.function.Consumer texts) { wrapperContained.method_37038(consumer,texts); }
// public static void method_37038(java.util.List consumer,java.util.function.Consumer texts, ) { net.minecraft.client.gui.screen.narration.Narration.method_37038(consumer,texts); }
public void forEachSentence(java.util.function.Consumer consumer) { wrapperContained.forEachSentence(consumer); }
// public static void forEachSentence(java.util.function.Consumer consumer, ) { net.minecraft.client.gui.screen.narration.Narration.forEachSentence(consumer); }
// public void method_37040(java.util.function.Consumer consumer,yarnwrap.util.Unit text) { wrapperContained.method_37040(consumer,text.wrapperContained); }
// public static void method_37040(java.util.function.Consumer consumer,yarnwrap.util.Unit text, ) { net.minecraft.client.gui.screen.narration.Narration.method_37040(consumer,text.wrapperContained); }
// public void method_37041(java.util.function.Consumer consumer,yarnwrap.text.Text text) { wrapperContained.method_37041(consumer,text.wrapperContained); }
// public static void method_37041(java.util.function.Consumer consumer,yarnwrap.text.Text text, ) { net.minecraft.client.gui.screen.narration.Narration.method_37041(consumer,text.wrapperContained); }
// public yarnwrap.client.gui.screen.narration.Narration text(yarnwrap.text.Text text) { return new yarnwrap.client.gui.screen.narration.Narration(wrapperContained.text(text.wrapperContained)); }
// public static yarnwrap.client.gui.screen.narration.Narration text(yarnwrap.text.Text text, ) { return new yarnwrap.client.gui.screen.narration.Narration(net.minecraft.client.gui.screen.narration.Narration.text(text.wrapperContained)); }

}