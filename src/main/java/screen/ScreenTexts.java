package yarnwrap.screen;
public class ScreenTexts { public net.minecraft.screen.ScreenTexts wrapperContained; public ScreenTexts(net.minecraft.screen.ScreenTexts wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.Text ON() { return new yarnwrap.text.Text(wrapperContained.ON); }
public yarnwrap.text.Text OFF() { return new yarnwrap.text.Text(wrapperContained.OFF); }
public yarnwrap.text.Text DONE() { return new yarnwrap.text.Text(wrapperContained.DONE); }
public yarnwrap.text.Text CANCEL() { return new yarnwrap.text.Text(wrapperContained.CANCEL); }
public yarnwrap.text.Text YES() { return new yarnwrap.text.Text(wrapperContained.YES); }
public yarnwrap.text.Text NO() { return new yarnwrap.text.Text(wrapperContained.NO); }
public yarnwrap.text.Text PROCEED() { return new yarnwrap.text.Text(wrapperContained.PROCEED); }
public yarnwrap.text.Text BACK() { return new yarnwrap.text.Text(wrapperContained.BACK); }
public yarnwrap.text.Text CONNECT_FAILED() { return new yarnwrap.text.Text(wrapperContained.CONNECT_FAILED); }
public yarnwrap.text.Text LINE_BREAK() { return new yarnwrap.text.Text(wrapperContained.LINE_BREAK); }
public yarnwrap.text.Text SENTENCE_SEPARATOR() { return new yarnwrap.text.Text(wrapperContained.SENTENCE_SEPARATOR); }
public yarnwrap.text.Text EMPTY() { return new yarnwrap.text.Text(wrapperContained.EMPTY); }
public yarnwrap.text.Text ELLIPSIS() { return new yarnwrap.text.Text(wrapperContained.ELLIPSIS); }
public yarnwrap.text.Text ACKNOWLEDGE() { return new yarnwrap.text.Text(wrapperContained.ACKNOWLEDGE); }
public yarnwrap.text.Text CONTINUE() { return new yarnwrap.text.Text(wrapperContained.CONTINUE); }
public yarnwrap.text.Text SPACE() { return new yarnwrap.text.Text(wrapperContained.SPACE); }
public yarnwrap.text.Text TO_TITLE() { return new yarnwrap.text.Text(wrapperContained.TO_TITLE); }
public yarnwrap.text.Text OK() { return new yarnwrap.text.Text(wrapperContained.OK); }
public yarnwrap.text.Text OPEN_LINK() { return new yarnwrap.text.Text(wrapperContained.OPEN_LINK); }
public yarnwrap.text.Text COPY_LINK_TO_CLIPBOARD() { return new yarnwrap.text.Text(wrapperContained.COPY_LINK_TO_CLIPBOARD); }
public yarnwrap.text.Text DISCONNECT() { return new yarnwrap.text.Text(wrapperContained.DISCONNECT); }
public yarnwrap.text.Text CONNECT_FAILED_TRANSFER() { return new yarnwrap.text.Text(wrapperContained.CONNECT_FAILED_TRANSFER); }
public yarnwrap.text.MutableText composeToggleText(yarnwrap.text.Text text,boolean value) { return new yarnwrap.text.MutableText(wrapperContained.composeToggleText(text.wrapperContained,value)); }
public yarnwrap.text.MutableText composeGenericOptionText(yarnwrap.text.Text text,yarnwrap.text.Text value) { return new yarnwrap.text.MutableText(wrapperContained.composeGenericOptionText(text.wrapperContained,value.wrapperContained)); }
public yarnwrap.text.Text onOrOff(boolean on) { return new yarnwrap.text.Text(wrapperContained.onOrOff(on)); }
public yarnwrap.text.Text joinLines(java.util.Collection texts) { return new yarnwrap.text.Text(wrapperContained.joinLines(texts)); }
public yarnwrap.text.Text joinLines(net.minecraft.text.Text[] texts) { return new yarnwrap.text.Text(wrapperContained.joinLines(texts)); }
public yarnwrap.text.MutableText joinSentences(net.minecraft.text.Text[] sentences) { return new yarnwrap.text.MutableText(wrapperContained.joinSentences(sentences)); }
public yarnwrap.text.MutableText days(long days) { return new yarnwrap.text.MutableText(wrapperContained.days(days)); }
public yarnwrap.text.MutableText hours(long hours) { return new yarnwrap.text.MutableText(wrapperContained.hours(hours)); }
public yarnwrap.text.MutableText minutes(long minutes) { return new yarnwrap.text.MutableText(wrapperContained.minutes(minutes)); }
public yarnwrap.text.MutableText space() { return new yarnwrap.text.MutableText(wrapperContained.space()); }

}