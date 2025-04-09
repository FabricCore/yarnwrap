package yarnwrap.client.render.model.json;
public class ModelTransformation { public net.minecraft.client.render.model.json.ModelTransformation wrapperContained; public ModelTransformation(net.minecraft.client.render.model.json.ModelTransformation wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.model.json.Transformation gui() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.gui); }
public yarnwrap.client.render.model.json.ModelTransformation NONE() { return new yarnwrap.client.render.model.json.ModelTransformation(wrapperContained.NONE); }
public yarnwrap.client.render.model.json.Transformation firstPersonLeftHand() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.firstPersonLeftHand); }
public yarnwrap.client.render.model.json.Transformation ground() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.ground); }
public yarnwrap.client.render.model.json.Transformation firstPersonRightHand() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.firstPersonRightHand); }
public yarnwrap.client.render.model.json.Transformation thirdPersonLeftHand() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.thirdPersonLeftHand); }
public yarnwrap.client.render.model.json.Transformation fixed() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.fixed); }
public yarnwrap.client.render.model.json.Transformation thirdPersonRightHand() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.thirdPersonRightHand); }
public yarnwrap.client.render.model.json.Transformation head() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.head); }
public boolean isTransformationDefined(yarnwrap.client.render.model.json.ModelTransformationMode renderMode) { return wrapperContained.isTransformationDefined(renderMode.wrapperContained); }
public yarnwrap.client.render.model.json.Transformation getTransformation(yarnwrap.client.render.model.json.ModelTransformationMode renderMode) { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.getTransformation(renderMode.wrapperContained)); }

}