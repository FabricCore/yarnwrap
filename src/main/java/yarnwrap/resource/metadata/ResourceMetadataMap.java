package yarnwrap.resource.metadata;
public class ResourceMetadataMap { public net.minecraft.resource.metadata.ResourceMetadataMap wrapperContained; public ResourceMetadataMap(net.minecraft.resource.metadata.ResourceMetadataMap wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.resource.metadata.ResourceMetadataMap EMPTY() { return new yarnwrap.resource.metadata.ResourceMetadataMap(wrapperContained.EMPTY); }
// public void EMPTY(yarnwrap.resource.metadata.ResourceMetadataMap value) { wrapperContained.EMPTY = value.wrapperContained; }
// public static yarnwrap.resource.metadata.ResourceMetadataMap EMPTY() { return new yarnwrap.resource.metadata.ResourceMetadataMap(net.minecraft.resource.metadata.ResourceMetadataMap.EMPTY); }
// public static void EMPTY(yarnwrap.resource.metadata.ResourceMetadataMap value, ) { net.minecraft.resource.metadata.ResourceMetadataMap.EMPTY = value.wrapperContained; }

// public java.util.Map values() { return wrapperContained.values; }
// public void values(java.util.Map value) { wrapperContained.values = value; }
// public static java.util.Map values() { return net.minecraft.resource.metadata.ResourceMetadataMap.values; }
// public static void values(java.util.Map value, ) { net.minecraft.resource.metadata.ResourceMetadataMap.values = value; }

// public ResourceMetadataMap(java.util.Map values) { this.wrapperContained = new net.minecraft.resource.metadata.ResourceMetadataMap(values); }
// public yarnwrap.resource.metadata.ResourceMetadataMap of() { return new yarnwrap.resource.metadata.ResourceMetadataMap(wrapperContained.of()); }
public static yarnwrap.resource.metadata.ResourceMetadataMap of() { return new yarnwrap.resource.metadata.ResourceMetadataMap(net.minecraft.resource.metadata.ResourceMetadataMap.of()); }
public java.lang.Object get(yarnwrap.resource.metadata.ResourceMetadataSerializer serializer) { return wrapperContained.get(serializer.wrapperContained); }
// public static java.lang.Object get(yarnwrap.resource.metadata.ResourceMetadataSerializer serializer, ) { return net.minecraft.resource.metadata.ResourceMetadataMap.get(serializer.wrapperContained); }
// public yarnwrap.resource.metadata.ResourceMetadataMap of(yarnwrap.resource.metadata.ResourceMetadataSerializer serializer,java.lang.Object value) { return new yarnwrap.resource.metadata.ResourceMetadataMap(wrapperContained.of(serializer.wrapperContained,value)); }
// public static yarnwrap.resource.metadata.ResourceMetadataMap of(yarnwrap.resource.metadata.ResourceMetadataSerializer serializer,java.lang.Object value, ) { return new yarnwrap.resource.metadata.ResourceMetadataMap(net.minecraft.resource.metadata.ResourceMetadataMap.of(serializer.wrapperContained,value)); }
// public yarnwrap.resource.metadata.ResourceMetadataMap of(yarnwrap.resource.metadata.ResourceMetadataSerializer serializer,java.lang.Object value,yarnwrap.resource.metadata.ResourceMetadataSerializer serializer2,java.lang.Object value2) { return new yarnwrap.resource.metadata.ResourceMetadataMap(wrapperContained.of(serializer.wrapperContained,value,serializer2.wrapperContained,value2)); }
// public static yarnwrap.resource.metadata.ResourceMetadataMap of(yarnwrap.resource.metadata.ResourceMetadataSerializer serializer,java.lang.Object value,yarnwrap.resource.metadata.ResourceMetadataSerializer serializer2,java.lang.Object value2, ) { return new yarnwrap.resource.metadata.ResourceMetadataMap(net.minecraft.resource.metadata.ResourceMetadataMap.of(serializer.wrapperContained,value,serializer2.wrapperContained,value2)); }

}