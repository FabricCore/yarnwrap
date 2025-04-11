package yarnwrap.client.font;
public class TextHandler { public net.minecraft.client.font.TextHandler wrapperContained; public TextHandler(net.minecraft.client.font.TextHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object widthRetriever() { return wrapperContained.widthRetriever; }
// // public void widthRetriever(Object value) { wrapperContained.widthRetriever = value; }
public float getWidth(java.lang.String text) { return wrapperContained.getWidth(text); }
public int moveCursorByWords(java.lang.String text,int offset,int cursor,boolean consumeSpaceOrBreak) { return wrapperContained.moveCursorByWords(text,offset,cursor,consumeSpaceOrBreak); }
public int getTrimmedLength(java.lang.String text,int maxWidth,yarnwrap.text.Style style) { return wrapperContained.getTrimmedLength(text,maxWidth,style.wrapperContained); }
// public void wrapLines(java.lang.String text,int maxWidth,yarnwrap.text.Style style,boolean retainTrailingWordSplit,Object consumer) { wrapperContained.wrapLines(text,maxWidth,style.wrapperContained,retainTrailingWordSplit,consumer); }
public float getWidth(yarnwrap.text.StringVisitable text) { return wrapperContained.getWidth(text.wrapperContained); }
public yarnwrap.text.Style getStyleAt(yarnwrap.text.StringVisitable text,int x) { return new yarnwrap.text.Style(wrapperContained.getStyleAt(text.wrapperContained,x)); }
public yarnwrap.text.StringVisitable trimToWidth(yarnwrap.text.StringVisitable text,int width,yarnwrap.text.Style style) { return new yarnwrap.text.StringVisitable(wrapperContained.trimToWidth(text.wrapperContained,width,style.wrapperContained)); }
public java.lang.String trimToWidth(java.lang.String text,int maxWidth,yarnwrap.text.Style style) { return wrapperContained.trimToWidth(text,maxWidth,style.wrapperContained); }
public java.util.List wrapLines(yarnwrap.text.StringVisitable text,int maxWidth,yarnwrap.text.Style style) { return wrapperContained.wrapLines(text.wrapperContained,maxWidth,style.wrapperContained); }
public java.lang.String trimToWidthBackwards(java.lang.String text,int maxWidth,yarnwrap.text.Style style) { return wrapperContained.trimToWidthBackwards(text,maxWidth,style.wrapperContained); }
public java.util.List wrapLines(java.lang.String text,int maxWidth,yarnwrap.text.Style style) { return wrapperContained.wrapLines(text,maxWidth,style.wrapperContained); }
public void wrapLines(yarnwrap.text.StringVisitable text,int maxWidth,yarnwrap.text.Style style,java.util.function.BiConsumer lineConsumer) { wrapperContained.wrapLines(text.wrapperContained,maxWidth,style.wrapperContained,lineConsumer); }
public float getWidth(yarnwrap.text.OrderedText text) { return wrapperContained.getWidth(text.wrapperContained); }
public yarnwrap.text.Style getStyleAt(yarnwrap.text.OrderedText text,int x) { return new yarnwrap.text.Style(wrapperContained.getStyleAt(text.wrapperContained,x)); }
public java.util.List wrapLines(yarnwrap.text.StringVisitable text,int maxWidth,yarnwrap.text.Style style,yarnwrap.text.StringVisitable wrappedLinePrefix) { return wrapperContained.wrapLines(text.wrapperContained,maxWidth,style.wrapperContained,wrappedLinePrefix.wrapperContained); }
public int getLimitedStringLength(java.lang.String text,int maxWidth,yarnwrap.text.Style style) { return wrapperContained.getLimitedStringLength(text,maxWidth,style.wrapperContained); }
public java.lang.String limitString(java.lang.String text,int maxWidth,yarnwrap.text.Style style) { return wrapperContained.limitString(text,maxWidth,style.wrapperContained); }
public int getEndingIndex(java.lang.String text,int maxWidth,yarnwrap.text.Style style) { return wrapperContained.getEndingIndex(text,maxWidth,style.wrapperContained); }

}