package yarnwrap.client.render.model.json;
public class ModelTransformation { public net.minecraft.client.render.model.json.ModelTransformation wrapperContained; public ModelTransformation(net.minecraft.client.render.model.json.ModelTransformation wrapperContained) { this.wrapperContained = wrapperContained; }

public yarnwrap.client.render.model.json.Transformation gui() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.gui); }
// public void gui(yarnwrap.client.render.model.json.Transformation value) { wrapperContained.gui = value.wrapperContained; }
public yarnwrap.client.render.model.json.ModelTransformation NONE() { return new yarnwrap.client.render.model.json.ModelTransformation(wrapperContained.NONE); }
// public void NONE(yarnwrap.client.render.model.json.ModelTransformation value) { wrapperContained.NONE = value.wrapperContained; }
public yarnwrap.client.render.model.json.Transformation firstPersonLeftHand() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.firstPersonLeftHand); }
// public void firstPersonLeftHand(yarnwrap.client.render.model.json.Transformation value) { wrapperContained.firstPersonLeftHand = value.wrapperContained; }
public yarnwrap.client.render.model.json.Transformation ground() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.ground); }
// public void ground(yarnwrap.client.render.model.json.Transformation value) { wrapperContained.ground = value.wrapperContained; }
public yarnwrap.client.render.model.json.Transformation firstPersonRightHand() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.firstPersonRightHand); }
// public void firstPersonRightHand(yarnwrap.client.render.model.json.Transformation value) { wrapperContained.firstPersonRightHand = value.wrapperContained; }
public yarnwrap.client.render.model.json.Transformation thirdPersonLeftHand() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.thirdPersonLeftHand); }
// public void thirdPersonLeftHand(yarnwrap.client.render.model.json.Transformation value) { wrapperContained.thirdPersonLeftHand = value.wrapperContained; }
public yarnwrap.client.render.model.json.Transformation fixed() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.fixed); }
// public void fixed(yarnwrap.client.render.model.json.Transformation value) { wrapperContained.fixed = value.wrapperContained; }
public yarnwrap.client.render.model.json.Transformation thirdPersonRightHand() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.thirdPersonRightHand); }
// public void thirdPersonRightHand(yarnwrap.client.render.model.json.Transformation value) { wrapperContained.thirdPersonRightHand = value.wrapperContained; }
public yarnwrap.client.render.model.json.Transformation head() { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.head); }
// public void head(yarnwrap.client.render.model.json.Transformation value) { wrapperContained.head = value.wrapperContained; }
public ModelTransformation(yarnwrap.client.render.model.json.Transformation thirdPersonLeftHand,yarnwrap.client.render.model.json.Transformation thirdPersonRightHand,yarnwrap.client.render.model.json.Transformation firstPersonLeftHand,yarnwrap.client.render.model.json.Transformation firstPersonRightHand,yarnwrap.client.render.model.json.Transformation head,yarnwrap.client.render.model.json.Transformation gui,yarnwrap.client.render.model.json.Transformation ground,yarnwrap.client.render.model.json.Transformation fixed) { this.wrapperContained = new net.minecraft.client.render.model.json.ModelTransformation(thirdPersonLeftHand.wrapperContained,thirdPersonRightHand.wrapperContained,firstPersonLeftHand.wrapperContained,firstPersonRightHand.wrapperContained,head.wrapperContained,gui.wrapperContained,ground.wrapperContained,fixed.wrapperContained); }
public ModelTransformation(yarnwrap.client.render.model.json.ModelTransformation other) { this.wrapperContained = new net.minecraft.client.render.model.json.ModelTransformation(other.wrapperContained); }
public boolean isTransformationDefined(yarnwrap.client.render.model.json.ModelTransformationMode renderMode) { return wrapperContained.isTransformationDefined(renderMode.wrapperContained); }
public yarnwrap.client.render.model.json.Transformation getTransformation(yarnwrap.client.render.model.json.ModelTransformationMode renderMode) { return new yarnwrap.client.render.model.json.Transformation(wrapperContained.getTransformation(renderMode.wrapperContained)); }

}