package yarnwrap.client.session.report.log;
public class ChatLog { public net.minecraft.client.session.report.log.ChatLog wrapperContained; public ChatLog(net.minecraft.client.session.report.log.ChatLog wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.client.session.report.log.ChatLogEntry[] entries() { return wrapperContained.entries; }
// public void entries(net.minecraft.client.session.report.log.ChatLogEntry[] value) { wrapperContained.entries = value; }
// public static net.minecraft.client.session.report.log.ChatLogEntry[] entries() { return net.minecraft.client.session.report.log.ChatLog.entries; }
// public static void entries(net.minecraft.client.session.report.log.ChatLogEntry[] value, ) { net.minecraft.client.session.report.log.ChatLog.entries = value; }

// public int currentIndex() { return wrapperContained.currentIndex; }
// public void currentIndex(int value) { wrapperContained.currentIndex = value; }
// public static int currentIndex() { return net.minecraft.client.session.report.log.ChatLog.currentIndex; }
// public static void currentIndex(int value, ) { net.minecraft.client.session.report.log.ChatLog.currentIndex = value; }

public ChatLog(int maxSize) { this.wrapperContained = new net.minecraft.client.session.report.log.ChatLog(maxSize); }
// public ChatLog(int size,java.util.List entries) { this.wrapperContained = new net.minecraft.client.session.report.log.ChatLog(size,entries); }
public yarnwrap.client.session.report.log.ChatLogEntry get(int index) { return new yarnwrap.client.session.report.log.ChatLogEntry(wrapperContained.get(index)); }
// public static yarnwrap.client.session.report.log.ChatLogEntry get(int index, ) { return new yarnwrap.client.session.report.log.ChatLogEntry(net.minecraft.client.session.report.log.ChatLog.get(index)); }
public void add(yarnwrap.client.session.report.log.ChatLogEntry entry) { wrapperContained.add(entry.wrapperContained); }
// public static void add(yarnwrap.client.session.report.log.ChatLogEntry entry, ) { net.minecraft.client.session.report.log.ChatLog.add(entry.wrapperContained); }
public int getMinIndex() { return wrapperContained.getMinIndex(); }
// public static int getMinIndex() { return net.minecraft.client.session.report.log.ChatLog.getMinIndex(); }
public int getMaxIndex() { return wrapperContained.getMaxIndex(); }
// public static int getMaxIndex() { return net.minecraft.client.session.report.log.ChatLog.getMaxIndex(); }
// public int wrapIndex(int index) { return wrapperContained.wrapIndex(index); }
// public static int wrapIndex(int index, ) { return net.minecraft.client.session.report.log.ChatLog.wrapIndex(index); }
// public com.mojang.serialization.Codec createCodec(int maxSize) { return wrapperContained.createCodec(maxSize); }
// public static com.mojang.serialization.Codec createCodec(int maxSize, ) { return net.minecraft.client.session.report.log.ChatLog.createCodec(maxSize); }
// public net.minecraft.client.session.report.log.ChatLogEntry[] method_46534(int currentIndex) { return wrapperContained.method_46534(currentIndex); }
// public static net.minecraft.client.session.report.log.ChatLogEntry[] method_46534(int currentIndex, ) { return net.minecraft.client.session.report.log.ChatLog.method_46534(currentIndex); }
// public com.mojang.serialization.DataResult method_46535(int entries) { return wrapperContained.method_46535(entries); }
// public static com.mojang.serialization.DataResult method_46535(int entries, ) { return net.minecraft.client.session.report.log.ChatLog.method_46535(entries); }
// public java.util.List toList() { return wrapperContained.toList(); }
// public static java.util.List toList() { return net.minecraft.client.session.report.log.ChatLog.toList(); }
// public int size() { return wrapperContained.size(); }
// public static int size() { return net.minecraft.client.session.report.log.ChatLog.size(); }

}