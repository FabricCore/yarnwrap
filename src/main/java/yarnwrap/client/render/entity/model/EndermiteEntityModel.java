package yarnwrap.client.render.entity.model;
public class EndermiteEntityModel { public net.minecraft.client.render.entity.model.EndermiteEntityModel wrapperContained; public EndermiteEntityModel(net.minecraft.client.render.entity.model.EndermiteEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public void root(yarnwrap.client.model.ModelPart value) { wrapperContained.root = value.wrapperContained; }
// public int BODY_SEGMENTS_COUNT() { return wrapperContained.BODY_SEGMENTS_COUNT; }
// public void BODY_SEGMENTS_COUNT(int value) { wrapperContained.BODY_SEGMENTS_COUNT = value; }
// public int[][] SEGMENT_DIMENSIONS() { return wrapperContained.SEGMENT_DIMENSIONS; }
// public void SEGMENT_DIMENSIONS(int[][] value) { wrapperContained.SEGMENT_DIMENSIONS = value; }
// public net.minecraft.client.model.ModelPart[] bodySegments() { return wrapperContained.bodySegments; }
// public void bodySegments(net.minecraft.client.model.ModelPart[] value) { wrapperContained.bodySegments = value; }
// public int[][] SEGMENT_UVS() { return wrapperContained.SEGMENT_UVS; }
// public void SEGMENT_UVS(int[][] value) { wrapperContained.SEGMENT_UVS = value; }
public EndermiteEntityModel(yarnwrap.client.model.ModelPart root) { this.wrapperContained = new net.minecraft.client.render.entity.model.EndermiteEntityModel(root.wrapperContained); }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public java.lang.String getSegmentName(int index) { return wrapperContained.getSegmentName(index); }

}