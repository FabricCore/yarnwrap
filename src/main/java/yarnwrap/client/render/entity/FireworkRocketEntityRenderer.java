package yarnwrap.client.render.entity;
public class FireworkRocketEntityRenderer { public net.minecraft.client.render.entity.FireworkRocketEntityRenderer wrapperContained; public FireworkRocketEntityRenderer(net.minecraft.client.render.entity.FireworkRocketEntityRenderer wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.item.ItemModelManager itemModelManager() { return new yarnwrap.client.item.ItemModelManager(wrapperContained.itemModelManager); }
// public void itemModelManager(yarnwrap.client.item.ItemModelManager value) { wrapperContained.itemModelManager = value.wrapperContained; }
// public static yarnwrap.client.item.ItemModelManager itemModelManager() { return new yarnwrap.client.item.ItemModelManager(net.minecraft.client.render.entity.FireworkRocketEntityRenderer.itemModelManager); }
// public static void itemModelManager(yarnwrap.client.item.ItemModelManager value, ) { net.minecraft.client.render.entity.FireworkRocketEntityRenderer.itemModelManager = value.wrapperContained; }


}