package yarnwrap.client.texture.atlas;
public class AtlasLoader { public net.minecraft.client.texture.atlas.AtlasLoader wrapperContained; public AtlasLoader(net.minecraft.client.texture.atlas.AtlasLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.FINDER); }
// public java.util.List sources() { return wrapperContained.sources; }
public java.util.List loadSources(yarnwrap.resource.ResourceManager resourceManager) { return wrapperContained.loadSources(resourceManager.wrapperContained); }
public yarnwrap.client.texture.atlas.AtlasLoader of(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier id) { return new yarnwrap.client.texture.atlas.AtlasLoader(wrapperContained.of(resourceManager.wrapperContained,id.wrapperContained)); }

}