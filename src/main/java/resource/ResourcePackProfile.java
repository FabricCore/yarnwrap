package yarnwrap.resource;
public class ResourcePackProfile { public net.minecraft.resource.ResourcePackProfile wrapperContained; public ResourcePackProfile(net.minecraft.resource.ResourcePackProfile wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object packFactory() { return wrapperContained.packFactory; }
// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.resource.ResourcePackInfo info() { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.info); }
// public Object metaData() { return wrapperContained.metaData; }
// public yarnwrap.resource.ResourcePackPosition position() { return new yarnwrap.resource.ResourcePackPosition(wrapperContained.position); }
public yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(wrapperContained.getDisplayName()); }
public yarnwrap.resource.ResourcePack createResourcePack() { return new yarnwrap.resource.ResourcePack(wrapperContained.createResourcePack()); }
public yarnwrap.text.Text getDescription() { return new yarnwrap.text.Text(wrapperContained.getDescription()); }
public yarnwrap.resource.ResourcePackCompatibility getCompatibility() { return new yarnwrap.resource.ResourcePackCompatibility(wrapperContained.getCompatibility()); }
public yarnwrap.text.Text getInformationText(boolean enabled) { return new yarnwrap.text.Text(wrapperContained.getInformationText(enabled)); }
public java.lang.String getId() { return wrapperContained.getId(); }
public boolean isRequired() { return wrapperContained.isRequired(); }
public boolean isPinned() { return wrapperContained.isPinned(); }
public Object getInitialPosition() { return wrapperContained.getInitialPosition(); }
public yarnwrap.resource.ResourcePackSource getSource() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.getSource()); }
// public Object loadMetadata(yarnwrap.resource.ResourcePackInfo info,Object packFactory,int currentPackFormat) { return wrapperContained.loadMetadata(info.wrapperContained,packFactory,currentPackFormat); }
// public yarnwrap.resource.ResourcePackProfile create(yarnwrap.resource.ResourcePackInfo info,Object packFactory,yarnwrap.resource.ResourceType type,yarnwrap.resource.ResourcePackPosition position) { return new yarnwrap.resource.ResourcePackProfile(wrapperContained.create(info.wrapperContained,packFactory,type.wrapperContained,position.wrapperContained)); }
public yarnwrap.resource.featuretoggle.FeatureSet getRequestedFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.getRequestedFeatures()); }
// public yarnwrap.util.dynamic.Range getSupportedFormats(java.lang.String packId,yarnwrap.resource.metadata.PackResourceMetadata metadata) { return new yarnwrap.util.dynamic.Range(wrapperContained.getSupportedFormats(packId,metadata.wrapperContained)); }
public yarnwrap.resource.ResourcePackInfo getInfo() { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.getInfo()); }
public yarnwrap.resource.ResourcePackPosition getPosition() { return new yarnwrap.resource.ResourcePackPosition(wrapperContained.getPosition()); }

}