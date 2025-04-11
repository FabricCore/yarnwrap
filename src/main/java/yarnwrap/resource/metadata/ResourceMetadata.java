package yarnwrap.resource.metadata;
public class ResourceMetadata { public net.minecraft.resource.metadata.ResourceMetadata wrapperContained; public ResourceMetadata(net.minecraft.resource.metadata.ResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.resource.metadata.ResourceMetadata NONE() { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.NONE); }
// public void NONE(yarnwrap.resource.metadata.ResourceMetadata value) { wrapperContained.NONE = value.wrapperContained; }
public yarnwrap.resource.InputSupplier NONE_SUPPLIER() { return new yarnwrap.resource.InputSupplier(wrapperContained.NONE_SUPPLIER); }
// public void NONE_SUPPLIER(yarnwrap.resource.InputSupplier value) { wrapperContained.NONE_SUPPLIER = value.wrapperContained; }
public java.util.Optional decode(yarnwrap.resource.metadata.ResourceMetadataReader reader) { return wrapperContained.decode(reader.wrapperContained); }
// public yarnwrap.resource.metadata.ResourceMetadata create(java.io.InputStream stream) { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.create(stream)); }
// public void decodeAndAdd(Object builder,yarnwrap.resource.metadata.ResourceMetadataReader reader) { wrapperContained.decodeAndAdd(builder,reader.wrapperContained); }
// public void method_52445(Object value) { wrapperContained.method_52445(value); }
public yarnwrap.resource.metadata.ResourceMetadata copy(java.util.Collection readers) { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.copy(readers)); }

}