package yarnwrap.client.render.entity.feature;
public class VillagerResourceMetadata { public net.minecraft.client.render.entity.feature.VillagerResourceMetadata wrapperContained; public VillagerResourceMetadata(net.minecraft.client.render.entity.feature.VillagerResourceMetadata wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.entity.feature.VillagerResourceMetadataReader READER() { return new yarnwrap.client.render.entity.feature.VillagerResourceMetadataReader(wrapperContained.READER); }
// public Object hatType() { return wrapperContained.hatType; }
public java.lang.String KEY() { return wrapperContained.KEY; }
public Object getHatType() { return wrapperContained.getHatType(); }

}