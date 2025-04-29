package yarnwrap.client.texture.atlas;
public class AtlasLoader { public net.minecraft.client.texture.atlas.AtlasLoader wrapperContained; public AtlasLoader(net.minecraft.client.texture.atlas.AtlasLoader wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.slf4j.Logger LOGGER() { return wrapperContained.LOGGER; }
// public void LOGGER(org.slf4j.Logger value) { wrapperContained.LOGGER = value; }
// public static org.slf4j.Logger LOGGER() { return net.minecraft.client.texture.atlas.AtlasLoader.LOGGER; }
// public static void LOGGER(org.slf4j.Logger value, ) { net.minecraft.client.texture.atlas.AtlasLoader.LOGGER = value; }

// public yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(wrapperContained.FINDER); }
// public void FINDER(yarnwrap.resource.ResourceFinder value) { wrapperContained.FINDER = value.wrapperContained; }
// public static yarnwrap.resource.ResourceFinder FINDER() { return new yarnwrap.resource.ResourceFinder(net.minecraft.client.texture.atlas.AtlasLoader.FINDER); }
// public static void FINDER(yarnwrap.resource.ResourceFinder value, ) { net.minecraft.client.texture.atlas.AtlasLoader.FINDER = value.wrapperContained; }

// public java.util.List sources() { return wrapperContained.sources; }
// public void sources(java.util.List value) { wrapperContained.sources = value; }
// public static java.util.List sources() { return net.minecraft.client.texture.atlas.AtlasLoader.sources; }
// public static void sources(java.util.List value, ) { net.minecraft.client.texture.atlas.AtlasLoader.sources = value; }

// public AtlasLoader(java.util.List sources) { this.wrapperContained = new net.minecraft.client.texture.atlas.AtlasLoader(sources); }
public java.util.List loadSources(yarnwrap.resource.ResourceManager resourceManager) { return wrapperContained.loadSources(resourceManager.wrapperContained); }
// public static java.util.List loadSources(yarnwrap.resource.ResourceManager resourceManager, ) { return net.minecraft.client.texture.atlas.AtlasLoader.loadSources(resourceManager.wrapperContained); }
// public yarnwrap.client.texture.atlas.AtlasLoader of(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier id) { return new yarnwrap.client.texture.atlas.AtlasLoader(wrapperContained.of(resourceManager.wrapperContained,id.wrapperContained)); }
// public static yarnwrap.client.texture.atlas.AtlasLoader of(yarnwrap.resource.ResourceManager resourceManager,yarnwrap.util.Identifier id, ) { return new yarnwrap.client.texture.atlas.AtlasLoader(net.minecraft.client.texture.atlas.AtlasLoader.of(resourceManager.wrapperContained,id.wrapperContained)); }
// public void method_47669(yarnwrap.resource.ResourceManager source) { wrapperContained.method_47669(source.wrapperContained); }
// public static void method_47669(yarnwrap.resource.ResourceManager source, ) { net.minecraft.client.texture.atlas.AtlasLoader.method_47669(source.wrapperContained); }
// public yarnwrap.client.texture.SpriteContents method_52852(yarnwrap.client.texture.SpriteOpener opener) { return new yarnwrap.client.texture.SpriteContents(wrapperContained.method_52852(opener.wrapperContained)); }
// public static yarnwrap.client.texture.SpriteContents method_52852(yarnwrap.client.texture.SpriteOpener opener, ) { return new yarnwrap.client.texture.SpriteContents(net.minecraft.client.texture.atlas.AtlasLoader.method_52852(opener.wrapperContained)); }

}