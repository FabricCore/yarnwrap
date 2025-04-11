package yarnwrap.client.render.entity.feature;
public class VillagerResourceMetadata { public net.minecraft.client.render.entity.feature.VillagerResourceMetadata wrapperContained; public VillagerResourceMetadata(net.minecraft.client.render.entity.feature.VillagerResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.entity.feature.VillagerResourceMetadataReader READER() { return new yarnwrap.client.render.entity.feature.VillagerResourceMetadataReader(wrapperContained.READER); }
// public void READER(yarnwrap.client.render.entity.feature.VillagerResourceMetadataReader value) { wrapperContained.READER = value.wrapperContained; }
// public Object hatType() { return wrapperContained.hatType; }
// // public void hatType(Object value) { wrapperContained.hatType = value; }
public java.lang.String KEY() { return wrapperContained.KEY; }
// public void KEY(java.lang.String value) { wrapperContained.KEY = value; }
public Object getHatType() { return wrapperContained.getHatType(); }

}