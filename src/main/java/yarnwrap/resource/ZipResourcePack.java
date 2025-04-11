package yarnwrap.resource;
public class ZipResourcePack { public net.minecraft.resource.ZipResourcePack wrapperContained; public ZipResourcePack(net.minecraft.resource.ZipResourcePack wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public Object zipFile() { return wrapperContained.zipFile; }
// // public void zipFile(Object value) { wrapperContained.zipFile = value; }
// public java.lang.String overlay() { return wrapperContained.overlay; }
// public void overlay(java.lang.String value) { wrapperContained.overlay = value; }
// public yarnwrap.resource.InputSupplier openFile(java.lang.String path) { return new yarnwrap.resource.InputSupplier(wrapperContained.openFile(path)); }
// public java.lang.String toPath(yarnwrap.resource.ResourceType type,yarnwrap.util.Identifier id) { return wrapperContained.toPath(type.wrapperContained,id.wrapperContained); }
// public java.lang.String appendOverlayPrefix(java.lang.String path) { return wrapperContained.appendOverlayPrefix(path); }
public java.lang.String getNamespace(java.lang.String prefix,java.lang.String entryName) { return wrapperContained.getNamespace(prefix,entryName); }

}