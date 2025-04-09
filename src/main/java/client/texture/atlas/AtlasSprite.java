package yarnwrap.client.texture.atlas;
public class AtlasSprite { public net.minecraft.client.texture.atlas.AtlasSprite wrapperContained; public AtlasSprite(net.minecraft.client.texture.atlas.AtlasSprite wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public yarnwrap.resource.Resource resource() { return new yarnwrap.resource.Resource(wrapperContained.resource); }
// public java.util.concurrent.atomic.AtomicReference image() { return wrapperContained.image; }
// public java.util.concurrent.atomic.AtomicInteger regionCount() { return wrapperContained.regionCount; }
// public yarnwrap.client.texture.NativeImage read() { return new yarnwrap.client.texture.NativeImage(wrapperContained.read()); }
public void close() { wrapperContained.close(); }

}