package yarnwrap.client.texture.atlas;
public class AtlasSprite { public net.minecraft.client.texture.atlas.AtlasSprite wrapperContained; public AtlasSprite(net.minecraft.client.texture.atlas.AtlasSprite wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(wrapperContained.id); }
// public void id(yarnwrap.util.Identifier value) { wrapperContained.id = value.wrapperContained; }
// public static yarnwrap.util.Identifier id() { return new yarnwrap.util.Identifier(net.minecraft.client.texture.atlas.AtlasSprite.id); }
// public static void id(yarnwrap.util.Identifier value, ) { net.minecraft.client.texture.atlas.AtlasSprite.id = value.wrapperContained; }

// public yarnwrap.resource.Resource resource() { return new yarnwrap.resource.Resource(wrapperContained.resource); }
// public void resource(yarnwrap.resource.Resource value) { wrapperContained.resource = value.wrapperContained; }
// public static yarnwrap.resource.Resource resource() { return new yarnwrap.resource.Resource(net.minecraft.client.texture.atlas.AtlasSprite.resource); }
// public static void resource(yarnwrap.resource.Resource value, ) { net.minecraft.client.texture.atlas.AtlasSprite.resource = value.wrapperContained; }

// public java.util.concurrent.atomic.AtomicReference image() { return wrapperContained.image; }
// public void image(java.util.concurrent.atomic.AtomicReference value) { wrapperContained.image = value; }
// public static java.util.concurrent.atomic.AtomicReference image() { return net.minecraft.client.texture.atlas.AtlasSprite.image; }
// public static void image(java.util.concurrent.atomic.AtomicReference value, ) { net.minecraft.client.texture.atlas.AtlasSprite.image = value; }

// public java.util.concurrent.atomic.AtomicInteger regionCount() { return wrapperContained.regionCount; }
// public void regionCount(java.util.concurrent.atomic.AtomicInteger value) { wrapperContained.regionCount = value; }
// public static java.util.concurrent.atomic.AtomicInteger regionCount() { return net.minecraft.client.texture.atlas.AtlasSprite.regionCount; }
// public static void regionCount(java.util.concurrent.atomic.AtomicInteger value, ) { net.minecraft.client.texture.atlas.AtlasSprite.regionCount = value; }

public AtlasSprite(yarnwrap.util.Identifier id,yarnwrap.resource.Resource resource,int regionCount) { this.wrapperContained = new net.minecraft.client.texture.atlas.AtlasSprite(id.wrapperContained,resource.wrapperContained,regionCount); }
// public yarnwrap.client.texture.NativeImage read() { return new yarnwrap.client.texture.NativeImage(wrapperContained.read()); }
// public static yarnwrap.client.texture.NativeImage read() { return new yarnwrap.client.texture.NativeImage(net.minecraft.client.texture.atlas.AtlasSprite.read()); }
public void close() { wrapperContained.close(); }
// public static void close() { net.minecraft.client.texture.atlas.AtlasSprite.close(); }

}