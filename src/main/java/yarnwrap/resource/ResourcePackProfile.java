package yarnwrap.resource;
public class ResourcePackProfile { public net.minecraft.resource.ResourcePackProfile wrapperContained; public ResourcePackProfile(net.minecraft.resource.ResourcePackProfile wrapperContained) { this.wrapperContained = wrapperContained; }

// public Object packFactory() { return wrapperContained.packFactory; }
// // public void packFactory(Object value) { wrapperContained.packFactory = value; }
// // public static Object packFactory() { return net.minecraft.resource.ResourcePackProfile.packFactory; }
// // public static void packFactory(Object value, ) { net.minecraft.resource.ResourcePackProfile.packFactory = value; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.resource.ResourcePackProfile.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.resource.ResourcePackProfile.LOGGER = value; }

// public yarnwrap.resource.ResourcePackInfo info() { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.info); }
// public void info(yarnwrap.resource.ResourcePackInfo value) { wrapperContained.info = value.wrapperContained; }
// public static yarnwrap.resource.ResourcePackInfo info() { return new yarnwrap.resource.ResourcePackInfo(net.minecraft.resource.ResourcePackProfile.info); }
// public static void info(yarnwrap.resource.ResourcePackInfo value, ) { net.minecraft.resource.ResourcePackProfile.info = value.wrapperContained; }

// public Object metaData() { return wrapperContained.metaData; }
// // public void metaData(Object value) { wrapperContained.metaData = value; }
// // public static Object metaData() { return net.minecraft.resource.ResourcePackProfile.metaData; }
// // public static void metaData(Object value, ) { net.minecraft.resource.ResourcePackProfile.metaData = value; }

// public yarnwrap.resource.ResourcePackPosition position() { return new yarnwrap.resource.ResourcePackPosition(wrapperContained.position); }
// public void position(yarnwrap.resource.ResourcePackPosition value) { wrapperContained.position = value.wrapperContained; }
// public static yarnwrap.resource.ResourcePackPosition position() { return new yarnwrap.resource.ResourcePackPosition(net.minecraft.resource.ResourcePackProfile.position); }
// public static void position(yarnwrap.resource.ResourcePackPosition value, ) { net.minecraft.resource.ResourcePackProfile.position = value.wrapperContained; }

// public ResourcePackProfile(yarnwrap.resource.ResourcePackInfo info,Object packFactory,Object metaData,yarnwrap.resource.ResourcePackPosition position) { this.wrapperContained = new net.minecraft.resource.ResourcePackProfile(info.wrapperContained,packFactory,metaData,position.wrapperContained); }
public boolean equals(java.lang.Object o) { return wrapperContained.equals(o); }
// public static boolean equals(java.lang.Object o, ) { return net.minecraft.resource.ResourcePackProfile.equals(o); }
public yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(wrapperContained.getDisplayName()); }
// public static yarnwrap.text.Text getDisplayName() { return new yarnwrap.text.Text(net.minecraft.resource.ResourcePackProfile.getDisplayName()); }
public yarnwrap.resource.ResourcePack createResourcePack() { return new yarnwrap.resource.ResourcePack(wrapperContained.createResourcePack()); }
// public static yarnwrap.resource.ResourcePack createResourcePack() { return new yarnwrap.resource.ResourcePack(net.minecraft.resource.ResourcePackProfile.createResourcePack()); }
public yarnwrap.text.Text getDescription() { return new yarnwrap.text.Text(wrapperContained.getDescription()); }
// public static yarnwrap.text.Text getDescription() { return new yarnwrap.text.Text(net.minecraft.resource.ResourcePackProfile.getDescription()); }
public yarnwrap.resource.ResourcePackCompatibility getCompatibility() { return new yarnwrap.resource.ResourcePackCompatibility(wrapperContained.getCompatibility()); }
// public static yarnwrap.resource.ResourcePackCompatibility getCompatibility() { return new yarnwrap.resource.ResourcePackCompatibility(net.minecraft.resource.ResourcePackProfile.getCompatibility()); }
public yarnwrap.text.Text getInformationText(boolean enabled) { return new yarnwrap.text.Text(wrapperContained.getInformationText(enabled)); }
// public static yarnwrap.text.Text getInformationText(boolean enabled, ) { return new yarnwrap.text.Text(net.minecraft.resource.ResourcePackProfile.getInformationText(enabled)); }
public java.lang.String getId() { return wrapperContained.getId(); }
// public static java.lang.String getId() { return net.minecraft.resource.ResourcePackProfile.getId(); }
public boolean isRequired() { return wrapperContained.isRequired(); }
// public static boolean isRequired() { return net.minecraft.resource.ResourcePackProfile.isRequired(); }
public boolean isPinned() { return wrapperContained.isPinned(); }
// public static boolean isPinned() { return net.minecraft.resource.ResourcePackProfile.isPinned(); }
public Object getInitialPosition() { return wrapperContained.getInitialPosition(); }
// public static Object getInitialPosition() { return net.minecraft.resource.ResourcePackProfile.getInitialPosition(); }
public yarnwrap.resource.ResourcePackSource getSource() { return new yarnwrap.resource.ResourcePackSource(wrapperContained.getSource()); }
// public static yarnwrap.resource.ResourcePackSource getSource() { return new yarnwrap.resource.ResourcePackSource(net.minecraft.resource.ResourcePackProfile.getSource()); }
// public Object loadMetadata(yarnwrap.resource.ResourcePackInfo info,Object packFactory,int currentPackFormat) { return wrapperContained.loadMetadata(info.wrapperContained,packFactory,currentPackFormat); }
// public static Object loadMetadata(yarnwrap.resource.ResourcePackInfo info,Object packFactory,int currentPackFormat, ) { return net.minecraft.resource.ResourcePackProfile.loadMetadata(info.wrapperContained,packFactory,currentPackFormat); }
// public yarnwrap.resource.ResourcePackProfile create(yarnwrap.resource.ResourcePackInfo info,Object packFactory,yarnwrap.resource.ResourceType type,yarnwrap.resource.ResourcePackPosition position) { return new yarnwrap.resource.ResourcePackProfile(wrapperContained.create(info.wrapperContained,packFactory,type.wrapperContained,position.wrapperContained)); }
// public static yarnwrap.resource.ResourcePackProfile create(yarnwrap.resource.ResourcePackInfo info,Object packFactory,yarnwrap.resource.ResourceType type,yarnwrap.resource.ResourcePackPosition position, ) { return new yarnwrap.resource.ResourcePackProfile(net.minecraft.resource.ResourcePackProfile.create(info.wrapperContained,packFactory,type.wrapperContained,position.wrapperContained)); }
public yarnwrap.resource.featuretoggle.FeatureSet getRequestedFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(wrapperContained.getRequestedFeatures()); }
// public static yarnwrap.resource.featuretoggle.FeatureSet getRequestedFeatures() { return new yarnwrap.resource.featuretoggle.FeatureSet(net.minecraft.resource.ResourcePackProfile.getRequestedFeatures()); }
// public yarnwrap.util.dynamic.Range getSupportedFormats(java.lang.String packId,yarnwrap.resource.metadata.PackResourceMetadata metadata) { return new yarnwrap.util.dynamic.Range(wrapperContained.getSupportedFormats(packId,metadata.wrapperContained)); }
// public static yarnwrap.util.dynamic.Range getSupportedFormats(java.lang.String packId,yarnwrap.resource.metadata.PackResourceMetadata metadata, ) { return new yarnwrap.util.dynamic.Range(net.minecraft.resource.ResourcePackProfile.getSupportedFormats(packId,metadata.wrapperContained)); }
public yarnwrap.resource.ResourcePackInfo getInfo() { return new yarnwrap.resource.ResourcePackInfo(wrapperContained.getInfo()); }
// public static yarnwrap.resource.ResourcePackInfo getInfo() { return new yarnwrap.resource.ResourcePackInfo(net.minecraft.resource.ResourcePackProfile.getInfo()); }
public yarnwrap.resource.ResourcePackPosition getPosition() { return new yarnwrap.resource.ResourcePackPosition(wrapperContained.getPosition()); }
// public static yarnwrap.resource.ResourcePackPosition getPosition() { return new yarnwrap.resource.ResourcePackPosition(net.minecraft.resource.ResourcePackProfile.getPosition()); }

}