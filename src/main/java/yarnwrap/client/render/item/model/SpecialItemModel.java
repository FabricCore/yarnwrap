package yarnwrap.client.render.item.model;
public class SpecialItemModel { public net.minecraft.client.render.item.model.SpecialItemModel wrapperContained; public SpecialItemModel(net.minecraft.client.render.item.model.SpecialItemModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.render.item.model.special.SpecialModelRenderer specialModelType() { return new yarnwrap.client.render.item.model.special.SpecialModelRenderer(wrapperContained.specialModelType); }
// public void specialModelType(yarnwrap.client.render.item.model.special.SpecialModelRenderer value) { wrapperContained.specialModelType = value.wrapperContained; }
// public static yarnwrap.client.render.item.model.special.SpecialModelRenderer specialModelType() { return new yarnwrap.client.render.item.model.special.SpecialModelRenderer(net.minecraft.client.render.item.model.SpecialItemModel.specialModelType); }
// public static void specialModelType(yarnwrap.client.render.item.model.special.SpecialModelRenderer value, ) { net.minecraft.client.render.item.model.SpecialItemModel.specialModelType = value.wrapperContained; }

// public org.joml.Vector3f[] EMPTY() { return wrapperContained.EMPTY; }
// public void EMPTY(org.joml.Vector3f[] value) { wrapperContained.EMPTY = value; }
// public static org.joml.Vector3f[] EMPTY() { return net.minecraft.client.render.item.model.SpecialItemModel.EMPTY; }
// public static void EMPTY(org.joml.Vector3f[] value, ) { net.minecraft.client.render.item.model.SpecialItemModel.EMPTY = value; }

// public yarnwrap.client.render.model.ModelSettings settings() { return new yarnwrap.client.render.model.ModelSettings(wrapperContained.settings); }
// public void settings(yarnwrap.client.render.model.ModelSettings value) { wrapperContained.settings = value.wrapperContained; }
// public static yarnwrap.client.render.model.ModelSettings settings() { return new yarnwrap.client.render.model.ModelSettings(net.minecraft.client.render.item.model.SpecialItemModel.settings); }
// public static void settings(yarnwrap.client.render.model.ModelSettings value, ) { net.minecraft.client.render.item.model.SpecialItemModel.settings = value.wrapperContained; }

public SpecialItemModel(yarnwrap.client.render.item.model.special.SpecialModelRenderer specialModelType,yarnwrap.client.render.model.ModelSettings settings) { this.wrapperContained = new net.minecraft.client.render.item.model.SpecialItemModel(specialModelType.wrapperContained,settings.wrapperContained); }

}