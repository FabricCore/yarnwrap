package yarnwrap.resource.metadata;
public class ResourceMetadata { public net.minecraft.resource.metadata.ResourceMetadata wrapperContained; public ResourceMetadata(net.minecraft.resource.metadata.ResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.resource.metadata.ResourceMetadata NONE() { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.NONE); }
public yarnwrap.resource.InputSupplier NONE_SUPPLIER() { return new yarnwrap.resource.InputSupplier(wrapperContained.NONE_SUPPLIER); }
public java.util.Optional decode(yarnwrap.resource.metadata.ResourceMetadataReader reader) { return wrapperContained.decode(reader.wrapperContained); }
// public yarnwrap.resource.metadata.ResourceMetadata create(java.io.InputStream stream) { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.create(stream)); }
// public void decodeAndAdd(Object builder,yarnwrap.resource.metadata.ResourceMetadataReader reader) { wrapperContained.decodeAndAdd(builder,reader.wrapperContained); }
public yarnwrap.resource.metadata.ResourceMetadata copy(java.util.Collection readers) { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.copy(readers)); }

}