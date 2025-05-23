package yarnwrap.client.render.item.model;
public class BasicItemModel { public net.minecraft.client.render.item.model.BasicItemModel wrapperContained; public BasicItemModel(net.minecraft.client.render.item.model.BasicItemModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public java.util.List tints() { return wrapperContained.tints; }
// public void tints(java.util.List value) { wrapperContained.tints = value; }
// public static java.util.List tints() { return net.minecraft.client.render.item.model.BasicItemModel.tints; }
// public static void tints(java.util.List value, ) { net.minecraft.client.render.item.model.BasicItemModel.tints = value; }

// public java.util.List quads() { return wrapperContained.quads; }
// public void quads(java.util.List value) { wrapperContained.quads = value; }
// public static java.util.List quads() { return net.minecraft.client.render.item.model.BasicItemModel.quads; }
// public static void quads(java.util.List value, ) { net.minecraft.client.render.item.model.BasicItemModel.quads = value; }

// public java.util.function.Supplier vector() { return wrapperContained.vector; }
// public void vector(java.util.function.Supplier value) { wrapperContained.vector = value; }
// public static java.util.function.Supplier vector() { return net.minecraft.client.render.item.model.BasicItemModel.vector; }
// public static void vector(java.util.function.Supplier value, ) { net.minecraft.client.render.item.model.BasicItemModel.vector = value; }

// public yarnwrap.client.render.model.ModelSettings settings() { return new yarnwrap.client.render.model.ModelSettings(wrapperContained.settings); }
// public void settings(yarnwrap.client.render.model.ModelSettings value) { wrapperContained.settings = value.wrapperContained; }
// public static yarnwrap.client.render.model.ModelSettings settings() { return new yarnwrap.client.render.model.ModelSettings(net.minecraft.client.render.item.model.BasicItemModel.settings); }
// public static void settings(yarnwrap.client.render.model.ModelSettings value, ) { net.minecraft.client.render.item.model.BasicItemModel.settings = value.wrapperContained; }

// public boolean animated() { return wrapperContained.animated; }
// public void animated(boolean value) { wrapperContained.animated = value; }
// public static boolean animated() { return net.minecraft.client.render.item.model.BasicItemModel.animated; }
// public static void animated(boolean value, ) { net.minecraft.client.render.item.model.BasicItemModel.animated = value; }

public BasicItemModel(java.util.List tints,java.util.List quads,yarnwrap.client.render.model.ModelSettings settings) { this.wrapperContained = new net.minecraft.client.render.item.model.BasicItemModel(tints,quads,settings.wrapperContained); }
// public boolean shouldUseSpecialGlint(yarnwrap.item.ItemStack stack) { return wrapperContained.shouldUseSpecialGlint(stack.wrapperContained); }
// public static boolean shouldUseSpecialGlint(yarnwrap.item.ItemStack stack, ) { return net.minecraft.client.render.item.model.BasicItemModel.shouldUseSpecialGlint(stack.wrapperContained); }
// public org.joml.Vector3f[] bakeQuads(java.util.List quads) { return wrapperContained.bakeQuads(quads); }
// public static org.joml.Vector3f[] bakeQuads(java.util.List quads, ) { return net.minecraft.client.render.item.model.BasicItemModel.bakeQuads(quads); }

}