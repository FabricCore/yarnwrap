package yarnwrap.client.session.report.log;
public class ChatLog { public net.minecraft.client.session.report.log.ChatLog wrapperContained; public ChatLog(net.minecraft.client.session.report.log.ChatLog wrapperContained) { this.wrapperContained = wrapperContained; }

// public net.minecraft.client.session.report.log.ChatLogEntry[] entries() { return wrapperContained.entries; }
// public void entries(net.minecraft.client.session.report.log.ChatLogEntry[] value) { wrapperContained.entries = value; }
// public int currentIndex() { return wrapperContained.currentIndex; }
// public void currentIndex(int value) { wrapperContained.currentIndex = value; }
public yarnwrap.client.session.report.log.ChatLogEntry get(int index) { return new yarnwrap.client.session.report.log.ChatLogEntry(wrapperContained.get(index)); }
public void add(yarnwrap.client.session.report.log.ChatLogEntry entry) { wrapperContained.add(entry.wrapperContained); }
public int getMinIndex() { return wrapperContained.getMinIndex(); }
public int getMaxIndex() { return wrapperContained.getMaxIndex(); }
// public int wrapIndex(int index) { return wrapperContained.wrapIndex(index); }
public com.mojang.serialization.Codec createCodec(int maxSize) { return wrapperContained.createCodec(maxSize); }
// public java.util.List toList() { return wrapperContained.toList(); }
// public int size() { return wrapperContained.size(); }

}