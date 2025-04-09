package yarnwrap.client.render.entity.model;
public class SilverfishEntityModel { public net.minecraft.client.render.entity.model.SilverfishEntityModel wrapperContained; public SilverfishEntityModel(net.minecraft.client.render.entity.model.SilverfishEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public int BODY_PARTS_COUNT() { return wrapperContained.BODY_PARTS_COUNT; }
// public net.minecraft.client.model.ModelPart[] scales() { return wrapperContained.scales; }
// public int[][] SEGMENT_LOCATIONS() { return wrapperContained.SEGMENT_LOCATIONS; }
// public int[][] SEGMENT_SIZES() { return wrapperContained.SEGMENT_SIZES; }
// public net.minecraft.client.model.ModelPart[] body() { return wrapperContained.body; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public java.lang.String getLayerName(int index) { return wrapperContained.getLayerName(index); }
// public java.lang.String getSegmentName(int index) { return wrapperContained.getSegmentName(index); }

}