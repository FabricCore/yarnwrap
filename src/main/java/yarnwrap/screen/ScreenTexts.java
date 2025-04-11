package yarnwrap.screen;
public class ScreenTexts { public net.minecraft.screen.ScreenTexts wrapperContained; public ScreenTexts(net.minecraft.screen.ScreenTexts wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.text.Text ON() { return new yarnwrap.text.Text(wrapperContained.ON); }
// public void ON(yarnwrap.text.Text value) { wrapperContained.ON = value.wrapperContained; }
public yarnwrap.text.Text OFF() { return new yarnwrap.text.Text(wrapperContained.OFF); }
// public void OFF(yarnwrap.text.Text value) { wrapperContained.OFF = value.wrapperContained; }
public yarnwrap.text.Text DONE() { return new yarnwrap.text.Text(wrapperContained.DONE); }
// public void DONE(yarnwrap.text.Text value) { wrapperContained.DONE = value.wrapperContained; }
public yarnwrap.text.Text CANCEL() { return new yarnwrap.text.Text(wrapperContained.CANCEL); }
// public void CANCEL(yarnwrap.text.Text value) { wrapperContained.CANCEL = value.wrapperContained; }
public yarnwrap.text.Text YES() { return new yarnwrap.text.Text(wrapperContained.YES); }
// public void YES(yarnwrap.text.Text value) { wrapperContained.YES = value.wrapperContained; }
public yarnwrap.text.Text NO() { return new yarnwrap.text.Text(wrapperContained.NO); }
// public void NO(yarnwrap.text.Text value) { wrapperContained.NO = value.wrapperContained; }
public yarnwrap.text.Text PROCEED() { return new yarnwrap.text.Text(wrapperContained.PROCEED); }
// public void PROCEED(yarnwrap.text.Text value) { wrapperContained.PROCEED = value.wrapperContained; }
public yarnwrap.text.Text BACK() { return new yarnwrap.text.Text(wrapperContained.BACK); }
// public void BACK(yarnwrap.text.Text value) { wrapperContained.BACK = value.wrapperContained; }
public yarnwrap.text.Text CONNECT_FAILED() { return new yarnwrap.text.Text(wrapperContained.CONNECT_FAILED); }
// public void CONNECT_FAILED(yarnwrap.text.Text value) { wrapperContained.CONNECT_FAILED = value.wrapperContained; }
public yarnwrap.text.Text LINE_BREAK() { return new yarnwrap.text.Text(wrapperContained.LINE_BREAK); }
// public void LINE_BREAK(yarnwrap.text.Text value) { wrapperContained.LINE_BREAK = value.wrapperContained; }
public yarnwrap.text.Text SENTENCE_SEPARATOR() { return new yarnwrap.text.Text(wrapperContained.SENTENCE_SEPARATOR); }
// public void SENTENCE_SEPARATOR(yarnwrap.text.Text value) { wrapperContained.SENTENCE_SEPARATOR = value.wrapperContained; }
public yarnwrap.text.Text EMPTY() { return new yarnwrap.text.Text(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.text.Text value) { wrapperContained.EMPTY = value.wrapperContained; }
public yarnwrap.text.Text ELLIPSIS() { return new yarnwrap.text.Text(wrapperContained.ELLIPSIS); }
// public void ELLIPSIS(yarnwrap.text.Text value) { wrapperContained.ELLIPSIS = value.wrapperContained; }
public yarnwrap.text.Text ACKNOWLEDGE() { return new yarnwrap.text.Text(wrapperContained.ACKNOWLEDGE); }
// public void ACKNOWLEDGE(yarnwrap.text.Text value) { wrapperContained.ACKNOWLEDGE = value.wrapperContained; }
public yarnwrap.text.Text CONTINUE() { return new yarnwrap.text.Text(wrapperContained.CONTINUE); }
// public void CONTINUE(yarnwrap.text.Text value) { wrapperContained.CONTINUE = value.wrapperContained; }
public yarnwrap.text.Text SPACE() { return new yarnwrap.text.Text(wrapperContained.SPACE); }
// public void SPACE(yarnwrap.text.Text value) { wrapperContained.SPACE = value.wrapperContained; }
public yarnwrap.text.Text TO_TITLE() { return new yarnwrap.text.Text(wrapperContained.TO_TITLE); }
// public void TO_TITLE(yarnwrap.text.Text value) { wrapperContained.TO_TITLE = value.wrapperContained; }
public yarnwrap.text.Text OK() { return new yarnwrap.text.Text(wrapperContained.OK); }
// public void OK(yarnwrap.text.Text value) { wrapperContained.OK = value.wrapperContained; }
public yarnwrap.text.Text OPEN_LINK() { return new yarnwrap.text.Text(wrapperContained.OPEN_LINK); }
// public void OPEN_LINK(yarnwrap.text.Text value) { wrapperContained.OPEN_LINK = value.wrapperContained; }
public yarnwrap.text.Text COPY_LINK_TO_CLIPBOARD() { return new yarnwrap.text.Text(wrapperContained.COPY_LINK_TO_CLIPBOARD); }
// public void COPY_LINK_TO_CLIPBOARD(yarnwrap.text.Text value) { wrapperContained.COPY_LINK_TO_CLIPBOARD = value.wrapperContained; }
public yarnwrap.text.Text DISCONNECT() { return new yarnwrap.text.Text(wrapperContained.DISCONNECT); }
// public void DISCONNECT(yarnwrap.text.Text value) { wrapperContained.DISCONNECT = value.wrapperContained; }
public yarnwrap.text.Text CONNECT_FAILED_TRANSFER() { return new yarnwrap.text.Text(wrapperContained.CONNECT_FAILED_TRANSFER); }
// public void CONNECT_FAILED_TRANSFER(yarnwrap.text.Text value) { wrapperContained.CONNECT_FAILED_TRANSFER = value.wrapperContained; }
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