package yarnwrap.client.texture;
public class MapDecorationsAtlasManager { public net.minecraft.client.texture.MapDecorationsAtlasManager wrapperContained; public MapDecorationsAtlasManager(net.minecraft.client.texture.MapDecorationsAtlasManager wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.texture.Sprite getSprite(yarnwrap.item.map.MapDecoration decoration) { return new yarnwrap.client.texture.Sprite(wrapperContained.getSprite(decoration.wrapperContained)); }

}