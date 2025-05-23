package yarnwrap.client.render.item.model;
public class CompositeItemModel { public net.minecraft.client.render.item.model.CompositeItemModel wrapperContained; public CompositeItemModel(net.minecraft.client.render.item.model.CompositeItemModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List models() { return wrapperContained.models; }
// public void models(java.util.List value) { wrapperContained.models = value; }
// public static java.util.List models() { return net.minecraft.client.render.item.model.CompositeItemModel.models; }
// public static void models(java.util.List value, ) { net.minecraft.client.render.item.model.CompositeItemModel.models = value; }

public CompositeItemModel(java.util.List models) { this.wrapperContained = new net.minecraft.client.render.item.model.CompositeItemModel(models); }

}