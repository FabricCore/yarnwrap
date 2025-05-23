package yarnwrap.resource.metadata;
public class ResourceMetadata { public net.minecraft.resource.metadata.ResourceMetadata wrapperContained; public ResourceMetadata(net.minecraft.resource.metadata.ResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.metadata.ResourceMetadata NONE() { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.NONE); }
// public void NONE(yarnwrap.resource.metadata.ResourceMetadata value) { wrapperContained.NONE = value.wrapperContained; }
public static yarnwrap.resource.metadata.ResourceMetadata NONE() { return new yarnwrap.resource.metadata.ResourceMetadata(net.minecraft.resource.metadata.ResourceMetadata.NONE); }
// public static void NONE(yarnwrap.resource.metadata.ResourceMetadata value, ) { net.minecraft.resource.metadata.ResourceMetadata.NONE = value.wrapperContained; }

// public yarnwrap.resource.InputSupplier NONE_SUPPLIER() { return new yarnwrap.resource.InputSupplier(wrapperContained.NONE_SUPPLIER); }
// public void NONE_SUPPLIER(yarnwrap.resource.InputSupplier value) { wrapperContained.NONE_SUPPLIER = value.wrapperContained; }
public static yarnwrap.resource.InputSupplier NONE_SUPPLIER() { return new yarnwrap.resource.InputSupplier(net.minecraft.resource.metadata.ResourceMetadata.NONE_SUPPLIER); }
// public static void NONE_SUPPLIER(yarnwrap.resource.InputSupplier value, ) { net.minecraft.resource.metadata.ResourceMetadata.NONE_SUPPLIER = value.wrapperContained; }

public java.util.Optional decode(yarnwrap.resource.metadata.ResourceMetadataSerializer serializer) { return wrapperContained.decode(serializer.wrapperContained); }
// public static java.util.Optional decode(yarnwrap.resource.metadata.ResourceMetadataSerializer serializer, ) { return net.minecraft.resource.metadata.ResourceMetadata.decode(serializer.wrapperContained); }
// public yarnwrap.resource.metadata.ResourceMetadata create(java.io.InputStream stream) { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.create(stream)); }
// public static yarnwrap.resource.metadata.ResourceMetadata create(java.io.InputStream stream, ) { return new yarnwrap.resource.metadata.ResourceMetadata(net.minecraft.resource.metadata.ResourceMetadata.create(stream)); }
// public void decodeAndAdd(Object builder,yarnwrap.resource.metadata.ResourceMetadataSerializer serializer) { wrapperContained.decodeAndAdd(builder,serializer.wrapperContained); }
// public static void decodeAndAdd(Object builder,yarnwrap.resource.metadata.ResourceMetadataSerializer serializer, ) { net.minecraft.resource.metadata.ResourceMetadata.decodeAndAdd(builder,serializer.wrapperContained); }
// public void method_52445(Object value) { wrapperContained.method_52445(value); }
// public static void method_52445(Object value, ) { net.minecraft.resource.metadata.ResourceMetadata.method_52445(value); }
public yarnwrap.resource.metadata.ResourceMetadata copy(java.util.Collection serializers) { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.copy(serializers)); }
// public static yarnwrap.resource.metadata.ResourceMetadata copy(java.util.Collection serializers, ) { return new yarnwrap.resource.metadata.ResourceMetadata(net.minecraft.resource.metadata.ResourceMetadata.copy(serializers)); }

}