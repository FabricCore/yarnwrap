package yarnwrap.client.session.report.log;
public class ChatLogEntry { public net.minecraft.client.session.report.log.ChatLogEntry wrapperContained; public ChatLogEntry(net.minecraft.client.session.report.log.ChatLogEntry wrapperContained) { this.wrapperContained = wrapperContained; }

public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public Object getType() { return wrapperContained.getType(); }

}