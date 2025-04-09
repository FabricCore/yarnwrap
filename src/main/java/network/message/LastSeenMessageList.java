package yarnwrap.network.message;
public class LastSeenMessageList { public net.minecraft.network.message.LastSeenMessageList wrapperContained; public LastSeenMessageList(net.minecraft.network.message.LastSeenMessageList wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.message.LastSeenMessageList EMPTY() { return new yarnwrap.network.message.LastSeenMessageList(wrapperContained.EMPTY); }
public int MAX_ENTRIES() { return wrapperContained.MAX_ENTRIES; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void updateSignatures(Object updater) { wrapperContained.updateSignatures(updater); }
public Object pack(yarnwrap.network.message.MessageSignatureStorage storage) { return wrapperContained.pack(storage.wrapperContained); }

}