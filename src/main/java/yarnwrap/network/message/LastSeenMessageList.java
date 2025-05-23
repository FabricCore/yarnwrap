package yarnwrap.network.message;
public class LastSeenMessageList { public net.minecraft.network.message.LastSeenMessageList wrapperContained; public LastSeenMessageList(net.minecraft.network.message.LastSeenMessageList wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.network.message.LastSeenMessageList EMPTY() { return new yarnwrap.network.message.LastSeenMessageList(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.network.message.LastSeenMessageList value) { wrapperContained.EMPTY = value.wrapperContained; }
public static yarnwrap.network.message.LastSeenMessageList EMPTY() { return new yarnwrap.network.message.LastSeenMessageList(net.minecraft.network.message.LastSeenMessageList.EMPTY); }
// public static void EMPTY(yarnwrap.network.message.LastSeenMessageList value, ) { net.minecraft.network.message.LastSeenMessageList.EMPTY = value.wrapperContained; }

// public int MAX_ENTRIES() { return wrapperContained.MAX_ENTRIES; }
// public void MAX_ENTRIES(int value) { wrapperContained.MAX_ENTRIES = value; }
public static int MAX_ENTRIES() { return net.minecraft.network.message.LastSeenMessageList.MAX_ENTRIES; }
// public static void MAX_ENTRIES(int value, ) { net.minecraft.network.message.LastSeenMessageList.MAX_ENTRIES = value; }

// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public static com.mojang.serialization.Codec CODEC() { return net.minecraft.network.message.LastSeenMessageList.CODEC; }
// public static void CODEC(com.mojang.serialization.Codec value, ) { net.minecraft.network.message.LastSeenMessageList.CODEC = value; }

// public void updateSignatures(Object updater) { wrapperContained.updateSignatures(updater); }
// public static void updateSignatures(Object updater, ) { net.minecraft.network.message.LastSeenMessageList.updateSignatures(updater); }
public Object pack(yarnwrap.network.message.MessageSignatureStorage storage) { return wrapperContained.pack(storage.wrapperContained); }
// public static Object pack(yarnwrap.network.message.MessageSignatureStorage storage, ) { return net.minecraft.network.message.LastSeenMessageList.pack(storage.wrapperContained); }
// public Object method_46259(yarnwrap.network.message.MessageSignatureStorage signature) { return wrapperContained.method_46259(signature.wrapperContained); }
// public static Object method_46259(yarnwrap.network.message.MessageSignatureStorage signature, ) { return net.minecraft.network.message.LastSeenMessageList.method_46259(signature.wrapperContained); }
public byte calculateChecksum() { return wrapperContained.calculateChecksum(); }
// public static byte calculateChecksum() { return net.minecraft.network.message.LastSeenMessageList.calculateChecksum(); }

}