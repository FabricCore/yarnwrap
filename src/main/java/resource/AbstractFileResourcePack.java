package yarnwrap.resource;
public class AbstractFileResourcePack { public net.minecraft.resource.AbstractFileResourcePack wrapperContained; public AbstractFileResourcePack(net.minecraft.resource.AbstractFileResourcePack wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.resource.ResourcePackInfo info() { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.info); }
public java.lang.Object parseMetadata(yarnwrap.resource.metadata.ResourceMetadataReader metaReader,java.io.InputStream inputStream) { return wrapperContained.parseMetadata(metaReader.wrapperContained,inputStream); }

}