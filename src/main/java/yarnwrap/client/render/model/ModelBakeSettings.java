package yarnwrap.client.render.model;
public class ModelBakeSettings { public net.minecraft.client.render.model.ModelBakeSettings wrapperContained; public ModelBakeSettings(net.minecraft.client.render.model.ModelBakeSettings wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.AffineTransformation getRotation() { return new yarnwrap.util.math.AffineTransformation(wrapperContained.getRotation()); }
// public static yarnwrap.util.math.AffineTransformation getRotation() { return new yarnwrap.util.math.AffineTransformation(net.minecraft.client.render.model.ModelBakeSettings.getRotation()); }
public boolean isUvLocked() { return wrapperContained.isUvLocked(); }
// public static boolean isUvLocked() { return net.minecraft.client.render.model.ModelBakeSettings.isUvLocked(); }

}