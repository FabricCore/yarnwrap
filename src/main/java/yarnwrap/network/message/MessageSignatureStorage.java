package yarnwrap.network.message;
public class MessageSignatureStorage { public net.minecraft.network.message.MessageSignatureStorage wrapperContained; public MessageSignatureStorage(net.minecraft.network.message.MessageSignatureStorage wrapperContained) { this.wrapperContained = wrapperContained; }

// public int MAX_ENTRIES() { return wrapperContained.MAX_ENTRIES; }
// public void MAX_ENTRIES(int value) { wrapperContained.MAX_ENTRIES = value; }
// public net.minecraft.network.message.MessageSignatureData[] signatures() { return wrapperContained.signatures; }
// public void signatures(net.minecraft.network.message.MessageSignatureData[] value) { wrapperContained.signatures = value; }
public int MISSING() { return wrapperContained.MISSING; }
// public void MISSING(int value) { wrapperContained.MISSING = value; }
public yarnwrap.network.message.MessageSignatureStorage create() { return new yarnwrap.network.message.MessageSignatureStorage(wrapperContained.create()); }
// public void addFrom(java.util.ArrayDeque deque) { wrapperContained.addFrom(deque); }
// public void addFrom(java.util.List signatures) { wrapperContained.addFrom(signatures); }
public void add(yarnwrap.network.message.MessageBody body,yarnwrap.network.message.MessageSignatureData signature) { wrapperContained.add(body.wrapperContained,signature.wrapperContained); }
public yarnwrap.network.message.MessageSignatureData get(int index) { return new yarnwrap.network.message.MessageSignatureData(wrapperContained.get(index)); }
public int indexOf(yarnwrap.network.message.MessageSignatureData signature) { return wrapperContained.indexOf(signature.wrapperContained); }

}