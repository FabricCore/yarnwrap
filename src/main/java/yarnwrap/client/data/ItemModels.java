package yarnwrap.client.data;
public class ItemModels { public net.minecraft.client.data.ItemModels wrapperContained; public ItemModels(net.minecraft.client.data.ItemModels wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.item.property.bool.BooleanProperty usingItemProperty() { return new yarnwrap.client.render.item.property.bool.BooleanProperty(wrapperContained.usingItemProperty()); }
public static yarnwrap.client.render.item.property.bool.BooleanProperty usingItemProperty() { return new yarnwrap.client.render.item.property.bool.BooleanProperty(net.minecraft.client.data.ItemModels.usingItemProperty()); }
// public yarnwrap.client.render.item.tint.TintSource constantTintSource(int value) { return new yarnwrap.client.render.item.tint.TintSource(wrapperContained.constantTintSource(value)); }
// public static yarnwrap.client.render.item.tint.TintSource constantTintSource(int value, ) { return new yarnwrap.client.render.item.tint.TintSource(net.minecraft.client.data.ItemModels.constantTintSource(value)); }
// public Object basic(yarnwrap.util.Identifier model) { return wrapperContained.basic(model.wrapperContained); }
// public static Object basic(yarnwrap.util.Identifier model, ) { return net.minecraft.client.data.ItemModels.basic(model.wrapperContained); }
// public Object special(yarnwrap.util.Identifier base,Object specialModel) { return wrapperContained.special(base.wrapperContained,specialModel); }
// public static Object special(yarnwrap.util.Identifier base,Object specialModel, ) { return net.minecraft.client.data.ItemModels.special(base.wrapperContained,specialModel); }
// public Object tinted(yarnwrap.util.Identifier model,net.minecraft.client.render.item.tint.TintSource[] tints) { return wrapperContained.tinted(model.wrapperContained,tints); }
// public static Object tinted(yarnwrap.util.Identifier model,net.minecraft.client.render.item.tint.TintSource[] tints, ) { return net.minecraft.client.data.ItemModels.tinted(model.wrapperContained,tints); }
// public Object select(yarnwrap.state.property.Property property,Object fallback,java.util.Map valuesToModels) { return wrapperContained.select(property.wrapperContained,fallback,valuesToModels); }
// public static Object select(yarnwrap.state.property.Property property,Object fallback,java.util.Map valuesToModels, ) { return net.minecraft.client.data.ItemModels.select(property.wrapperContained,fallback,valuesToModels); }
// public Object rangeDispatchEntry(Object model,float threshold) { return wrapperContained.rangeDispatchEntry(model,threshold); }
// public static Object rangeDispatchEntry(Object model,float threshold, ) { return net.minecraft.client.data.ItemModels.rangeDispatchEntry(model,threshold); }
// public Object condition(yarnwrap.client.render.item.property.bool.BooleanProperty property,Object onTrue,Object onFalse) { return wrapperContained.condition(property.wrapperContained,onTrue,onFalse); }
// public static Object condition(yarnwrap.client.render.item.property.bool.BooleanProperty property,Object onTrue,Object onFalse, ) { return net.minecraft.client.data.ItemModels.condition(property.wrapperContained,onTrue,onFalse); }
// public Object rangeDispatch(yarnwrap.client.render.item.property.numeric.NumericProperty property,float scale,Object fallback,Object[] entries) { return wrapperContained.rangeDispatch(property.wrapperContained,scale,fallback,entries); }
// public static Object rangeDispatch(yarnwrap.client.render.item.property.numeric.NumericProperty property,float scale,Object fallback,Object[] entries, ) { return net.minecraft.client.data.ItemModels.rangeDispatch(property.wrapperContained,scale,fallback,entries); }
// public Object rangeDispatch(yarnwrap.client.render.item.property.numeric.NumericProperty property,float scale,java.util.List entries) { return wrapperContained.rangeDispatch(property.wrapperContained,scale,entries); }
// public static Object rangeDispatch(yarnwrap.client.render.item.property.numeric.NumericProperty property,float scale,java.util.List entries, ) { return net.minecraft.client.data.ItemModels.rangeDispatch(property.wrapperContained,scale,entries); }
// public Object rangeDispatch(yarnwrap.client.render.item.property.numeric.NumericProperty property,Object fallback,java.util.List entries) { return wrapperContained.rangeDispatch(property.wrapperContained,fallback,entries); }
// public static Object rangeDispatch(yarnwrap.client.render.item.property.numeric.NumericProperty property,Object fallback,java.util.List entries, ) { return net.minecraft.client.data.ItemModels.rangeDispatch(property.wrapperContained,fallback,entries); }
// public Object rangeDispatch(yarnwrap.client.render.item.property.numeric.NumericProperty property,Object fallback,Object[] entries) { return wrapperContained.rangeDispatch(property.wrapperContained,fallback,entries); }
// public static Object rangeDispatch(yarnwrap.client.render.item.property.numeric.NumericProperty property,Object fallback,Object[] entries, ) { return net.minecraft.client.data.ItemModels.rangeDispatch(property.wrapperContained,fallback,entries); }
// public Object rangeDispatch(yarnwrap.client.render.item.property.numeric.NumericProperty property,java.util.List entries) { return wrapperContained.rangeDispatch(property.wrapperContained,entries); }
// public static Object rangeDispatch(yarnwrap.client.render.item.property.numeric.NumericProperty property,java.util.List entries, ) { return net.minecraft.client.data.ItemModels.rangeDispatch(property.wrapperContained,entries); }
// public Object select(yarnwrap.client.render.item.property.select.SelectProperty property,Object fallback,java.util.List cases) { return wrapperContained.select(property.wrapperContained,fallback,cases); }
// public static Object select(yarnwrap.client.render.item.property.select.SelectProperty property,Object fallback,java.util.List cases, ) { return net.minecraft.client.data.ItemModels.select(property.wrapperContained,fallback,cases); }
// public Object select(yarnwrap.client.render.item.property.select.SelectProperty property,Object fallback,Object[] cases) { return wrapperContained.select(property.wrapperContained,fallback,cases); }
// public static Object select(yarnwrap.client.render.item.property.select.SelectProperty property,Object fallback,Object[] cases, ) { return net.minecraft.client.data.ItemModels.select(property.wrapperContained,fallback,cases); }
// public Object select(yarnwrap.client.render.item.property.select.SelectProperty property,java.util.List cases) { return wrapperContained.select(property.wrapperContained,cases); }
// public static Object select(yarnwrap.client.render.item.property.select.SelectProperty property,java.util.List cases, ) { return net.minecraft.client.data.ItemModels.select(property.wrapperContained,cases); }
// public Object select(yarnwrap.client.render.item.property.select.SelectProperty property,Object[] cases) { return wrapperContained.select(property.wrapperContained,cases); }
// public static Object select(yarnwrap.client.render.item.property.select.SelectProperty property,Object[] cases, ) { return net.minecraft.client.data.ItemModels.select(property.wrapperContained,cases); }
// public Object switchCase(java.lang.Object value,Object model) { return wrapperContained.switchCase(value,model); }
// public static Object switchCase(java.lang.Object value,Object model, ) { return net.minecraft.client.data.ItemModels.switchCase(value,model); }
// public Object switchCase(java.util.List values,Object model) { return wrapperContained.switchCase(values,model); }
// public static Object switchCase(java.util.List values,Object model, ) { return net.minecraft.client.data.ItemModels.switchCase(values,model); }
// public yarnwrap.client.render.item.property.bool.BooleanProperty hasComponentProperty(yarnwrap.component.ComponentType component) { return new yarnwrap.client.render.item.property.bool.BooleanProperty(wrapperContained.hasComponentProperty(component.wrapperContained)); }
// public static yarnwrap.client.render.item.property.bool.BooleanProperty hasComponentProperty(yarnwrap.component.ComponentType component, ) { return new yarnwrap.client.render.item.property.bool.BooleanProperty(net.minecraft.client.data.ItemModels.hasComponentProperty(component.wrapperContained)); }
// public Object composite(Object[] models) { return wrapperContained.composite(models); }
// public static Object composite(Object[] models, ) { return net.minecraft.client.data.ItemModels.composite(models); }
// public Object christmasSelect(Object regularModel,Object christmasModel) { return wrapperContained.christmasSelect(regularModel,christmasModel); }
// public static Object christmasSelect(Object regularModel,Object christmasModel, ) { return net.minecraft.client.data.ItemModels.christmasSelect(regularModel,christmasModel); }
// public Object overworldSelect(Object overworldModel,Object fallback) { return wrapperContained.overworldSelect(overworldModel,fallback); }
// public static Object overworldSelect(Object overworldModel,Object fallback, ) { return net.minecraft.client.data.ItemModels.overworldSelect(overworldModel,fallback); }

}