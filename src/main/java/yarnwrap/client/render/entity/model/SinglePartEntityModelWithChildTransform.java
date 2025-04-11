package yarnwrap.client.render.entity.model;
public class SinglePartEntityModelWithChildTransform { public net.minecraft.client.render.entity.model.SinglePartEntityModelWithChildTransform wrapperContained; public SinglePartEntityModelWithChildTransform(net.minecraft.client.render.entity.model.SinglePartEntityModelWithChildTransform wrapperContained) { this.wrapperContained = wrapperContained; }

// public float childScale() { return wrapperContained.childScale; }
// public void childScale(float value) { wrapperContained.childScale = value; }
// public float childTranslation() { return wrapperContained.childTranslation; }
// public void childTranslation(float value) { wrapperContained.childTranslation = value; }
// public SinglePartEntityModelWithChildTransform(float childScale,float childTranslation) { this.wrapperContained = new net.minecraft.client.render.entity.model.SinglePartEntityModelWithChildTransform(childScale,childTranslation); }
// public SinglePartEntityModelWithChildTransform(float childScale,float childTranslation,java.util.function.Function layerFactory) { this.wrapperContained = new net.minecraft.client.render.entity.model.SinglePartEntityModelWithChildTransform(childScale,childTranslation,layerFactory); }

}