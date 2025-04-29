package yarnwrap.resource;
public class Resource { public net.minecraft.resource.Resource wrapperContained; public Resource(net.minecraft.resource.Resource wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.InputSupplier inputSupplier() { return new yarnwrap.resource.InputSupplier(wrapperContained.inputSupplier); }
// public void inputSupplier(yarnwrap.resource.InputSupplier value) { wrapperContained.inputSupplier = value.wrapperContained; }
// public static yarnwrap.resource.InputSupplier inputSupplier() { return new yarnwrap.resource.InputSupplier(net.minecraft.resource.Resource.inputSupplier); }
// public static void inputSupplier(yarnwrap.resource.InputSupplier value, ) { net.minecraft.resource.Resource.inputSupplier = value.wrapperContained; }

// public yarnwrap.resource.InputSupplier metadataSupplier() { return new yarnwrap.resource.InputSupplier(wrapperContained.metadataSupplier); }
// public void metadataSupplier(yarnwrap.resource.InputSupplier value) { wrapperContained.metadataSupplier = value.wrapperContained; }
// public static yarnwrap.resource.InputSupplier metadataSupplier() { return new yarnwrap.resource.InputSupplier(net.minecraft.resource.Resource.metadataSupplier); }
// public static void metadataSupplier(yarnwrap.resource.InputSupplier value, ) { net.minecraft.resource.Resource.metadataSupplier = value.wrapperContained; }

// public yarnwrap.resource.metadata.ResourceMetadata metadata() { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.metadata); }
// public void metadata(yarnwrap.resource.metadata.ResourceMetadata value) { wrapperContained.metadata = value.wrapperContained; }
// public static yarnwrap.resource.metadata.ResourceMetadata metadata() { return new yarnwrap.resource.metadata.ResourceMetadata(net.minecraft.resource.Resource.metadata); }
// public static void metadata(yarnwrap.resource.metadata.ResourceMetadata value, ) { net.minecraft.resource.Resource.metadata = value.wrapperContained; }

// public yarnwrap.resource.ResourcePack pack() { return new yarnwrap.resource.ResourcePack(wrapperContained.pack); }
// public void pack(yarnwrap.resource.ResourcePack value) { wrapperContained.pack = value.wrapperContained; }
// public static yarnwrap.resource.ResourcePack pack() { return new yarnwrap.resource.ResourcePack(net.minecraft.resource.Resource.pack); }
// public static void pack(yarnwrap.resource.ResourcePack value, ) { net.minecraft.resource.Resource.pack = value.wrapperContained; }

public Resource(yarnwrap.resource.ResourcePack pack,yarnwrap.resource.InputSupplier inputSupplier) { this.wrapperContained = new net.minecraft.resource.Resource(pack.wrapperContained,inputSupplier.wrapperContained); }
public Resource(yarnwrap.resource.ResourcePack pack,yarnwrap.resource.InputSupplier inputSupplier,yarnwrap.resource.InputSupplier metadataSupplier) { this.wrapperContained = new net.minecraft.resource.Resource(pack.wrapperContained,inputSupplier.wrapperContained,metadataSupplier.wrapperContained); }
public java.lang.String getPackId() { return wrapperContained.getPackId(); }
// public static java.lang.String getPackId() { return net.minecraft.resource.Resource.getPackId(); }
// public yarnwrap.resource.metadata.ResourceMetadata getMetadata() { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.getMetadata()); }
// public static yarnwrap.resource.metadata.ResourceMetadata getMetadata() { return new yarnwrap.resource.metadata.ResourceMetadata(net.minecraft.resource.Resource.getMetadata()); }
// public java.io.InputStream getInputStream() { return wrapperContained.getInputStream(); }
// public static java.io.InputStream getInputStream() { return net.minecraft.resource.Resource.getInputStream(); }
// public java.io.BufferedReader getReader() { return wrapperContained.getReader(); }
// public static java.io.BufferedReader getReader() { return net.minecraft.resource.Resource.getReader(); }
public yarnwrap.resource.ResourcePack getPack() { return new yarnwrap.resource.ResourcePack(wrapperContained.getPack()); }
// public static yarnwrap.resource.ResourcePack getPack() { return new yarnwrap.resource.ResourcePack(net.minecraft.resource.Resource.getPack()); }
public java.util.Optional getKnownPackInfo() { return wrapperContained.getKnownPackInfo(); }
// public static java.util.Optional getKnownPackInfo() { return net.minecraft.resource.Resource.getKnownPackInfo(); }

}