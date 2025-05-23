package yarnwrap.client.util;
public class SpriteMapper { public net.minecraft.client.util.SpriteMapper wrapperContained; public SpriteMapper(net.minecraft.client.util.SpriteMapper wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.util.SpriteIdentifier map(yarnwrap.util.Identifier id) { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.map(id.wrapperContained)); }
// public static yarnwrap.client.util.SpriteIdentifier map(yarnwrap.util.Identifier id, ) { return new yarnwrap.client.util.SpriteIdentifier(net.minecraft.client.util.SpriteMapper.map(id.wrapperContained)); }
public yarnwrap.client.util.SpriteIdentifier mapVanilla(java.lang.String id) { return new yarnwrap.client.util.SpriteIdentifier(wrapperContained.mapVanilla(id)); }
// public static yarnwrap.client.util.SpriteIdentifier mapVanilla(java.lang.String id, ) { return new yarnwrap.client.util.SpriteIdentifier(net.minecraft.client.util.SpriteMapper.mapVanilla(id)); }

}