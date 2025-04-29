package yarnwrap.client.resource;
public class ResourceIndex { public net.minecraft.client.resource.ResourceIndex wrapperContained; public ResourceIndex(net.minecraft.client.resource.ResourceIndex wrapperContained) { this.wrapperContained = wrapperContained; }

// public com.google.common.base.Splitter SEPARATOR_SPLITTER() { return wrapperContained.SEPARATOR_SPLITTER; }
// public void SEPARATOR_SPLITTER(com.google.common.base.Splitter value) { wrapperContained.SEPARATOR_SPLITTER = value; }
public static com.google.common.base.Splitter SEPARATOR_SPLITTER() { return net.minecraft.client.resource.ResourceIndex.SEPARATOR_SPLITTER; }
// public static void SEPARATOR_SPLITTER(com.google.common.base.Splitter value, ) { net.minecraft.client.resource.ResourceIndex.SEPARATOR_SPLITTER = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.resource.ResourceIndex.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.resource.ResourceIndex.LOGGER = value; }

// public java.nio.file.Path buildFileSystem(java.nio.file.Path assetsDir,java.lang.String indexName) { return wrapperContained.buildFileSystem(assetsDir,indexName); }
// public static java.nio.file.Path buildFileSystem(java.nio.file.Path assetsDir,java.lang.String indexName, ) { return net.minecraft.client.resource.ResourceIndex.buildFileSystem(assetsDir,indexName); }

}