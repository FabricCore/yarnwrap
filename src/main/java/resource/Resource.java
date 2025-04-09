package yarnwrap.resource;
public class Resource { public net.minecraft.resource.Resource wrapperContained; public Resource(net.minecraft.resource.Resource wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.InputSupplier inputSupplier() { return new yarnwrap.resource.InputSupplier(wrapperContained.inputSupplier); }
// public yarnwrap.resource.InputSupplier metadataSupplier() { return new yarnwrap.resource.InputSupplier(wrapperContained.metadataSupplier); }
// public yarnwrap.resource.metadata.ResourceMetadata metadata() { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.metadata); }
// public yarnwrap.resource.ResourcePack pack() { return new yarnwrap.resource.ResourcePack(wrapperContained.pack); }
public java.lang.String getPackId() { return wrapperContained.getPackId(); }
// public yarnwrap.resource.metadata.ResourceMetadata getMetadata() { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.getMetadata()); }
// public java.io.InputStream getInputStream() { return wrapperContained.getInputStream(); }
// public java.io.BufferedReader getReader() { return wrapperContained.getReader(); }
public yarnwrap.resource.ResourcePack getPack() { return new yarnwrap.resource.ResourcePack(wrapperContained.getPack()); }
public java.util.Optional getKnownPackInfo() { return wrapperContained.getKnownPackInfo(); }

}