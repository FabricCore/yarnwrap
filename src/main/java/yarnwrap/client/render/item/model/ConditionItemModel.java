package yarnwrap.client.render.item.model;
public class ConditionItemModel { public net.minecraft.client.render.item.model.ConditionItemModel wrapperContained; public ConditionItemModel(net.minecraft.client.render.item.model.ConditionItemModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.item.property.PropertyTester property() { return new yarnwrap.client.render.item.property.PropertyTester(wrapperContained.property); }
// public void property(yarnwrap.client.render.item.property.PropertyTester value) { wrapperContained.property = value.wrapperContained; }
// public static yarnwrap.client.render.item.property.PropertyTester property() { return new yarnwrap.client.render.item.property.PropertyTester(net.minecraft.client.render.item.model.ConditionItemModel.property); }
// public static void property(yarnwrap.client.render.item.property.PropertyTester value, ) { net.minecraft.client.render.item.model.ConditionItemModel.property = value.wrapperContained; }

// public yarnwrap.client.render.item.model.ItemModel onTrue() { return new yarnwrap.client.render.item.model.ItemModel(wrapperContained.onTrue); }
// public void onTrue(yarnwrap.client.render.item.model.ItemModel value) { wrapperContained.onTrue = value.wrapperContained; }
// public static yarnwrap.client.render.item.model.ItemModel onTrue() { return new yarnwrap.client.render.item.model.ItemModel(net.minecraft.client.render.item.model.ConditionItemModel.onTrue); }
// public static void onTrue(yarnwrap.client.render.item.model.ItemModel value, ) { net.minecraft.client.render.item.model.ConditionItemModel.onTrue = value.wrapperContained; }

// public yarnwrap.client.render.item.model.ItemModel onFalse() { return new yarnwrap.client.render.item.model.ItemModel(wrapperContained.onFalse); }
// public void onFalse(yarnwrap.client.render.item.model.ItemModel value) { wrapperContained.onFalse = value.wrapperContained; }
// public static yarnwrap.client.render.item.model.ItemModel onFalse() { return new yarnwrap.client.render.item.model.ItemModel(net.minecraft.client.render.item.model.ConditionItemModel.onFalse); }
// public static void onFalse(yarnwrap.client.render.item.model.ItemModel value, ) { net.minecraft.client.render.item.model.ConditionItemModel.onFalse = value.wrapperContained; }

public ConditionItemModel(yarnwrap.client.render.item.property.PropertyTester property,yarnwrap.client.render.item.model.ItemModel onTrue,yarnwrap.client.render.item.model.ItemModel onFalse) { this.wrapperContained = new net.minecraft.client.render.item.model.ConditionItemModel(property.wrapperContained,onTrue.wrapperContained,onFalse.wrapperContained); }

}