package yarnwrap.client.render.model;
public class ModelBakeSettings { public net.minecraft.client.render.model.ModelBakeSettings wrapperContained; public ModelBakeSettings(net.minecraft.client.render.model.ModelBakeSettings wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.util.math.AffineTransformation getRotation() { return new yarnwrap.util.math.AffineTransformation(wrapperContained.getRotation()); }
public boolean isUvLocked() { return wrapperContained.isUvLocked(); }

}