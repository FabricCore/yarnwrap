package yarnwrap.client.render.item.model;
public class EmptyItemModel { public net.minecraft.client.render.item.model.EmptyItemModel wrapperContained; public EmptyItemModel(net.minecraft.client.render.item.model.EmptyItemModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.item.model.ItemModel INSTANCE() { return new yarnwrap.client.render.item.model.ItemModel(wrapperContained.INSTANCE); }
// public void INSTANCE(yarnwrap.client.render.item.model.ItemModel value) { wrapperContained.INSTANCE = value.wrapperContained; }
public static yarnwrap.client.render.item.model.ItemModel INSTANCE() { return new yarnwrap.client.render.item.model.ItemModel(net.minecraft.client.render.item.model.EmptyItemModel.INSTANCE); }
// public static void INSTANCE(yarnwrap.client.render.item.model.ItemModel value, ) { net.minecraft.client.render.item.model.EmptyItemModel.INSTANCE = value.wrapperContained; }


}