package yarnwrap.client.texture.atlas;
public class AtlasSource { public net.minecraft.client.texture.atlas.AtlasSource wrapperContained; public AtlasSource(net.minecraft.client.texture.atlas.AtlasSource wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.resource.ResourceFinder RESOURCE_FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.RESOURCE_FINDER); }
// public void RESOURCE_FINDER(yarnwrap.resource.ResourceFinder value) { wrapperContained.RESOURCE_FINDER = value.wrapperContained; }
public yarnwrap.client.texture.atlas.AtlasSourceType getType() { return new yarnwrap.client.texture.atlas.AtlasSourceType(wrapperContained.getType()); }
// public void load(yarnwrap.resource.ResourceManager resourceManager,Object regions) { wrapperContained.load(resourceManager.wrapperContained,regions); }

}