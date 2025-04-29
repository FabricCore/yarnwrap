package yarnwrap.network.message;
public class MessageSignatureStorage { public net.minecraft.network.message.MessageSignatureStorage wrapperContained; public MessageSignatureStorage(net.minecraft.network.message.MessageSignatureStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_ENTRIES() { return wrapperContained.MAX_ENTRIES; }
// public void MAX_ENTRIES(int value) { wrapperContained.MAX_ENTRIES = value; }
// public static int MAX_ENTRIES() { return net.minecraft.network.message.MessageSignatureStorage.MAX_ENTRIES; }
// public static void MAX_ENTRIES(int value, ) { net.minecraft.network.message.MessageSignatureStorage.MAX_ENTRIES = value; }

// public net.minecraft.network.message.MessageSignatureData[] signatures() { return wrapperContained.signatures; }
// public void signatures(net.minecraft.network.message.MessageSignatureData[] value) { wrapperContained.signatures = value; }
// public static net.minecraft.network.message.MessageSignatureData[] signatures() { return net.minecraft.network.message.MessageSignatureStorage.signatures; }
// public static void signatures(net.minecraft.network.message.MessageSignatureData[] value, ) { net.minecraft.network.message.MessageSignatureStorage.signatures = value; }

// public int MISSING() { return wrapperContained.MISSING; }
// public void MISSING(int value) { wrapperContained.MISSING = value; }
public static int MISSING() { return net.minecraft.network.message.MessageSignatureStorage.MISSING; }
// public static void MISSING(int value, ) { net.minecraft.network.message.MessageSignatureStorage.MISSING = value; }

public MessageSignatureStorage(int maxEntries) { this.wrapperContained = new net.minecraft.network.message.MessageSignatureStorage(maxEntries); }
// public yarnwrap.network.message.MessageSignatureStorage create() { return new yarnwrap.network.message.MessageSignatureStorage(wrapperContained.create()); }
public static yarnwrap.network.message.MessageSignatureStorage create() { return new yarnwrap.network.message.MessageSignatureStorage(net.minecraft.network.message.MessageSignatureStorage.create()); }
// public void addFrom(java.util.ArrayDeque deque) { wrapperContained.addFrom(deque); }
// public static void addFrom(java.util.ArrayDeque deque, ) { net.minecraft.network.message.MessageSignatureStorage.addFrom(deque); }
// public void addFrom(java.util.List signatures) { wrapperContained.addFrom(signatures); }
// public static void addFrom(java.util.List signatures, ) { net.minecraft.network.message.MessageSignatureStorage.addFrom(signatures); }
public void add(yarnwrap.network.message.MessageBody body,yarnwrap.network.message.MessageSignatureData signature) { wrapperContained.add(body.wrapperContained,signature.wrapperContained); }
// public static void add(yarnwrap.network.message.MessageBody body,yarnwrap.network.message.MessageSignatureData signature, ) { net.minecraft.network.message.MessageSignatureStorage.add(body.wrapperContained,signature.wrapperContained); }
public yarnwrap.network.message.MessageSignatureData get(int index) { return new yarnwrap.network.message.MessageSignatureData(wrapperContained.get(index)); }
// public static yarnwrap.network.message.MessageSignatureData get(int index, ) { return new yarnwrap.network.message.MessageSignatureData(net.minecraft.network.message.MessageSignatureStorage.get(index)); }
public int indexOf(yarnwrap.network.message.MessageSignatureData signature) { return wrapperContained.indexOf(signature.wrapperContained); }
// public static int indexOf(yarnwrap.network.message.MessageSignatureData signature, ) { return net.minecraft.network.message.MessageSignatureStorage.indexOf(signature.wrapperContained); }

}