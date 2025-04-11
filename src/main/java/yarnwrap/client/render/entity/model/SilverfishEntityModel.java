package yarnwrap.client.render.entity.model;
public class SilverfishEntityModel { public net.minecraft.client.render.entity.model.SilverfishEntityModel wrapperContained; public SilverfishEntityModel(net.minecraft.client.render.entity.model.SilverfishEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public int BODY_PARTS_COUNT() { return wrapperContained.BODY_PARTS_COUNT; }
// public void BODY_PARTS_COUNT(int value) { wrapperContained.BODY_PARTS_COUNT = value; }
// public net.minecraft.client.model.ModelPart[] scales() { return wrapperContained.scales; }
// public void scales(net.minecraft.client.model.ModelPart[] value) { wrapperContained.scales = value; }
// public int[][] SEGMENT_LOCATIONS() { return wrapperContained.SEGMENT_LOCATIONS; }
// public void SEGMENT_LOCATIONS(int[][] value) { wrapperContained.SEGMENT_LOCATIONS = value; }
// public int[][] SEGMENT_SIZES() { return wrapperContained.SEGMENT_SIZES; }
// public void SEGMENT_SIZES(int[][] value) { wrapperContained.SEGMENT_SIZES = value; }
// public net.minecraft.client.model.ModelPart[] body() { return wrapperContained.body; }
// public void body(net.minecraft.client.model.ModelPart[] value) { wrapperContained.body = value; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public java.lang.String getLayerName(int index) { return wrapperContained.getLayerName(index); }
// public java.lang.String getSegmentName(int index) { return wrapperContained.getSegmentName(index); }

}