package yarnwrap.network.message;
public class LastSeenMessageList { public net.minecraft.network.message.LastSeenMessageList wrapperContained; public LastSeenMessageList(net.minecraft.network.message.LastSeenMessageList wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.network.message.LastSeenMessageList EMPTY() { return new yarnwrap.network.message.LastSeenMessageList(wrapperContained.EMPTY); }
public void EMPTY(yarnwrap.network.message.LastSeenMessageList value) { wrapperContained.EMPTY = value.wrapperContained; }
public int MAX_ENTRIES() { return wrapperContained.MAX_ENTRIES; }
// public void MAX_ENTRIES(int value) { wrapperContained.MAX_ENTRIES = value; }
public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
// public void updateSignatures(Object updater) { wrapperContained.updateSignatures(updater); }
public Object pack(yarnwrap.network.message.MessageSignatureStorage storage) { return wrapperContained.pack(storage.wrapperContained); }
// public Object method_46259(yarnwrap.network.message.MessageSignatureStorage signature) { return wrapperContained.method_46259(signature.wrapperContained); }

}