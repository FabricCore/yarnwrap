package yarnwrap.resource;
public class AbstractFileResourcePack { public net.minecraft.resource.AbstractFileResourcePack wrapperContained; public AbstractFileResourcePack(net.minecraft.resource.AbstractFileResourcePack wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.resource.ResourcePackInfo info() { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.info); }
// public void info(yarnwrap.resource.ResourcePackInfo value) { wrapperContained.info = value.wrapperContained; }
// public AbstractFileResourcePack(yarnwrap.resource.ResourcePackInfo info) { this.wrapperContained = new net.minecraft.resource.AbstractFileResourcePack(info.wrapperContained); }
public java.lang.Object parseMetadata(yarnwrap.resource.metadata.ResourceMetadataReader metaReader,java.io.InputStream inputStream) { return wrapperContained.parseMetadata(metaReader.wrapperContained,inputStream); }

}