package yarnwrap.client.render.entity;
public class FireworkRocketEntityRenderer { public net.minecraft.client.render.entity.FireworkRocketEntityRenderer wrapperContained; public FireworkRocketEntityRenderer(net.minecraft.client.render.entity.FireworkRocketEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(wrapperContained.itemRenderer); }
// public void itemRenderer(yarnwrap.client.render.item.ItemRenderer value) { wrapperContained.itemRenderer = value.wrapperContained; }
// public static yarnwrap.client.render.item.ItemRenderer itemRenderer() { return new yarnwrap.client.render.item.ItemRenderer(net.minecraft.client.render.entity.FireworkRocketEntityRenderer.itemRenderer); }
// public static void itemRenderer(yarnwrap.client.render.item.ItemRenderer value, ) { net.minecraft.client.render.entity.FireworkRocketEntityRenderer.itemRenderer = value.wrapperContained; }


}