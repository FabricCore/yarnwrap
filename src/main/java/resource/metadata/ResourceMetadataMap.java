package yarnwrap.resource.metadata;
public class ResourceMetadataMap { public net.minecraft.resource.metadata.ResourceMetadataMap wrapperContained; public ResourceMetadataMap(net.minecraft.resource.metadata.ResourceMetadataMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.metadata.ResourceMetadataMap EMPTY() { return new yarnwrap.resource.metadata.ResourceMetadataMap(wrapperContained.EMPTY); }
// public java.util.Map values() { return wrapperContained.values; }
public yarnwrap.resource.metadata.ResourceMetadataMap of() { return new yarnwrap.resource.metadata.ResourceMetadataMap(wrapperContained.of()); }
public java.lang.Object get(yarnwrap.resource.metadata.ResourceMetadataReader reader) { return wrapperContained.get(reader.wrapperContained); }
public yarnwrap.resource.metadata.ResourceMetadataMap of(yarnwrap.resource.metadata.ResourceMetadataReader reader,java.lang.Object value) { return new yarnwrap.resource.metadata.ResourceMetadataMap(wrapperContained.of(reader.wrapperContained,value)); }
public yarnwrap.resource.metadata.ResourceMetadataMap of(yarnwrap.resource.metadata.ResourceMetadataReader reader,java.lang.Object value,yarnwrap.resource.metadata.ResourceMetadataReader reader2,java.lang.Object value2) { return new yarnwrap.resource.metadata.ResourceMetadataMap(wrapperContained.of(reader.wrapperContained,value,reader2.wrapperContained,value2)); }

}