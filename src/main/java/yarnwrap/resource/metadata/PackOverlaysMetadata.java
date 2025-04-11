package yarnwrap.resource.metadata;
public class PackOverlaysMetadata { public net.minecraft.resource.metadata.PackOverlaysMetadata wrapperContained; public PackOverlaysMetadata(net.minecraft.resource.metadata.PackOverlaysMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.resource.metadata.ResourceMetadataSerializer SERIALIZER() { return new yarnwrap.resource.metadata.ResourceMetadataSerializer(wrapperContained.SERIALIZER); }
// public void SERIALIZER(yarnwrap.resource.metadata.ResourceMetadataSerializer value) { wrapperContained.SERIALIZER = value.wrapperContained; }
// public java.util.regex.Pattern DIRECTORY_NAME_PATTERN() { return wrapperContained.DIRECTORY_NAME_PATTERN; }
// public void DIRECTORY_NAME_PATTERN(java.util.regex.Pattern value) { wrapperContained.DIRECTORY_NAME_PATTERN = value; }
// public com.mojang.serialization.Codec CODEC() { return wrapperContained.CODEC; }
// public void CODEC(com.mojang.serialization.Codec value) { wrapperContained.CODEC = value; }
public java.util.List getAppliedOverlays(int packFormat) { return wrapperContained.getAppliedOverlays(packFormat); }
// public com.mojang.serialization.DataResult validate(java.lang.String directoryName) { return wrapperContained.validate(directoryName); }

}