package yarnwrap.client.render.entity.model;
public class EndermiteEntityModel { public net.minecraft.client.render.entity.model.EndermiteEntityModel wrapperContained; public EndermiteEntityModel(net.minecraft.client.render.entity.model.EndermiteEntityModel wrapperContained) { this.wrapperContained = wrapperContained; }

// public yarnwrap.client.model.ModelPart root() { return new yarnwrap.client.model.ModelPart(wrapperContained.root); }
// public int BODY_SEGMENTS_COUNT() { return wrapperContained.BODY_SEGMENTS_COUNT; }
// public int[][] SEGMENT_DIMENSIONS() { return wrapperContained.SEGMENT_DIMENSIONS; }
// public net.minecraft.client.model.ModelPart[] bodySegments() { return wrapperContained.bodySegments; }
// public int[][] SEGMENT_UVS() { return wrapperContained.SEGMENT_UVS; }
public yarnwrap.client.model.TexturedModelData getTexturedModelData() { return new yarnwrap.client.model.TexturedModelData(wrapperContained.getTexturedModelData()); }
// public java.lang.String getSegmentName(int index) { return wrapperContained.getSegmentName(index); }

}