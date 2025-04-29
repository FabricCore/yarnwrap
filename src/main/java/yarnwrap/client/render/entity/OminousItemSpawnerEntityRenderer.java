package yarnwrap.client.render.entity;
public class OminousItemSpawnerEntityRenderer { public net.minecraft.client.render.entity.OminousItemSpawnerEntityRenderer wrapperContained; public OminousItemSpawnerEntityRenderer(net.minecraft.client.render.entity.OminousItemSpawnerEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.itemRenderer); }
// public void itemRenderer(yarnwrap.client.render.item.ItemRenderer value) { wrapperContained.itemRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(net.minecraft.client.render.entity.OminousItemSpawnerEntityRenderer.itemRenderer); }
// public static void itemRenderer(yarnwrap.client.render.item.ItemRenderer value, ) { net.minecraft.client.render.entity.OminousItemSpawnerEntityRenderer.itemRenderer = value.wrapperContained; }


}