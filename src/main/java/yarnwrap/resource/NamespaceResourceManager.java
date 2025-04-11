package yarnwrap.resource;
public class NamespaceResourceManager { public net.minecraft.resource.NamespaceResourceManager wrapperContained; public NamespaceResourceManager(net.minecraft.resource.NamespaceResourceManager wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List packList() { return wrapperContained.packList; }
// public void packList(java.util.List value) { wrapperContained.packList = value; }
// public yarnwrap.resource.ResourceType type() { return new yarnwrap.resource.ResourceType(wrapperContained.type); }
// public void type(yarnwrap.resource.ResourceType value) { wrapperContained.type = value.wrapperContained; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public java.lang.String namespace() { return wrapperContained.namespace; }
// public void namespace(java.lang.String value) { wrapperContained.namespace = value; }
public NamespaceResourceManager(yarnwrap.resource.ResourceType type,java.lang.String namespace) { this.wrapperContained = new net.minecraft.resource.NamespaceResourceManager(type.wrapperContained,namespace); }
// public yarnwrap.util.Identifier getMetadataPath(yarnwrap.util.Identifier id) { return new yarnwrap.util.Identifier(wrapperContained.getMetadataPath(id.wrapperContained)); }
public void addPack(yarnwrap.resource.ResourcePack pack) { wrapperContained.addPack(pack.wrapperContained); }
public void addPack(yarnwrap.resource.ResourcePack pack,java.util.function.Predicate filter) { wrapperContained.addPack(pack.wrapperContained,filter); }
// public yarnwrap.resource.ResourcePack method_41257(Object pack) { return new yarnwrap.resource.ResourcePack(wrapperContained.method_41257(pack)); }
// public void findAndAdd(Object pack,java.lang.String startingPath,java.util.function.Predicate allowedPathPredicate,java.util.Map idToEntryList) { wrapperContained.findAndAdd(pack,startingPath,allowedPathPredicate,idToEntryList); }
// public void applyFilter(Object pack,java.util.Map idToEntryList) { wrapperContained.applyFilter(pack,idToEntryList); }
// public void addPack(java.lang.String id,yarnwrap.resource.ResourcePack underlyingPack,java.util.function.Predicate filter) { wrapperContained.addPack(id,underlyingPack.wrapperContained,filter); }
public void addPack(java.lang.String id,java.util.function.Predicate filter) { wrapperContained.addPack(id,filter); }
// public yarnwrap.resource.InputSupplier createMetadataSupplier(yarnwrap.util.Identifier id,int index) { return new yarnwrap.resource.InputSupplier(wrapperContained.createMetadataSupplier(id.wrapperContained,index)); }
// public yarnwrap.resource.InputSupplier wrapForDebug(yarnwrap.util.Identifier id,yarnwrap.resource.ResourcePack pack,yarnwrap.resource.InputSupplier supplier) { return new yarnwrap.resource.InputSupplier(wrapperContained.wrapForDebug(id.wrapperContained,pack.wrapperContained,supplier.wrapperContained)); }
// public yarnwrap.resource.Resource createResource(yarnwrap.resource.ResourcePack pack,yarnwrap.util.Identifier id,yarnwrap.resource.InputSupplier supplier,yarnwrap.resource.InputSupplier metadataSupplier) { return new yarnwrap.resource.Resource(wrapperContained.createResource(pack.wrapperContained,id.wrapperContained,supplier.wrapperContained,metadataSupplier.wrapperContained)); }
// public yarnwrap.resource.InputSupplier getMetadataSupplier(yarnwrap.resource.InputSupplier supplier) { return new yarnwrap.resource.InputSupplier(wrapperContained.getMetadataSupplier(supplier.wrapperContained)); }
// public void method_45293(java.util.Map id,java.util.Map result) { wrapperContained.method_45293(id,result); }
// public void method_45294(java.util.function.Predicate id,java.util.Map supplier) { wrapperContained.method_45294(id,supplier); }
// public void method_45295(java.util.function.Predicate id,java.util.Map supplier) { wrapperContained.method_45295(id,supplier); }
// public boolean isMcmeta(yarnwrap.util.Identifier id) { return wrapperContained.isMcmeta(id.wrapperContained); }
// public yarnwrap.resource.metadata.ResourceMetadata loadMetadata(yarnwrap.resource.InputSupplier supplier) { return new yarnwrap.resource.metadata.ResourceMetadata(wrapperContained.loadMetadata(supplier.wrapperContained)); }
// public yarnwrap.util.Identifier getMetadataFileName(yarnwrap.util.Identifier id) { return new yarnwrap.util.Identifier(wrapperContained.getMetadataFileName(id.wrapperContained)); }

}