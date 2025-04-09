package yarnwrap.client.render.entity.model;
public class GuardianEntityModel { public net.minecraft.client.render.entity.model.GuardianEntityModel wrapperContained; public GuardianEntityModel(net.minecraft.client.render.entity.model.GuardianEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public float[] SPIKE_PITCHES() { return wrapperContained.SPIKE_PITCHES; }
// public float[] SPIKE_YAWS() { return wrapperContained.SPIKE_YAWS; }
// public float[] SPIKE_ROLLS() { return wrapperContained.SPIKE_ROLLS; }
// public float[] SPIKE_PIVOTS_X() { return wrapperContained.SPIKE_PIVOTS_X; }
// public float[] SPIKE_PIVOTS_Y() { return wrapperContained.SPIKE_PIVOTS_Y; }
// public float[] SPIKE_PIVOTS_Z() { return wrapperContained.SPIKE_PIVOTS_Z; }
// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public java.lang.String EYE() { return wrapperContained.EYE; }
// public java.lang.String TAIL0() { return wrapperContained.TAIL0; }
// public java.lang.String TAIL1() { return wrapperContained.TAIL1; }
// public java.lang.String TAIL2() { return wrapperContained.TAIL2; }
// public net.minecraft.client.model.ModelPart[] tail() { return wrapperContained.tail; }
// public yarnwrap.client.model.ModelPart head() { return new yarnwrap.client.model.ModelPart(wrapperContained.head); }
// public net.minecraft.client.model.ModelPart[] spikes() { return wrapperContained.spikes; }
// public yarnwrap.client.model.ModelPart eye() { return new yarnwrap.client.model.ModelPart(wrapperContained.eye); }
// public void updateSpikeExtensions(float animationProgress,float extension) { wrapperContained.updateSpikeExtensions(animationProgress,extension); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public java.lang.String getSpikeName(int index) { return wrapperContained.getSpikeName(index); }
// public float getAngle(int index,float animationProgress,float magnitude) { return wrapperContained.getAngle(index,animationProgress,magnitude); }
// public float getSpikePivotX(int index,float animationProgress,float extension) { return wrapperContained.getSpikePivotX(index,animationProgress,extension); }
// public float getSpikePivotY(int index,float animationProgress,float extension) { return wrapperContained.getSpikePivotY(index,animationProgress,extension); }
// public float getSpikePivotZ(int index,float animationProgress,float extension) { return wrapperContained.getSpikePivotZ(index,animationProgress,extension); }

}