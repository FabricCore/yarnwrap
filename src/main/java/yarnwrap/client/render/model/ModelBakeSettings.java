package yarnwrap.client.render.model;
public class ModelBakeSettings { public net.minecraft.client.render.model.ModelBakeSettings wrapperContained; public ModelBakeSettings(net.minecraft.client.render.model.ModelBakeSettings wrapperContained) { this.wrapperContained = wrapperContained; }

// public org.joml.Matrix4fc TRANSFORM_NONE() { return wrapperContained.TRANSFORM_NONE; }
// public void TRANSFORM_NONE(org.joml.Matrix4fc value) { wrapperContained.TRANSFORM_NONE = value; }
public static org.joml.Matrix4fc TRANSFORM_NONE() { return net.minecraft.client.render.model.ModelBakeSettings.TRANSFORM_NONE; }
// public static void TRANSFORM_NONE(org.joml.Matrix4fc value, ) { net.minecraft.client.render.model.ModelBakeSettings.TRANSFORM_NONE = value; }

public yarnwrap.util.math.AffineTransformation getRotation() { return new yarnwrap.util.math.AffineTransformation(wrapperContained.getRotation()); }
// public static yarnwrap.util.math.AffineTransformation getRotation() { return new yarnwrap.util.math.AffineTransformation(net.minecraft.client.render.model.ModelBakeSettings.getRotation()); }
public org.joml.Matrix4fc forward(yarnwrap.util.math.Direction facing) { return wrapperContained.forward(facing.wrapperContained); }
// public static org.joml.Matrix4fc forward(yarnwrap.util.math.Direction facing, ) { return net.minecraft.client.render.model.ModelBakeSettings.forward(facing.wrapperContained); }
public org.joml.Matrix4fc reverse(yarnwrap.util.math.Direction facing) { return wrapperContained.reverse(facing.wrapperContained); }
// public static org.joml.Matrix4fc reverse(yarnwrap.util.math.Direction facing, ) { return net.minecraft.client.render.model.ModelBakeSettings.reverse(facing.wrapperContained); }

}