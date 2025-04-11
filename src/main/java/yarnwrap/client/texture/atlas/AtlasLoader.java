package yarnwrap.client.texture.atlas;
public class AtlasLoader { public net.minecraft.client.texture.atlas.AtlasLoader wrapperContained; public AtlasLoader(net.minecraft.client.texture.atlas.AtlasLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.FINDER); }
// public void FINDER(yarnwrap.resource.ResourceFinder value) { wrapperContained.FINDER = value.wrapperContained; }
// public java.util.List sources() { return wrapperContained.sources; }
// public void sources(java.util.List value) { wrapperContained.sources = value; }
public java.util.List loadSources(yarnwrap.resource.ResourceManager resourceManager) { return wrapperContained.loadSources(resourceManager.wrapperContained); }
public yarnwrap.client.texture.atlas.AtlasLoader of(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier id) { return new yarnwrap.client.texture.atlas.AtlasLoader(wrapperContained.of(resourceManager.wrapperContained,id.wrapperContained)); }

}