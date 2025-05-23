package yarnwrap.client.render.item.model;
public class SelectItemModel { public net.minecraft.client.render.item.model.SelectItemModel wrapperContained; public SelectItemModel(net.minecraft.client.render.item.model.SelectItemModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.item.property.select.SelectProperty property() { return new yarnwrap.client.render.item.property.select.SelectProperty(wrapperContained.property); }
// public void property(yarnwrap.client.render.item.property.select.SelectProperty value) { wrapperContained.property = value.wrapperContained; }
// public static yarnwrap.client.render.item.property.select.SelectProperty property() { return new yarnwrap.client.render.item.property.select.SelectProperty(net.minecraft.client.render.item.model.SelectItemModel.property); }
// public static void property(yarnwrap.client.render.item.property.select.SelectProperty value, ) { net.minecraft.client.render.item.model.SelectItemModel.property = value.wrapperContained; }

// public Object selector() { return wrapperContained.selector; }
// // public void selector(Object value) { wrapperContained.selector = value; }
// // public static Object selector() { return net.minecraft.client.render.item.model.SelectItemModel.selector; }
// // public static void selector(Object value, ) { net.minecraft.client.render.item.model.SelectItemModel.selector = value; }

// public SelectItemModel(yarnwrap.client.render.item.property.select.SelectProperty property,Object selector) { this.wrapperContained = new net.minecraft.client.render.item.model.SelectItemModel(property.wrapperContained,selector); }

}