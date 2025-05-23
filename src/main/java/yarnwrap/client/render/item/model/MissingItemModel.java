package yarnwrap.client.render.item.model;
public class MissingItemModel { public net.minecraft.client.render.item.model.MissingItemModel wrapperContained; public MissingItemModel(net.minecraft.client.render.item.model.MissingItemModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List quads() { return wrapperContained.quads; }
// public void quads(java.util.List value) { wrapperContained.quads = value; }
// public static java.util.List quads() { return net.minecraft.client.render.item.model.MissingItemModel.quads; }
// public static void quads(java.util.List value, ) { net.minecraft.client.render.item.model.MissingItemModel.quads = value; }

// public java.util.function.Supplier vector() { return wrapperContained.vector; }
// public void vector(java.util.function.Supplier value) { wrapperContained.vector = value; }
// public static java.util.function.Supplier vector() { return net.minecraft.client.render.item.model.MissingItemModel.vector; }
// public static void vector(java.util.function.Supplier value, ) { net.minecraft.client.render.item.model.MissingItemModel.vector = value; }

// public yarnwrap.client.render.model.ModelSettings settings() { return new yarnwrap.client.render.model.ModelSettings(wrapperContained.settings); }
// public void settings(yarnwrap.client.render.model.ModelSettings value) { wrapperContained.settings = value.wrapperContained; }
// public static yarnwrap.client.render.model.ModelSettings settings() { return new yarnwrap.client.render.model.ModelSettings(net.minecraft.client.render.item.model.MissingItemModel.settings); }
// public static void settings(yarnwrap.client.render.model.ModelSettings value, ) { net.minecraft.client.render.item.model.MissingItemModel.settings = value.wrapperContained; }

public MissingItemModel(java.util.List quads,yarnwrap.client.render.model.ModelSettings settings) { this.wrapperContained = new net.minecraft.client.render.item.model.MissingItemModel(quads,settings.wrapperContained); }

}