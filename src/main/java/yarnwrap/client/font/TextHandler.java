package yarnwrap.client.font;
public class TextHandler { public net.minecraft.client.font.TextHandler wrapperContained; public TextHandler(net.minecraft.client.font.TextHandler wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object widthRetriever() { return wrapperContained.widthRetriever; }
// // public void widthRetriever(Object value) { wrapperContained.widthRetriever = value; }
// // public static Object widthRetriever() { return net.minecraft.client.font.TextHandler.widthRetriever; }
// // public static void widthRetriever(Object value, ) { net.minecraft.client.font.TextHandler.widthRetriever = value; }

// public TextHandler(Object widthRetriever) { this.wrapperContained = new net.minecraft.client.font.TextHandler(widthRetriever); }
// public java.util.Optional method_27480(Object style,yarnwrap.text.Style text) { return wrapperContained.method_27480(style,text.wrapperContained); }
// public static java.util.Optional method_27480(Object style,yarnwrap.text.Style text, ) { return net.minecraft.client.font.TextHandler.method_27480(style,text.wrapperContained); }
public float getWidth(java.lang.String text) { return wrapperContained.getWidth(text); }
// public static float getWidth(java.lang.String text, ) { return net.minecraft.client.font.TextHandler.getWidth(text); }
// public int moveCursorByWords(java.lang.String text,int offset,int cursor,boolean consumeSpaceOrBreak) { return wrapperContained.moveCursorByWords(text,offset,cursor,consumeSpaceOrBreak); }
// public static int moveCursorByWords(java.lang.String text,int offset,int cursor,boolean consumeSpaceOrBreak, ) { return net.minecraft.client.font.TextHandler.moveCursorByWords(text,offset,cursor,consumeSpaceOrBreak); }
public int getTrimmedLength(java.lang.String text,int maxWidth,yarnwrap.text.Style style) { return wrapperContained.getTrimmedLength(text,maxWidth,style.wrapperContained); }
// public static int getTrimmedLength(java.lang.String text,int maxWidth,yarnwrap.text.Style style, ) { return net.minecraft.client.font.TextHandler.getTrimmedLength(text,maxWidth,style.wrapperContained); }
// public void wrapLines(java.lang.String text,int maxWidth,yarnwrap.text.Style style,boolean retainTrailingWordSplit,Object consumer) { wrapperContained.wrapLines(text,maxWidth,style.wrapperContained,retainTrailingWordSplit,consumer); }
// public static void wrapLines(java.lang.String text,int maxWidth,yarnwrap.text.Style style,boolean retainTrailingWordSplit,Object consumer, ) { net.minecraft.client.font.TextHandler.wrapLines(text,maxWidth,style.wrapperContained,retainTrailingWordSplit,consumer); }
// public void method_27486(java.util.List style,java.lang.String start,yarnwrap.text.Style end) { wrapperContained.method_27486(style,start,end.wrapperContained); }
// public static void method_27486(java.util.List style,java.lang.String start,yarnwrap.text.Style end, ) { net.minecraft.client.font.TextHandler.method_27486(style,start,end.wrapperContained); }
// public java.util.Optional method_27487(java.util.List style,yarnwrap.text.Style text) { return wrapperContained.method_27487(style,text.wrapperContained); }
// public static java.util.Optional method_27487(java.util.List style,yarnwrap.text.Style text, ) { return net.minecraft.client.font.TextHandler.method_27487(style,text.wrapperContained); }
public float getWidth(yarnwrap.text.StringVisitable text) { return wrapperContained.getWidth(text.wrapperContained); }
// public static float getWidth(yarnwrap.text.StringVisitable text, ) { return net.minecraft.client.font.TextHandler.getWidth(text.wrapperContained); }
public yarnwrap.text.Style getStyleAt(yarnwrap.text.StringVisitable text,int x) { return new yarnwrap.text.Style(wrapperContained.getStyleAt(text.wrapperContained,x)); }
// public static yarnwrap.text.Style getStyleAt(yarnwrap.text.StringVisitable text,int x, ) { return new yarnwrap.text.Style(net.minecraft.client.font.TextHandler.getStyleAt(text.wrapperContained,x)); }
public yarnwrap.text.StringVisitable trimToWidth(yarnwrap.text.StringVisitable text,int width,yarnwrap.text.Style style) { return new yarnwrap.text.StringVisitable(wrapperContained.trimToWidth(text.wrapperContained,width,style.wrapperContained)); }
// public static yarnwrap.text.StringVisitable trimToWidth(yarnwrap.text.StringVisitable text,int width,yarnwrap.text.Style style, ) { return new yarnwrap.text.StringVisitable(net.minecraft.client.font.TextHandler.trimToWidth(text.wrapperContained,width,style.wrapperContained)); }
// public boolean method_27492(org.apache.commons.lang3.mutable.MutableFloat unused,int style,yarnwrap.text.Style codePoint) { return wrapperContained.method_27492(unused,style,codePoint.wrapperContained); }
// public static boolean method_27492(org.apache.commons.lang3.mutable.MutableFloat unused,int style,yarnwrap.text.Style codePoint, ) { return net.minecraft.client.font.TextHandler.method_27492(unused,style,codePoint.wrapperContained); }
// public boolean method_27493(org.apache.commons.lang3.mutable.MutableFloat index,int style,org.apache.commons.lang3.mutable.MutableInt codePoint) { return wrapperContained.method_27493(index,style,codePoint); }
// public static boolean method_27493(org.apache.commons.lang3.mutable.MutableFloat index,int style,org.apache.commons.lang3.mutable.MutableInt codePoint, ) { return net.minecraft.client.font.TextHandler.method_27493(index,style,codePoint); }
public java.lang.String trimToWidth(java.lang.String text,int maxWidth,yarnwrap.text.Style style) { return wrapperContained.trimToWidth(text,maxWidth,style.wrapperContained); }
// public static java.lang.String trimToWidth(java.lang.String text,int maxWidth,yarnwrap.text.Style style, ) { return net.minecraft.client.font.TextHandler.trimToWidth(text,maxWidth,style.wrapperContained); }
public java.util.List wrapLines(yarnwrap.text.StringVisitable text,int maxWidth,yarnwrap.text.Style style) { return wrapperContained.wrapLines(text.wrapperContained,maxWidth,style.wrapperContained); }
// public static java.util.List wrapLines(yarnwrap.text.StringVisitable text,int maxWidth,yarnwrap.text.Style style, ) { return net.minecraft.client.font.TextHandler.wrapLines(text.wrapperContained,maxWidth,style.wrapperContained); }
// public boolean method_27496(org.apache.commons.lang3.mutable.MutableFloat unused,int style,yarnwrap.text.Style codePoint) { return wrapperContained.method_27496(unused,style,codePoint.wrapperContained); }
// public static boolean method_27496(org.apache.commons.lang3.mutable.MutableFloat unused,int style,yarnwrap.text.Style codePoint, ) { return net.minecraft.client.font.TextHandler.method_27496(unused,style,codePoint.wrapperContained); }
public java.lang.String trimToWidthBackwards(java.lang.String text,int maxWidth,yarnwrap.text.Style style) { return wrapperContained.trimToWidthBackwards(text,maxWidth,style.wrapperContained); }
// public static java.lang.String trimToWidthBackwards(java.lang.String text,int maxWidth,yarnwrap.text.Style style, ) { return net.minecraft.client.font.TextHandler.trimToWidthBackwards(text,maxWidth,style.wrapperContained); }
public java.util.List wrapLines(java.lang.String text,int maxWidth,yarnwrap.text.Style style) { return wrapperContained.wrapLines(text,maxWidth,style.wrapperContained); }
// public static java.util.List wrapLines(java.lang.String text,int maxWidth,yarnwrap.text.Style style, ) { return net.minecraft.client.font.TextHandler.wrapLines(text,maxWidth,style.wrapperContained); }
public void wrapLines(yarnwrap.text.StringVisitable text,int maxWidth,yarnwrap.text.Style style,java.util.function.BiConsumer lineConsumer) { wrapperContained.wrapLines(text.wrapperContained,maxWidth,style.wrapperContained,lineConsumer); }
// public static void wrapLines(yarnwrap.text.StringVisitable text,int maxWidth,yarnwrap.text.Style style,java.util.function.BiConsumer lineConsumer, ) { net.minecraft.client.font.TextHandler.wrapLines(text.wrapperContained,maxWidth,style.wrapperContained,lineConsumer); }
public float getWidth(yarnwrap.text.OrderedText text) { return wrapperContained.getWidth(text.wrapperContained); }
// public static float getWidth(yarnwrap.text.OrderedText text, ) { return net.minecraft.client.font.TextHandler.getWidth(text.wrapperContained); }
public yarnwrap.text.Style getStyleAt(yarnwrap.text.OrderedText text,int x) { return new yarnwrap.text.Style(wrapperContained.getStyleAt(text.wrapperContained,x)); }
// public static yarnwrap.text.Style getStyleAt(yarnwrap.text.OrderedText text,int x, ) { return new yarnwrap.text.Style(net.minecraft.client.font.TextHandler.getStyleAt(text.wrapperContained,x)); }
// public boolean method_30877(Object index,org.apache.commons.lang3.mutable.MutableObject style,int codePoint) { return wrapperContained.method_30877(index,style,codePoint); }
// public static boolean method_30877(Object index,org.apache.commons.lang3.mutable.MutableObject style,int codePoint, ) { return net.minecraft.client.font.TextHandler.method_30877(index,style,codePoint); }
// public void method_30878(java.util.List text,yarnwrap.text.StringVisitable lastLineWrapped) { wrapperContained.method_30878(text,lastLineWrapped.wrapperContained); }
// public static void method_30878(java.util.List text,yarnwrap.text.StringVisitable lastLineWrapped, ) { net.minecraft.client.font.TextHandler.method_30878(text,lastLineWrapped.wrapperContained); }
// public boolean method_30879(org.apache.commons.lang3.mutable.MutableFloat index,int style,yarnwrap.text.Style codePoint) { return wrapperContained.method_30879(index,style,codePoint.wrapperContained); }
// public static boolean method_30879(org.apache.commons.lang3.mutable.MutableFloat index,int style,yarnwrap.text.Style codePoint, ) { return net.minecraft.client.font.TextHandler.method_30879(index,style,codePoint.wrapperContained); }
// public void method_35713(java.util.List text,yarnwrap.text.StringVisitable lastLineWrapped) { wrapperContained.method_35713(text,lastLineWrapped.wrapperContained); }
// public static void method_35713(java.util.List text,yarnwrap.text.StringVisitable lastLineWrapped, ) { net.minecraft.client.font.TextHandler.method_35713(text,lastLineWrapped.wrapperContained); }
public java.util.List wrapLines(yarnwrap.text.StringVisitable text,int maxWidth,yarnwrap.text.Style style,yarnwrap.text.StringVisitable wrappedLinePrefix) { return wrapperContained.wrapLines(text.wrapperContained,maxWidth,style.wrapperContained,wrappedLinePrefix.wrapperContained); }
// public static java.util.List wrapLines(yarnwrap.text.StringVisitable text,int maxWidth,yarnwrap.text.Style style,yarnwrap.text.StringVisitable wrappedLinePrefix, ) { return net.minecraft.client.font.TextHandler.wrapLines(text.wrapperContained,maxWidth,style.wrapperContained,wrappedLinePrefix.wrapperContained); }
public int getLimitedStringLength(java.lang.String text,int maxWidth,yarnwrap.text.Style style) { return wrapperContained.getLimitedStringLength(text,maxWidth,style.wrapperContained); }
// public static int getLimitedStringLength(java.lang.String text,int maxWidth,yarnwrap.text.Style style, ) { return net.minecraft.client.font.TextHandler.getLimitedStringLength(text,maxWidth,style.wrapperContained); }
public java.lang.String limitString(java.lang.String text,int maxWidth,yarnwrap.text.Style style) { return wrapperContained.limitString(text,maxWidth,style.wrapperContained); }
// public static java.lang.String limitString(java.lang.String text,int maxWidth,yarnwrap.text.Style style, ) { return net.minecraft.client.font.TextHandler.limitString(text,maxWidth,style.wrapperContained); }
public int getEndingIndex(java.lang.String text,int maxWidth,yarnwrap.text.Style style) { return wrapperContained.getEndingIndex(text,maxWidth,style.wrapperContained); }
// public static int getEndingIndex(java.lang.String text,int maxWidth,yarnwrap.text.Style style, ) { return net.minecraft.client.font.TextHandler.getEndingIndex(text,maxWidth,style.wrapperContained); }

}